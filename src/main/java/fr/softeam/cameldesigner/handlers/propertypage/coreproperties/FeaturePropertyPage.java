package fr.softeam.cameldesigner.handlers.propertypage.coreproperties;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.Feature;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("806c7ae3-78ff-434d-adb0-352d8c7b0c07")
public class FeaturePropertyPage<T extends Feature> extends NamedElementPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("eaf9b087-3b41-4c30-8924-1d9602be125b")
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
    @objid ("508dc122-6400-47a7-aa16-eb42a9f96556")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("b1cca794-a24e-42e6-9ad5-a42b271c63b5")
    public FeaturePropertyPage(T elt) {
        super(elt);
    }

}
