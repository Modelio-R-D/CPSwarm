package org.modelio.module.cpswarm.utils;

import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.IUmlModel;
import org.modelio.metamodel.diagrams.ClassDiagram;
import org.modelio.metamodel.diagrams.StateMachineDiagram;
import org.modelio.metamodel.diagrams.StaticDiagram;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Event;
import org.modelio.metamodel.uml.behavior.stateMachineModel.FinalState;
import org.modelio.metamodel.uml.behavior.stateMachineModel.InitialPseudoState;
import org.modelio.metamodel.uml.behavior.stateMachineModel.InternalTransition;
import org.modelio.metamodel.uml.behavior.stateMachineModel.Region;
import org.modelio.metamodel.uml.behavior.stateMachineModel.State;
import org.modelio.metamodel.uml.behavior.stateMachineModel.StateMachine;
import org.modelio.metamodel.uml.behavior.stateMachineModel.StateVertex;
import org.modelio.metamodel.uml.behavior.stateMachineModel.Transition;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.statik.AggregationKind;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.Collaboration;
import org.modelio.metamodel.uml.statik.DataType;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.metamodel.uml.statik.Port;
import org.modelio.metamodel.uml.statik.PortOrientation;
import org.modelio.module.cpswarm.api.CPSwarmStereotypes;
import org.modelio.module.cpswarm.api.ICPSwarmPeerModule;
import org.modelio.module.cpswarm.i18n.I18nMessageService;
import org.modelio.module.cpswarm.impl.CPSwarmModule;
import org.modelio.module.cpswarm.type.swarm.SwarmComponentType;
import org.modelio.module.sysml.api.ISysMLPeerModule;
import org.modelio.module.sysml.api.SysMLStereotypes;
import org.modelio.module.sysml.impl.SysMLPeerModule;
import org.modelio.vcore.smkernel.mapi.MObject;

public class CPSwarmFactory {
    private static final String MODELERMODULE_NAME = "ModelerModule";

    private static final String DESCRIPTION = "description";

    private static final IModelingSession _session = CPSwarmModule.getInstance().getModuleContext().getModelingSession();

    private static final IUmlModel _model = _session.getModel();

    private static final String LOCALS = "locals";

    public static StaticDiagram createEnvironmentDefinitionDiagram(ModelElement owner) {
        try {
            StaticDiagram diagram = _model.createStaticDiagram("", owner, ICPSwarmPeerModule.MODULE_NAME, CPSwarmStereotypes.ENVIRONMENTDEFINITION);
            _session.getModel().getDefaultNameService().setDefaultName(diagram, I18nMessageService.getString("Ui.Name.EnvironmentDefinition", owner.getName()));
            return diagram;
        } catch (Exception e) {
            CPSwarmModule.logService.error(e);
            return null;
        }
    }

    public static StaticDiagram createEnvironmentDefinitionDiagram(ModelElement owner, String name, String description) {
        try {
            StaticDiagram diagram = _model.createStaticDiagram("", owner, ICPSwarmPeerModule.MODULE_NAME, CPSwarmStereotypes.ENVIRONMENTDEFINITION);
            _session.getModel().getDefaultNameService().setDefaultName(diagram, name);
            _session.getModel().createNote(MODELERMODULE_NAME, DESCRIPTION, diagram, description);
            return diagram;
        } catch (Exception e) {
            CPSwarmModule.logService.error(e);
            return null;
        }
    }

    public static StaticDiagram createFitnessDefinitionDiagram(ModelElement owner, String name, String description) {
        try {
            StaticDiagram diagram = _model.createStaticDiagram(name, owner, ICPSwarmPeerModule.MODULE_NAME, CPSwarmStereotypes.FITNESSDEFINITIONDIAGRAM);
            _session.getModel().getDefaultNameService().setDefaultName(diagram, I18nMessageService.getString("Ui.Name.FitnessDefinition", owner.getName()));
            _session.getModel().createNote(MODELERMODULE_NAME, DESCRIPTION, diagram, description);
            return diagram;
        } catch (Exception e) {
            CPSwarmModule.logService.error(e);
            return null;
        }
    }

