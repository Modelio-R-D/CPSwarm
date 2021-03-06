package org.modelio.module.cpswarm.ui.window;

import java.io.File;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Shell;
import org.modelio.module.cpswarm.generator.CommunicationConfigurationGeneration;
import org.modelio.module.cpswarm.impl.CPSwarmModule;
import org.modelio.module.cpswarm.ui.composite.FileChooserComposite;
import org.modelio.module.cpswarm.ui.composite.ValidationBoutonComposite;
import org.modelio.module.cpswarm.utils.ResourcesManager;

/**
 * This class provides the Communication export dialog
 * @author ebrosse
 */
public class CommunicationExport extends AbstractSwtWizardWindow {
    @Override
    public Object open() {
        createContents();
        return super.open();
    }

    private void createContents() {
        setLabels();
        
        this.shell = new Shell(getParent(), 67696 | SWT.APPLICATION_MODAL | SWT.RESIZE | SWT.TITLE);
        this.shell.setLayout( new FormLayout());
        this.shell.setText(this.frametitle);
        
        // File chooser composite
        this.fileChooserComposite = new FileChooserComposite(this.shell, SWT.NONE, SWT.OPEN);
        
        
        // Validation Composite
        this.validateComposite = new ValidationBoutonComposite(this.shell, SWT.NONE, this.cancelButton, this.validateButton);
        
        this.validateComposite.getValidationButton().addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
        
                if (getFileChooserComposite().getCurrentFile() != null) {
                    validationAction();
                } else {
                    selectAFile();
                }
            }
        });
        
        this.validateComposite.getCancelButton().addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                setCancellation(true);
                cancelAction();
            }
        });
        
        final FormData fd_fileChooserComposite = new FormData();
        fd_fileChooserComposite.right = new FormAttachment(100, 0);
        fd_fileChooserComposite.bottom = new FormAttachment(0, 50);
        fd_fileChooserComposite.top = new FormAttachment(0, 0);
        fd_fileChooserComposite.left = new FormAttachment(0, 0);
        this.fileChooserComposite.setLayoutData(fd_fileChooserComposite);
        
        final FormData fd_validateComposite = new FormData();
        fd_validateComposite.top = new FormAttachment(this.fileChooserComposite, 5);
        fd_validateComposite.bottom = new FormAttachment(100, -5);
        fd_validateComposite.left = new FormAttachment(this.fileChooserComposite, 0, SWT.LEFT);
        fd_validateComposite.right = new FormAttachment(this.fileChooserComposite, 0, SWT.RIGHT);
        this.validateComposite.setLayoutData(fd_validateComposite);
        
        this.fileChooserComposite.getSearch().addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                CommunicationExport.this.fileChooserComposite.searchFile();
            }
        });
        
        setDefaultDialog();
        this.shell.pack();
        this.shell.setMinimumSize(new Point(this.shell.getBounds().width, this.shell.getBounds().height));
        
        this.validateComposite.getValidationButton().setFocus();
    }

    public CommunicationExport(Shell parent) {
        super(parent);
    }

    @Override
    public void setLabels() {
        setTitle("Title");
        setDescription("Description");
        setFrametitle("Communication Configuration Generation");
        setCancelButton("Cancel");
        setValidateButton("Export");
    }

    @Override
    public void validationAction() {
        File theFile = getFileChooserComposite().getCurrentFile();
        
        CommunicationConfigurationGeneration commGen = new CommunicationConfigurationGeneration((org.modelio.metamodel.uml.statik.Class) this.selectedElt, theFile);
        commGen.generate();
        
        completeBox();
    }

    @Override
    public void setPath() {
        try {
            if (this.path.equals(""))
                this.path = CPSwarmModule.getInstance().getModuleContext().getProjectStructure().getPath().toAbsolutePath().toString();
        
            this.fileChooserComposite.getDialog().setFilterPath(this.path);
            this.fileChooserComposite.getDialog().setFileName("");
            this.fileChooserComposite.setText(ResourcesManager.getInstance().getGeneratedPath() + File.separator + this.selectedElt.getName() + ".cfg" );
        } catch (@SuppressWarnings ("unused") final NoClassDefFoundError e) {
            this.fileChooserComposite.setText("");
        }
    }

    @Override
    public void setDefaultDialog() {
        this.fileChooserComposite.getDialog().setFilterNames(new String[] { ".cfg" });
        this.fileChooserComposite.getDialog().setFilterExtensions(new String[] { "*.cfg" });
        setPath();
    }

}
