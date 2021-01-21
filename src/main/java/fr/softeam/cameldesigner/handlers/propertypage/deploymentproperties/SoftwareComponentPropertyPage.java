package fr.softeam.cameldesigner.handlers.propertypage.deploymentproperties;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.SoftwareComponent;
import fr.softeam.cameldesigner.handlers.propertypage.coreproperties.NamedElementPropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("7e7fbf02-6d70-4228-bfe3-37cb97d10044")
public class SoftwareComponentPropertyPage<T extends SoftwareComponent> extends NamedElementPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("a18016cf-c548-4b33-a9f8-687757cda425")
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
    @objid ("dd90fd2c-ab2d-4130-a894-2ddb357d0e72")
    @Override
    public void update(IModulePropertyTable table) {
        // TODO Auto-generated method stub
    }

    @objid ("8e560be0-2006-4f5f-ae3a-40bfce86f74c")
    public SoftwareComponentPropertyPage(T elt) {
        super(elt);
    }

}
