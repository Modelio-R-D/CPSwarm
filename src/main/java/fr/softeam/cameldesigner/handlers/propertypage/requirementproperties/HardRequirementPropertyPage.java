package fr.softeam.cameldesigner.handlers.propertypage.requirementproperties;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.requirementmodel.standard.generalclass.HardRequirement;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("ad2a1109-c0ec-4502-889d-00dc89df3985")
public class HardRequirementPropertyPage<T extends HardRequirement> extends RequirementPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("4062199c-be6d-4e89-85a2-fa10c736fc1c")
    @Override
    public int changeProperty(int row, String value) {
        return super.changeProperty(row, value);
    }

    /**
     * This method handles the construction of the property table of a selected element
     * @param MObject : the selected element
     * 
     * @param table : the property table to fulfill
     */
    @objid ("5ed87be5-3bef-429a-bf5f-1a3f6d2f93f4")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("d6e1428e-9b1b-40c7-b67c-6e0499d4b38d")
    public HardRequirementPropertyPage(T elt) {
        super(elt);
    }

}
