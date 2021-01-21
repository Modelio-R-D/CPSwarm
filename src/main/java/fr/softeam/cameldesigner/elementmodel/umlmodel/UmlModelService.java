package fr.softeam.cameldesigner.elementmodel.umlmodel;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.standard.package_.CamelModel;
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.CamelModelDiagram;
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.DeploymentModelDiagram;
import fr.softeam.cameldesigner.api.constraintmodel.standard.package_.ConstraintModel;
import fr.softeam.cameldesigner.api.datamodel.standard.package_.DataInstanceModel;
import fr.softeam.cameldesigner.api.datamodel.standard.package_.DataTypeModel;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.package_.DeploymentInstanceModel;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.package_.DeploymentTypeModel;
import fr.softeam.cameldesigner.api.executionmodel.standard.package_.ExecutionModel;
import fr.softeam.cameldesigner.api.locationmodel.standard.package_.LocationModel;
import fr.softeam.cameldesigner.api.metadatamodel.standard.package_.MetaDataModel;
import fr.softeam.cameldesigner.api.metricmodel.standard.package_.MetricInstanceModel;
import fr.softeam.cameldesigner.api.metricmodel.standard.package_.MetricTypeModel;
import fr.softeam.cameldesigner.api.organisationmodel.standard.package_.OrganisationModel;
import fr.softeam.cameldesigner.api.requirementmodel.standard.package_.RequirementModel;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.package_.ScalabilityModel;
import fr.softeam.cameldesigner.api.securitymodel.standard.package_.SecurityModel;
import fr.softeam.cameldesigner.api.unitmodel.standard.package_.UnitModel;
import fr.softeam.cameldesigner.elementmodel.properties.TagsManager;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import fr.softeam.cameldesigner.representation.diagrams.CamelDiagramsService;
import org.eclipse.draw2d.geometry.Rectangle;
import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.modelio.diagram.IDiagramService;
import org.modelio.api.modelio.diagram.dg.IDiagramDG;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.diagrams.ClassDiagram;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.vcore.smkernel.mapi.MClass;

/**
 * @author kchaabouni
 */
@objid ("eb17cdb2-e6e0-40cb-8425-d0955e892705")
public class UmlModelService {
    @objid ("d07920e8-0d49-4d47-a732-7722f80df82e")
    private CamelDiagramsService camelDiagramService = new CamelDiagramsService();

    @objid ("9f0fb2ee-d761-444e-b32c-9c693887358b")
    private TagsManager tagsManager = new TagsManager();

    @objid ("1835e7f9-e0b3-4079-b07c-8d1925a43dc5")
    private static IModuleContext MODULE_CONTEXT = CamelDesignerModule.getInstance().getModuleContext();

    @objid ("fcfe0c5c-b0e4-475d-a5c2-8c63520304ae")
    private static IModelingSession MODELING_SESSION = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();

