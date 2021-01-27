package org.modelio.module.cpswarm.propertypage;

import java.util.List;
import org.modelio.api.modelio.model.IMetamodelExtensions;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.behavior.stateMachineModel.InternalTransition;
import org.modelio.metamodel.uml.behavior.stateMachineModel.State;
import org.modelio.metamodel.uml.behavior.stateMachineModel.Transition;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.metamodel.uml.statik.Port;
import org.modelio.module.cpswarm.api.CPSwarmStereotypes;
import org.modelio.module.cpswarm.api.ICPSwarmPeerModule;
import org.modelio.module.cpswarm.api.cpswarm_concept.standard.associationend.OptimisedEnd;
import org.modelio.module.cpswarm.impl.CPSwarmModule;
import org.modelio.vcore.smkernel.mapi.MMetamodel;

public class CPSwarmPropertyManager {
    public int changeProperty(ModelElement element, int row, String value) {
        IPropertyContent propertypage = null;
        IModuleContext moduleContext = CPSwarmModule.getInstance().getModuleContext();
        IMetamodelExtensions extensions = moduleContext.getModelingSession().getMetamodelExtensions();
        
        int currentRow = row;
        
        propertypage = new ModelElementPropertyPage();
        currentRow = currentRow - propertypage.changeProperty(element, currentRow, value);
        
        if ((element instanceof Class)) {
            propertypage = new ClassPropertyPage();
            currentRow = currentRow - propertypage.changeProperty(element, currentRow, value);
        } else if ((element instanceof Attribute)) {
            propertypage = new AttributePropertyPage();
            currentRow = currentRow - propertypage.changeProperty(element, currentRow, value);
        } else if ((element instanceof Parameter)) {
            propertypage = new ParameterPropertyPage();
            currentRow = currentRow - propertypage.changeProperty(element, currentRow, value);
        } else if ((element instanceof Port)) {
            propertypage = new PortPropertyPage();
            currentRow = currentRow - propertypage.changeProperty(element, currentRow, value);
        } else if ((element instanceof Association) || (element instanceof AssociationEnd)) {
            propertypage = new AssociationPropertyPage();
            currentRow = currentRow - propertypage.changeProperty(element, currentRow, value);
        } else if (element instanceof InternalTransition) {
            propertypage = new InternalTransitionPropertyPage();
            currentRow = currentRow - propertypage.changeProperty(element, currentRow, value);
        } else if ((element instanceof Transition) && !(element instanceof InternalTransition)) {
            propertypage = new TransitionPropertyPage();
            currentRow = currentRow - propertypage.changeProperty(element, currentRow, value);
        } else if (element instanceof State) {
            State state = (State) element;
            if (state.getInternal().size() > 0) {
                propertypage = new ActionPropertyPage();
                currentRow = currentRow - propertypage.changeProperty(element, currentRow, value);
            }else {
                propertypage = new SubMachinePropertyPage();
                currentRow = currentRow - propertypage.changeProperty(element, currentRow, value);
            }
        }
        
        List<Stereotype> sterList = element.getExtension();
        MMetamodel metamodel = moduleContext.getModelioServices().getMetamodelService().getMetamodel();
        
        for (Stereotype ster : sterList) {
            propertypage = null;
        
        
            // FitnessFunction property page
            if (ster.equals(extensions.getStereotype(ICPSwarmPeerModule.MODULE_NAME, CPSwarmStereotypes.FITNESSFUNCTION,
                    metamodel.getMClass(BindableInstance.class)))) {
                propertypage = new FitnessFunctionPropertyPage();
            }
        
            // FitnessFunction property page
            if (ster.equals(extensions.getStereotype(ICPSwarmPeerModule.MODULE_NAME, CPSwarmStereotypes.FITNESSFUNCTION,
                    metamodel.getMClass(BindableInstance.class)))) {
                propertypage = new FitnessFunctionPropertyPage();
            }
        
            //Optimised Parameter  property page
            if (ster.equals(extensions.getStereotype(ICPSwarmPeerModule.MODULE_NAME, CPSwarmStereotypes.OPTIMISEDPARAMETER,
                    metamodel.getMClass(Parameter.class)))) {
                propertypage = new OptimisedParameterPage();
            }
        
        
            //Optimised Port  property page
            if (ster.equals(extensions.getStereotype(ICPSwarmPeerModule.MODULE_NAME, CPSwarmStereotypes.OPTIMISEDPORT,
                    metamodel.getMClass(Port.class)))) {
                propertypage = new OptimisedParameterPage();
            }
        
            //Optimised Association End  property page
            if (ster.equals(extensions.getStereotype(ICPSwarmPeerModule.MODULE_NAME, OptimisedEnd.STEREOTYPE_NAME,
                    metamodel.getMClass(AssociationEnd.class)))) {
                propertypage = new OptimisedEndPage();
            }
        
            if (propertypage != null) {
                currentRow = currentRow - propertypage.changeProperty(element, currentRow, value);
                propertypage = null;
            }
        
        }
        return currentRow;
    }

