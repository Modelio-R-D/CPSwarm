package org.modelio.module.cpswarm.impl;

import java.util.List;
import org.modelio.api.module.IModule;
import org.modelio.api.module.propertiesPage.AbstractModulePropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.cpswarm.propertypage.CPSwarmPropertyManager;
import org.modelio.vcore.smkernel.mapi.MObject;

public class CPSwarmProperties extends AbstractModulePropertyPage {
    public CPSwarmProperties(IModule module, String name, String label, String bitmap) {
        super(module, name, label, bitmap);
    }

    /**
     * This method is called when the current selection changes and the property box content requires an update.
     * The 'selectedElements' parameter contains the list of the newly selected elements.
     * The 'table' parameter is the table that must be filled with the updated contents of the property box before returning.
     */
    @Override
    public void update(List<MObject> selectedElements, IModulePropertyTable table) {
        if((selectedElements.size() != 0) &&  (selectedElements.get(0) instanceof ModelElement)) {
        
            ModelElement obmo = (ModelElement) selectedElements.get(0);
            
            CPSwarmPropertyManager CPSwarm = new CPSwarmPropertyManager();
            CPSwarm.update(obmo, table);        
        }
    }

    /**
     * This method is called when a value has been edited in the property box in the 'row' row.
     * The 'selectedElements' parameter contains the list of the currently selected elements.
     * The 'row' parameter is the row number of the modified value.
     * The 'value' parameter is the new value the user has set to the given row.
     */
    @Override
    public void changeProperty(List<MObject> selectedElements, int row, String value) {
        /* Typical code in this method consists in switching to the row number, 
         * transforming the string value into the proper internal type and 
         * setting the proper attribute of the selected element(s) to the new value.
         * Remember that if the model changes, a transaction is required.
         */
        
        /*
         * NE PAS Mettre De Transition ICI
         */
        if((selectedElements.size() != 0) &&  (selectedElements.get(0) instanceof ModelElement)) {
            ModelElement element = (ModelElement) selectedElements.get(0);
            
            CPSwarmPropertyManager CPSwarm = new CPSwarmPropertyManager();
            row = CPSwarm.changeProperty(element, row, value);      
            
        }
    }

}
