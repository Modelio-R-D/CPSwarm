package fr.softeam.cameldesigner.handlers.propertypage.requirementproperties;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ResourceRequirement;
import fr.softeam.cameldesigner.handlers.propertypage.coreproperties.NamedElementPropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("1ad63e6b-8b55-447b-8414-ecb535776426")
public class ResourceRequirementPropertyPage<T extends ResourceRequirement> extends NamedElementPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("a4f59d36-a6ed-408e-b86f-a4a240f14e5d")
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
    @objid ("7d5bf22a-0f16-458e-847e-b5141d9d79dc")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("d1ba719e-655a-47c8-afcf-6a11ed3dfb4d")
    public ResourceRequirementPropertyPage(T elt) {
        super(elt);
    }

}
