package fr.softeam.cameldesigner.handlers.propertypage.requirementproperties;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.LocationRequirement;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("554848a8-bbb1-4f16-9549-aac73c541805")
public class LocationRequirementPropertyPage<T extends LocationRequirement> extends HardRequirementPropertyPage<T> {
    @objid ("61ffcf1a-5ec6-4a70-bee2-b1985512c139")
    private List<ModelElement> _locations = null;

    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("27936cf5-f602-49ff-b29b-c7019f3a2975")
    @Override
    public int changeProperty(int row, String value) {
        int currentRow = super.changeProperty(row, value);
        
        switch (currentRow) {
        
        case 1 :
        //            ModelElement elt = getModelElt(this._annotations, value);
        //            if (elt.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MmsObject.STEREOTYPE_NAME)) {
        //                Object mmsObj = CamelDesignerProxyFactory.instantiate(elt);
        //                if (value.startsWith(this.add)) {
        //                    this.element.addAnnotations((MmsObject) mmsObj);
        //                }else {
        //                    this.element.removeAnnotations((MmsObject) mmsObj);
        //                }
        //            }
        
        case 2 :
            Boolean allRequirement = Boolean.valueOf(value);
            this.element.setAllRequired(allRequirement);
        }
        return currentRow - 2;
    }

    /**
     * This method handles the construction of the property table of a selected element
     * @param MObject : the selected element
     * 
     * @param table : the property table to fulfill
     */
    @objid ("2a66bbf7-a8b5-45d2-9df2-c8c96da78ac6")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
              //Locations
        //                table.addProperty("Locations", this.element);
        //                table.addProperty("Annotations", getCamelValue(this.element.getAnnotations()), getAddRemove(this._annotations, this.element.getAnnotations()));
        
              //AllRequired
        table.addProperty("AllRequired", this.element.isAllRequired());
    }

    @objid ("c3139e3e-3237-468d-8650-34ffbee17d5e")
    public LocationRequirementPropertyPage(T elt) {
        super(elt);
        //        this._locations = CamelDesignerAbstractProxy.getLocations();
    }

}