    public static ClassDiagram createSwarmMemberArchitectureDiagram(ModelElement owner, String name, String description) {
        try {
            Stereotype ster = _session.getMetamodelExtensions().getStereotype(ICPSwarmPeerModule.MODULE_NAME, CPSwarmStereotypes.SWARMMEMBER_ARCHITECTURE,
                    CPSwarmModule.getInstance().getModuleContext().getModelioServices().getMetamodelService().getMetamodel().getMClass(ClassDiagram.class));
        
            ClassDiagram diagram = _model.createClassDiagram(name, owner, ster);
            _session.getModel().getDefaultNameService().setDefaultName(diagram, name);
            _session.getModel().createNote(MODELERMODULE_NAME, DESCRIPTION, diagram, description);
            return diagram;
        } catch (Exception e) {
            CPSwarmModule.logService.error(e);
            return null;
        }
    }

    public static ClassDiagram createSwarmDefinitionDiagram(ModelElement owner, String name, String description) {
        try {
            Stereotype ster = _session.getMetamodelExtensions().getStereotype(ICPSwarmPeerModule.MODULE_NAME, CPSwarmStereotypes.SWARMCOMPOSITIONDIAGRAM,
                    CPSwarmModule.getInstance().getModuleContext().getModelioServices().getMetamodelService().getMetamodel().getMClass(ClassDiagram.class));
        
            ClassDiagram diagram = _model.createClassDiagram(name, owner, ster);
            _session.getModel().getDefaultNameService().setDefaultName(diagram, I18nMessageService.getString("Ui.Name.SwarmDefinition", owner.getName()));
            _session.getModel().createNote(MODELERMODULE_NAME, DESCRIPTION, diagram, description);
            return diagram;
        } catch (Exception e) {
            CPSwarmModule.logService.error(e);
            return null;
        }
    }

    public static ClassDiagram createSwarmCompositionDiagram(ModelElement owner, String name) {
        try {
            Stereotype ster = _session.getMetamodelExtensions().getStereotype(ICPSwarmPeerModule.MODULE_NAME, CPSwarmStereotypes.SWARMCOMPOSITIONDIAGRAM,
                    CPSwarmModule.getInstance().getModuleContext().getModelioServices().getMetamodelService().getMetamodel().getMClass(ClassDiagram.class));
        
            ClassDiagram diagram = _model.createClassDiagram(name, owner, ster);
            _session.getModel().getDefaultNameService().setDefaultName(diagram, name);
            return diagram;
        } catch (Exception e) {
            CPSwarmModule.logService.error(e);
            return null;
        }
    }

    public static ClassDiagram createSwarmDefinitionDiagram(ModelElement owner, String name) {
        try {
            Stereotype ster = _session.getMetamodelExtensions().getStereotype(ICPSwarmPeerModule.MODULE_NAME, CPSwarmStereotypes.SWARMCOMPOSITIONDIAGRAM,
                    CPSwarmModule.getInstance().getModuleContext().getModelioServices().getMetamodelService().getMetamodel().getMClass(ClassDiagram.class));
        
            ClassDiagram diagram = _model.createClassDiagram(name, owner, ster);
            _session.getModel().getDefaultNameService().setDefaultName(diagram, "Swarm Definition Diagram");
            return diagram;
        } catch (Exception e) {
            CPSwarmModule.logService.error(e);
            return null;
        }
    }

    public static StateMachineDiagram createBehaviorDiagram(StateMachine owner, String description) {
        try {
            Stereotype ster = _session.getMetamodelExtensions().getStereotype(ICPSwarmPeerModule.MODULE_NAME, CPSwarmStereotypes.BEHAVIORDIAGRAM,
                    CPSwarmModule.getInstance().getModuleContext().getModelioServices().getMetamodelService().getMetamodel().getMClass(StateMachineDiagram.class));
            StateMachineDiagram diagram = _model.createStateMachineDiagram("Behavior", owner, ster);
            _session.getModel().getDefaultNameService().setDefaultName(diagram, owner.getName());
            _session.getModel().createNote(MODELERMODULE_NAME, DESCRIPTION, diagram, description);
            return diagram;
        } catch (Exception e) {
            CPSwarmModule.logService.error(e);
            return null;
        }
    }

    public static StateMachineDiagram createBehaviorDiagram(StateMachine owner) {
        try {
            Stereotype ster = _session.getMetamodelExtensions().getStereotype(ICPSwarmPeerModule.MODULE_NAME, CPSwarmStereotypes.BEHAVIORDIAGRAM,
                    CPSwarmModule.getInstance().getModuleContext().getModelioServices().getMetamodelService().getMetamodel().getMClass(StateMachineDiagram.class));
            StateMachineDiagram diagram = _model.createStateMachineDiagram("Behavior", owner, ster);
            _session.getModel().getDefaultNameService().setDefaultName(diagram, owner.getName());
            return diagram;
        } catch (Exception e) {
            CPSwarmModule.logService.error(e);
            return null;
        }
    }

