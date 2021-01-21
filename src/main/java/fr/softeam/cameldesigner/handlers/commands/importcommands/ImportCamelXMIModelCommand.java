package fr.softeam.cameldesigner.handlers.commands.importcommands;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.elementmodel.importer.ImporterService;
import org.eclipse.emf.ecore.xmi.XMLResource;

/**
 * @author kchaabouni
 */
@objid ("61f8e992-7e7f-4379-a67b-5e5ec9bef393")
public class ImportCamelXMIModelCommand extends ImportModelCommand {
    @objid ("77b4277b-f0a6-4e99-b6eb-677ced4edc01")
    public ImportCamelXMIModelCommand() {
        super(new ImporterService(XMLResource.OPTION_SCHEMA_LOCATION), "*.camel");
    }

}
