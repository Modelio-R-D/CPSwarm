package org.modelio.module.cpswarm.propertypage;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.GeneralClass;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.module.cpswarm.impl.CPSwarmModule;

public class AttributePropertyPage implements IPropertyContent {
    @Override
    public void update(ModelElement element, IModulePropertyTable table) {
        Attribute attribute = (Attribute) element;
        
        // Attribute Type
        Package defaultUMLTypes = CPSwarmModule.getInstance().getModuleContext().getModelingSession().findElementById(Package.class, "00000004-0000-0004-0000-000000000000");
        List<String> defaultTypes = defaultUMLTypes.getOwnedElement(GeneralClass.class).stream().map(GeneralClass::getName).collect(Collectors.toCollection(ArrayList::new));
        table.addProperty("Type", attribute.getType().getName(), defaultTypes.toArray(new String[defaultTypes.size()]));
    }

    @Override
    public int changeProperty(ModelElement element, int row, String value) {
        Attribute attribute = (Attribute) element;
        
        switch (row) {
        //Type
        case 1:
            Package defaultUMLTypes = CPSwarmModule.getInstance().getModuleContext().getModelingSession().findElementById(Package.class, "00000004-0000-0004-0000-000000000000");
            for (GeneralClass generalClass : defaultUMLTypes.getOwnedElement(GeneralClass.class)) {
                if (generalClass.getName().equals(value)) {
                    attribute.setType(generalClass);
                }
            }
            break;
        default:
            break;
        }
        return 1;
    }

}
