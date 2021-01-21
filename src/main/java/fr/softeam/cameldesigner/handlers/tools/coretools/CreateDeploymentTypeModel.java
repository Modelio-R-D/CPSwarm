package fr.softeam.cameldesigner.handlers.tools.coretools;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.DeploymentModelDiagram;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.package_.DeploymentTypeModel;

/**
 * @author kchaabouni
 */
@objid ("d55fbc99-67a6-48d4-8f38-e928d620d567")
public class CreateDeploymentTypeModel extends CreateSubModelTool {
    @objid ("71274297-eac3-4e25-af55-76e75fba0e13")
    public CreateDeploymentTypeModel() {
        super("DeploymentModel", DeploymentTypeModel.STEREOTYPE_NAME, "DeploymentTypeModelDiagram", DeploymentModelDiagram.STEREOTYPE_NAME);
    }

}
