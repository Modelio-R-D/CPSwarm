package org.modelio.module.cpswarm.generator;

import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.modelermodule.api.IModelerModuleNoteTypes;
import org.modelio.module.modelermodule.api.IModelerModulePeerModule;

public class JavaGeneration extends Generator {
    private org.modelio.metamodel.uml.statik.Class agent = null;

    private org.modelio.metamodel.uml.statik.Class environment = null;

    public JavaGeneration(org.modelio.metamodel.uml.statik.Class agent, org.modelio.metamodel.uml.statik.Class environment) {
        this.agent = agent;
        this.environment = environment;
    }

    public StringBuffer generate() {
        headerJava();
        classJava();
        return this.content;
    }

    private void evaluateCandidate() {
        addLine("/**");        
        addLine("*  Simulate without visualization to evaluate the candidate representation.");
        addLine("*  @param AbstractRepresentation candidate: The candidate to evaluate.");
        addLine("* @return double: The fitness of the candidate.");
        addLine("*/");
        
        addLine("@Override");
        addLine("public double evaluateCandidate(AbstractRepresentation candidate) {");
        increaseIndent();
        addLine("// create new simulator interface");     
        addLine("ProblemXMLData data = (ProblemXMLData) getXMLData();");
        addLine("sim = new simROS(candidate, getProperties().get(\"rosPath\").getValue(), getProperties().get(\"rosWs\").getValue(), getProperties().get(\"rosPackage\").getValue(), data.getRequiredNumberOfOutputs());");
        addEmptyLine();
        addLine("// read config for simulation");
        addLine("loadParameters();");
        addEmptyLine();
        addLine("// run simulation");
        addLine("sim.run();");
                    
        addEmptyLine();
              
        addLine("// return fitness");
        addLine("return calcFitness();");
        decreaseIndent();
        addLine("}");
    }

    private void setupJava() {
        addLine("/**");
        addLine(" * Setup environment by placing agents and neeed object.");
        addLine(" * ");
        addLine(" * @param s: random seed.");
        addLine("*/");
        addLine("void setup(int s) {");
        increaseIndent();
        addEmptyLine();
        addLine("// read config from xml file");
        addLine("numAgents = Integer.parseInt(getProperties().get(\"numAgents\").getValue());");
        
        environmentProperties();
        
        addEmptyLine();
        addLine("// create entities");
        addLine("agents = new agent[numAgents];");
        
        environmentEntities();
        
        addEmptyLine();
        addLine("// reset candidate representation");
        addLine("c.reset();");
        decreaseIndent();
        addLine("}");
        addEmptyLine();
    }

    private void environmentProperties() {
        for (AssociationEnd assocEnd : this.environment.getOwnedEnd()){
            AssociationEnd opposite = assocEnd.getOpposite();
            String key = "num" + opposite.getOwner().getName() + "s";
            addLine(key + " = Integer.parseInt(getProperties().get(\"" + key + "\").getValue());");    
        }
            
        for (Attribute attribute : this.environment.getOwnedAttribute()){
            String key = attribute.getName();
            addLine(key + " = Integer.parseInt(getProperties().get(\"" + key + "\").getValue());");    
        }
    }

    private void environmentEntities() {
        for (AssociationEnd assocEnd : this.environment.getOwnedEnd()){
            AssociationEnd opposite = assocEnd.getOpposite();
            org.modelio.metamodel.uml.statik.Classifier oppositeOwner = opposite.getOwner(); 
            String key = "num" + oppositeOwner.getName() + "s";
            addLine(oppositeOwner.getName().toLowerCase() + "s = new " + oppositeOwner.getName().toLowerCase() + "[" + key +"];");    
        }
    }

    private void simulateJava() {
        addLine("/**");
        addLine("* Execute the emergency exit simulation for a limited number of steps.");
        addLine("* ");
        addLine("* @return double: number of simulation steps plus negative sum of the minimum distance between each agent and the nearest emergency exit.");
        addLine("*/");        
        addLine("double simulate() {");
        increaseIndent();
        addLine("ArrayList<Float> output = a.representation.getOutput(input);");
        decreaseIndent();
        addLine("}");
        addEmptyLine();
    }

