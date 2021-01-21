package fr.softeam.cameldesigner.handlers.propertypage.dataproperties;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.datamodel.standard.instance.DataInstance;
import fr.softeam.cameldesigner.api.datamodel.standard.instance.DataSourceInstance;
import fr.softeam.cameldesigner.handlers.propertypage.coreproperties.NamedElementPropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("ee6dd469-4bdb-4086-ab42-df04ed380434")
public class DataInstancePropertyPage<T extends DataInstance> extends NamedElementPropertyPage<T> {
    @objid ("c4ad9b6b-5286-4bd7-88f1-de6a0b80c479")
    private List<ModelElement> _dataSourceInstances;

    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("4a9efc80-c0f4-4fef-bf86-782dbe73b7c4")
    @Override
    public int changeProperty(int row, String value) {
        int currentRow = super.changeProperty(row, value);
        
        if(currentRow == 1) {
            ModelElement elt = getModelElt(this._dataSourceInstances, value);
            if (DataSourceInstance.canInstantiate(elt)) {
                this.element.setDataSourceInstance(DataSourceInstance.instantiate((org.modelio.metamodel.uml.statik.Instance)elt));
            }
        }
        return currentRow - 1;
    }

    /**
     * This method handles the construction of the property table of a selected element
     * @param MObject : the selected element
     * 
     * @param table : the property table to fulfill
     */
    @objid ("c2bfa98d-38b0-456a-a017-ae262077c4df")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
        //DataSource
        table.addProperty("Data Source Instance", getCamelName(this.element.getDataSourceInstance()));
    }

    @objid ("49ad7845-6ed2-44ab-b4ca-a1235b7c0198")
    public DataInstancePropertyPage(T elt) {
        super(elt);
        
        this._dataSourceInstances = DataSourceInstance.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
    }

}