    public static StateMachineDiagram createBehavior(NameSpace owner) {
        try {
            StateMachine sm = _model.createStateMachine();
            _session.getModel().getDefaultNameService().setDefaultName(sm, "Behavior");
            sm.setOwner(owner);
            return createBehaviorDiagram(sm);
        } catch (Exception e) {
            CPSwarmModule.logService.error(e);
            return null;
        }
    }

    public static StateMachineDiagram createBehavior(Operation owner) {
        try {
            StateMachine sm = _model.createStateMachine();
            _session.getModel().getDefaultNameService().setDefaultName(sm, "Behavior");
            sm.setOwnerOperation(owner);
            return createBehaviorDiagram(sm);
        } catch (Exception e) {
            CPSwarmModule.logService.error(e);
            return null;
        }
    }

    public static State createAction(Region owner) {
        try {
            State state = _model.createState();
            _session.getModel().getDefaultNameService().setDefaultName(state, "Action");
            state.setParent(owner);
        
            InternalTransition it = _model.createInternalTransition();
            it.setSComposed(state);
            it.setReceivedEvents("Do");
            return state;
        } catch (Exception e) {
            CPSwarmModule.logService.error(e);
            return null;
        }
    }

    public static State createAction(StateMachine owner) {
        try {
            return createAction(owner.getTop());
        } catch (Exception e) {
            CPSwarmModule.logService.error(e);
            return null;
        }
    }

    public static Event createEvent(Transition tran) {
        try {
            Event event = _model.createEvent();
            _session.getModel().getDefaultNameService().setDefaultName(event, "Event");
        
            StateVertex source = tran.getSource();
            Region reg = source.getParent();
            event.setComposed(reg.getRepresented());
            tran.setTrigger(event);
        
            return event;
        } catch (Exception e) {
            CPSwarmModule.logService.error(e);
            return null;
        }
    }

    public static MObject createSubStateMachine(Region owner) {
        try {
            State state = _model.createState();
            _session.getModel().getDefaultNameService().setDefaultName(state, "subState");
            state.setParent(owner);
        
            return state;
        } catch (Exception e) {
            CPSwarmModule.logService.error(e);
            return null;
        }
    }

    public static MObject createSubStateMachine(StateMachine owner) {
        try {
            return createSubStateMachine(owner.getTop());
        } catch (Exception e) {
            CPSwarmModule.logService.error(e);
            return null;
        }
    }

    public static Class createSwarm(Package owner) {
        try {
            Class swarm = _model.createClass("Swarm", owner, ICPSwarmPeerModule.MODULE_NAME, CPSwarmStereotypes.SWARM);
            _session.getModel().getDefaultNameService().setDefaultName(swarm, "Swarm");
            return swarm;
        } catch (Exception e) {
            CPSwarmModule.logService.error(e);
            return null;
        }
    }

    public static Class createSwarmMember(Package owner) {
        try {
            Class swarm = _model.createClass("SwarmMember", owner, ICPSwarmPeerModule.MODULE_NAME, CPSwarmStereotypes.SWARMMEMBER);
            _session.getModel().getDefaultNameService().setDefaultName(swarm, "SwarmMember");
            return swarm;
        } catch (Exception e) {
            CPSwarmModule.logService.error(e);
            return null;
        }
    }

    public static ClassDiagram createInternalSwarmMemberDiagram(ModelElement owner, String name) {
        try {
            Stereotype ster = _session.getMetamodelExtensions().getStereotype(ICPSwarmPeerModule.MODULE_NAME, CPSwarmStereotypes.INTERNALSWARMMEMBERDIAGRAM,
                    CPSwarmModule.getInstance().getModuleContext().getModelioServices().getMetamodelService().getMetamodel().getMClass(ClassDiagram.class));
        
            ClassDiagram diagram = _model.createClassDiagram(name, owner, ster);
            _session.getModel().getDefaultNameService().setDefaultName(diagram, "Swarm Internal Block Diagram");
            return diagram;
        } catch (Exception e) {
            CPSwarmModule.logService.error(e);
            return null;
        }
    }

