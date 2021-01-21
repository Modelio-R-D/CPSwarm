package fr.softeam.cameldesigner.elementmodel.walker.camelwalker;

import camel.constraint.ConstraintModel;
import camel.core.CamelModel;
import camel.data.DataInstanceModel;
import camel.data.DataModel;
import camel.data.DataTypeModel;
import camel.deployment.DeploymentInstanceModel;
import camel.deployment.DeploymentModel;
import camel.deployment.DeploymentTypeModel;
import camel.execution.ExecutionModel;
import camel.location.LocationModel;
import camel.metric.MetricInstanceModel;
import camel.metric.MetricModel;
import camel.mms.MetaDataModel;
import camel.organisation.OrganisationModel;
import camel.requirement.RequirementModel;
import camel.scalability.ScalabilityModel;
import camel.security.SecurityModel;
import camel.type.TypeModel;
import camel.unit.UnitModel;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.conversion.process.reverse.AbstractReverseProcess;
import fr.softeam.cameldesigner.conversion.process.reverse.ReverseProcessConstraint;
import fr.softeam.cameldesigner.conversion.process.reverse.ReverseProcessDataInstance;
import fr.softeam.cameldesigner.conversion.process.reverse.ReverseProcessDataType;
import fr.softeam.cameldesigner.conversion.process.reverse.ReverseProcessDeploymentInstance;
import fr.softeam.cameldesigner.conversion.process.reverse.ReverseProcessDeploymentType;
import fr.softeam.cameldesigner.conversion.process.reverse.ReverseProcessExecution;
import fr.softeam.cameldesigner.conversion.process.reverse.ReverseProcessLocation;
import fr.softeam.cameldesigner.conversion.process.reverse.ReverseProcessMetaData;
import fr.softeam.cameldesigner.conversion.process.reverse.ReverseProcessMetricInstance;
import fr.softeam.cameldesigner.conversion.process.reverse.ReverseProcessMetricType;
import fr.softeam.cameldesigner.conversion.process.reverse.ReverseProcessOrganisation;
import fr.softeam.cameldesigner.conversion.process.reverse.ReverseProcessRequirement;
import fr.softeam.cameldesigner.conversion.process.reverse.ReverseProcessScalability;
import fr.softeam.cameldesigner.conversion.process.reverse.ReverseProcessSecurity;
import fr.softeam.cameldesigner.conversion.process.reverse.ReverseProcessType;
import fr.softeam.cameldesigner.conversion.process.reverse.ReverseProcessUnit;

@objid ("f657c722-e33b-4d7c-8743-1d71eceff07f")
public class CamelWalker extends AbstractCamelWalker {
    @objid ("61f06f62-67d7-4cad-b3e6-318575615fac")
    public CamelWalker(AbstractReverseProcess reverseProcess) {
        this.reverseProcess = reverseProcess;
    }

