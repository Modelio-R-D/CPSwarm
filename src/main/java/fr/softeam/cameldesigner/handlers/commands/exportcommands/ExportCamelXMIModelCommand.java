package fr.softeam.cameldesigner.handlers.commands.exportcommands;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.elementmodel.exporter.XMIExporterService;

@objid ("78ea1827-e24b-4481-8b6b-e13b8cfb84a9")
public class ExportCamelXMIModelCommand extends ExportModelCommand {
    @objid ("489906bb-068e-40b3-9b16-dbcfb1f51fc2")
    public ExportCamelXMIModelCommand() {
        super(new XMIExporterService());
    }

}
