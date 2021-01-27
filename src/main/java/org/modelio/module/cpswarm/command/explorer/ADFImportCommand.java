package org.modelio.module.cpswarm.command.explorer;

import java.util.List;
import org.eclipse.swt.widgets.Display;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.module.cpswarm.ui.window.ADFImportWindow;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Implementation of the IModuleContextualCommand interface.
 * <br>The module contextual commands are displayed in the contextual menu and in the specific toolbar of each module property page.
 * <br>The developer may inherit the DefaultModuleContextualCommand class which contains a default standard contextual command implementation.
 */
public class ADFImportCommand extends DefaultModuleCommandHandler {
    /**
     * @see org.modelio.api.module.commands.DefaultModuleContextualCommand#actionPerformed(java.util.List,
     * org.modelio.api.module.IModule)
     */
    @Override
    public void actionPerformed(List<MObject> selectedElements, IModule module) {
        ADFImportWindow importW = new ADFImportWindow(Display.getCurrent().getActiveShell());
        importW.setSelectedElt((ModelElement)selectedElements.get(0));
        importW.open();
    }

    /**
     * @see org.modelio.api.module.commands.DefaultModuleContextualCommand#accept(java.util.List,
     * org.modelio.api.module.IModule)
     */
    @Override
    public boolean accept(List<MObject> selectedElements, IModule module) {
        // Check that there is only one selected element
        return ((selectedElements.size() == 1)
                && (selectedElements.get(0) instanceof NameSpace)
                && (((NameSpace) selectedElements.get(0)).getExtension().size() == 0));
    }

    /**
     * Constructor.
     */
    public ADFImportCommand() {
        super();
    }

}
