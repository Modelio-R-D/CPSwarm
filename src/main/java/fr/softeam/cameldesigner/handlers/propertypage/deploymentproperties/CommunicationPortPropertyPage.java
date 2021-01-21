package fr.softeam.cameldesigner.handlers.propertypage.deploymentproperties;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.port.CommunicationPort;
import fr.softeam.cameldesigner.handlers.propertypage.coreproperties.NamedElementPropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("f51e66ad-5490-4a12-9412-f60a76a980da")
public class CommunicationPortPropertyPage<T extends CommunicationPort> extends NamedElementPropertyPage<T> {
    @objid ("7b457ef3-b5d8-428b-9b5b-c7322f0e48e6")
    public CommunicationPortPropertyPage(T elt) {
        super(elt);
    }

    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("8ef1df7d-e9da-492a-a772-6115be1a67f0")
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
    @objid ("0b3e0237-2dc6-4375-a1b1-e84d99066b0f")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

}
