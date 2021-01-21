package fr.softeam.cameldesigner.handlers.commands.createsubmodel;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.ScalabilityModelDiagram;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.package_.ScalabilityModel;
import fr.softeam.cameldesigner.handlers.commands.CreateCamelSubModelCommand;

/**
 * @author kchaabouni
 */
@objid ("7cb3a36f-ce8e-40b5-aa75-2405b7f1b396")
public class CreateScalabilityModelCommand extends CreateCamelSubModelCommand {
    @objid ("5962d295-9e95-4e69-9f29-c439786b7d01")
    public CreateScalabilityModelCommand() {
        super("Scalability Model", ScalabilityModel.STEREOTYPE_NAME, "Scalability Model Diagram", ScalabilityModelDiagram.STEREOTYPE_NAME);
    }

}