    @objid ("1fe683ee-2b93-433d-a56d-3e12a6e7a2a6")
    @Override
    protected void walkChildren(Object processedElement, CamelElement resultedElement) {
        //if(resultedElement instanceof Package) {
        //Package packageOwner = (Package) resultedElement;
        if (processedElement instanceof CamelModel && resultedElement instanceof fr.softeam.cameldesigner.api.camelcore.standard.package_.CamelModel) {
            CamelModel camelModel = (CamelModel) processedElement;
            fr.softeam.cameldesigner.api.camelcore.standard.package_.CamelModel proxyResultedElement = (fr.softeam.cameldesigner.api.camelcore.standard.package_.CamelModel)resultedElement;
            for(DeploymentModel deploymentModel : camelModel.getDeploymentModels()) {
                this.reverseProcess.setUmlElementParent(proxyResultedElement.getElement());
                walk(deploymentModel);
            }
            for(RequirementModel requirementModel : camelModel.getRequirementModels()) {
                this.reverseProcess.setUmlElementParent(proxyResultedElement.getElement());
                walk(requirementModel);
            }
            for(MetricModel metricModel : camelModel.getMetricModels()) {
                this.reverseProcess.setUmlElementParent(proxyResultedElement.getElement());
                walk(metricModel);
            }
            for(MetaDataModel metaDataModel : camelModel.getMetadataModels()) {
                this.reverseProcess.setUmlElementParent(proxyResultedElement.getElement());
                walk(metaDataModel);
            }
            for(ExecutionModel deploymentModel : camelModel.getExecutionModels()) {
                this.reverseProcess.setUmlElementParent(proxyResultedElement.getElement());
                walk(deploymentModel);
            }
            for(LocationModel locationModel : camelModel.getLocationModels()) {
                this.reverseProcess.setUmlElementParent(proxyResultedElement.getElement());
                walk(locationModel);
            }
            for(OrganisationModel organisationModel : camelModel.getOrganisationModels()) {
                this.reverseProcess.setUmlElementParent(proxyResultedElement.getElement());
                walk(organisationModel);
            }
            for(ScalabilityModel scalabilityModel : camelModel.getScalabilityModels()) {
                this.reverseProcess.setUmlElementParent(proxyResultedElement.getElement());
                walk(scalabilityModel);
            }
            for(SecurityModel securityModel : camelModel.getSecurityModels()) {
                this.reverseProcess.setUmlElementParent(proxyResultedElement.getElement());
                walk(securityModel);
            }
            for(TypeModel typeModel : camelModel.getTypeModels()) {
                this.reverseProcess.setUmlElementParent(proxyResultedElement.getElement());
                walk(typeModel);
            }
            for(UnitModel unitModel : camelModel.getUnitModels()) {
                this.reverseProcess.setUmlElementParent(proxyResultedElement.getElement());
                walk(unitModel);
            }
            for(ConstraintModel constraintModel : camelModel.getConstraintModels()) {
                this.reverseProcess.setUmlElementParent(proxyResultedElement.getElement());
                walk(constraintModel);
            }
            for(DataModel dataModel : camelModel.getDataModels()) {
                this.reverseProcess.setUmlElementParent(proxyResultedElement.getElement());
                walk(dataModel);
            }
        }
        else if (resultedElement instanceof fr.softeam.cameldesigner.api.camelcore.standard.package_.SubModel) {
            fr.softeam.cameldesigner.api.camelcore.standard.package_.SubModel proxyResultedElement = (fr.softeam.cameldesigner.api.camelcore.standard.package_.SubModel)resultedElement;
        
            if(processedElement instanceof DeploymentTypeModel ) {
        
                AbstractReverseProcess subModelProcess = new ReverseProcessDeploymentType(proxyResultedElement.getElement(), this.reverseProcess.getProcessedCamelElements() );
                AbstractCamelWalker subModelWalker = new DeploymentTypeWalker (subModelProcess);
                //  Call directly walkChildren. no need to call walk, subModel already created by Camel Walker
                subModelWalker.walkChildren(processedElement, resultedElement);
        
            } 
            else if(processedElement instanceof RequirementModel) {
                AbstractReverseProcess subModelProcess = new ReverseProcessRequirement(proxyResultedElement.getElement(), this.reverseProcess.getProcessedCamelElements() );
                AbstractCamelWalker subModelWalker = new RequirementWalker (subModelProcess);
                //  Call directly walkChildren. no need to call walk, subModel already created by Camel Walker
                subModelWalker.walkChildren(processedElement, resultedElement);
        
            } 
        
            else if(processedElement instanceof MetricModel ) {
                AbstractReverseProcess subModelProcess = new ReverseProcessMetricType(proxyResultedElement.getElement(), this.reverseProcess.getProcessedCamelElements() );
                AbstractCamelWalker subModelWalker = new MetricTypeWalker (subModelProcess);
                //  Call directly walkChildren. no need to call walk, subModel already created by Camel Walker
                subModelWalker.walkChildren(processedElement, resultedElement);
        
            } 
        
            else if(processedElement instanceof MetaDataModel ) {
                AbstractReverseProcess subModelProcess = new ReverseProcessMetaData(proxyResultedElement.getElement(), this.reverseProcess.getProcessedCamelElements() );
                AbstractCamelWalker subModelWalker = new MetaDataWalker (subModelProcess);
                //  Call directly walkChildren. no need to call walk, subModel already created by Camel Walker
                subModelWalker.walkChildren(processedElement, resultedElement);        
        
            } else if(processedElement instanceof DataTypeModel ) {
                AbstractReverseProcess subModelProcess = new ReverseProcessDataType(proxyResultedElement.getElement(), this.reverseProcess.getProcessedCamelElements() );
                AbstractCamelWalker subModelWalker = new DataTypeWalker (subModelProcess);
                //  Call directly walkChildren. no need to call walk, subModel already created by Camel Walker
                subModelWalker.walkChildren(processedElement, resultedElement);        
        
            } else if(processedElement instanceof ExecutionModel ) {
                AbstractReverseProcess subModelProcess = new ReverseProcessExecution(proxyResultedElement.getElement(), this.reverseProcess.getProcessedCamelElements() );
                AbstractCamelWalker subModelWalker = new ExecutionWalker (subModelProcess);
                //  Call directly walkChildren. no need to call walk, subModel already created by Camel Walker
                subModelWalker.walkChildren(processedElement, resultedElement);        
        
            } 
        
            else if(processedElement instanceof LocationModel ) {
                AbstractReverseProcess subModelProcess = new ReverseProcessLocation(proxyResultedElement.getElement(), this.reverseProcess.getProcessedCamelElements() );
                AbstractCamelWalker subModelWalker = new LocationWalker (subModelProcess);
                //  Call directly walkChildren. no need to call walk, subModel already created by Camel Walker
                subModelWalker.walkChildren(processedElement, resultedElement);  
        
        
        
            } 
            else if(processedElement instanceof OrganisationModel ) {
        
                AbstractReverseProcess subModelProcess = new ReverseProcessOrganisation(proxyResultedElement.getElement(), this.reverseProcess.getProcessedCamelElements() );
                AbstractCamelWalker subModelWalker = new OrganisationWalker (subModelProcess);
                //  Call directly walkChildren. no need to call walk, subModel already created by Camel Walker
                subModelWalker.walkChildren(processedElement, resultedElement);  
        
        
            } else if(processedElement instanceof ScalabilityModel ) {
        
                AbstractReverseProcess subModelProcess = new ReverseProcessScalability(proxyResultedElement.getElement(), this.reverseProcess.getProcessedCamelElements() );
                AbstractCamelWalker subModelWalker = new ScalabilityWalker (subModelProcess);
                //  Call directly walkChildren. no need to call walk, subModel already created by Camel Walker
                subModelWalker.walkChildren(processedElement, resultedElement);  
        
        
            } else if(processedElement instanceof SecurityModel ) {
        
                AbstractReverseProcess subModelProcess = new ReverseProcessSecurity(proxyResultedElement.getElement(), this.reverseProcess.getProcessedCamelElements() );
                AbstractCamelWalker subModelWalker = new SecurityWalker (subModelProcess);
                //  Call directly walkChildren. no need to call walk, subModel already created by Camel Walker
                subModelWalker.walkChildren(processedElement, resultedElement);  
        
        
        
            } else if(processedElement instanceof TypeModel ) {
        
                AbstractReverseProcess subModelProcess = new ReverseProcessType(proxyResultedElement.getElement(), this.reverseProcess.getProcessedCamelElements() );
                AbstractCamelWalker subModelWalker = new TypeWalker (subModelProcess);
                //  Call directly walkChildren. no need to call walk, subModel already created by Camel Walker
                subModelWalker.walkChildren(processedElement, resultedElement);  
        
            } else if(processedElement instanceof UnitModel ) {
        
                AbstractReverseProcess subModelProcess = new ReverseProcessUnit(proxyResultedElement.getElement(), this.reverseProcess.getProcessedCamelElements() );
                AbstractCamelWalker subModelWalker = new UnitWalker (subModelProcess);
                //  Call directly walkChildren. no need to call walk, subModel already created by Camel Walker
                subModelWalker.walkChildren(processedElement, resultedElement);  
        
        
            } else if(processedElement instanceof ConstraintModel ) {
        
        
                AbstractReverseProcess subModelProcess = new ReverseProcessConstraint(proxyResultedElement.getElement(), this.reverseProcess.getProcessedCamelElements() );
                AbstractCamelWalker subModelWalker = new ConstraintWalker (subModelProcess);
                //  Call directly walkChildren. no need to call walk, subModel already created by Camel Walker
                subModelWalker.walkChildren(processedElement, resultedElement);  
        
            } 
        
        
            else if(processedElement instanceof DeploymentInstanceModel ) {
        
        
                AbstractReverseProcess subModelProcess = new ReverseProcessDeploymentInstance(proxyResultedElement.getElement(), this.reverseProcess.getProcessedCamelElements() );
                AbstractCamelWalker subModelWalker = new DeploymentInstanceWalker (subModelProcess);
                //  Call directly walkChildren. no need to call walk, subModel already created by Camel Walker
                subModelWalker.walkChildren(processedElement, resultedElement);  
        
            }
            else if(processedElement instanceof DataInstanceModel ) {
        
                AbstractReverseProcess subModelProcess = new ReverseProcessDataInstance(proxyResultedElement.getElement(), this.reverseProcess.getProcessedCamelElements() );
                AbstractCamelWalker subModelWalker = new DataInstanceWalker (subModelProcess);
                //  Call directly walkChildren. no need to call walk, subModel already created by Camel Walker
                subModelWalker.walkChildren(processedElement, resultedElement);  
        
            }
            else if(processedElement instanceof MetricInstanceModel ) {
        
                AbstractReverseProcess subModelProcess = new ReverseProcessMetricInstance(proxyResultedElement.getElement(), this.reverseProcess.getProcessedCamelElements() );
                AbstractCamelWalker subModelWalker = new MetricInstanceWalker (subModelProcess);
                //  Call directly walkChildren. no need to call walk, subModel already created by Camel Walker
                subModelWalker.walkChildren(processedElement, resultedElement);  
        
        
            }
        }
    }

}