    private void agentJava() {
        addLine("/**");
        addLine(" * Class representing one agent in the problem.");
        addLine(" */");    
        addLine("public class " + this.agent.getName() + " {");
        increaseIndent();
        addLine("public AbstractRepresentation r;");
        
        classAttribute(this.agent);
        
        addEmptyLine();
        addLine("/**");
        addLine(" * Constructor.");
        addLine(" * @param r: representation of this agent.");
        addLine(" */");
        addLine("public " + this.agent.getName() + "(AbstractRepresentation r, boolean reachedExit ");
        parameter(this.agent);
        addLine(") {");
        increaseIndent();
        addLine("this.r = r;");
        
        constAttribute(this.agent);
        
        decreaseIndent();
        addLine("}");
        addEmptyLine();
        
        for (AssociationEnd assocEnd : this.environment.getOwnedEnd()){
            AssociationEnd opposite = assocEnd.getOpposite();
            generateClass(opposite.getOwner());
        }
        
        
        addEmptyLine();
    }

    private void generateClass(org.modelio.metamodel.uml.statik.Classifier generateClass) {
        addLine("/**");
        addLine(" * " + generateClass.getNoteContent(IModelerModulePeerModule.MODULE_NAME, IModelerModuleNoteTypes.MODELELEMENT_DESCRIPTION) );
        addLine(" */");
        addLine("public class " + generateClass.getName() + " {");
        increaseIndent();
        classAttribute(generateClass);
        decreaseIndent();
        addLine("}");
        addEmptyLine();
    }

    private void classAttribute(org.modelio.metamodel.uml.statik.Classifier generateClass) {
        for (Attribute attribute : generateClass.getOwnedAttribute()){
            String line = "";
            line += attribute.getVisibility().getLiteral() + " ";
            if (attribute.getType().getName().equals("integer")){
                line += "int" + " ";
            }else{
                line += attribute.getType().getName() + " ";
            }
            line += attribute.getName() + ";";
            addLine(line);    
        }
    }

    private void parameter(org.modelio.metamodel.uml.statik.Class generateClass) {
        for (Attribute attribute : generateClass.getOwnedAttribute()){
            String name = attribute.getName().toLowerCase();
            String line = " ," + name;
            addLine(line);    
        }
    }

    private void constAttribute(org.modelio.metamodel.uml.statik.Class generateClass) {
        for (Attribute attribute : generateClass.getOwnedAttribute()){
            String name = attribute.getName().toLowerCase();
            String line = "this." + name + " = " + name + ";";
            addLine(line);    
        }
    }

    private void maximumFitnessJava() {
        addLine("/**");
        addLine("* Get the maximum possible fitness.");
        addLine("* @return double: maximum fitness.");
        addLine("*/");
        addLine("@Override");
        addLine("public double getMaximumFitness() {");
        addLine("// TODO Auto-generated method stub");
        increaseIndent();
        addLine("return Double.MAX_VALUE;");
        decreaseIndent();
        addLine("}");
        addEmptyLine();
    }

    private void classJava() {
        addLine("/**");
        addLine(" */");
        
        addLine("public class EmergencyExitROS extends AbstractSingleProblem {");
        addEmptyLine();
        increaseIndent();
        
               
        addLine("/**");
        addLine("* Interface to ROS simulator.");
        addLine("*/");
        addLine("private simROS sim;");
        addEmptyLine();
              
        
        loadParameters();
        calcFitness();
        
        
        //        agentJava();
        //        simulateJava();
        //        setupJava();
        evaluateCandidate();
        replayWithVisualization();
        maximumFitnessJava();
        
        decreaseIndent();
        addLine("}");
    }

    private void envArray() {
        for (AssociationEnd assocEnd : this.environment.getOwnedEnd()){
            String name = assocEnd.getOpposite().getOwner().getName().toLowerCase();
            String line =  name + "[] " + name + "s;";
            addLine(line);
        }
    }

