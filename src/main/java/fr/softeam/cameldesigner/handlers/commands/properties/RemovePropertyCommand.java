package fr.softeam.cameldesigner.handlers.commands.properties;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.dialogs.RemovePropertyDialog;
import fr.softeam.cameldesigner.impl.CamelDesignerPeerModule;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("06eccb99-25a3-4b83-b28e-92d7cd562baa")
public class RemovePropertyCommand extends DefaultModuleCommandHandler {
    @objid ("a3713df3-9c01-42c0-831d-cff1ee5b56b0")
    @Override
    public void actionPerformed(final List<MObject> selectedElements, final IModule module) {
        RemovePropertyDialog removePropertyDialog = new RemovePropertyDialog((ModelElement)selectedElements.get(0));
        removePropertyDialog.open();
    }

    @objid ("7056a94d-f90d-4a07-9bf6-8738ed718992")
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
