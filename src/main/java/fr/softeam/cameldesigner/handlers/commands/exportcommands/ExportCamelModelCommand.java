package fr.softeam.cameldesigner.handlers.commands.exportcommands;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.elementmodel.exporter.CamelExporterService;

@objid ("473a0b93-af1a-4840-b851-1f90873f7b56")
public class ExportCamelModelCommand extends ExportModelCommand {
    @objid ("9531d44d-5c05-44b9-b1e6-359d6d1d1179")
    public ExportCamelModelCommand() {
        super(new CamelExporterService());
    }

}
