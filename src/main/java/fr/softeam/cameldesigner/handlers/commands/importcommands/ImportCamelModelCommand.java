package fr.softeam.cameldesigner.handlers.commands.importcommands;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.elementmodel.importer.ImporterService;
import org.eclipse.xtext.resource.XtextResource;

@objid ("a6f85cb6-6019-4939-84f8-499ea7d4d2ba")
public class ImportCamelModelCommand extends ImportModelCommand {
    @objid ("007426c6-2acc-4542-a18e-db691175ab3c")
    public ImportCamelModelCommand() {
        super(new ImporterService(XtextResource.OPTION_RESOLVE_ALL), "*.camel");
    }

}