    public static StateMachineDiagram createBehaviorDiagram(ModelElement owner, String diagramName) {
        StateMachine statemachine = null;
        //IModelingSession session = CPSwarmModule.getInstance().getModuleContext().getModelingSession();
        //IUmlModel model = session.getModel();
        
        if (owner instanceof StateMachine){
            statemachine = (StateMachine) owner;
        
        }else{
            statemachine = _model.createStateMachine();
            if (owner instanceof  Operation)
                statemachine.setOwnerOperation((Operation) owner);
            else   if (owner instanceof  NameSpace)
                statemachine.setOwner((NameSpace) owner);
        
        }
        
        boolean notFound = true;
        for (Collaboration colla : statemachine.getOwnedCollaboration()){
            if (colla.getName().equals(LOCALS)){
                notFound = false;
                break;
            }
        }
        
        if (notFound){
            Collaboration locals = _model.createCollaboration();
            locals.setName(LOCALS);
            statemachine.getOwnedCollaboration().add(locals);
        }
        
        StateMachineDiagram diagram = null;
        try{
            Stereotype ster = _session.getMetamodelExtensions().getStereotype(ICPSwarmPeerModule.MODULE_NAME, CPSwarmStereotypes.BEHAVIORDIAGRAM, CPSwarmModule.getInstance().getModuleContext().getModelioServices().getMetamodelService().getMetamodel().getMClass(StateMachineDiagram.class));
            diagram = _model.createStateMachineDiagram("", statemachine,ster);
            diagram.setOrigin(statemachine);
            _model.getDefaultNameService().setDefaultName(diagram,  diagramName);
        
        } catch (Exception e) {
            CPSwarmModule.logService.error(e);
        }
        
        CPSwarmModule.getInstance().getModuleContext().getModelioServices().getEditionService().openEditor(diagram);
        return diagram;
    }

    public static Class createSwarm(Package owner, String name) {
        try {
            Class swarm = _model.createClass(name, owner, ICPSwarmPeerModule.MODULE_NAME, CPSwarmStereotypes.SWARM);
            _session.getModel().getDefaultNameService().setDefaultName(swarm, name);
            return swarm;
        } catch (Exception e) {
            CPSwarmModule.logService.error(e);
            return null;
        }
    }

    public static Class createSwarm(Package owner, String name, String description) {
        try {
            Class swarm = _model.createClass(name, owner, ICPSwarmPeerModule.MODULE_NAME, CPSwarmStereotypes.SWARM);
            _session.getModel().getDefaultNameService().setDefaultName(swarm, name);
            _session.getModel().createNote(MODELERMODULE_NAME, DESCRIPTION, swarm, description);
            return swarm;
        } catch (Exception e) {
            CPSwarmModule.logService.error(e);
            return null;
        }
    }

    public static Association createComposition(Class source, Class destination, String destinationRole, String destinationMultiplicity) {
        try {
        
        
            Association association = _model.createAssociation();
        
            AssociationEnd endSource = _model.createAssociationEnd();
            endSource.setMultiplicityMin("1");
            endSource.setMultiplicityMax("1");
            endSource.setSource(destination);
            endSource.setTarget(source);
        
            AssociationEnd endTarget = _model.createAssociationEnd();
            endTarget.setName(destinationRole);
            endTarget.setAggregation(AggregationKind.KINDISCOMPOSITION);
            endTarget.setMultiplicityMin(destinationMultiplicity);
            endTarget.setMultiplicityMax(destinationMultiplicity);
        
            association.getEnd().add(endTarget);
            association.getEnd().add(endSource);
        
            endSource.setOpposite(endTarget);
            endTarget.setOpposite(endSource);
        
            endSource.setNavigable(false);
            endTarget.setNavigable(true);
        
            return association;
        } catch (Exception e) {
            CPSwarmModule.logService.error(e);
            return null;
        }
    }

    public static Class createSwarmComponent(Package owner, String name, String description, SwarmComponentType swarmComponentType) {
        try {
            Class swarmComponent = _model.createClass(name, owner, ICPSwarmPeerModule.MODULE_NAME,
                    swarmComponentType.getCorrespondingStereotype());
            _session.getModel().getDefaultNameService().setDefaultName(swarmComponent, name);
            _session.getModel().createNote(MODELERMODULE_NAME, DESCRIPTION, swarmComponent, description);
            return swarmComponent;
        } catch (Exception e) {
            CPSwarmModule.logService.error(e);
            return null;
        }
    }

