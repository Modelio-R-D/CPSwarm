package org.modelio.module.cpswarm.generator;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Usage;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.module.cpswarm.api.CPSwarmStereotypes;
import org.modelio.module.cpswarm.api.ICPSwarmPeerModule;

public class ProjectGeneration {
    private String frevopath = "";

    private org.modelio.metamodel.uml.statik.Class problem = null;

    private org.modelio.metamodel.uml.statik.Class swarm = null;

    private org.modelio.metamodel.uml.statik.Class agent = null;

    private org.modelio.metamodel.uml.statik.Class environment = null;

    private List<org.modelio.metamodel.uml.statik.Class> environmentRelated = new ArrayList<>();

    private org.modelio.metamodel.uml.statik.Class costFunction = null;

    private org.modelio.metamodel.uml.statik.Class controller = null;

    public ProjectGeneration() {
    }

    public ProjectGeneration(org.modelio.metamodel.uml.statik.Class problem) {
        this.problem = problem;
        setRelatedClasses();
    }

    private void setRelatedClasses() {
        for (Dependency dependency : this.problem.getDependsOnDependency()){
            
            if (dependency instanceof Usage){
        
                ModelElement target = dependency.getDependsOn();
                
                if ((target instanceof org.modelio.metamodel.uml.statik.Class) 
                        && (target.isStereotyped(ICPSwarmPeerModule.MODULE_NAME, CPSwarmStereotypes.ENVIRONMENT))){
                    this.environment = (org.modelio.metamodel.uml.statik.Class) target;
        
                }else if ((target instanceof org.modelio.metamodel.uml.statik.Class) 
                        && (target.isStereotyped(ICPSwarmPeerModule.MODULE_NAME, CPSwarmStereotypes.FITNESSFUNCTION))){
                    this.costFunction = (org.modelio.metamodel.uml.statik.Class) target;
        
                }else if ((target instanceof org.modelio.metamodel.uml.statik.Class) 
                        && (target.isStereotyped(ICPSwarmPeerModule.MODULE_NAME, CPSwarmStereotypes.SWARM))){
        
                    this.swarm = (org.modelio.metamodel.uml.statik.Class) target;
        
                    //looking for Swarm member
                    for (AssociationEnd assocEnd2 : this.swarm.getOwnedEnd()){
                        AssociationEnd oppositeEnd2 = assocEnd2.getOpposite();
                        Classifier oppositeOwner2 = oppositeEnd2.getOwner();
                        if ((oppositeOwner2 instanceof org.modelio.metamodel.uml.statik.Class) 
                                && (oppositeOwner2.isStereotyped(ICPSwarmPeerModule.MODULE_NAME, CPSwarmStereotypes.SWARMMEMBER))){                        
                            this.agent = (org.modelio.metamodel.uml.statik.Class) oppositeOwner2;
                        }
                    }
                    
                    for (BindableInstance part : this.agent.getInternalStructure()){
                        NameSpace base = part.getBase();
                        if ((base != null) && (base instanceof org.modelio.metamodel.uml.statik.Class)
                                && (base.isStereotyped(ICPSwarmPeerModule.MODULE_NAME, CPSwarmStereotypes.CONTROLLER))){
                            this.controller = (org.modelio.metamodel.uml.statik.Class) base;
                        }
                    }
                }
            }
        }
    }

    public void generate(String rosWs, String rosPath, String frevopath) {
        String xmlPath = frevopath + File.separator + "Components" + File.separator + "Problems" + File.separator + problem.getName() + ".xml";
        File xmlFile = new File(xmlPath);
        if (!xmlFile.exists())
            xmlFile.getParentFile().mkdirs();
            
        XMLGeneration  xmlGen = new XMLGeneration(this.problem, this.swarm, this.environment, this.costFunction, this.controller, rosWs, rosPath);
        StringBuffer content = xmlGen.generate();
        write(xmlPath, content);
        
        
        String javaPath = frevopath + File.separator + "Components" + File.separator + "Problems" + File.separator + problem.getName() + File.separator + problem.getName().toLowerCase() + File.separator + problem.getName() +".java";
        File javaFile = new File(javaPath);
        if (!javaFile.exists())
            javaFile.getParentFile().mkdirs();
        
        JavaGeneration  javaGen = new JavaGeneration(this.agent, this.environment);
        content = javaGen.generate();        
        write(javaPath, content);
    }

    private void write(String path, StringBuffer sbf) {
        File file = new File(path);
        file.getParentFile().mkdirs();
        
        try {
            file.createNewFile();
            /*
             * To write contents of StringBuffer to a file, use
             * BufferedWriter class.
             */
        
            BufferedWriter bwr;
        
            bwr = new BufferedWriter(new FileWriter(file));
        
        
            //write contents of StringBuffer to a file
            bwr.write(sbf.toString());
        
        
            //flush the stream
            bwr.flush();
        
            //close the stream
            bwr.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
