/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CPSwarm v3.9.03

 * This file was generated on 4/15/20 8:10 AM by Modelio Studio.
 */
package org.modelio.module.cpswarm.api;

import org.modelio.metamodel.diagrams.ClassDiagram;
import org.modelio.metamodel.diagrams.StateMachineDiagram;
import org.modelio.metamodel.uml.behavior.stateMachineModel.InternalTransition;
import org.modelio.metamodel.uml.behavior.stateMachineModel.State;
import org.modelio.metamodel.uml.behavior.stateMachineModel.StateMachine;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.UmlModelElement;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.Component;
import org.modelio.metamodel.uml.statik.DataType;
import org.modelio.metamodel.uml.statik.Interface;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.metamodel.uml.statik.Port;
import org.modelio.metamodel.visitors.IDefaultInfrastructureVisitor;
import org.modelio.metamodel.visitors.IDefaultModelVisitor;
import org.modelio.metamodel.visitors.IInfrastructureVisitor;

/**
 * Factory that instantiates the right proxy class for a model element stereotyped by a 'CPSwarm' module stereotype.
 * <h2>Module description:</h2>
 * <br/><i>CPSwarm is a Modelio extension dedicated to the CPSWarm methodology and tool flow.</i></p>
 * <h2>Supported stereotypes:</h2>
 * <ul><li><< Actuator >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link Actuator}
 * <li><< CommunicationInterface >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link CommunicationInterface}
 * <li><< Controller >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link Controller}
 * <li><< EnvironmentDefinition >> on a {@link org.modelio.metamodel.uml.statik.Package}: instantiates a {@link EnvironmentDefinition}
 * <li><< FitnessDefinition >> on a {@link org.modelio.metamodel.uml.statik.Package}: instantiates a {@link FitnessDefinition}
 * <li><< FitnessFunction >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link FitnessFunction}
 * <li><< OptimisedArgument >> on a {@link org.modelio.metamodel.uml.infrastructure.UmlModelElement}: instantiates a {@link OptimisedArgument}
 * <li><< Optimised_End >> on a {@link org.modelio.metamodel.uml.statik.AssociationEnd}: instantiates a {@link OptimisedEnd}
 * <li><< Optimised_Parameter >> on a {@link org.modelio.metamodel.uml.statik.Parameter}: instantiates a {@link OptimisedParameter}
 * <li><< Optimised_Port >> on a {@link org.modelio.metamodel.uml.statik.Port}: instantiates a {@link OptimisedPort}
 * <li><< Problem >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link Problem}
 * <li><< RoSAlgorithm >> on a {@link org.modelio.metamodel.uml.statik.Operation}: instantiates a {@link RoSAlgorithm}
 * <li><< RoSAbstraction >> on a {@link org.modelio.metamodel.uml.statik.Operation}: instantiates a {@link RoSAbstraction}
 * <li><< Sensor >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link Sensor}
 * <li><< Swarm >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link Swarm}
 * <li><< SwarmMember >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link SwarmMember}
 * <li><< Virtual >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link Virtual}
 * <li><< Topic >> on a {@link org.modelio.metamodel.uml.statik.Package}: instantiates a {@link Topic}
 * <li><< Msg >> on a {@link org.modelio.metamodel.uml.statik.DataType}: instantiates a {@link Msg}
 * <li><< ROSPackage >> on a {@link org.modelio.metamodel.uml.statik.Package}: instantiates a {@link ROSPackage}
 * <li><< ROSMonitoring >> on a {@link org.modelio.metamodel.uml.behavior.stateMachineModel.State}: instantiates a {@link ROSMonitoring}
 * <li><< ROSComponent >> on a {@link org.modelio.metamodel.uml.statik.Component}: instantiates a {@link ROSComponent}
 * <li><< DepTopic >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link DepTopic}
 * <li><< DepMsg >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link DepMsg}
 * <li><< DepPort >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link DepPort}
 * <li><< ROSAction >> on a {@link org.modelio.metamodel.uml.statik.Interface}: instantiates a {@link ROSAction}
 * <li><< ROSService >> on a {@link org.modelio.metamodel.uml.statik.Interface}: instantiates a {@link ROSService}
 * <li><< GOAL >> on a {@link org.modelio.metamodel.uml.statik.Attribute}: instantiates a {@link GOAL}
 * <li><< RESULT >> on a {@link org.modelio.metamodel.uml.statik.Attribute}: instantiates a {@link RESULT}
 * <li><< DepCommModel >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link DepCommModel}
 * <li><< Mapped >> on a {@link org.modelio.metamodel.uml.behavior.stateMachineModel.InternalTransition}: instantiates a {@link Mapped}
 * <li><< BehaviorDiagram >> on a {@link org.modelio.metamodel.diagrams.StateMachineDiagram}: instantiates a {@link BehaviorDiagram}
 * <li><< SwarmCompositionDiagram >> on a {@link org.modelio.metamodel.diagrams.ClassDiagram}: instantiates a {@link SwarmCompositionDiagram}
 * <li><< SwarmBlockDiagram >> on a {@link org.modelio.metamodel.diagrams.ClassDiagram}: instantiates a {@link SwarmBlockDiagram}
 * <li><< InternalSwarmMemberDiagram >> on a {@link org.modelio.metamodel.diagrams.ClassDiagram}: instantiates a {@link InternalSwarmMemberDiagram}
 * <li><< FitnessDefinitionDiagram >> on a {@link org.modelio.metamodel.diagrams.ClassDiagram}: instantiates a {@link FitnessDefinitionDiagram}
 * <li><< World >> on a {@link org.modelio.metamodel.uml.statik.Package}: instantiates a {@link World}
 * <li><< SDFRoot >> on a {@link org.modelio.metamodel.uml.statik.Package}: instantiates a {@link SDFRoot}
 * <li><< Model >> on a {@link org.modelio.metamodel.uml.statik.Package}: instantiates a {@link Model}
 * </ul>
 */
