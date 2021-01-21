package fr.softeam.cameldesigner.handlers.commands.createsubmodel;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.ConstraintModelDiagram;
import fr.softeam.cameldesigner.api.constraintmodel.standard.package_.ConstraintModel;
import fr.softeam.cameldesigner.handlers.commands.CreateCamelSubModelCommand;

/**
 * @author kchaabouni
 */
@objid ("820b49a4-d863-4526-940c-beeeb1b0b4a4")
public class CreateConstraintModelCommand extends CreateCamelSubModelCommand {
    @objid ("879a50a7-6d60-4964-8e85-d22cc4d9ffb3")
    public CreateConstraintModelCommand() {
        super("ConstraintModel", ConstraintModel.STEREOTYPE_NAME, "Constraint Model Diagram", ConstraintModelDiagram.STEREOTYPE_NAME);
    }

}
