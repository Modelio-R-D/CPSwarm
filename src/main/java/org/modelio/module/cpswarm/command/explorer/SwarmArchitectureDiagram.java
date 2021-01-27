package org.modelio.module.cpswarm.command.explorer;

import java.util.List;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.standard.DiagramCreationStandardHandler;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.vcore.smkernel.mapi.MObject;

public class SwarmArchitectureDiagram extends DiagramCreationStandardHandler {
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

    @Override
    protected void postConfigureElement(final MObject newDiagram, final IModule module) {
        // This method is a hook called once the element is created and configured and before the transaction is committed.
        // The super method applies the diagram style and open the diagram is needed and should be first called in most cases.
        // Sub classes may redefine this method to make additional modifications.
        
        // Call the super method to apply the diagram style and open the diagram if asked for.
        super.postConfigureElement(newDiagram, module);
        
        if (newDiagram instanceof AbstractDiagram)
            module.getModuleContext().getModelioServices().getEditionService().openEditor((AbstractDiagram) newDiagram);
    }

}
