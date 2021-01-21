package fr.softeam.cameldesigner.handlers.propertypage.coreproperties;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.FeatureClass;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("5ef97125-be13-402d-a0f5-ac3b9f8b012b")
public class FeatureClassPropertyPage<T extends FeatureClass> extends FeaturePropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("540bf213-47ee-43e3-a65d-926e00122752")
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
    @objid ("579c4e45-859c-4f67-874f-0764f904e46a")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("948072b0-2a12-4a5c-9c2b-4c5ba576810c")
    public FeatureClassPropertyPage(T elt) {
        super(elt);
    }

}
