package fr.softeam.cameldesigner.handlers.tools.coretools;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.Feature;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.AttributeClass;
import fr.softeam.cameldesigner.elementmodel.umlmodel.UmlModelService;
import org.eclipse.draw2d.geometry.Rectangle;
import org.modelio.api.modelio.diagram.IDiagramGraphic;
import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.modelio.diagram.tools.DefaultBoxTool;
import org.modelio.metamodel.uml.statik.Class;

@objid ("88d6022c-3726-4601-85b7-dfd3b2819139")
public class CreateAttributeClassTool extends DefaultBoxTool {
    @objid ("4ce4b9e9-dedf-48ff-b95f-8a71e8cb80f5")
    private UmlModelService umlModelService = new UmlModelService();

    @objid ("da0fd434-b2a5-440b-aca3-d54043964185")
    @Override
    public boolean acceptElement(final IDiagramHandle diagramHandle, final IDiagramGraphic targetNode) {
        return
                targetNode.getElement() instanceof Class
                && ((Class) targetNode.getElement())
                .isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Feature.STEREOTYPE_NAME);
    }

    @objid ("23026732-a672-4d05-b991-1bc6d38de270")
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
                AttributeClass.STEREOTYPE_NAME,
                AttributeClass.STEREOTYPE_NAME,
                newBounds);
    }

}
