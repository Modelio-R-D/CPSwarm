package fr.softeam.cameldesigner.elementmodel.umlmodel;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.DeploymentModelDiagram;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ScriptConfiguration;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.SoftwareComponent;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.port.CommunicationPort;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.port.HostingPort;
import fr.softeam.cameldesigner.elementmodel.properties.TagsManager;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import fr.softeam.cameldesigner.representation.diagrams.CamelDiagramsService;
import org.eclipse.draw2d.geometry.Rectangle;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.diagrams.ClassDiagram;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("26a568cc-3298-4179-a825-bb282a44f134")
public class UmlDeploymentService {
    @objid ("e385c254-09d1-42e2-85f0-53db17162871")
    private CamelDiagramsService camelDiagramService = new CamelDiagramsService();

    @objid ("f55e06d4-74d9-4e7e-b8ab-478a66a60ca2")
    private TagsManager tagsManager = new TagsManager();

    @objid ("277702ca-ba5d-4098-9b75-6b5af20fe262")
    private UmlModelService umlModelService = new UmlModelService();

    @objid ("88ff9e7e-f4f2-4ff9-a0ee-36059ecfad7b")
    private static IModuleContext MODULE_CONTEXT = CamelDesignerModule.getInstance().getModuleContext();

    @objid ("2674d1a7-ac19-42c0-b269-5ef0b88d1f70")
    private static IModelingSession MODELING_SESSION = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();

    @objid ("0161a44a-9845-4fb0-b682-7207dc7fa92b")
    public Class createUmlSoftwareComponent(Package umlDeploymentModel, String umlSoftwareComponentName, Rectangle bounds) {
        Class umlSoftwareComponent = null;
        
        //try( ITransaction transaction = MODELING_SESSION.createTransaction("TO MODIFY LATER")){
        
            // create class
            umlSoftwareComponent = MODELING_SESSION.getModel().createClass(umlSoftwareComponentName, umlDeploymentModel,
                    ICamelDesignerPeerModule.MODULE_NAME, SoftwareComponent.STEREOTYPE_NAME);
        
            // Add default Named_Element.Name Tag
        //            this.tagsManager.createTag(umlSoftwareComponent, CamelDesignerTagTypes.NAME, umlSoftwareComponentName);
        
        
            // Unmask umlSoftwareComponent in Deployment Diagram
            for( MObject child : umlDeploymentModel.getCompositionChildren()) {
                if(child instanceof ClassDiagram
                        && ((ModelElement) child).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DeploymentModelDiagram.STEREOTYPE_NAME)) {
        
                    ClassDiagram deploymentDiagram = (ClassDiagram) child;
        
                    this.camelDiagramService.unmaskModelElement(umlSoftwareComponent, MODULE_CONTEXT, deploymentDiagram, bounds);
        
                }
            }
        
        
            //transaction.commit ();
        //}
        return umlSoftwareComponent;
    }

    @objid ("5e0d07a8-62a5-4ec2-80c2-476a1b924ce8")
    public Class createUmlRequiredHost(Class umlSoftwareComponentOwner, String requiredHostName, Rectangle bounds) {
        return this.umlModelService.createUmlClass(umlSoftwareComponentOwner, requiredHostName, HostingPort.STEREOTYPE_NAME, bounds);
    }

    @objid ("41f4f419-09c4-4432-b890-742fdd4c8073")
    public Class createUmlProvidedHost(Class umlSoftwareComponentOwner, String providedHostname, Rectangle bounds) {
        return this.umlModelService.createUmlClass(umlSoftwareComponentOwner, providedHostname, HostingPort.STEREOTYPE_NAME, bounds);
    }

    @objid ("ebe0786e-26ca-4300-81cb-0a3cd441cbdb")
    public Class createUmlRequiredCommunication(Class umlSoftwareComponentOwner, String requiredCommunicationName, Rectangle bounds) {
        return this.umlModelService.createUmlClass(umlSoftwareComponentOwner, requiredCommunicationName, CommunicationPort.STEREOTYPE_NAME, bounds);
    }

    @objid ("7b38a0a3-f582-4470-8e42-51c92f7364a4")
    public Class createUmlProvidedCommunication(Class umlSoftwareComponentOwner, String providedCommunicationname, Rectangle bounds) {
        return this.umlModelService.createUmlClass(umlSoftwareComponentOwner, providedCommunicationname, CommunicationPort.STEREOTYPE_NAME, bounds);
    }

    @objid ("91bbd2d9-57fd-423e-9a6a-7ee1c92910ba")
    public Class createUmlScriptConfiguration(Class umlSoftwareComponentOwner, String scriptConfigurationName, Rectangle bounds) {
        return this.umlModelService.createUmlClass(umlSoftwareComponentOwner, scriptConfigurationName, ScriptConfiguration.STEREOTYPE_NAME, bounds);
    }

}
