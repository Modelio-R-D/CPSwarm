package fr.softeam.cameldesigner.handlers.tools.deploymenttools;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.port.CommunicationPort;
import fr.softeam.cameldesigner.elementmodel.umlmodel.UmlDeploymentService;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.eclipse.draw2d.geometry.Rectangle;
import org.modelio.api.modelio.diagram.IDiagramGraphic;
import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.modelio.diagram.IDiagramNode;
import org.modelio.api.modelio.diagram.tools.DefaultBoxTool;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.metamodel.uml.statik.Component;
import org.modelio.metamodel.uml.statik.Port;
import org.modelio.metamodel.uml.statik.PortOrientation;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("4fa2e89b-6213-4592-b834-3e0237c7933a")
public class CreateProvidedCommunication extends DefaultBoxTool {
    @objid ("76db0e50-fe96-4f50-a1bd-6886a716c1f3")
    private UmlDeploymentService umlDeploymentService = new UmlDeploymentService();

    @objid ("4d8a0bac-65d2-44a4-8571-5f547a92c595")
    @Override
    public boolean acceptElement(final IDiagramHandle diagramHandle, final IDiagramGraphic targetNode) {
        MObject element = targetNode.getElement();
        return (element instanceof Component) ;
    }

    @objid ("c44750a4-e601-4021-89a3-cb2bd125cfe4")
    @Override
    public void actionPerformed(final IDiagramHandle diagramHandle, final IDiagramGraphic parent, final Rectangle rect) {
        IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
        try( ITransaction transaction = session.createTransaction ("Create provided Communication")){
            Component element = (Component) parent.getElement();
        
            Port port = session.getModel().createPort("", element);
            port.setDirection(PortOrientation.OUT);
            port.getExtension().add(CommunicationPort.MdaTypes.STEREOTYPE_ELT);
            List<IDiagramGraphic> graph = diagramHandle.unmask(port, rect.x, rect.y);
        
            if((graph != null) &&  (graph.size() > 0) && (graph.get(0) instanceof IDiagramNode))
                ((IDiagramNode)graph.get(0)).setBounds(rect);
        
            diagramHandle.save();
            diagramHandle.close();
            transaction.commit ();
        }
    }

}
