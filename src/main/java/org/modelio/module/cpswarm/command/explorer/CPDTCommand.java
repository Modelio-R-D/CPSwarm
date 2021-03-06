package org.modelio.module.cpswarm.command.explorer;

import java.nio.file.Paths;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.modelio.pattern.IPatternService.PatternException;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.infrastructure.Profile;
import org.modelio.module.cpswarm.impl.CPSwarmModule;
import org.modelio.module.cpswarm.impl.CPSwarmPeerModule;
import org.modelio.module.cpswarm.utils.CPSwarmResourcesManager;
import org.modelio.vcore.smkernel.mapi.MObject;

public class CPDTCommand extends DefaultModuleCommandHandler {
    protected String _title = "Complete";

    protected String _spiderinoPath = "";

    protected String _descriptionGeneration = "Generation Complete";

    protected ModelTree _selectedElt;

    protected IModule _module;

    protected List<org.modelio.metamodel.uml.statik.Class> _behaviours;

    protected Shell _shell;

    protected Text _nameText;

    protected Text _descriptionText;

    @Override
    public void actionPerformed(List<MObject> selectedElements, IModule module) {
        this._selectedElt = (ModelTree) selectedElements.get(0);
        this._module = module;
        
        createContents();
    }

    protected void completeBox() {
        Display.getDefault().asyncExec(new Runnable() {
            @Override
            public void run() {
                customMessageBox(SWT.ICON_INFORMATION);
                CPDTCommand.this._shell.dispose();
            }
        });
    }

    void customMessageBox(int icon) {
        MessageBox messageBox = new MessageBox(Display.getCurrent().getActiveShell(), icon);
        messageBox.setMessage(this._descriptionGeneration);
        messageBox.setText(this._title);
        messageBox.open();
    }

    /**
     * This methods authorizes a command to be displayed in a defined context.
     * The commands are displayed, by default, depending on the kind of metaclass on which the command has been launched.
     */
    @Override
    public boolean accept(List<MObject> selectedElements, IModule module) {
        if ((selectedElements != null) && (selectedElements.size() == 1 )){
            MObject selected = selectedElements.get(0);
            return (selected instanceof org.modelio.metamodel.uml.statik.Package) &&
                    (!(selected instanceof Profile));
        }
        return false;
    }

    /**
     * This method specifies whether or not a command must be deactivated.
     * If the command has to be displayed (which means that the accept method has returned a positive value, it is sometimes needed to desactivate the command depending on specific constraints that are specific to the module.
     */
    @Override
    public boolean isActiveFor(List<MObject> selectedElements, IModule module) {
        return true;
    }

    /**
     * @param root : element owner
     */
    public void createInitiaSpiderinolModel(ModelTree root, IModule module, String name, String description, String behaviourName) {
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("Spiderino", this._selectedElt);
        parameters.put("$(Name)", name);
        
        for (org.modelio.metamodel.uml.statik.Class behaviour : this._behaviours){
            if (behaviour.getName().equals(behaviourName))
                parameters.put("Behaviour", behaviour);
        }
        
        String templatePath = CPSwarmResourcesManager.getPattern("Spiderino_2.0.00.umlt");
        
        IModelingSession session = module.getModuleContext().getModelingSession();
        
        try(ITransaction transaction = session.createTransaction ("Spiderino")){
            module.getModuleContext().getModelioServices().getPatternService().applyPattern(Paths.get(templatePath), parameters);
        
            for(ModelTree owned : this._selectedElt.getOwnedElement()){
                if (owned.isStereotyped(CPSwarmPeerModule.MODULE_NAME, "Swarm_Member")){
                    owned.setName(name);
                    session.getModel().createNote("ModelerModule", "description", owned, description);
                }
            }
            transaction.commit();
        
        
        } catch (InvalidParameterException e) {
            CPSwarmModule.logService.error(e);
        } catch (PatternException e) {
            CPSwarmModule.logService.error(e);
        }
    }

