package org.modelio.module.cpswarm.propertypage;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

public class RosMessagingPropertyPage implements IPropertyContent {
    @Override
    public void update(ModelElement element, IModulePropertyTable table) {
    }

    @Override
    public int changeProperty(ModelElement element, int row, String value) {
        return 0;
    }

}
