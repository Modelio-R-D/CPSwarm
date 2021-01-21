package fr.softeam.cameldesigner.handlers.propertypage.locationproperties;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.locationmodel.standard.enumeration.Location;
import fr.softeam.cameldesigner.handlers.propertypage.coreproperties.NamedElementPropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("97cb0753-85cc-47f3-bb00-5701574f35f0")
public class LocationPropertyPage<T extends Location> extends NamedElementPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("5d42345c-bee2-4b70-ab5b-a46fe09df925")
    @Override
    public int changeProperty(int row, String value) {
        int currentRow = super.changeProperty(row, value);
        
        this.element.setId(value);
        return currentRow -1;
    }

    /**
     * This method handles the construction of the property table of a selected element
     * @param MObject : the selected element
     * 
     * @param table : the property table to fulfill
     */
    @objid ("f39bb4c8-1da4-494a-b07a-dde7fe930107")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
        table.addProperty("Id",  getValue(this.element.getId()));
    }

    @objid ("565ee01b-e1c4-4010-9534-c40379b0add2")
    public LocationPropertyPage(T elt) {
        super(elt);
    }

}
