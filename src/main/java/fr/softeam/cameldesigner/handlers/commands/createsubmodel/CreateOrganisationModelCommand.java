package fr.softeam.cameldesigner.handlers.commands.createsubmodel;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.OrganisationModelDiagram;
import fr.softeam.cameldesigner.api.organisationmodel.standard.package_.OrganisationModel;
import fr.softeam.cameldesigner.handlers.commands.CreateCamelSubModelCommand;

/**
 * @author kchaabouni
 */
@objid ("35fa4b1c-da0a-428f-8c5c-1658a70fb885")
public class CreateOrganisationModelCommand extends CreateCamelSubModelCommand {
    @objid ("983c9b50-8af6-4940-b0a9-3c3af9b224d0")
    public CreateOrganisationModelCommand() {
        super("Organisation Model", OrganisationModel.STEREOTYPE_NAME, "Organisation Model Diagram", OrganisationModelDiagram.STEREOTYPE_NAME);
    }

}
