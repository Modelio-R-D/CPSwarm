package org.modelio.module.cpswarm.propertypage;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.cpswarm.api.CPSwarmTagTypes;
import org.modelio.module.cpswarm.api.ICPSwarmPeerModule;
import org.modelio.module.cpswarm.utils.ModelUtils;

public class FitnessFunctionPropertyPage implements IPropertyContent {
    @Override
    public int changeProperty(ModelElement element, int row, String value) {
        if(row == 1){
            ModelUtils.addValue(ICPSwarmPeerModule.MODULE_NAME, CPSwarmTagTypes.FITNESSFUNCTION_MINIMUMCANDIDATES, value, element);
        }else if(row == 2){
            ModelUtils.addValue(ICPSwarmPeerModule.MODULE_NAME, CPSwarmTagTypes.FITNESSFUNCTION_MAXIMUMCANDIDATES, value, element);
        }
        return 2;
    }

    @Override
    public void update(ModelElement element, IModulePropertyTable table) {
        String value = ModelUtils.getTaggedValue(CPSwarmTagTypes.FITNESSFUNCTION_MINIMUMCANDIDATES, element);    
        table.addProperty("MinCandidates", value);
        
        value = ModelUtils.getTaggedValue(CPSwarmTagTypes.FITNESSFUNCTION_MAXIMUMCANDIDATES, element);
        table.addProperty("MaxCandidates", value);
    }

}
