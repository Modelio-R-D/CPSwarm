package org.modelio.module.cpswarm.impl;

import org.modelio.api.module.AbstractJavaModule;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.api.module.context.configuration.IModuleUserConfiguration;
import org.modelio.api.module.lifecycle.IModuleLifeCycleHandler;
import org.modelio.api.module.mda.IMdaExpert;
import org.modelio.api.module.parameter.IParameterEditionModel;
import org.modelio.api.module.parameter.impl.ParameterGroupModel;
import org.modelio.api.module.parameter.impl.ParameterModel;
import org.modelio.api.module.parameter.impl.ParametersEditionModel;
import org.modelio.api.module.parameter.impl.StringParameterModel;
import org.modelio.gproject.ramc.core.model.IModelComponent;
import org.modelio.gproject.ramc.core.packaging.IModelComponentContributor;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.module.cpswarm.api.CPSwarmParameters;
import org.modelio.module.cpswarm.i18n.I18nMessageService;

/**
 * Implementation of the IModule interface.
 * <br>All Modelio java modules should inherit from this class.
 */
public class CPSwarmModule extends AbstractJavaModule {
    private static CPSwarmModule instance = null;

    public static CPSwarmLogService logService;

    private CPSwarmPeerModule peerModule = null;

    private CPSwarmSession session = null;

    public static CPSwarmModule getInstance() {
        return instance;
    }

    @Override
    public CPSwarmPeerModule getPeerModule() {
        return this.peerModule;
    }

    /**
     * Return the lifecycle handler attached to the current module.
     * <p>
     * <p>
     * This handler is used to manage the module lifecycle by declaring the
     * desired implementation on start, select... methods.
     */
    @Override
    public IModuleLifeCycleHandler getLifeCycleHandler() {
        return this.session;
    }

    /**
     * Method automatically called just after the creation of the module.
     * <p>
     * <p>
     * The module is automatically instanciated at the beginning of the MDA
     * lifecycle and constructor implementation is not accessible to the module
     * developer.
     * <p>
     * <p>
     * The <code>init</code> method allows the developer to execute the desired initialization code at this step. For
     * example, this is the perfect place to register any IViewpoint this module provides.
     * @see org.modelio.api.module.AbstractJavaModule#init()
     */
    @Override
    public void init() {
        // Add the module initialization code
        super.init();
    }

    /**
     * Method automatically called just before the disposal of the module.
     * <p>
     * <p>
     * 
     * 
     * The <code>uninit</code> method allows the developer to execute the desired un-initialization code at this step.
     * For example, if IViewpoints have been registered in the {@link #init()} method, this method is the perfect place
     * to remove them.
     * <p>
     * <p>
     * 
     * This method should never be called by the developer because it is already invoked by the tool.
     * @see org.modelio.api.module.AbstractJavaModule#uninit()
     */
    @Override
    public void uninit() {
        // Add the module un-initialization code
        super.uninit();
    }

    /**
     * Builds a new module.
     * <p>
     * <p>
     * This constructor must not be called by the user. It is automatically
     * invoked by Modelio when the module is installed, selected or started.
     * 
     * @param moduleContext context of the module, needed to access Modelio features.
     */
    public CPSwarmModule(IModuleContext moduleContext) {
        super(moduleContext);
        this.session = new CPSwarmSession(this);
        this.peerModule = new CPSwarmPeerModule(this, moduleContext.getPeerConfiguration());
        this.peerModule.init();
        CPSwarmModule.logService = new CPSwarmLogService(this.getModuleContext().getLogService(), this);
        instance = this;
    }

    /**
     * @see org.modelio.api.module.AbstractJavaModule#getParametersEditionModel()
     */
    @Override
    public IParameterEditionModel getParametersEditionModel() {
        if (this.parameterEditionModel == null) {
            IModuleUserConfiguration configuration = this.getModuleContext().getConfiguration();
            ParametersEditionModel parameters = new ParametersEditionModel(this);
            this.parameterEditionModel = parameters;
            ParameterModel parameter;
        
            ParameterGroupModel Group1 = new ParameterGroupModel("Group1", "ROS");
            parameters.addGroup(Group1);
            parameter = new StringParameterModel(configuration, CPSwarmParameters.WORKSPACEPATH, I18nMessageService.getString ("Ui.Parameter.ROSWorkspace.Label"), I18nMessageService.getString ("Ui.Parameter.ROSWorkspace.Description"),"");
            Group1.addParameter(parameter);
        
            parameter = new StringParameterModel(configuration, CPSwarmParameters.ROSPATH, I18nMessageService.getString ("Ui.Parameter.ROSPath.Label"), I18nMessageService.getString ("Ui.Parameter.ROSPath.Description"),"");
            Group1.addParameter(parameter);
            
            ParameterGroupModel Group2 = new ParameterGroupModel("Group2", "OptimizationTool");
            parameters.addGroup(Group2);
            parameter = new StringParameterModel(configuration, CPSwarmParameters.FREVOPATH, I18nMessageService.getString ("Ui.Parameter.FrevoPath.Label"), I18nMessageService.getString ("Ui.Parameter.FrevoPath.Description"),"");
            Group2.addParameter(parameter);
        
        }
        return this.parameterEditionModel;
    }

    @Override
    public String getModuleImagePath() {
        return "/res/icons/CPSwarm.png";
    }

    @Override
    public IModelComponentContributor getModelComponentContributor(IModelComponent mc) {
        return new CPSwarmModelComponentContributor(this);
    }

    @Override
    public IMdaExpert getMdaExpert(final Stereotype st) {
        // Generated code, please do not remove it
        IMdaExpert expert = getGeneratedMdaExpert(st);
        if (expert != null) {
            return expert;
        }// End generated code
        return null;
    }

    /**
     * Generated expert looking for a MDA expert in the generated MDA API.
     * 
     * @param st a stereotype owned by the current module.
     * @return a MDA expert belonging to the MDA API or <code>null</code>.
     */
    private IMdaExpert getGeneratedMdaExpert(final Stereotype st) {
        switch (st.getUuid()) {
            default: return null;
        }
    }

}
