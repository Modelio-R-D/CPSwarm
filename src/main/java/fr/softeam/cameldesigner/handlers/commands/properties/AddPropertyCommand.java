package fr.softeam.cameldesigner.handlers.commands.properties;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.dialogs.AddPropertyDialog;
import fr.softeam.cameldesigner.impl.CamelDesignerPeerModule;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("8f732e67-fb2c-4f9b-b657-3cc6483cea0b")
public class AddPropertyCommand extends DefaultModuleCommandHandler {
    @objid ("b88e3ecb-b5d1-45ce-be4e-b5c8447dc619")
    @Override
    public void actionPerformed(final List<MObject> selectedElements, final IModule module) {
        AddPropertyDialog addCustomTagDialog = new AddPropertyDialog((ModelElement)selectedElements.get(0));
        addCustomTagDialog.open();
    }

    @objid ("e181ea68-377e-416c-baa8-941bb8d8636a")
    @Override
    public boolean accept(final List<MObject> selectedElements, final IModule module) {
        if ((selectedElements != null) && (selectedElements.size() == 1)){
            return selectedElements.get(0) instanceof Class
                    && ((Class) selectedElements.get(0))
                    .isStereotyped(CamelDesignerPeerModule.MODULE_NAME, CamelElement.STEREOTYPE_NAME);
        }
        return false;
    }

}
