package fr.softeam.cameldesigner.handlers.tools.deploymenttools;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.SoftwareComponent;
import fr.softeam.cameldesigner.elementmodel.umlmodel.UmlDeploymentService;
import org.eclipse.draw2d.geometry.Rectangle;
import org.modelio.api.modelio.diagram.IDiagramGraphic;
import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.modelio.diagram.tools.DefaultBoxTool;
import org.modelio.metamodel.uml.statik.Class;

@objid ("1ab67851-78b0-48c1-a8a4-a8ab35be451f")
public class CreateScriptConfiguration extends DefaultBoxTool {
    @objid ("ac32e2eb-45f2-4c60-bfaa-d3eeef277604")
    private UmlDeploymentService umlDeploymentService = new UmlDeploymentService();

    @objid ("3bf17f9c-a67a-4163-b454-81dae5742f19")
    @Override
    public boolean acceptElement(final IDiagramHandle diagramHandle, final IDiagramGraphic targetNode) {
        return
                targetNode.getElement() instanceof org.modelio.metamodel.uml.statik.Package
                && ((org.modelio.metamodel.uml.statik.Package) targetNode.getElement())
                .isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, SoftwareComponent.STEREOTYPE_NAME);
    }

    @objid ("8a74183b-21ee-4bef-bf07-4b4affa59c88")
    @Override
    public void actionPerformed(final IDiagramHandle diagramHandle, final IDiagramGraphic parent, final Rectangle rect) {
        Rectangle newBounds = rect.getCopy();
        if(newBounds.height <= 0) {
            newBounds.height = 50;
        }
        if(newBounds.width <= 0) {
            newBounds.width = 300;
        }
        
        
        this.umlDeploymentService.createUmlScriptConfiguration(((Class) parent.getElement()), "ScriptConfiguration", newBounds);
    }

}