    private void envProperties() {
        for (AssociationEnd assocEnd : this.environment.getOwnedEnd()){
            
            String line = "int num" + assocEnd.getOpposite().getOwner().getName() + "s;";
            addLine(line);
        }
        
        
        for (Attribute attribute : this.environment.getOwnedAttribute()){
            String line = "";
            if (attribute.getType().getName().equals("integer")){
                line += "int" ;
            }else {
                line += attribute.getType().getName() ; 
            }
            line += " " + attribute.getName() + ";";
            addLine(line);
        }
    }

    private void headerJava() {
        addLine("package emergencyexitros;");
        addEmptyLine();
        addLine("import java.util.ArrayList;");
        addLine("import java.util.Hashtable;");
        addLine("import java.util.NavigableMap;");
        addEmptyLine();
        addLine("import core.AbstractRepresentation;");
        addLine("import core.AbstractSingleProblem;");
        addLine("import core.ProblemXMLData;");
        addEmptyLine();     
        addLine("import helper.simROS;");
        addLine("import helper.Environment;");
        addEmptyLine();
    }

    private void replayWithVisualization() {
        addLine("/**");        
        addLine("*  Simulate with visualization to introspect a certain candidate representation.");
        addLine("* @param AbstractRepresentation candidate: The candidate to introspect.");
        addLine("*/");
        
        addLine("@Override");
        addLine("public void replayWithVisualization(AbstractRepresentation candidate) {");
        increaseIndent();
        addLine("// create new simulator interface");     
        addLine("ProblemXMLData data = (ProblemXMLData) getXMLData();");
        addLine("sim = new simROS(candidate, getProperties().get(\"rosPath\").getValue(), getProperties().get(\"rosWs\").getValue(), getProperties().get(\"rosPackage\").getValue(), data.getRequiredNumberOfOutputs());");
        addEmptyLine();
        addLine("// read config for simulation");
        addLine("loadParameters();");
        addEmptyLine();
        addLine("// run simulation");
        addLine("sim.runVisual();");
        decreaseIndent();
        addLine("}");
    }

    private void loadParameters() {
        addLine("/**");
        addLine("* Load configuration parameters and store in simulator interface.");
        addLine("*/");
        addLine("private void loadParameters() {");
        increaseIndent();
        addLine("// general simulation parameters for ROS");
        addLine("Hashtable<String,String> params = new Hashtable<String, String>();");
        addLine("params.put(\"steps\", getProperties().get(\"steps\").getValue());");
        addLine("params.put(\"agents\", getProperties().get(\"swarmMembers\").getValue());");
        addLine("sim.setParameters(params);");
        addEmptyLine();
        addLine("// name of the environment to simulate in");
        addLine("sim.setEnvironment(Environment.fromString(getProperties().get(\"environment\").getValue()));");
        decreaseIndent();
        addLine("}");
        addEmptyLine();
    }

    private void calcFitness() {
        addLine("/**");
        addLine("* Calculate the fitness score of the last simulation run.");
        addLine("* @return double: The fitness score.");
        addLine("*/");
        addLine("private double calcFitness() {");
        increaseIndent();
        addLine("// get content from log files");
        addLine("ArrayList<NavigableMap<Integer,Double>> logs = sim.getLogs();");
        addEmptyLine();
        
        addLine("// fitness score is negative sum of all distances");
        addLine("double dist = 0;");
        addEmptyLine();
        
        addLine("// iterate all log files");
        addLine("for (NavigableMap<Integer,Double> log : logs) {");
        increaseIndent();
        addLine("if (log.size() > 0)");
        addLine("// take last line of log file");
        addLine("dist = dist + log.lastEntry().getValue();");
        decreaseIndent();
        addLine("}");
        addEmptyLine();
        
        addLine("// return negative distance as fitness;");
        addLine("return -dist;");
        decreaseIndent();
        addLine("}");
        addEmptyLine();
    }

}
