package fr.softeam.cameldesigner.representation.diagrams;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.eclipse.draw2d.geometry.Rectangle;
import org.modelio.api.modelio.diagram.IDiagramGraphic;
import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.modelio.diagram.IDiagramNode;
import org.modelio.api.modelio.diagram.IDiagramService;
import org.modelio.api.modelio.diagram.dg.IDiagramDG;
import org.modelio.api.modelio.diagram.style.IStyleHandle;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.diagrams.ClassDiagram;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.vcore.smkernel.mapi.MClass;

/**
 * @author kchaabouni
 */
@objid ("e58f6418-b695-42f8-b291-ae99e48e4697")
public class CamelDiagramsService {
    @objid ("7e1e057f-9898-42f0-bc54-49827e4709e1")
    public void applyCamelStyle(IDiagramDG diagramDG) {
        IDiagramService diagramService = CamelDesignerModule.getInstance().getModuleContext().getModelioServices().getDiagramService();
        for (IStyleHandle camelStyle : diagramService.listStyles()){
            if (camelStyle.getName().equals(ICamelDesignerPeerModule.CAMEL_STYLE)){
                diagramDG.setStyle(camelStyle);
                break;
            }
        }
    }

    @objid ("92bf06a7-3a1c-4474-8776-c6b12a72941e")
    public void unmaskModelElement(ModelElement modelElement, IModuleContext moduleContext, ClassDiagram deploymentModelDiagram, Rectangle bounds) {
        IDiagramService diagramService = moduleContext.getModelioServices().getDiagramService();
        try(  IDiagramHandle diagramHandle = diagramService.getDiagramHandle(deploymentModelDiagram);){
            IDiagramDG diagramDG = diagramHandle.getDiagramNode();
            applyCamelStyle(diagramDG);
            List<IDiagramGraphic> diagramGraphics = diagramHandle.unmask(modelElement, 200, 200);
            if(bounds != null) {
                for (IDiagramGraphic diagramGraphic : diagramGraphics) {
                    if(diagramGraphic.getElement().equals(modelElement)){
                        ((IDiagramNode) diagramGraphic).setBounds(bounds);
                    }
                }
            }
            diagramHandle.save();
            diagramHandle.close();
        }
    }

    @objid ("5dda0cc8-afc9-41dc-a054-bb80d6e082f8")
    public ClassDiagram createSubModelDiagram(Class subModel, String diagramStereotype, String deploymentModelDiagramName) {
        IModuleContext moduleContext = CamelDesignerModule.getInstance().getModuleContext();
        IModelingSession modelingSession = moduleContext.getModelingSession();
        ClassDiagram subModelDiagram;
        MClass classDiagramMclass = moduleContext.getModelioServices().getMetamodelService().getMetamodel().getMClass(ClassDiagram.class);
        
        // Create CamelModelDiagram and unmask CamelModel
        Stereotype camelModelDiagramStereotype = modelingSession.getMetamodelExtensions().getStereotype(ICamelDesignerPeerModule.MODULE_NAME, diagramStereotype, classDiagramMclass);
        subModelDiagram = modelingSession.getModel().createClassDiagram(deploymentModelDiagramName, subModel, camelModelDiagramStereotype);
        //unmaskModelElement(subModel, moduleContext, subModelDiagram, new Rectangle(300,200,200,100));
        return subModelDiagram;
    }

}
