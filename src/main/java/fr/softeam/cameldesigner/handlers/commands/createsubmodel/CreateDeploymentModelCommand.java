package fr.softeam.cameldesigner.handlers.commands.createsubmodel;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.DeploymentModelDiagram;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.package_.DeploymentTypeModel;
import fr.softeam.cameldesigner.handlers.commands.CreateCamelSubModelCommand;

/**
 * @author kchaabouni
 */
@objid ("4c006b3c-4453-4c26-bb2f-aa0f7b7b1eaf")
public class CreateDeploymentModelCommand extends CreateCamelSubModelCommand {
    @objid ("a7a8db6a-cc6a-4fff-ad01-4208673109f6")
    public CreateDeploymentModelCommand() {
        super("Deployment Model", DeploymentTypeModel.STEREOTYPE_NAME, "Deployment Type Model Diagram", DeploymentModelDiagram.STEREOTYPE_NAME);
    }

}
