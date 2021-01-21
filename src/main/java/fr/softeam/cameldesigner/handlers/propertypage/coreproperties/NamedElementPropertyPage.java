package fr.softeam.cameldesigner.handlers.propertypage.coreproperties;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerAbstractProxy;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.NamedElement;
import fr.softeam.cameldesigner.api.metadatamodel.infrastructure.modelelement.MmsObject;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("790accee-f24f-4970-96f9-27559763c3fb")
public class NamedElementPropertyPage<T extends NamedElement> extends CamelElementPropertyPage<T> {
    @objid ("ef6064d4-47ae-496c-878d-780f08d58be4")
    private List<ModelElement> _annotations = null;

    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("eee1cd6a-0e73-4cd5-b450-65163338b435")
    @Override
    public int changeProperty(int row, String value) {
        int currentRow = super.changeProperty(row, value);
        
        if(currentRow == 1){
            ModelElement elt = getModelElt(this._annotations, value);
            if (elt.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MmsObject.STEREOTYPE_NAME)) {
                Object mmsObj = CamelDesignerProxyFactory.instantiate(elt);
                if (value.startsWith(this.add)) {
                    this.element.addAnnotations((MmsObject) mmsObj);
                }else {
                    this.element.removeAnnotations((MmsObject) mmsObj);
                }
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
    @objid ("c43530f4-0978-4bab-846b-9802c1fd14dd")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
        //Annotations
        table.addProperty("Annotations", getCamelValue(this.element.getAnnotations()), getAddRemove(this._annotations, this.element.getAnnotations()));
    }

    @objid ("999aef69-7222-4059-ae86-3df082c6f055")
    public NamedElementPropertyPage(T elt) {
        super(elt);
        
        this._annotations = CamelDesignerAbstractProxy.getMMSObject();
    }

}
