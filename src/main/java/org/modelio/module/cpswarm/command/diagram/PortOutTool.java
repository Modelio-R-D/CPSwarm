package org.modelio.module.cpswarm.command.diagram;

import org.eclipse.draw2d.geometry.Rectangle;
import org.modelio.api.modelio.diagram.IDiagramGraphic;
import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.modelio.diagram.tools.DefaultBoxTool;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.Port;
import org.modelio.metamodel.uml.statik.PortOrientation;
import org.modelio.module.cpswarm.impl.CPSwarmModule;
import org.modelio.module.sysml.api.ISysMLPeerModule;
import org.modelio.module.sysml.api.SysMLStereotypes;
import org.modelio.vcore.smkernel.mapi.MObject;

public class PortOutTool extends DefaultBoxTool {
    @Override
    public boolean acceptElement(final IDiagramHandle diagramHandle, final IDiagramGraphic targetNode) {
        MObject element = targetNode.getElement();
        if (element instanceof Classifier || element instanceof Instance) {
            return true;
        }
        return false;
    }

    @Override
    public void actionPerformed(final IDiagramHandle representation, final IDiagramGraphic parent, final Rectangle rect) {
        IModelingSession session = CPSwarmModule.getInstance().getModuleContext().getModelingSession();
        try (ITransaction transaction = session.createTransaction("org.modelio.module.CPSwarm.command.diagram.PortOutTool")) {
        
            MObject element = parent.getElement();
        
            Port port = CPSwarmModule.getInstance().getModuleContext().getModelingSession().getModel().createPort();
            if (parent.getElement() instanceof Instance) {
                port.setCluster((Instance) element);
            } else if (parent.getElement() instanceof Classifier) {
                port.setInternalOwner((Classifier) element);
            }
            port.setName("FlowPort");
            port.getExtension().add(session.getMetamodelExtensions().getStereotype(ISysMLPeerModule.MODULE_NAME, SysMLStereotypes.FLOWPORT, port.getMClass()));
            port.setDirection(PortOrientation.OUT);
            
            representation.unmask(port, rect.x, rect.y);
            representation.save();
            representation.close();
        
            transaction.commit();
        }
    }

}