    public static Port createPort(ModelElement owner, String name, DataType valueType, PortOrientation portOrientation) {
        try {
        
            Port port = _model.createPort();
            if (owner instanceof Instance) {
                port.setCluster((Instance) owner);
            } else if (owner instanceof Classifier) {
                port.setInternalOwner((Classifier) owner);
            }
            port.setName(name);
            port.getExtension().add(_session.getMetamodelExtensions().getStereotype(ISysMLPeerModule.MODULE_NAME, SysMLStereotypes.FLOWPORT, port.getMClass()));
        
            port.setBase(valueType);
        
            port.setDirection(portOrientation);
            return port;
        } catch (Exception e) {
            CPSwarmModule.logService.error(e);
            return null;
        }
    }

    public static StateMachineDiagram createBehaviorDiagram(ModelElement owner, String stateMachineName, String diagramName) {
        StateMachine statemachine = null;
        
        if (owner instanceof StateMachine){
            statemachine = (StateMachine) owner;
        
        }else{
            statemachine = _model.createStateMachine();
            if (owner instanceof  Operation)
                statemachine.setOwnerOperation((Operation) owner);
            else   if (owner instanceof  NameSpace)
                statemachine.setOwner((NameSpace) owner);
            statemachine.setName(stateMachineName);
            _model.getDefaultNameService().setDefaultName(statemachine,  stateMachineName);
        }
        
        boolean notFound = true;
        for (Collaboration colla : statemachine.getOwnedCollaboration()){
            if (colla.getName().equals(LOCALS)){
                notFound = false;
                break;
            }
        }
        
        if (notFound){
            Collaboration locals = _model.createCollaboration();
            locals.setName(LOCALS);
            statemachine.getOwnedCollaboration().add(locals);
        }
        
        StateMachineDiagram diagram = null;
        try{
            Stereotype ster = _session.getMetamodelExtensions().getStereotype(ICPSwarmPeerModule.MODULE_NAME, CPSwarmStereotypes.BEHAVIORDIAGRAM, CPSwarmModule.getInstance().getModuleContext().getModelioServices().getMetamodelService().getMetamodel().getMClass(StateMachineDiagram.class));
            diagram = _model.createStateMachineDiagram("", statemachine,ster);
            diagram.setOrigin(statemachine);
            _model.getDefaultNameService().setDefaultName(diagram,  diagramName);
        
        } catch (Exception e) {
            CPSwarmModule.logService.error(e);
        }
        
        CPSwarmModule.getInstance().getModuleContext().getModelioServices().getEditionService().openEditor(diagram);
        return diagram;
    }

    public static InitialPseudoState createInitialState(StateMachine owner, String name) {
        try {
            InitialPseudoState initialState = _model.createInitialPseudoState();
            initialState.setName(name);
            owner.getTop().getSub().add(initialState);
            return initialState;
        } catch (Exception e) {
            CPSwarmModule.logService.error(e);
            return null;
        }
    }

    public static FinalState createFinalState(StateMachine owner, String name) {
        try {
            FinalState finalState = _model.createFinalState();
            finalState.setName(name);
            owner.getTop().getSub().add(finalState);
            return finalState;
        } catch (Exception e) {
            CPSwarmModule.logService.error(e);
            return null;
        }
    }

    public static State createState(StateMachine owner, String name) {
        try {
            State state = _model.createState();
            state.setName(name);
            owner.getTop().getSub().add(state);
            return state;
        } catch (Exception e) {
            CPSwarmModule.logService.error(e);
            return null;
        }
    }

    public static Transition createTransition(StateVertex source, StateVertex target) {
        try {
            Transition transition = _model.createTransition();
            transition.setSource(source);
            transition.setTarget(target);
            //state.setName(state);
            //initialState.getTop().getSub().add(state);
            return transition;
        } catch (Exception e) {
            CPSwarmModule.logService.error(e);
            return null;
        }
    }

    public static DataType createValueType(Package owner, String name) {
        try {
            DataType valueType = _model.createDataType(name, owner, SysMLPeerModule.MODULE_NAME, SysMLStereotypes.VALUETYPE);
            _model.getDefaultNameService().setDefaultName(valueType,  name);
            return valueType;
        } catch (Exception e) {
            CPSwarmModule.logService.error(e);
            return null;
        }
    }

    public static Class createSwarmMember(Package owner, String name) {
        try {
            Class swarm = _model.createClass(name, owner, ICPSwarmPeerModule.MODULE_NAME, CPSwarmStereotypes.SWARMMEMBER);
            _session.getModel().getDefaultNameService().setDefaultName(swarm, name);
            return swarm;
        } catch (Exception e) {
            CPSwarmModule.logService.error(e);
            return null;
        }
    }

}
