package fr.softeam.cameldesigner.handlers.propertypage.requirementproperties;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.requirementmodel.standard.generalclass.ScaleRequirement;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("6c998c45-c7c2-4a68-9ce5-081558e11aaa")
public class ScaleRequirementPropertyPage<T extends ScaleRequirement> extends RequirementPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("bb102d8e-9097-40b4-b26a-8d29e2acc4e8")
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
    @objid ("9d835218-cbe0-4051-b023-9d7d1d3543da")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("75fdf062-59c1-475f-81c2-638aa813b54b")
    public ScaleRequirementPropertyPage(T elt) {
        super(elt);
    }

}
