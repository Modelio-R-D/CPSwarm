package org.modelio.module.cpswarm.impl;

import java.io.File;
import org.modelio.api.module.context.configuration.IModuleAPIConfiguration;
import org.modelio.metamodel.uml.behavior.stateMachineModel.StateMachine;
import org.modelio.module.cpswarm.api.ICPSwarmPeerModule;
import org.modelio.module.cpswarm.generator.SCXMLGeneration;
import org.modelio.module.cpswarm.generator.SwarmCompositionGeneration;
import org.modelio.module.cpswarm.utils.ResourcesManager;
import org.modelio.vbasic.version.Version;

/**
 * Implementation of Module services
 * <br>When a module is built using the MDA Modeler tool, a public interface is generated and accessible for the other module developments.
 * <br>The main class that allows developpers to get specific module services has to implement the current interface.
 * <br>Each mda component brings a specific interface that inherit from this one and gives all the desired module services.
 */
public class CPSwarmPeerModule implements ICPSwarmPeerModule {
    private IModuleAPIConfiguration peerConfiguration;

    private CPSwarmModule module;

    public CPSwarmPeerModule(CPSwarmModule statModuleModule, IModuleAPIConfiguration peerConfiguration) {
        super();
        this.module = statModuleModule;
        this.peerConfiguration = peerConfiguration;
    }

    public void init() {
    }

    /**
     * @see org.modelio.api.module.IPeerModule#getConfiguration()
     */
    @Override
    public IModuleAPIConfiguration getConfiguration() {
        return this.peerConfiguration;
    }

    /**
     * @see org.modelio.api.module.IPeerModule#getDescription()
     */
    @Override
    public String getDescription() {
        return this.module.getDescription();
    }

    /**
     * @see org.modelio.api.module.IPeerModule#getName()
     */
    @Override
    public String getName() {
        return this.module.getName();
    }

    /**
     * @see org.modelio.api.module.IPeerModule#getVersion()
     */
    @Override
    public Version getVersion() {
        return this.module.getVersion();
    }

// Old Generation
//    @objid ("ec82135a-4224-40b4-b136-d55d2048ea1e")
//    void generateFrevoProject(org.modelio.metamodel.uml.statik.Class selectedElt);
    @Override
    public void generateSCXML(StateMachine stateMachine) {
        String pathDest = ResourcesManager.getInstance().getGeneratedPath() + File.separator + stateMachine.getName() + ".xml";
               
        SCXMLGeneration scxmlGen = new SCXMLGeneration(stateMachine, new File(pathDest));
        scxmlGen.generate();
    }

    @Override
    public void generateSwarmComposition(org.modelio.metamodel.uml.statik.Class swarm) {
        String pathDest = ResourcesManager.getInstance().getGeneratedPath() + File.separator + swarm.getName() + ".xml";
        SwarmCompositionGeneration scxmlGen = new SwarmCompositionGeneration(swarm, new File(pathDest));
        scxmlGen.generate();
    }

    @Override
    public void generateFitnessFunction(org.modelio.metamodel.uml.statik.Class fitnessFunction) {
        // TODO Auto-generated method stub
    }

    @Override
    public void generateCommunicationConfiguration(org.modelio.metamodel.uml.statik.Class swarmMember) {
        // TODO Auto-generated method stub
    }

    @Override
    public void generateOptimisedParam() {
    }


//    @objid ("781e6890-9282-462f-b3ea-830c0a2dbbbf")
//    @Override
//    public void generateFrevoProject(org.modelio.metamodel.uml.statik.Class selectedElt) {
//        IModuleUserConfiguration configuration = this.module.getModuleContext().getConfiguration();
//
//        String rosWs = configuration.getParameterValue(CPSwarmParameters.WORKSPACEPATH);
//
//        String rosPath = configuration.getParameterValue(CPSwarmParameters.ROSPATH);
//
//        String frevoPath = configuration.getParameterValue(CPSwarmParameters.FREVOPATH);
//
//        ProjectGeneration generation = new ProjectGeneration(selectedElt);
//        generation.generate(rosWs, rosPath, frevoPath);
//    }
}
