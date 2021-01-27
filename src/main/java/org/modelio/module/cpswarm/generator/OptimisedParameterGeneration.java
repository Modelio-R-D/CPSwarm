package org.modelio.module.cpswarm.generator;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.module.cpswarm.api.CPSwarmStereotypes;
import org.modelio.module.cpswarm.api.ICPSwarmPeerModule;
import org.modelio.module.cpswarm.api.cpswarm_concept.standard.associationend.OptimisedEnd;
import org.modelio.module.cpswarm.api.cpswarm_concept.standard.parameter.OptimisedParameter;
import org.modelio.module.cpswarm.impl.CPSwarmModule;
import org.modelio.module.cpswarm.type.optimisation.OptimisedParameters;
import org.modelio.module.cpswarm.utils.FileUtils;

public class OptimisedParameterGeneration extends Generator implements IGenerator {
    public OptimisedParameterGeneration(File file) {
        this.file = file;
    }

    @Override
    public void generate() {
        OptimisedParameters optiParameters = exportParams();
        
        //Serialization
        try {
        
            ObjectMapper mapper = new ObjectMapper();
            String json = mapper.writeValueAsString(optiParameters);
            this.content.append(json);
        
            if (!this.file.exists()){
                this.file.getParentFile().mkdirs();
                this.file.createNewFile();
            }
        
            try {
                FileUtils.write(this.file, this.content);
            } catch (Exception e) {
                e.printStackTrace();
            }
        
        } catch (IOException e) {
            CPSwarmModule.logService.error(e);
        }
    }

    private OptimisedParameters exportParams() {
        OptimisedParameters result = new OptimisedParameters();
        List<org.modelio.module.cpswarm.type.optimisation.Parameter> parameters = new ArrayList<>();
        
        Collection<Parameter> params = CPSwarmModule.getInstance().getModuleContext().getModelingSession().findByClass(Parameter.class);
        
        for (Parameter param : params) {
            if (param.isStereotyped(ICPSwarmPeerModule.MODULE_NAME, CPSwarmStereotypes.OPTIMISEDPARAMETER)) {
               OptimisedParameter modelioParam = OptimisedParameter.instantiate(param);
               org.modelio.module.cpswarm.type.optimisation.Parameter optiParam = new org.modelio.module.cpswarm.type.optimisation.Parameter();
               optiParam.setName(param.getName());
               optiParam.setMin(modelioParam.getMin());
               optiParam.setMax(modelioParam.getMax());
               optiParam.setScale(modelioParam.getScale());
               optiParam.setMeta("file:" + modelioParam.getFile());
               parameters.add(optiParam);
            }
        }
        
        Collection<AssociationEnd> ends = CPSwarmModule.getInstance().getModuleContext().getModelingSession().findByClass(AssociationEnd.class);
        
        for (AssociationEnd end : ends) {
            if (end.isStereotyped(ICPSwarmPeerModule.MODULE_NAME, OptimisedEnd.STEREOTYPE_NAME)) {
               OptimisedEnd modelioParam = OptimisedEnd.instantiate(end);
               org.modelio.module.cpswarm.type.optimisation.Parameter optiParam = new org.modelio.module.cpswarm.type.optimisation.Parameter();
               optiParam.setName(end.getName());
               optiParam.setMin(modelioParam.getMin());
               optiParam.setMax(modelioParam.getMax());
               optiParam.setScale(modelioParam.getScale());
               optiParam.setMeta("command_line");
               parameters.add(optiParam);
            }
        }
        
        result.setParameters(parameters);
        return result;
    }

}