    public void createDroneModel(ModelTree root, IModule module, String name, String description, String behaviourName) {
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("DroneG", this._selectedElt);
        parameters.put("$(Name)", name);
        
        for (org.modelio.metamodel.uml.statik.Class behaviour : this._behaviours){
            if (behaviour.getName().equals(behaviourName))
                parameters.put("Behaviour", behaviour);
        }
        
        String templatePath = CPSwarmResourcesManager.getPattern("DroneG_1.0.00.umlt");
        
        IModelingSession session = module.getModuleContext().getModelingSession();
        
        try(ITransaction transaction = session.createTransaction ("Drone")){
            module.getModuleContext().getModelioServices().getPatternService().applyPattern(Paths.get(templatePath), parameters);
        
            for(ModelTree owned : this._selectedElt.getOwnedElement()){
                if (owned.isStereotyped(CPSwarmPeerModule.MODULE_NAME, "Swarm_Member")){
                    owned.setName(name);
                    session.getModel().createNote("ModelerModule", "description", owned, description);
                }
            }
            transaction.commit();
        
        
        } catch (InvalidParameterException e) {
            CPSwarmModule.logService.error(e);
        } catch (PatternException e) {
            CPSwarmModule.logService.error(e);
        }
    }

    private void createContents() {
        //Shell Creation
        Display display = Display.getCurrent();
        this._shell = new Shell(display);
        this._shell.setText("CPS Template Creation");
        GridLayout gridLayout = new GridLayout();
        gridLayout.numColumns = 3;
        this._shell.setLayout(gridLayout);
        
        
        //Name Creation
        new Label(this._shell, SWT.NONE).setText("Name:");
        this._nameText = new Text(this._shell, SWT.SINGLE | SWT.BORDER);
        GridData gridDataName = new GridData(GridData.FILL, GridData.CENTER, true, false);
        gridDataName.horizontalSpan = 2;
        this._nameText.setLayoutData(gridDataName);
        
        //Description Creation
        new Label(this._shell, SWT.NONE).setText("Description:");
        this._descriptionText = new Text(this._shell, SWT.MULTI | SWT.BORDER | SWT.V_SCROLL );
        GridData gridDataDescription = new GridData(GridData.FILL, GridData.CENTER, true, false);
        gridDataDescription.horizontalSpan = 2;
        this._descriptionText.setLayoutData(gridDataDescription);
        
        
        //Behaviour Creation
        new Label(this._shell, SWT.NONE).setText("Behaviour :");
        Combo cpsBehaviour = new Combo(this._shell, SWT.NONE);
        
        Collection<org.modelio.metamodel.uml.statik.Class> classes = this._module.getModuleContext().getModelingSession().findByClass(org.modelio.metamodel.uml.statik.Class.class);
        this._behaviours = new ArrayList<>();
        for (org.modelio.metamodel.uml.statik.Class classe : classes){
            if (classe.isStereotyped(CPSwarmPeerModule.MODULE_NAME, "Controller"))
                this._behaviours.add(classe);
        }
        
        for (org.modelio.metamodel.uml.statik.Class behaviour: this._behaviours){
            cpsBehaviour.add(behaviour.getName());
        }
        
        GridData gridDataBehaviour = new GridData(GridData.FILL, GridData.CENTER, true, false);
        gridDataBehaviour.horizontalSpan = 2;
        cpsBehaviour.setLayoutData(gridDataBehaviour);
        
        //Hardware Creation
        new Label(this._shell, SWT.NONE).setText("Hardware:");
        Combo cpsHardware = new Combo(this._shell, SWT.NONE);
        cpsHardware.setItems(new String[] { "Spiderino", "Drone"});
        GridData gridDataHardware = new GridData(GridData.FILL, GridData.CENTER, true, false);
        gridDataHardware.horizontalSpan = 2;
        cpsHardware.setLayoutData(gridDataHardware);
        
        //Enter button
        Button enter = new Button(this._shell, SWT.PUSH);
        enter.setText("Create");
        GridData gridDataButton = new GridData(GridData.END, GridData.CENTER, false, false);
        gridDataButton.horizontalSpan = 3;
        enter.setLayoutData(gridDataButton);
        enter.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent event) {
                if (cpsHardware.getText().equals("SPiderino"))
                    createInitiaSpiderinolModel(CPDTCommand.this._selectedElt, CPDTCommand.this._module, CPDTCommand.this._nameText.getText(), CPDTCommand.this._descriptionText.getText(), cpsBehaviour.getText());
                else
                    createDroneModel(CPDTCommand.this._selectedElt, CPDTCommand.this._module, CPDTCommand.this._nameText.getText(), CPDTCommand.this._descriptionText.getText(), cpsBehaviour.getText());
        
                completeBox();
            }
        });
        
        this._shell.pack();
        this._shell.open();
        
        while (!this._shell.isDisposed()) {
            if (!display.readAndDispatch()) {
                display.sleep();
            }
        }
    }

}
