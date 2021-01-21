package fr.softeam.cameldesigner.handlers.propertypage.deploymentproperties;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.port.HostingPort;
import fr.softeam.cameldesigner.handlers.propertypage.coreproperties.NamedElementPropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("017e7a67-764b-480e-8cc0-ae3968ee646b")
public class ProvidedHostPropertyPage<T extends HostingPort> extends NamedElementPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("ede7c8cd-10b8-46da-a1c0-0fcd10e913be")
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
    @objid ("070467f1-421f-48b6-a6cb-6487e5b97df4")
    @Override
    public void update(IModulePropertyTable table) {
        // TODO Auto-generated method stub
    }

    @objid ("bc39b4c2-eeb9-45cb-b145-9d609edd50f8")
    public ProvidedHostPropertyPage(T elt) {
        super(elt);
    }

}
