package org.modelio.module.cpswarm.propertypage;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.cpswarm.api.CPSwarmStereotypes;
import org.modelio.module.cpswarm.api.ICPSwarmPeerModule;

public class ParameterPropertyPage implements IPropertyContent {
    @Override
    public int changeProperty(ModelElement element, int row, String value) {
        if(row == 1){           
            // Optimised       
            if (Boolean.valueOf(value)) {
                element.addStereotype(ICPSwarmPeerModule.MODULE_NAME, CPSwarmStereotypes.OPTIMISEDPARAMETER);
            }else {
                element.removeStereotypes(ICPSwarmPeerModule.MODULE_NAME, CPSwarmStereotypes.OPTIMISEDPARAMETER);
            }
        }
        return 1;
    }

    @Override
    public void update(ModelElement element, IModulePropertyTable table) {
        table.addProperty("Optimised", element.isStereotyped(ICPSwarmPeerModule.MODULE_NAME, CPSwarmStereotypes.OPTIMISEDPARAMETER));
    }

}
