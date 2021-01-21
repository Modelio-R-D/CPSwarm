package fr.softeam.cameldesigner.handlers.propertypage.locationproperties;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.locationmodel.standard.enumeration.GeographicalRegion;
import fr.softeam.cameldesigner.handlers.propertypage.coreproperties.NamedElementPropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("82645d05-9da9-41ae-9799-bd04591b5d97")
public class GeographicalRegionPropertyPage<T extends GeographicalRegion> extends NamedElementPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("0ee11791-a01d-44ad-9041-76fd1d32fc17")
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
    @objid ("a0993606-4dba-4b6d-b6ea-afcea87cd555")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("bd0b52f7-60b0-4a41-9d19-225ab82beacc")
    public GeographicalRegionPropertyPage(T elt) {
        super(elt);
    }

}