public class CPSwarmProxyFactory {
    private static final InstantiateVisitor instantiateVisitor = new InstantiateVisitor();

    /**
     * Instantiates the right proxy class the given element.
     * <br/>The model element must be stereotyped by a 'CPSwarm' module stereotype.
     * <br/>In the other case the method will return <i>null</i>.
     * 
     * @param e A model element
     * @return the right proxy or <i>null</i>.
     */
    public static final Object instantiate(final ModelElement e) {
        for (Stereotype s : e.getExtension()) {
              if (s.getModule().getName().equals(ICPSwarmPeerModule.MODULE_NAME)) {
                  return instantiate(e, s.getName());
              }
        }
        return null;
    }

    /**
     * Instantiates the right proxy class the given element with a stereotype name.
     * The stereotype must be one of the 'CPSwarm' module stereotypes.
     * In the other case the method will return <i>null</i>.
     * 
     * @param e A model element.
     * @param stName A stereotype name.
     * @return the right proxy or <i>null</i>.
     */
    public static final Object instantiate(final Element e, final String stName) {
        instantiateVisitor.setStereotype(stName);
        return e.accept(instantiateVisitor);
    }

    private static class InstantiateVisitor implements IDefaultModelVisitor, IDefaultInfrastructureVisitor {
        private String stName;

        public final void setStereotype(final String stName) {
            this.stName = stName;
        }

        @Override
        public final Object visitDependency(Dependency obj) {
            switch (this.stName) {
                case org.modelio.module.cpswarm.api.cpswarm_concept.infrastructure.dependency.DepTopic.STEREOTYPE_NAME: return org.modelio.module.cpswarm.api.cpswarm_concept.infrastructure.dependency.DepTopic.instantiate(obj);
                case org.modelio.module.cpswarm.api.cpswarm_concept.infrastructure.dependency.DepMsg.STEREOTYPE_NAME: return org.modelio.module.cpswarm.api.cpswarm_concept.infrastructure.dependency.DepMsg.instantiate(obj);
                case org.modelio.module.cpswarm.api.cpswarm_concept.infrastructure.dependency.DepPort.STEREOTYPE_NAME: return org.modelio.module.cpswarm.api.cpswarm_concept.infrastructure.dependency.DepPort.instantiate(obj);
                case org.modelio.module.cpswarm.api.cpswarm_concept.infrastructure.dependency.DepCommModel.STEREOTYPE_NAME: return org.modelio.module.cpswarm.api.cpswarm_concept.infrastructure.dependency.DepCommModel.instantiate(obj);
                default:
                    break;
            }
            return IDefaultInfrastructureVisitor.super.visitDependency(obj);
        }

