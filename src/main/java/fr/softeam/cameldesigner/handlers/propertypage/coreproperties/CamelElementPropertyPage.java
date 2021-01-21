package fr.softeam.cameldesigner.handlers.propertypage.coreproperties;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.handlers.propertypage.IPropertyContent;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("b0b23b1d-2c4d-436c-b5da-90182576cbb9")
public class CamelElementPropertyPage<T extends CamelElement> implements IPropertyContent {
    @objid ("af3b795a-4b31-4a52-95d0-320e53661f29")
    protected T element;

    @objid ("dee0cc07-37db-44ed-a7f4-9456eeedcfad")
    private final String ownerSeparator = ".";

    @objid ("afedee03-0318-4386-ba96-0923b37e948f")
    private final String eltSeparator = ";";

    @objid ("754bbaa1-8b71-4d90-a7fa-0c551edcc9fa")
    protected final String add = "Add ";

    @objid ("3c69ef7d-9f29-4f2e-936a-c8ac3edcce38")
    protected final String remove = "Remove ";

    @objid ("375345d9-f1fe-400e-be8a-d8bd8642bdea")
    protected final String removeAll = "Remove all";

    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("9daf1978-c3c2-4523-bb20-2292f186747b")
    @Override
    public int changeProperty(int row, String value) {
        if(row == 1){
            this.element.getElement().setName(value);
        }
        return row - 1;
    }

    /**
     * This method handles the construction of the property table of a selected element
     * 
     * @param table : the property table to fulfill
     */
    @objid ("2bdd5465-1c7d-450b-be0f-ee5154387dc1")
    @Override
    public void update(IModulePropertyTable table) {
        table.addProperty("Name",   getValue(this.element.getElement().getName()));
    }

    @objid ("79851d7d-27fa-4a96-8c53-35328bd05424")
    public CamelElementPropertyPage(T elt) {
        this.element = elt;
    }

    @objid ("b4d82ab0-3e4f-4912-9c93-acdc5b78f613")
    protected String getValue(String value) {
        if (value == null)
            return "";
        return value;
    }

    /**
     * Compute the name of the Camel Element
     * 
     * @param elt : the Camel Element
     * @return the computed name
     */
    @objid ("516f27c4-abc7-4919-b07e-508c8d75583b")
    protected String getCamelName(CamelElement elt) {
        if (elt != null) {
            return getCamelName(elt.getElement());
        }else {
            return "";
        }
    }

    /**
     * Compute the name of the Model Element
     * 
     * @param elt : the model Element
     * @return the computed name
     */
    @objid ("80ea2b0d-e6d4-4e79-ab78-3ad8d09f6c02")
    protected String getCamelName(ModelElement elt) {
        return elt.getCompositionOwner().getName() + this.ownerSeparator + elt.getName();
    }

    /**
     * REturn the array of Camel name
     * @param elt : the list of Camel Element
     * 
     * @return the array of Camel name
     */
    @objid ("72b44209-d7c4-4d3e-a1a6-944533342341")
    protected String[] getCamelNames(List<ModelElement> elts) {
        List<String> result = new ArrayList<>();
        result.add(" ");
        for (ModelElement elt : elts) {
            result.add(getCamelName(elt));
        }
        return result.toArray(new String[result.size()]);
    }

    @objid ("ff925376-08af-4f99-b3fc-739a727a8a3c")
    protected ModelElement getModelElt(List<? extends ModelElement> elts, String camelName) {
        String name = camelName.replaceFirst(this.add, "").replaceFirst(this.remove, "");
        
        for (ModelElement elt : elts) {
            if (getCamelName(elt).equals(name)) {
                return elt;
            }
        }
        return null;
    }

    @objid ("4a453fc2-84d8-4cee-bc87-61da5ed695f4")
    protected ModelElement getElt(List<ModelElement> elts, String name) {
        for (ModelElement elt : elts) {
            if (getCamelName(elt).equals(name))
                return elt;
        }
        return null;
    }

    @objid ("ff95ceb7-ff75-468b-81cc-2ce64524431f")
    protected String[] getAddRemove(List<ModelElement> allElt, List<? extends CamelElement> added) {
        // List of added Elts , remove Elts
        List<String> result = new ArrayList<>();
        result.add("");
        result.add(this.removeAll);
        
        //List of already added Elt
        List<ModelElement> addElt = new ArrayList<>();
        for (CamelElement elt : added) {
            addElt.add(elt.getElement());
        }
        
        //Compute the list of Added and Removed Elements
        for (ModelElement elt : allElt) {
            if (addElt.contains(elt)) {
                result.add(this.remove + getCamelName(elt));
            }else {
                result.add(this.add + getCamelName(elt));
            }
        }
        return result.toArray(new String[result.size()]);
    }

    @objid ("79649685-3cf5-45f3-8c5b-4d4c32aea7cf")
    protected String getCamelValue(List<? extends CamelElement> elts) {
        String result = "";
        Iterator<? extends CamelElement> it = elts.iterator();
        
        if (it.hasNext()) {
            result += getCamelName(it.next());
        }
        
        while (it.hasNext()) {
            result +=  this.eltSeparator + getCamelName(it.next());
        }
        return result;
    }

    @objid ("d7139fbe-3f9d-477c-99a6-087300e65ed2")
    protected CamelElement getCamelElt(List<? extends CamelElement> elts, String camelName) {
        String name = camelName.replaceFirst(this.add, "").replaceFirst(this.remove, "");
        
        for (CamelElement elt : elts) {
            if (getCamelName(elt).equals(name)) {
                return elt;
            }
        }
        return null;
    }

}
