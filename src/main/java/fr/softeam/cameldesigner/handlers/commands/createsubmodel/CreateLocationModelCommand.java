package fr.softeam.cameldesigner.handlers.commands.createsubmodel;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.LocationModelDiagram;
import fr.softeam.cameldesigner.api.locationmodel.standard.package_.LocationModel;
import fr.softeam.cameldesigner.handlers.commands.CreateCamelSubModelCommand;

@objid ("cc04eabe-5c7c-4221-aaf7-5bc0a76d9174")
public class CreateLocationModelCommand extends CreateCamelSubModelCommand {
    @objid ("86e6aedf-d82d-484b-86ce-480a7ef5204a")
    public CreateLocationModelCommand() {
        super("Location Model", LocationModel.STEREOTYPE_NAME, "Location Model Diagram", LocationModelDiagram.STEREOTYPE_NAME);
    }

}
