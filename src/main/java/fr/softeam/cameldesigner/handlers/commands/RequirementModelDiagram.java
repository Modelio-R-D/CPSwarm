package fr.softeam.cameldesigner.handlers.commands;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.standard.ElementCreationStandardHandler;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("3d5a8f75-8473-4b65-ad2d-3d58bd8fca7d")
public class RequirementModelDiagram extends ElementCreationStandardHandler {
    @objid ("052c43f3-7aeb-46c5-9e0e-07fc7407e0b1")
    @Override
    public boolean accept(final List<MObject> selectedElements, final IModule module) {
        // Generated call to the super method will check the scope conditions defined in Studio.
        // Do not remove this call unless you need to take full control on the checks to be carried out.
        // However you can safely extends the checked conditions by adding custom code.
        if (super.accept(selectedElements, module) == false) {
            return false;
        }
        return true;
    }

    @objid ("d1e232d6-d702-45b6-9451-28b687da6f90")
    @Override
    protected void postConfigureElement(final MObject newElement, final IModule module) {
        // This method is a hook called once the element is created and configured and before the transaction is committed.
        // The super method should be first called in most cases.
        // Sub classes may redefine this method to make additional modifications.
        
        // Call the super method
        super.postConfigureElement(newElement, module);
        
        // TODO Add additional behavior below
    }

}
