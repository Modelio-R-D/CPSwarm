package fr.softeam.cameldesigner.handlers.propertypage;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.standard.attribute.AttributeAttribute;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.FeatureClass;
import fr.softeam.cameldesigner.api.camelcore.standard.package_.CamelModel;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ScriptConfiguration;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.SoftwareComponent;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.OptimisationRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ResourceRequirement;
import fr.softeam.cameldesigner.handlers.propertypage.coreproperties.AttributeAttributePropertyPage;
import fr.softeam.cameldesigner.handlers.propertypage.coreproperties.CamelModelPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypage.coreproperties.FeaturePropertyPage;
import fr.softeam.cameldesigner.handlers.propertypage.deploymentproperties.ScriptConfigurationPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypage.deploymentproperties.SoftwareComponentPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypage.requirementproperties.OptimisationRequirementPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypage.requirementproperties.ResourceRequirementPropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Artifact;
import org.modelio.metamodel.uml.statik.Component;

@objid ("491a5f0a-d15b-472b-8c63-1a90e605e275")
public class PropertyPageManager {
    @objid ("18ac694a-2bae-4714-a101-94f1b8963117")
    public int changeProperty(ModelElement elt, int row, String value) {
        IPropertyContent propertyPage = getPropertyPage(elt);
        
        if (propertyPage != null) {
            propertyPage.changeProperty(row, value);
        }
        return row;
    }

    /**
     * build the property table of the selected Elements
     * @param element : the selected element
     * 
     * @param table : the property table
     */
    @objid ("d71fcb60-14c1-4fab-8452-662dd3e1180c")
    public void update(ModelElement elt, IModulePropertyTable table) {
        IPropertyContent propertyPage = getPropertyPage(elt);
        
        if (propertyPage != null) {
            propertyPage.update(table);
        }
    }

    @objid ("8687dd77-99ee-48df-bfce-140aa32e1cb9")
    private IPropertyContent getPropertyPage(ModelElement elt) {
        IPropertyContent result = null;
        
        if(CamelModel.canInstantiate(elt)) {
            result = new CamelModelPropertyPage(CamelModel.instantiate((org.modelio.metamodel.uml.statik.Package)elt));
        
        } else if (SoftwareComponent.canInstantiate(elt)) {
            result = new SoftwareComponentPropertyPage(SoftwareComponent.instantiate((Component) elt));
        
        } else if (ScriptConfiguration.canInstantiate(elt)) {
            result = new ScriptConfigurationPropertyPage(ScriptConfiguration.instantiate((Artifact) elt));
        
        } else if (OptimisationRequirement.canInstantiate(elt)) {
            result = new OptimisationRequirementPropertyPage(OptimisationRequirement.instantiate((org.modelio.metamodel.uml.statik.Class) elt));
        
        } else if (ResourceRequirement.canInstantiate(elt)) {
            result = new ResourceRequirementPropertyPage(ResourceRequirement.instantiate((org.modelio.metamodel.uml.statik.Class) elt));
        
        } else if (FeatureClass.canInstantiate(elt)) {
            result = new FeaturePropertyPage(FeatureClass.instantiate((org.modelio.metamodel.uml.statik.Class) elt));
        
        } else if (AttributeAttribute.canInstantiate(elt)) {
            result = new AttributeAttributePropertyPage(AttributeAttribute.instantiate((org.modelio.metamodel.uml.statik.Attribute) elt));
        }
        return result;
    }

}
