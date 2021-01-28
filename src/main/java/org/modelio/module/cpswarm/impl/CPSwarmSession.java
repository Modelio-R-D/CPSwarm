package org.modelio.module.cpswarm.impl;

import java.io.File;
import java.nio.file.Path;
import java.util.Map;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.modelio.api.modelio.mc.IModelComponentDescriptor;
import org.modelio.api.modelio.mc.IModelComponentService;
import org.modelio.api.module.IModule;
import org.modelio.api.module.lifecycle.DefaultModuleLifeCycleHandler;
import org.modelio.api.module.lifecycle.IModuleLifeCycleHandler;
import org.modelio.api.module.lifecycle.ModuleException;
import org.modelio.vbasic.version.Version;

/**
 * @author ebrosse
 */
public class CPSwarmSession extends DefaultModuleLifeCycleHandler implements IModuleLifeCycleHandler {
    /**
     * Constructor with the CPSwarm Mdac
     *
     * @param module : the CPSwarm Mdac module
     */
    public CPSwarmSession(IModule module) {
        super(module);
    }

    @Override
    public boolean start() throws ModuleException {
        installRamc();
        installStyles();
        return super.start();
    }

    @Override
    public void stop() throws ModuleException {
        super.stop();
    }

    private void installStyles() {
        Path mdaPath = this.module.getModuleContext().getConfiguration().getModuleResourcesPath();
        CPSwarmModule.getInstance().getModuleContext().getModelioServices().getDiagramService().registerStyle("CPSwarm", "default",
                new File(mdaPath + File.separator  + "res" + File.separator + "style" + File.separator + "CPSwarm.style"));
        CPSwarmModule.getInstance().getModuleContext().getModelioServices().getDiagramService().registerStyle("CPSwarminternal", "default",
                new File(mdaPath + File.separator  + "res" + File.separator + "style" + File.separator + "CPSwarminternal.style"));
    }

    @Override
    public boolean select() throws ModuleException {
        return super.select();
    }

    @Override
    public void upgrade(Version oldVersion, Map<String, String> oldParameters) throws ModuleException {
        super.upgrade (oldVersion, oldParameters);
    }

    @Override
    public void unselect() {}

    private void installRamc() {
        Path mdaplugsPath = this.module.getModuleContext().getConfiguration().getModuleResourcesPath();

        final IModelComponentService modelComponentService =  CPSwarmModule.getInstance().getModuleContext().getModelioServices().getModelComponentService();
        for (IModelComponentDescriptor mc : modelComponentService.getModelComponents()) {
            if (mc.getName().toLowerCase().equals("cpswarmlibrary")) {
                if (new Version(mc.getVersion()).isOlderThan(new Version("3.10.00"))) {
                    modelComponentService.deployModelComponent(new File(mdaplugsPath.resolve("res" + File.separator + "ramc" + File.separator + "CPSwarmLibrary.ramc").toString()), new NullProgressMonitor());
                } else {
                    // Ramc already deployed...
                    return;
                }
            }
        }

        // No ramc found, deploy it
        modelComponentService.deployModelComponent(new File(mdaplugsPath.resolve("res" + File.separator + "ramc" + File.separator + "CPSwarmLibrary.ramc").toString()), new NullProgressMonitor());
    }

}
