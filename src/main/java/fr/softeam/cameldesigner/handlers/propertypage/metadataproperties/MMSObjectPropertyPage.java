package fr.softeam.cameldesigner.handlers.propertypage.metadataproperties;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.metadatamodel.infrastructure.modelelement.MmsObject;
import fr.softeam.cameldesigner.handlers.propertypage.coreproperties.NamedElementPropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("c531b564-29df-480a-96bc-d2ecdd641c75")
public class MMSObjectPropertyPage<T extends MmsObject> extends NamedElementPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("5635c143-8082-43e5-8c52-0a8ab14fa34e")
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
    @objid ("cd6b5a49-c730-4f18-bf2f-08441b786dad")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("75db2859-5bc1-47f8-9002-ad0985f2786a")
    public MMSObjectPropertyPage(T elt) {
        super(elt);
    }

}
