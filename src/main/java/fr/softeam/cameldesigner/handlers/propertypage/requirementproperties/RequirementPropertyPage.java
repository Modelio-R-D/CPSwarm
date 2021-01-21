package fr.softeam.cameldesigner.handlers.propertypage.requirementproperties;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.requirementmodel.standard.generalclass.Requirement;
import fr.softeam.cameldesigner.handlers.propertypage.coreproperties.FeaturePropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("fe5aa9e5-f2bd-4b01-976d-5a5997546c17")
public class RequirementPropertyPage<T extends Requirement> extends FeaturePropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("ba6fafc8-15e0-484e-8f56-f7cbb863ac58")
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
    @objid ("07c84615-8182-4da5-b2c5-fd32c23ba298")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("38b79d99-2b42-4196-9c86-1378de55e5ef")
    public RequirementPropertyPage(T elt) {
        super(elt);
    }

}
