package fr.softeam.cameldesigner.handlers.propertypage.deploymentproperties;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ScriptConfiguration;
import fr.softeam.cameldesigner.handlers.propertypage.coreproperties.NamedElementPropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("a8af964e-700c-4bda-ad76-13b0cc00daa1")
public class ScriptConfigurationPropertyPage<T extends ScriptConfiguration> extends NamedElementPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("ece3266e-0042-4dbd-a328-d6464640bac0")
    @Override
    public int changeProperty(int row, String value) {
        int currentRow = super.changeProperty(row, value);
        
        switch (currentRow) {
        
        case 1 :
            this.element.setUploadCommandNote(value);
        
        case 2 :
            this.element.setInstallCommandNote(value);
        
        case 3 :
            this.element.setStartCommandNote(value);
        
        case 4 :
            this.element.setStopCommandNote(value);
        
        case 5 :
            this.element.setDownloadCommandNote(value);
        
        case 6 :
            this.element.setConfigureCommandNote(value);
        
        case 7 :
            this.element.setUpdateCommandNote(value);
        
        case 8 :
            this.element.setDevopsTool(value);
        
        case 9 :
            this.element.setOs(value);
        
        case 10 :
            this.element.setImageId(value);
        }
        return currentRow - 10;
    }

    /**
     * This method handles the construction of the property table of a selected element
     * @param MObject : the selected element
     * 
     * @param table : the property table to fulfill
     */
    @objid ("dfbcf22f-829a-4ffd-b196-9203508f1936")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
        table.addProperty("Upload Command", getValue(this.element.getUploadCommandNote()));
        
        table.addProperty("Install Command",  getValue(this.element.getInstallCommandNote()));
        
        table.addProperty("Start Command",  getValue(this.element.getStartCommandNote()));
        
        table.addProperty("Stop Command",  getValue(this.element.getStopCommandNote()));
        
        table.addProperty("Download Command",  getValue(this.element.getDownloadCommandNote()));
        
        table.addProperty("Configure Command",  getValue(this.element.getConfigureCommandNote()));
        
        table.addProperty("Update Command",  getValue(this.element.getUpdateCommandNote()));
        
        table.addProperty("Devops Tool",  getValue(this.element.getDevopsTool()));
        
        table.addProperty("OS",  getValue(this.element.getOs()));
        
        table.addProperty("ImageId",  getValue(this.element.getImageId()));
    }

    @objid ("7650265f-b996-4384-bf8d-15cc9e7e4b29")
    public ScriptConfigurationPropertyPage(T elt) {
        super(elt);
    }

}
