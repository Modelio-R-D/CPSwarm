package fr.softeam.cameldesigner.handlers.propertypage.coreproperties;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelAttribute;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("12f410b2-36df-4308-944f-aba11af42e20")
public class CamelAttributePropertyPage<T extends CamelAttribute> extends NamedElementPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("962a5516-d661-474c-9ffb-ebee3a73f764")
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
    @objid ("95872f3e-392a-4677-866d-d0b5dfa99418")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("55b83a02-f8f3-4f27-a43e-a5aadc616fb9")
    public CamelAttributePropertyPage(T elt) {
        super(elt);
    }

}
