package org.modelio.module.cpswarm.api;

import org.modelio.api.module.IPeerModule;
import org.modelio.metamodel.uml.behavior.stateMachineModel.StateMachine;

/**
 * @see com.modeliosoft.modelio.api.module.IPeerModule
 */
public interface ICPSwarmPeerModule extends IPeerModule {
    public static final String MODULE_NAME = "CPSwarm";

// Old Generation
//    @objid ("ec82135a-4224-40b4-b136-d55d2048ea1e")
//    void generateFrevoProject(org.modelio.metamodel.uml.statik.Class selectedElt);
    void generateSCXML(StateMachine stateMachine);

    void generateSwarmComposition(org.modelio.metamodel.uml.statik.Class swarm);

    void generateFitnessFunction(org.modelio.metamodel.uml.statik.Class fitnessFunction);

    void generateCommunicationConfiguration(org.modelio.metamodel.uml.statik.Class swarmMember);

    void generateOptimisedParam();

}
