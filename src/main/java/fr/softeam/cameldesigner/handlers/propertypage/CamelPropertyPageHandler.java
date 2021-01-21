package fr.softeam.cameldesigner.handlers.propertypage;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.IModule;
import org.modelio.api.module.propertiesPage.AbstractModulePropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("bcfec296-bffd-45e9-885b-40a0ae969f2e")
public class CamelPropertyPageHandler extends AbstractModulePropertyPage {
    @objid ("ec6527a6-e162-4a23-bf9f-e8f85ebed23e")
    private PropertyPageManager camelDesignerPropertyPageManager = new PropertyPageManager();

    @objid ("f9e026a8-a446-4c6c-9d7c-6dddb734133f")
    public CamelPropertyPageHandler(final IModule module, final String name, final String label, final String bitmap) {
        super(module, name, label, bitmap);
    }

    @objid ("224b5d23-f6be-419a-a26d-30ddeab768a2")
    @Override
    public void update(final List<MObject> selectedElements, final IModulePropertyTable table) {
        if ((selectedElements != null) && (selectedElements.size() > 0)
                && (selectedElements.get(0) != null)
                && (selectedElements.get(0) instanceof ModelElement)){
        
            ModelElement selectedElement = ((ModelElement) selectedElements.get(0));
            this.camelDesignerPropertyPageManager.update(selectedElement, table);
        }
    }

    @objid ("1d132582-0e32-4659-96dc-de33e55f583e")
    @Override
    public void changeProperty(final List<MObject> selectedElements, final int row, final String value) {
        if ((selectedElements != null) && (selectedElements.size() > 0) && (selectedElements.get(0) instanceof ModelElement)){
            ModelElement selectedElement = ((ModelElement) selectedElements.get(0));
            this.camelDesignerPropertyPageManager.changeProperty(selectedElement, row, value);
        }
    }

}
