package org.modelio.module.cpswarm.command.explorer;

import java.util.List;
import org.eclipse.swt.widgets.Display;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Profile;
import org.modelio.module.cpswarm.ui.window.SwarmDialog;
import org.modelio.vcore.smkernel.mapi.MObject;

public class SwarmWizardCommand extends DefaultModuleCommandHandler {
    @Override
    public void actionPerformed(final List<MObject> selectedElements, final IModule module) {
        SwarmDialog newSwarmDialog = new SwarmDialog(Display.getCurrent().getActiveShell());
        newSwarmDialog.setSelectedElement((ModelElement)selectedElements.get(0));
        newSwarmDialog.open();
    }

    @Override
    public boolean accept(final List<MObject> selectedElements, final IModule module) {
        if ((selectedElements != null) && (selectedElements.size() == 1 )){
            MObject selected = selectedElements.get(0);
            return (selected instanceof org.modelio.metamodel.uml.statik.Package) &&
                    (!(selected instanceof Profile));
        }
        return false;
    }

    @Override
    public boolean isActiveFor(List<MObject> selectedElements, IModule module) {
        return true;
    }

}
