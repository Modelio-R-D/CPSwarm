package fr.softeam.cameldesigner.handlers.propertypage.coreproperties;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.standard.package_.CamelModel;
import fr.softeam.cameldesigner.utils.CamelDesignerResourcesManager;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("7d0cf426-9308-4b4c-823a-cba67e1c386b")
public class CamelModelPropertyPage<T extends CamelModel> extends NamedElementPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("bf1e8483-f50c-44e9-a5c3-129175bc862c")
    @Override
    public int changeProperty(int row, String value) {
        int currentRow = super.changeProperty(row, value);
        
        if(currentRow == 1){
            this.element.setApplicationName(value);
        }else if (currentRow == 2) {
            this.element.setApplicationVersion(value);
        }
        return currentRow - 2;
    }

    /**
     * This method handles the construction of the property table of a selected element
     * @param MObject : the selected element
     * 
     * @param table : the property table to fulfill
     */
    @objid ("81a96e08-b270-4fa7-8622-4fdb0b011bca")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
        //Application Name
        table.addProperty(CamelDesignerResourcesManager.getPropertyName(CamelModel.APPLICATIONNAME_TAGTYPE), getValue(this.element.getApplicationName()));
        
        //Application Version
        table.addProperty(CamelDesignerResourcesManager.getPropertyName(CamelModel.APPLICATIONVERSION_TAGTYPE), getValue(this.element.getApplicationVersion()));
    }

    @objid ("c7ee25bb-4ac6-4fcf-826a-96771882b410")
    public CamelModelPropertyPage(T elt) {
        super(elt);
    }

}