        @Override
        public final Object visitInternalTransition(InternalTransition obj) {
            switch (this.stName) {
                case org.modelio.module.cpswarm.api.cpswarm_concept.standard.internaltransition.Mapped.STEREOTYPE_NAME: return org.modelio.module.cpswarm.api.cpswarm_concept.standard.internaltransition.Mapped.instantiate(obj);
                default:
                    break;
            }
            return IDefaultModelVisitor.super.visitInternalTransition(obj);
        }

        @Override
        public final Object visitComponent(Component obj) {
            switch (this.stName) {
                case org.modelio.module.cpswarm.api.cpswarm_concept.standard.component.ROSComponent.STEREOTYPE_NAME: return org.modelio.module.cpswarm.api.cpswarm_concept.standard.component.ROSComponent.instantiate(obj);
                default:
                    break;
            }
            return IDefaultModelVisitor.super.visitComponent(obj);
        }

        @Override
        public final Object visitState(State obj) {
            switch (this.stName) {
                case org.modelio.module.cpswarm.api.cpswarm_concept.standard.state.ROSMonitoring.STEREOTYPE_NAME: return org.modelio.module.cpswarm.api.cpswarm_concept.standard.state.ROSMonitoring.instantiate(obj);
                default:
                    break;
            }
            return IDefaultModelVisitor.super.visitState(obj);
        }

        @Override
        public final Object visitOperation(Operation obj) {
            switch (this.stName) {
                case org.modelio.module.cpswarm.api.cpswarm_concept.standard.operation.RoSAlgorithm.STEREOTYPE_NAME: return org.modelio.module.cpswarm.api.cpswarm_concept.standard.operation.RoSAlgorithm.instantiate(obj);
                case org.modelio.module.cpswarm.api.cpswarm_concept.standard.operation.RoSAbstraction.STEREOTYPE_NAME: return org.modelio.module.cpswarm.api.cpswarm_concept.standard.operation.RoSAbstraction.instantiate(obj);
                default:
                    break;
            }
            return IDefaultModelVisitor.super.visitOperation(obj);
        }

        @Override
        public final Object visitClass(Class obj) {
            switch (this.stName) {
                case org.modelio.module.cpswarm.api.cpswarm_concept.standard.class_.Actuator.STEREOTYPE_NAME: return org.modelio.module.cpswarm.api.cpswarm_concept.standard.class_.Actuator.instantiate(obj);
                case org.modelio.module.cpswarm.api.cpswarm_concept.standard.class_.CommunicationInterface.STEREOTYPE_NAME: return org.modelio.module.cpswarm.api.cpswarm_concept.standard.class_.CommunicationInterface.instantiate(obj);
                case org.modelio.module.cpswarm.api.cpswarm_concept.standard.class_.Controller.STEREOTYPE_NAME: return org.modelio.module.cpswarm.api.cpswarm_concept.standard.class_.Controller.instantiate(obj);
                case org.modelio.module.cpswarm.api.cpswarm_concept.standard.class_.FitnessFunction.STEREOTYPE_NAME: return org.modelio.module.cpswarm.api.cpswarm_concept.standard.class_.FitnessFunction.instantiate(obj);
                case org.modelio.module.cpswarm.api.cpswarm_concept.standard.class_.Problem.STEREOTYPE_NAME: return org.modelio.module.cpswarm.api.cpswarm_concept.standard.class_.Problem.instantiate(obj);
                case org.modelio.module.cpswarm.api.cpswarm_concept.standard.class_.Sensor.STEREOTYPE_NAME: return org.modelio.module.cpswarm.api.cpswarm_concept.standard.class_.Sensor.instantiate(obj);
                case org.modelio.module.cpswarm.api.cpswarm_concept.standard.class_.Swarm.STEREOTYPE_NAME: return org.modelio.module.cpswarm.api.cpswarm_concept.standard.class_.Swarm.instantiate(obj);
                case org.modelio.module.cpswarm.api.cpswarm_concept.standard.class_.SwarmMember.STEREOTYPE_NAME: return org.modelio.module.cpswarm.api.cpswarm_concept.standard.class_.SwarmMember.instantiate(obj);
                case org.modelio.module.cpswarm.api.cpswarm_concept.standard.class_.Virtual.STEREOTYPE_NAME: return org.modelio.module.cpswarm.api.cpswarm_concept.standard.class_.Virtual.instantiate(obj);
                default:
                    break;
            }
            return IDefaultModelVisitor.super.visitClass(obj);
        }

