package fr.softeam.cameldesigner.handlers.tools.coretools;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.Feature;
import fr.softeam.cameldesigner.elementmodel.umlmodel.UmlModelService;
import org.eclipse.draw2d.geometry.Rectangle;
import org.modelio.api.modelio.diagram.IDiagramGraphic;
import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.modelio.diagram.tools.DefaultBoxTool;
import org.modelio.metamodel.uml.statik.Class;

@objid ("f074bdd1-254a-4404-9169-fff405aa7a59")
public class CreateFeatureTool extends DefaultBoxTool {
    @objid ("715c913b-a2b2-436f-8782-426e3cbf7190")
    private UmlModelService umlModelService = new UmlModelService();

    @objid ("bf06a6d2-6b97-441a-a4af-f9a475900ba6")
    @Override
    public boolean acceptElement(final IDiagramHandle diagramHandle, final IDiagramGraphic targetNode) {
        return
                targetNode.getElement() instanceof Class
                && ((Class) targetNode.getElement())
                .isStereotyped(ICamelDesignerPeerModule.MODULE_NAME,  Feature.STEREOTYPE_NAME);
    }

    @objid ("18c13857-c8e1-4c5d-a28c-c2b369939fdc")
    @Override
    public void actionPerformed(final IDiagramHandle diagramHandle, final IDiagramGraphic parent, final Rectangle rect) {
        Rectangle newBounds = rect.getCopy();
        if(newBounds.height <= 0) {
            newBounds.height = 50;
        }
        if(newBounds.width <= 0) {
            newBounds.width = 300;
        }
        
        
        this.umlModelService.createUmlClass((Class) parent.getElement(),
                Feature.STEREOTYPE_NAME,
                Feature.STEREOTYPE_NAME,
                newBounds);
    }

}
