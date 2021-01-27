package org.modelio.module.cpswarm.command.explorer;

import java.util.List;
import org.eclipse.swt.widgets.Display;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.cpswarm.api.CPSwarmStereotypes;
import org.modelio.module.cpswarm.impl.CPSwarmPeerModule;
import org.modelio.module.cpswarm.ui.window.ParameterExport;
import org.modelio.vcore.smkernel.mapi.MObject;

public class ParamExportCommand extends DefaultModuleCommandHandler {
    @Override
    public void actionPerformed(final List<MObject> selectedElements, final IModule module) {
        ParameterExport export = new ParameterExport(Display.getCurrent().getActiveShell());
        export.setSelectedElt((ModelElement)selectedElements.get(0));
        export.open();
    }

    @Override
    public boolean accept(final List<MObject> selectedElements, final IModule module) {
        return ((selectedElements.get(0) instanceof org.modelio.metamodel.uml.statik.Class) &&
                (((ModelElement)selectedElements.get(0)).isStereotyped(CPSwarmPeerModule.MODULE_NAME, CPSwarmStereotypes.FITNESSFUNCTION)));
    }

}