        @Override
        public final Object visitUmlModelElement(UmlModelElement obj) {
            switch (this.stName) {
                case org.modelio.module.cpswarm.api.cpswarm_concept.standard.umlmodelelement.OptimisedArgument.STEREOTYPE_NAME: return org.modelio.module.cpswarm.api.cpswarm_concept.standard.umlmodelelement.OptimisedArgument.instantiate(obj);
                default:
                    break;
            }
            return IDefaultModelVisitor.super.visitUmlModelElement(obj);
        }

        @Override
        public final Object visitAttribute(Attribute obj) {
            switch (this.stName) {
                case org.modelio.module.cpswarm.api.cpswarm_concept.standard.attribute.GOAL.STEREOTYPE_NAME: return org.modelio.module.cpswarm.api.cpswarm_concept.standard.attribute.GOAL.instantiate(obj);
                case org.modelio.module.cpswarm.api.cpswarm_concept.standard.attribute.RESULT.STEREOTYPE_NAME: return org.modelio.module.cpswarm.api.cpswarm_concept.standard.attribute.RESULT.instantiate(obj);
                default:
                    break;
            }
            return IDefaultModelVisitor.super.visitAttribute(obj);
        }

        @Override
        public final Object visitInterface(Interface obj) {
            switch (this.stName) {
                case org.modelio.module.cpswarm.api.cpswarm_concept.standard.interface_.ROSAction.STEREOTYPE_NAME: return org.modelio.module.cpswarm.api.cpswarm_concept.standard.interface_.ROSAction.instantiate(obj);
                case org.modelio.module.cpswarm.api.cpswarm_concept.standard.interface_.ROSService.STEREOTYPE_NAME: return org.modelio.module.cpswarm.api.cpswarm_concept.standard.interface_.ROSService.instantiate(obj);
                default:
                    break;
            }
            return IDefaultModelVisitor.super.visitInterface(obj);
        }

        @Override
        public final Object visitClassDiagram(ClassDiagram obj) {
            switch (this.stName) {
                case org.modelio.module.cpswarm.api.cpswarm_diagram.standard.classdiagram.SwarmCompositionDiagram.STEREOTYPE_NAME: return org.modelio.module.cpswarm.api.cpswarm_diagram.standard.classdiagram.SwarmCompositionDiagram.instantiate(obj);
                case org.modelio.module.cpswarm.api.cpswarm_diagram.standard.classdiagram.SwarmBlockDiagram.STEREOTYPE_NAME: return org.modelio.module.cpswarm.api.cpswarm_diagram.standard.classdiagram.SwarmBlockDiagram.instantiate(obj);
                case org.modelio.module.cpswarm.api.cpswarm_diagram.standard.classdiagram.InternalSwarmMemberDiagram.STEREOTYPE_NAME: return org.modelio.module.cpswarm.api.cpswarm_diagram.standard.classdiagram.InternalSwarmMemberDiagram.instantiate(obj);
                case org.modelio.module.cpswarm.api.cpswarm_diagram.standard.classdiagram.FitnessDefinitionDiagram.STEREOTYPE_NAME: return org.modelio.module.cpswarm.api.cpswarm_diagram.standard.classdiagram.FitnessDefinitionDiagram.instantiate(obj);
                default:
                    break;
            }
            return IDefaultModelVisitor.super.visitClassDiagram(obj);
        }

        @Override
        public final Object visitStateMachineDiagram(StateMachineDiagram obj) {
            switch (this.stName) {
                case org.modelio.module.cpswarm.api.cpswarm_diagram.standard.statemachinediagram.BehaviorDiagram.STEREOTYPE_NAME: return org.modelio.module.cpswarm.api.cpswarm_diagram.standard.statemachinediagram.BehaviorDiagram.instantiate(obj);
                default:
                    break;
            }
            return IDefaultModelVisitor.super.visitStateMachineDiagram(obj);
        }

