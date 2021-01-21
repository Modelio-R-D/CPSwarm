package fr.softeam.cameldesigner.handlers.tools.deploymenttools;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.class_.RequirementSet;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.package_.DeploymentTypeModel;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.eclipse.draw2d.geometry.Rectangle;
import org.modelio.api.modelio.diagram.IDiagramGraphic;
import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.modelio.diagram.tools.DefaultBoxTool;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.diagrams.ClassDiagram;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("54235daf-444c-499a-bcb6-54db87d620ec")
public class CreateRequirementSet extends DefaultBoxTool {
    @objid ("1d1fec3f-3315-414d-b788-72e028799dfe")
    @Override
    public boolean acceptElement(final IDiagramHandle diagramHandle, final IDiagramGraphic targetNode) {
        return
                targetNode.getElement() instanceof ClassDiagram
                &&  ((ClassDiagram) targetNode.getElement()).getOrigin() instanceof org.modelio.metamodel.uml.statik.Package
                && ((org.modelio.metamodel.uml.statik.Package)((ClassDiagram) targetNode.getElement()).getOrigin())
                .isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DeploymentTypeModel.STEREOTYPE_NAME);
    }

    @objid ("f20c3b4c-e768-479e-bf00-cca5eedd08e3")
    @Override
    public void actionPerformed(final IDiagramHandle diagramHandle, final IDiagramGraphic parent, final Rectangle rect) {
        IModuleContext moduleContext = CamelDesignerModule.getInstance().getModuleContext();
        IModelingSession modelingSession = moduleContext.getModelingSession();
        
        Class softwareComponent = null;
        
        try( ITransaction transaction = modelingSession.createTransaction("TO MODIFY LATER")){
        
            MObject rootParent = diagramHandle.getDiagram().getOrigin().getCompositionOwner();
        
            // create stereotyped Attack Class
            softwareComponent = modelingSession.getModel().createClass(
                    "RequirementSet",
                    (NameSpace) rootParent,
                    ICamelDesignerPeerModule.MODULE_NAME,
                    RequirementSet.STEREOTYPE_NAME);
        
        
            // unmask Attack and save diagram
            diagramHandle.unmask(softwareComponent, rect.x, rect.y);
        
            diagramHandle.save();
            diagramHandle.close();
        
            softwareComponent.setOwner((ModelTree) parent.getElement().getCompositionOwner());
        
            modelingSession.getModel().getDefaultNameService()
            .setDefaultName(softwareComponent, "RequirementSet");
        
        
        
        
            transaction.commit ();
        }
    }

}
