package org.modelio.module.cpswarm.command.diagram;

import org.eclipse.draw2d.geometry.Rectangle;
import org.modelio.api.modelio.diagram.IDiagramGraphic;
import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.modelio.diagram.tools.DefaultBoxTool;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.metamodel.diagrams.StateMachineDiagram;
import org.modelio.metamodel.uml.behavior.stateMachineModel.Region;
import org.modelio.metamodel.uml.behavior.stateMachineModel.State;
import org.modelio.metamodel.uml.behavior.stateMachineModel.StateMachine;
import org.modelio.module.cpswarm.impl.CPSwarmModule;
import org.modelio.vcore.smkernel.mapi.MObject;

public class SubMachineTool extends DefaultBoxTool {
    @Override
    public boolean acceptElement(final IDiagramHandle diagramHandle, final IDiagramGraphic targetNode) {
        MObject element = targetNode.getElement();
        if (element instanceof StateMachineDiagram) {
            return (element.getCompositionOwner() instanceof StateMachine);
        }
        return false;
    }

    @Override
    public void actionPerformed(final IDiagramHandle diagramHandle, final IDiagramGraphic parent, final Rectangle rect) {
        IModelingSession session = CPSwarmModule.getInstance().getModuleContext().getModelingSession();
        try (ITransaction transaction = session.createTransaction("State")) {
        
            StateMachineDiagram diagram = (StateMachineDiagram) parent.getElement();
            StateMachine sm = (StateMachine) diagram.getCompositionOwner();
            Region region = sm.getTop();
        
            State state = CPSwarmModule.getInstance().getModuleContext().getModelingSession().getModel().createState();
            region.getSub().add(state);
        
            state.setName("Sub");
        
            for (IDiagramGraphic graph : diagramHandle.unmask (state, rect.x, rect.y)) {
                if (graph.getElement().equals(state)) {
                    graph.setProperty("STATE_FILLCOLOR", "0 , 128 , 128");
                    graph.setProperty("STATE_FILLMODE", "SOLID");
                }
        
            }
            diagramHandle.save();
            diagramHandle.close();
            transaction.commit();
        }
    }

}