    public void update(ModelElement element, IModulePropertyTable table) {
        IPropertyContent propertypage = null;
        IModuleContext moduleContext = CPSwarmModule.getInstance().getModuleContext();
        IMetamodelExtensions extensions = moduleContext.getModelingSession().getMetamodelExtensions();
        
        propertypage = new ModelElementPropertyPage();
        propertypage.update(element, table);
        
        
        if ((element instanceof Class)) {
            propertypage = new ClassPropertyPage();
            propertypage.update(element, table);
        } else if ((element instanceof Attribute)) {
            propertypage = new AttributePropertyPage();
            propertypage.update(element, table);
        } else if ((element instanceof Parameter)) {
            propertypage = new ParameterPropertyPage();
            propertypage.update(element, table);
        } else if ((element instanceof Port)) {
            propertypage = new PortPropertyPage();
            propertypage.update(element, table);
        } else if ((element instanceof Association) || (element instanceof AssociationEnd)) {
            propertypage = new AssociationPropertyPage();
            propertypage.update(element, table);
        } else if (element instanceof InternalTransition) {
            propertypage = new InternalTransitionPropertyPage();
            propertypage.update(element, table);
        } else if ((element instanceof Transition) && !(element instanceof InternalTransition)) {
            propertypage = new TransitionPropertyPage();
            propertypage.update(element, table);
        } else if (element instanceof State) {
            State state = (State) element;
            if (state.getInternal().size() > 0) {
                propertypage = new ActionPropertyPage();
                propertypage.update(element, table);
            }else {
                propertypage = new SubMachinePropertyPage();
                propertypage.update(element, table);
            }
        }
        
        
        List<Stereotype> sterList = element.getExtension();
        MMetamodel metamodel = moduleContext.getModelioServices().getMetamodelService().getMetamodel();
        
        for (Stereotype ster : sterList) {
        
            propertypage = null;
        
            // FitnessFunction property page
            if (ster.equals(extensions.getStereotype(ICPSwarmPeerModule.MODULE_NAME, CPSwarmStereotypes.FITNESSFUNCTION,
                    metamodel.getMClass(BindableInstance.class)))) {
                propertypage = new FitnessFunctionPropertyPage();
            }
        
          //Optimised Parameter  property page
            if (ster.equals(extensions.getStereotype(ICPSwarmPeerModule.MODULE_NAME, CPSwarmStereotypes.OPTIMISEDPARAMETER,
                    metamodel.getMClass(Parameter.class)))) {
                propertypage = new OptimisedParameterPage();
            }
        
            //Optimised Port  property page
            if (ster.equals(extensions.getStereotype(ICPSwarmPeerModule.MODULE_NAME, CPSwarmStereotypes.OPTIMISEDPORT,
                    metamodel.getMClass(Port.class)))) {
                propertypage = new OptimisedParameterPage();
            }
        
            //Optimised Association End  property page
            if (ster.equals(extensions.getStereotype(ICPSwarmPeerModule.MODULE_NAME, OptimisedEnd.STEREOTYPE_NAME,
                    metamodel.getMClass(AssociationEnd.class)))) {
                propertypage = new OptimisedEndPage();
            }
            if (propertypage != null) {
                propertypage.update(element, table);
                propertypage = null;
            }
        }
    }

}
