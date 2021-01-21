package fr.softeam.cameldesigner.handlers.commands.createsubmodel;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.ExecutionModelDiagram;
import fr.softeam.cameldesigner.api.executionmodel.standard.package_.ExecutionModel;
import fr.softeam.cameldesigner.handlers.commands.CreateCamelSubModelCommand;

@objid ("bc7455de-dad3-41e0-a2e3-57f6b5f86a17")
public class CreateExecutionModelCommand extends CreateCamelSubModelCommand {
    @objid ("4588e083-3e91-4c93-97f8-483fe3adf121")
    public CreateExecutionModelCommand() {
        super("Execution Model", ExecutionModel.STEREOTYPE_NAME, "Execution Model Diagram", ExecutionModelDiagram.STEREOTYPE_NAME);
    }

}
