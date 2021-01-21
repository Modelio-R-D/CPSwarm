package fr.softeam.cameldesigner.handlers.propertypage.coreproperties;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.standard.attribute.AttributeAttribute;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("4973c73b-3b7e-4de0-9771-8b3711c42f0a")
public class AttributeAttributePropertyPage<T extends AttributeAttribute> extends CamelAttributePropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("d5138a07-db69-403a-a435-246618a1bb82")
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
    @objid ("27c720e0-856e-4345-99f5-3ae34f0d5026")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("2de62bf6-a775-464f-bcc9-ab51f149f1c7")
    public AttributeAttributePropertyPage(T elt) {
        super(elt);
    }

}