    @objid ("8c7c3522-cc33-4cd0-b832-47d822034b24")
    public Package createSubModel(Package camelModelOwner, String subModelName, String subModelStereotype, String subModelDiagramName, String subModelDiagramStereotype) {
        Package umlSubModel = null;
        
        switch(subModelStereotype) {
        case DeploymentTypeModel.STEREOTYPE_NAME:
            umlSubModel = DeploymentTypeModel.create().getElement();
            break;
        
        case RequirementModel.STEREOTYPE_NAME:
            umlSubModel = RequirementModel.create().getElement();
            break;
        
        case MetricTypeModel.STEREOTYPE_NAME:
            umlSubModel = MetricTypeModel.create().getElement();
            break;
        
        case MetaDataModel.STEREOTYPE_NAME:
            umlSubModel = MetaDataModel.create().getElement();
            break;
        
        case LocationModel.STEREOTYPE_NAME:
            umlSubModel = LocationModel.create().getElement();
            break;
        
        case SecurityModel.STEREOTYPE_NAME:
            umlSubModel = SecurityModel.create().getElement();
            break;
        
        case UnitModel.STEREOTYPE_NAME:
            umlSubModel = UnitModel.create().getElement();
            break;
        
        case ConstraintModel.STEREOTYPE_NAME:
            umlSubModel = ConstraintModel.create().getElement();
            break;
        
        case DataTypeModel.STEREOTYPE_NAME:
            umlSubModel = DataTypeModel.create().getElement();
            break;
        
        case OrganisationModel.STEREOTYPE_NAME:
            umlSubModel = OrganisationModel.create().getElement();
            break;
        
        case ScalabilityModel.STEREOTYPE_NAME:
            umlSubModel = ScalabilityModel.create().getElement();
            break;
        
        case DeploymentInstanceModel.STEREOTYPE_NAME:
            umlSubModel = DeploymentInstanceModel.create().getElement();
            break;
        
        case MetricInstanceModel.STEREOTYPE_NAME:
            umlSubModel = MetricInstanceModel.create().getElement();
            break;
        
        case DataInstanceModel.STEREOTYPE_NAME:
            umlSubModel = DataInstanceModel.create().getElement();
            break;
        
        case ExecutionModel.STEREOTYPE_NAME:
            umlSubModel = ExecutionModel.create().getElement();
            break;
        
        }
        
        if(umlSubModel != null) {
            umlSubModel.setName(subModelName);
            umlSubModel.setOwner(camelModelOwner);
        
            IModelingSession session = MODULE_CONTEXT.getModelingSession();
            MClass mclass = MODULE_CONTEXT.getModelioServices().getMetamodelService().getMetamodel().getMClass(ClassDiagram.class);
            Stereotype ster = session.getMetamodelExtensions().getStereotype(subModelDiagramStereotype, mclass);
            AbstractDiagram diagram = session.getModel().createClassDiagram(subModelDiagramName, umlSubModel, ster);
            MODULE_CONTEXT.getModelioServices().getEditionService().openEditor(diagram);
        
        }
        return umlSubModel;
    }

    @objid ("3a184ba4-c42e-4e50-9f1f-d408ee628d0a")
    public Package createCamelModel(ModelElement packageOwner, String name) {
        Package camelUmlModel = null;
        
        CamelModel camelModelProxy = CamelModel.create();
        camelModelProxy.setApplicationName(name);
        
        
        camelUmlModel = camelModelProxy.getElement();
        camelUmlModel.setName(name);
        camelUmlModel.setOwner((ModelTree) packageOwner);
        
        CamelModelDiagram camelModelDiagramProxy = CamelModelDiagram.create();
        ClassDiagram camelModelDiagram = camelModelDiagramProxy.getElement();
        camelModelDiagram.setName(name + " Diagram");
        camelModelDiagram.setOrigin(camelUmlModel);
        
        IDiagramService diagramService = MODULE_CONTEXT.getModelioServices().getDiagramService();
        try(  IDiagramHandle diagramHandle = diagramService.getDiagramHandle(camelModelDiagram);){
            IDiagramDG diagramDG = diagramHandle.getDiagramNode();
            this.camelDiagramService.applyCamelStyle(diagramDG);
            //List<IDiagramGraphic> diagramGraphics = diagramHandle.unmask(camelUmlModel, 200, 200);
            //for (IDiagramGraphic diagramGraphic : diagramGraphics) {
            //    if(diagramGraphic.getElement().equals(camelUmlModel)){
            //        ((IDiagramNode) diagramGraphic).setBounds(new Rectangle(300,200,200,100));
            //    }
            //}
            diagramHandle.save();
            diagramHandle.close();
        }
        
        MODULE_CONTEXT.getModelioServices().getEditionService().openEditor(camelModelDiagram);
        return camelUmlModel;
    }

    @objid ("dd4653d2-3b09-48b4-abba-2f04b9033d3e")
    public Class createUmlClass(Class umlComponentOwner, String elementName, String elementStereotype, Rectangle bounds) {
        Class umlClazz = null;
        
        // create UML Class
        umlClazz = MODELING_SESSION.getModel().createClass(elementName, umlComponentOwner,
                ICamelDesignerPeerModule.MODULE_NAME, elementStereotype);
        
        // Unmask in Deployment Diagram
        for(  AbstractDiagram diagram : umlComponentOwner.getDiagramElement()) {
            if(diagram instanceof ClassDiagram
                    && ((ModelElement) diagram).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DeploymentModelDiagram.STEREOTYPE_NAME)) {
        
                ClassDiagram deploymentDiagram = (ClassDiagram) diagram;
        
                this.camelDiagramService.unmaskModelElement(umlClazz, MODULE_CONTEXT, deploymentDiagram, bounds);
            }
        }
        return umlClazz;
    }

}
