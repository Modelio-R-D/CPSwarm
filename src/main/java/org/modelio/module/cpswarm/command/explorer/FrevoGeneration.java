package org.modelio.module.cpswarm.command.explorer;

import java.util.List;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.MessageBox;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.api.module.context.configuration.IModuleUserConfiguration;
import org.modelio.module.cpswarm.api.CPSwarmParameters;
import org.modelio.module.cpswarm.generator.ProjectGeneration;
import org.modelio.vcore.smkernel.mapi.MObject;

public class FrevoGeneration extends DefaultModuleCommandHandler {
     String title = "Complete";

     String description = "Generation Complete";

    @Override
    public void actionPerformed(List<MObject> selectedElements, IModule module) {
        org.modelio.metamodel.uml.statik.Class selectedElt = (org.modelio.metamodel.uml.statik.Class) selectedElements.get(0);
              
        IModuleUserConfiguration configuration = module.getModuleContext().getConfiguration();
        String rosWs = configuration.getParameterValue(CPSwarmParameters.WORKSPACEPATH);       
        String rosPath = configuration.getParameterValue(CPSwarmParameters.ROSPATH);        
        String frevoPath = configuration.getParameterValue(CPSwarmParameters.FREVOPATH);
        
        ProjectGeneration generation = new ProjectGeneration(selectedElt);
        generation.generate(rosWs, rosPath, frevoPath);
        completeBox();
    }

    protected void completeBox() {
        Display.getDefault().asyncExec(new Runnable() {
            @Override
            public void run() {
                customMessageBox(SWT.ICON_INFORMATION);
            }
        });
    }

    void customMessageBox(int icon) {
        MessageBox messageBox = new MessageBox(Display.getCurrent().getActiveShell(), icon);
        messageBox.setMessage(this.description);
        messageBox.setText(this.title);
        messageBox.open();
    }

    /**
     * This methods authorizes a command to be displayed in a defined context.
     * The commands are displayed, by default, depending on the kind of metaclass on which the command has been launched.
     */
    @Override
    public boolean accept(List<MObject> selectedElements, IModule module) {
        if ((selectedElements != null) && (selectedElements.size() == 1 )){
            MObject selected = selectedElements.get(0);
            return (selected instanceof org.modelio.metamodel.uml.statik.Class);
        }
        return false;
    }

    /**
     * This method specifies whether or not a command must be deactivated.
     * If the command has to be displayed (which means that the accept method has returned a positive value, it is sometimes needed to desactivate the command depending on specific constraints that are specific to the module.
     */
    @Override
    public boolean isActiveFor(List<MObject> selectedElements, IModule module) {
        return true;
    }

}
