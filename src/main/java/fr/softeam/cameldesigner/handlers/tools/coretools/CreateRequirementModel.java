package fr.softeam.cameldesigner.handlers.tools.coretools;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.RequirementModelDiagram;
import fr.softeam.cameldesigner.api.requirementmodel.standard.package_.RequirementModel;

@objid ("9ebc4125-3a2e-4fff-905c-9a2e29f51559")
public class CreateRequirementModel extends CreateSubModelTool {
    @objid ("5c924740-c87a-4980-9d9c-e99ef8653a96")
    public CreateRequirementModel() {
        super("RequirementModel", RequirementModel.STEREOTYPE_NAME, "RequirementModelDiagram", RequirementModelDiagram.STEREOTYPE_NAME);
    }

}
