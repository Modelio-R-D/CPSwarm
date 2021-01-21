package fr.softeam.cameldesigner.handlers.propertypage.dataproperties;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.datamodel.standard.class_.Data;
import fr.softeam.cameldesigner.api.datamodel.standard.class_.DataSource;
import fr.softeam.cameldesigner.handlers.propertypage.coreproperties.NamedElementPropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("d24ad1ab-65c5-4b47-9b03-d186e2dfc683")
public class DataPropertyPage<T extends Data> extends NamedElementPropertyPage<T> {
    @objid ("939381c2-97b3-4500-8c46-4e3f087bb38b")
    private List<ModelElement> _dataSources;

    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("f7dccb5c-c056-4d77-b198-26fc2b20e388")
    @Override
    public int changeProperty(int row, String value) {
        int currentRow = super.changeProperty(row, value);
        
        if(currentRow == 1) {
            ModelElement elt = getModelElt(this._dataSources, value);
            if (DataSource.canInstantiate(elt)) {
                this.element.setDataSource(DataSource.instantiate((org.modelio.metamodel.uml.statik.Class)elt));
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
    @objid ("52428d50-731d-4d95-8c51-0e5906299938")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
        //DataSource
        table.addProperty("DataSource", getCamelName(this.element.getDataSource()));
    }

    @objid ("2c889eec-7758-4d50-b275-b3d9810f5451")
    public DataPropertyPage(T elt) {
        super(elt);
        
        this._dataSources = DataSource.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
    }

}
