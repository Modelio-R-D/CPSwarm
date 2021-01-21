package fr.softeam.cameldesigner.handlers.commands.exportcommands;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.elementmodel.exporter.AbstractExporterService;
import fr.softeam.cameldesigner.utils.FileSystemManager;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("15e725f8-2a34-4cc7-9d2e-abb413413a7b")
public abstract class ExportModelCommand extends DefaultModuleCommandHandler {
    @objid ("0d30658e-c64e-4f2e-8f96-47a3ce4473a8")
    private String directoryOutputPath;

    @objid ("40581558-e361-49c4-ac66-20128a67e342")
    private AbstractExporterService exporterService;

    @objid ("06d7784c-527b-4131-954d-52664597306d")
    public ExportModelCommand(AbstractExporterService exporterService) {
        super();
        this.exporterService = exporterService;
    }

    @objid ("2d604775-a093-4af8-ac14-6dc0aca6a746")
    @Override
    public void actionPerformed(final List<MObject> selectedElements, final IModule module) {
        this.directoryOutputPath = FileSystemManager.getDialogDirectoryPath("Select Directory");
        if(this.directoryOutputPath != null) {
            Package camelUMLModel = (Package) selectedElements.get(0);
            
            this.exporterService.exportCamelUMLModelToFile(camelUMLModel, this.directoryOutputPath);
            
        }
    }

    @objid ("f2bdf5da-769a-45c0-8e5b-77a340dab740")
    @Override
    public boolean accept(final List<MObject> selectedElements, final IModule module) {
        if ((selectedElements != null) && (selectedElements.size() == 1)){
            MObject selectedElement = selectedElements.get(0);
            return (
                    ((selectedElement instanceof org.modelio.metamodel.uml.statik.Package
                            && ((org.modelio.metamodel.uml.statik.Package)selectedElement).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, fr.softeam.cameldesigner.api.camelcore.standard.package_.CamelModel.STEREOTYPE_NAME)
                            )));
        }
        return false;
    }

}
