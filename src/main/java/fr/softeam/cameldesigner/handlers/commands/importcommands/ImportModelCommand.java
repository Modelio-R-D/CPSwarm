package fr.softeam.cameldesigner.handlers.commands.importcommands;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.elementmodel.importer.ImporterService;
import fr.softeam.cameldesigner.utils.FileSystemManager;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.metamodel.uml.infrastructure.Profile;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("2b0b295b-35c9-4f45-94b3-fca2a65734f7")
public abstract class ImportModelCommand extends DefaultModuleCommandHandler {
    @objid ("bfaba17f-e338-4e82-8bee-e3008d2b1d4a")
    private List<String> selectedfilesPaths;

    @objid ("aa170fd6-f44b-4707-9d57-3193c651d72f")
    private String filesExtension;

    @objid ("ab763650-e058-4d62-bacf-3b8dae599a40")
    private ImporterService importerService;

    @objid ("5963511c-41d4-4101-98b8-bf2747c24b3e")
    public ImportModelCommand(ImporterService importerService, String filesExtension) {
        super();
        
        this.importerService= importerService;
        
        this.filesExtension = filesExtension;
    }

    @objid ("e4508d80-f05c-4c93-b909-72b7d1c9886d")
    @Override
    public void actionPerformed(final List<MObject> selectedElements, final IModule module) {
        //this.directoryOutputPath = FileSystemManager.getFileDialogPath("Select Directory");
        
        //Class camelUMLModel = (Class) selectedElements.get(0);    
        
        //this.importerService.exportCamelUMLModel(camelUMLModel, this.directoryOutputPath);
        
        
        Package packageOwner = (Package) selectedElements.get(0);    
        
        this.selectedfilesPaths = FileSystemManager.getFileDialogPath("Select Files", this.filesExtension);
        
        try( ITransaction transaction = module.getModuleContext().getModelingSession().createTransaction("Import Camel Model")){
        
            for(String selectedfilePath : this.selectedfilesPaths) {
                this.importerService.importModelFromFile(packageOwner, selectedfilePath);
            }
            transaction.commit ();
        }
    }

    @objid ("abf490d6-e256-406b-aec4-53dc710112dc")
    @Override
    public boolean accept(final List<MObject> selectedElements, final IModule module) {
        if ((selectedElements != null) && (selectedElements.size() == 1)){
            MObject selectedElt = selectedElements.get(0);
            return (
                    (((selectedElt instanceof Package) 
                            && !(selectedElt instanceof Profile)
                            && selectedElt.getStatus().isModifiable())));
        }
        return false;
    }

}
