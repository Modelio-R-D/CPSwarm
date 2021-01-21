package fr.softeam.cameldesigner.handlers.commands.createsubmodel;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.DataModelDiagram;
import fr.softeam.cameldesigner.api.datamodel.standard.package_.DataTypeModel;
import fr.softeam.cameldesigner.handlers.commands.CreateCamelSubModelCommand;

@objid ("9928c665-42ea-42b5-8fee-62d432ab74a7")
public class CreateDataModelCommand extends CreateCamelSubModelCommand {
    @objid ("45d056b4-fbfb-42b1-9b54-c32ec46b3abb")
    public CreateDataModelCommand() {
        super("Data Model", DataTypeModel.STEREOTYPE_NAME, "Data Model Diagram", DataModelDiagram.STEREOTYPE_NAME);
    }

}