        @Override
        public final Object visitPackage(Package obj) {
            switch (this.stName) {
                case org.modelio.module.cpswarm.api.cpswarm_concept.standard.package_.EnvironmentDefinition.STEREOTYPE_NAME: return org.modelio.module.cpswarm.api.cpswarm_concept.standard.package_.EnvironmentDefinition.instantiate(obj);
                case org.modelio.module.cpswarm.api.cpswarm_concept.standard.package_.FitnessDefinition.STEREOTYPE_NAME: return org.modelio.module.cpswarm.api.cpswarm_concept.standard.package_.FitnessDefinition.instantiate(obj);
                case org.modelio.module.cpswarm.api.cpswarm_concept.standard.package_.Topic.STEREOTYPE_NAME: return org.modelio.module.cpswarm.api.cpswarm_concept.standard.package_.Topic.instantiate(obj);
                case org.modelio.module.cpswarm.api.cpswarm_concept.standard.package_.ROSPackage.STEREOTYPE_NAME: return org.modelio.module.cpswarm.api.cpswarm_concept.standard.package_.ROSPackage.instantiate(obj);
                case org.modelio.module.cpswarm.api.cpswarm_sdf.standard.package_.World.STEREOTYPE_NAME: return org.modelio.module.cpswarm.api.cpswarm_sdf.standard.package_.World.instantiate(obj);
                case org.modelio.module.cpswarm.api.cpswarm_sdf.standard.package_.SDFRoot.STEREOTYPE_NAME: return org.modelio.module.cpswarm.api.cpswarm_sdf.standard.package_.SDFRoot.instantiate(obj);
                case org.modelio.module.cpswarm.api.cpswarm_sdf.standard.package_.Model.STEREOTYPE_NAME: return org.modelio.module.cpswarm.api.cpswarm_sdf.standard.package_.Model.instantiate(obj);
                default:
                    break;
            }
            return IDefaultModelVisitor.super.visitPackage(obj);
        }

        @Override
        public final Object visitDataType(DataType obj) {
            switch (this.stName) {
                case org.modelio.module.cpswarm.api.cpswarm_concept.standard.datatype.Msg.STEREOTYPE_NAME: return org.modelio.module.cpswarm.api.cpswarm_concept.standard.datatype.Msg.instantiate(obj);
                default:
                    break;
            }
            return IDefaultModelVisitor.super.visitDataType(obj);
        }

        @Override
        public final Object visitAssociationEnd(AssociationEnd obj) {
            switch (this.stName) {
                case org.modelio.module.cpswarm.api.cpswarm_concept.standard.associationend.OptimisedEnd.STEREOTYPE_NAME: return org.modelio.module.cpswarm.api.cpswarm_concept.standard.associationend.OptimisedEnd.instantiate(obj);
                default:
                    break;
            }
            return IDefaultModelVisitor.super.visitAssociationEnd(obj);
        }

        @Override
        public final Object visitPort(Port obj) {
            switch (this.stName) {
                case org.modelio.module.cpswarm.api.cpswarm_concept.standard.port.OptimisedPort.STEREOTYPE_NAME: return org.modelio.module.cpswarm.api.cpswarm_concept.standard.port.OptimisedPort.instantiate(obj);
                default:
                    break;
            }
            return IDefaultModelVisitor.super.visitPort(obj);
        }

        @Override
        public final Object visitParameter(Parameter obj) {
            switch (this.stName) {
                case org.modelio.module.cpswarm.api.cpswarm_concept.standard.parameter.OptimisedParameter.STEREOTYPE_NAME: return org.modelio.module.cpswarm.api.cpswarm_concept.standard.parameter.OptimisedParameter.instantiate(obj);
                default:
                    break;
            }
            return IDefaultModelVisitor.super.visitParameter(obj);
        }

        @Override
        public final Object visitStateMachine(StateMachine obj) {
            switch (this.stName) {
                default:
                    break;
            }
            return IDefaultModelVisitor.super.visitStateMachine(obj);
        }

        /**
         * Get the visitor to delegate to when a {@link IInfrastructureVisitor} is needed.
         * <p>If null is returned the caller will return null.
         * 
         * @return the {@link IInfrastructureVisitor} visitor or <i>null</i>.
         */
        @Override
        public IInfrastructureVisitor getInfrastructureVisitor() {
            return this;
        }

    }

}
