package org.modelio.module.cpswarm.propertypage;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.DataType;
import org.modelio.metamodel.uml.statik.GeneralClass;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.metamodel.uml.statik.Port;
import org.modelio.metamodel.uml.statik.PortOrientation;
import org.modelio.module.cpswarm.api.CPSwarmStereotypes;
import org.modelio.module.cpswarm.api.ICPSwarmPeerModule;
import org.modelio.module.cpswarm.impl.CPSwarmModule;
import org.modelio.module.sysml.api.ISysMLPeerModule;
import org.modelio.module.sysml.api.SysMLStereotypes;

public class PortPropertyPage implements IPropertyContent {
    @Override
    public void update(ModelElement element, IModulePropertyTable table) {
        Port port = (Port) element;
        
        //Port base type
        Package defaultUMLTypes = CPSwarmModule.getInstance().getModuleContext().getModelingSession().findElementById(Package.class, "00000004-0000-0004-0000-000000000000");
        Set<String> defaultTypes = defaultUMLTypes.getOwnedElement(GeneralClass.class).stream().map(GeneralClass::getName).collect(Collectors.toCollection(HashSet::new));
        for (DataType dataType : CPSwarmModule.getInstance().getModuleContext().getModelingSession().findByClass(DataType.class)) {
            if (dataType.isStereotyped(ISysMLPeerModule.MODULE_NAME, SysMLStereotypes.VALUETYPE)) {
                defaultTypes.add(dataType.getName());
            }
        }
        table.addProperty("Base", port.getBase() != null ? port.getBase().getName() : "", defaultTypes.toArray(new String[defaultTypes.size()]));
        
        //Direction
        table.addProperty("Direction", port.getDirection().getName(), new String[] { "None", "In", "Out", "In/Out" });
        
        //Optimised
        table.addProperty("Optimised", element.isStereotyped(ICPSwarmPeerModule.MODULE_NAME, CPSwarmStereotypes.OPTIMISEDPORT));
    }

    @Override
    public int changeProperty(ModelElement element, int row, String value) {
        Port port = (Port) element;
        switch (row) {
        case 1:
            Package defaultUMLTypes = CPSwarmModule.getInstance().getModuleContext().getModelingSession().findElementById(Package.class, "00000004-0000-0004-0000-000000000000");
            for (NameSpace nameSpace : defaultUMLTypes.getOwnedElement(NameSpace.class)) {
                if (nameSpace.getName().equals(value)) {
                    port.setBase(nameSpace);
                }
            }
            for (DataType dataType : CPSwarmModule.getInstance().getModuleContext().getModelingSession().findByClass(DataType.class)) {
                if (dataType.getName().equals(value)) {
                    port.setBase(dataType);
                }
            }
            break;
            
        case 2:
            switch (value) {
            case "None":
                port.setDirection(PortOrientation.NONE);
                break;
            case "In":
                port.setDirection(PortOrientation.IN);
                break;
            case "Out":
                port.setDirection(PortOrientation.OUT);
                break;
            case "In/Out":
                port.setDirection(PortOrientation.INOUT);
                break;
            default:
                break;
            }
            break;
            
        case 3:
            
            // Optimised       
            if (Boolean.valueOf(value)) {
                element.addStereotype(ICPSwarmPeerModule.MODULE_NAME, CPSwarmStereotypes.OPTIMISEDPORT);
            }else {
                element.removeStereotypes(ICPSwarmPeerModule.MODULE_NAME, CPSwarmStereotypes.OPTIMISEDPORT);
            }
            break;
            
        
        default:
            break;
        }
        return 3;
    }

}
