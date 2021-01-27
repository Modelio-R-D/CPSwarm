package org.modelio.module.cpswarm.command.explorer.diagram.command;

import java.util.List;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.cpswarm.api.ICPSwarmPeerModule;
import org.modelio.module.cpswarm.api.cpswarm_concept.standard.class_.FitnessFunction;
import org.modelio.module.cpswarm.utils.CPSwarmFactory;
import org.modelio.module.sysml.i18n.I18nMessageService;
import org.modelio.module.sysml.impl.SysMLModule;
import org.modelio.vcore.smkernel.mapi.MObject;

public class BehaviorDefinitionDiagram extends DefaultModuleCommandHandler {
    @Override
    public void actionPerformed(List<MObject> selectedElements, IModule module) {
        IModelingSession session = SysMLModule.getInstance().getModuleContext().getModelingSession();
        AbstractDiagram diagram = null;
        ModelElement element = (ModelElement) selectedElements.get(0);
        String diagramName = I18nMessageService.getString("Ui.Command.SysMLStateMachineDiagramExplorerCommand.Name", element.getName());
        
        try (ITransaction transaction = session.createTransaction(I18nMessageService.getString("Info.Session.Create", "State Machine Diagram"))) {
        
            diagram = CPSwarmFactory.createBehaviorDiagram(element, diagramName);
        
            if (diagram != null) {
                SysMLModule.getInstance().getModuleContext().getModelioServices().getEditionService().openEditor(diagram);
            }
            transaction.commit();
        }
    }

    /**
     * This methods authorizes a command to be displayed in a defined context.
     * The commands are displayed, by default, depending on the kind of metaclass on which the command has been launched.
     */
    @Override
    public boolean accept(List<MObject> selectedElements, IModule module) {
        if ((selectedElements != null) && (selectedElements.size() == 1 )){
            MObject selected = selectedElements.get(0);
            return  (selected instanceof org.modelio.metamodel.uml.statik.NameSpace)
                    && (!((org.modelio.metamodel.uml.statik.NameSpace)selected).isStereotyped(ICPSwarmPeerModule.MODULE_NAME, FitnessFunction.STEREOTYPE_NAME));
        
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
