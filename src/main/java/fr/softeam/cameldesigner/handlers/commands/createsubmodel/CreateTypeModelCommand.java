package fr.softeam.cameldesigner.handlers.commands.createsubmodel;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.TypeModelDiagram;
import fr.softeam.cameldesigner.api.typemodel.standard.package_.TypeModel;
import fr.softeam.cameldesigner.handlers.commands.CreateCamelSubModelCommand;

@objid ("4fc64d2e-3eb6-4f5e-88f5-edf1544acb1d")
public class CreateTypeModelCommand extends CreateCamelSubModelCommand {
    @objid ("034fbeeb-be94-4472-b968-de2e2fbb7330")
    public CreateTypeModelCommand() {
        super("Type Model", TypeModel.STEREOTYPE_NAME, "Type Model Diagram", TypeModelDiagram.STEREOTYPE_NAME);
    }

}
