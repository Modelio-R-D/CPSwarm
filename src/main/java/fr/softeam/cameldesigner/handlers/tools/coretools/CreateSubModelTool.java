package fr.softeam.cameldesigner.handlers.tools.coretools;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerStereotypes;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.elementmodel.umlmodel.UmlModelService;
import org.eclipse.draw2d.geometry.Rectangle;
import org.modelio.api.modelio.diagram.IDiagramGraphic;
import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.modelio.diagram.IDiagramNode;
import org.modelio.api.modelio.diagram.tools.DefaultBoxTool;
import org.modelio.metamodel.diagrams.ClassDiagram;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("bc88f7ef-e788-4de4-aeec-8a42935e60d8")
public abstract class CreateSubModelTool extends DefaultBoxTool {
    @objid ("2b6af4dd-1c4a-48b5-8bce-d609f11ae02f")
    private String subModelName;

    @objid ("359a0603-2d28-4606-9be9-4e93057cbfec")
    private String subModelStereotype;

    @objid ("95ac6461-d143-4723-92e9-cfe715e32222")
    private String subModelDiagramName;

    @objid ("3659f6b0-9797-4fd1-8791-67f7c6176ead")
    private String subModelDiagramStereotype;

    @objid ("37ce16e0-fb84-4a34-9668-ee6256e0b8ad")
    private UmlModelService elementModelService = new UmlModelService();

    @objid ("b6a0a267-a218-4d53-a2db-af45bc84c22f")
    public CreateSubModelTool(String subModelName, String subModelStereotype, String subModelDiagramName, String subModelDiagramStereotype) {
        super();
        this.subModelName = subModelName;
        this.subModelStereotype = subModelStereotype;
        this.subModelDiagramName = subModelDiagramName;
        this.subModelDiagramStereotype = subModelDiagramStereotype;
    }

    @objid ("af2b339a-4f9c-4d67-b8f7-5ca301eb6362")
    @Override
    public boolean acceptElement(final IDiagramHandle diagramHandle, final IDiagramGraphic targetNode) {
        return
                targetNode.getElement() instanceof ClassDiagram
                &&  ((ClassDiagram) targetNode.getElement()).getOrigin() instanceof org.modelio.metamodel.uml.statik.Package
                && ((org.modelio.metamodel.uml.statik.Package)((ClassDiagram) targetNode.getElement()).getOrigin())
                .isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, fr.softeam.cameldesigner.api.camelcore.standard.package_.CamelModel.STEREOTYPE_NAME);
    }

    @objid ("9e4c7adb-34f5-4d0a-a894-1354fe63a587")
    @Override
    public void actionPerformed(final IDiagramHandle diagramHandle, final IDiagramGraphic parent, final Rectangle rect) {
        ModelElement classOwner = diagramHandle.getDiagram().getOrigin();
        org.modelio.metamodel.uml.statik.Package subModel = this.elementModelService.createSubModel((org.modelio.metamodel.uml.statik.Package) classOwner, this.subModelName, this.subModelStereotype, this.subModelDiagramName, this.subModelDiagramStereotype);
        
        List<IDiagramGraphic> graph = diagramHandle.unmask (subModel, rect.x, rect.y);
        
        if((graph != null) &&  (graph.size() > 0) && (graph.get(0) instanceof IDiagramNode))
            ((IDiagramNode)graph.get(0)).setBounds(rect);
        
        diagramHandle.save();
        diagramHandle.close();
    }

}
