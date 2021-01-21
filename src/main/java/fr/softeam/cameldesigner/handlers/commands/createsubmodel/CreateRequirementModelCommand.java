package fr.softeam.cameldesigner.handlers.commands.createsubmodel;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.RequirementModelDiagram;
import fr.softeam.cameldesigner.api.requirementmodel.standard.package_.RequirementModel;
import fr.softeam.cameldesigner.handlers.commands.CreateCamelSubModelCommand;

/**
 * @author kchaabouni
 */
@objid ("3b24e2f4-4063-45f5-8f0b-c7dd74eaf3ba")
public class CreateRequirementModelCommand extends CreateCamelSubModelCommand {
    @objid ("4af7a86b-595a-4ded-b6c6-2a4dbb746b7b")
    public CreateRequirementModelCommand() {
        super("Requirement Model", RequirementModel.STEREOTYPE_NAME, "Requirement Model Diagram", RequirementModelDiagram.STEREOTYPE_NAME);
    }

}
