package fr.softeam.cameldesigner.handlers.propertypage.requirementproperties;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ServiceLevelObjective;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("ec504d78-c35f-4f98-9c60-ea964f572474")
public class ServiceLevelObjectivePropertyPage<T extends ServiceLevelObjective> extends HardRequirementPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("da9be212-6c43-4056-93d9-37b40f6078fb")
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
    @objid ("c6695d55-9608-49f5-b192-d4f6b906aa9e")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("fbba2336-c6a0-4e79-a049-78eb53d1b58f")
    public ServiceLevelObjectivePropertyPage(T elt) {
        super(elt);
    }

}
