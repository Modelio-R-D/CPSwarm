package fr.softeam.cameldesigner.handlers.commands;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.elementmodel.umlmodel.UmlModelService;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * @author kchaabouni
 */
@objid ("585c2431-ec7c-4d52-8d30-f08ffed1c056")
public abstract class CreateCamelSubModelCommand extends DefaultModuleCommandHandler {
    @objid ("1a2688d3-3bc8-474d-b6e6-4192bce692f7")
    private String subModelName;

    @objid ("19a2d730-5262-4cbe-ac70-e6067a2a3d7c")
    private String subModelStereotype;

    @objid ("cc8a928a-0fb0-45e4-bdfb-ea0759481b9c")
    private String subModelDiagramName;

    @objid ("862d51d5-33b0-455d-905f-f11cc5a89400")
    private String subModelDiagramStereotype;

    @objid ("f8377e71-5569-4afb-aec1-130725c437a2")
    private UmlModelService elementModelService = new UmlModelService();

    @objid ("59a802ab-d48e-4414-a661-5492011b3c67")
    public CreateCamelSubModelCommand(String subModelName, String subModelStereotype, String subModelDiagramName, String subModelDiagramStereotype) {
        super();
        this.subModelName = subModelName;
        this.subModelStereotype = subModelStereotype;
        this.subModelDiagramName = subModelDiagramName;
        this.subModelDiagramStereotype = subModelDiagramStereotype;
    }

    @objid ("0f97e3e4-8353-4dac-b42c-6a4337f886b5")
    @Override
    public void actionPerformed(final List<MObject> selectedElements, final IModule module) {
        Package owner = (Package) selectedElements.get(0);
        try( ITransaction transaction = module.getModuleContext().getModelingSession().createTransaction("Create Camel SubModel")){
        
            this.elementModelService.createSubModel(owner, this.subModelName, this.subModelStereotype, this.subModelDiagramName, this.subModelDiagramStereotype);
            transaction.commit ();
        }
    }

    @objid ("5c9946a3-2dbf-4066-9bc9-6b71426241ed")
    @Override
    public boolean accept(final List<MObject> selectedElements, final IModule module) {
        if ((selectedElements != null) && (selectedElements.size() == 1)){
            MObject selectedElement = selectedElements.get(0);
            return (
                    ((selectedElement instanceof Package
                            && ((Package)selectedElement).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, fr.softeam.cameldesigner.api.camelcore.standard.package_.CamelModel.STEREOTYPE_NAME)
                            && selectedElement.getStatus().isModifiable())));
        }
        return false;
    }

}
