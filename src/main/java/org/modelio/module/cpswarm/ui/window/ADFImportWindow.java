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
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.module.cpswarm.impl.CPSwarmModule;
import org.modelio.module.cpswarm.ui.composite.FileChooserComposite;
import org.modelio.module.cpswarm.ui.composite.ValidationBoutonComposite;

/**
 * This class provides the ADF import dialog
 * @author ebrosse
 */
public class ADFImportWindow extends AbstractSwtWizardWindow {
    private void createContents() {
        setLabels();
        
        this.shell = new Shell(getParent(), 67696 | SWT.APPLICATION_MODAL | SWT.RESIZE | SWT.TITLE);
        this.shell.setLayout( new FormLayout());
        this.shell.setText(this.frametitle);
        
        // File chooser composite
        this.fileChooserComposite = new FileChooserComposite(this.shell, SWT.NONE, SWT.OPEN);
        
        
        // Validation Composite
        this. validateComposite = new ValidationBoutonComposite(this.shell, SWT.NONE, this.cancelButton, this.validateButton);
        
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
        fd_fileChooserComposite.bottom = new FormAttachment(0, 30);
        fd_fileChooserComposite.top = new FormAttachment(0, 0);
        fd_fileChooserComposite.left = new FormAttachment(0, 0);
        this.fileChooserComposite.setLayoutData(fd_fileChooserComposite);
        
        this.fileChooserComposite.getSearch().addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                ADFImportWindow.this.fileChooserComposite.searchFile();
            }
        });
        
        final FormData fd_validateComposite = new FormData();
        fd_validateComposite.top = new FormAttachment(this.fileChooserComposite, 5);
        fd_validateComposite.bottom = new FormAttachment(100, -5);
        fd_validateComposite.left = new FormAttachment(this.fileChooserComposite, 0, SWT.LEFT);
        fd_validateComposite.right = new FormAttachment(this.fileChooserComposite, 0, SWT.RIGHT);
        this.validateComposite.setLayoutData(fd_validateComposite);
        
        setDefaultDialog();
        this.shell.pack();
        this.shell.setMinimumSize(new Point(400, this.shell.getBounds().height));
        
        this.validateComposite.getValidationButton().setFocus();
    }

    @Override
    public void validationAction() {
        File theFile = getFileChooserComposite().getCurrentFile();
        
        
        try(ITransaction t = CPSwarmModule.getInstance().getModuleContext().getModelingSession().createTransaction("ADF Import") ) {
        
        //            AbstractionImporter importer = new AbstractionImporter();
        //            importer.importing((NameSpace) this.selectedElt, theFile);
        
            t.commit();
        
            completeBox();
        
        
        } catch (final Exception e) {
            CPSwarmModule.logService.error(e);
        }
    }

    @Override
    public void setLabels() {
        setTitle("Title");
        setDescription("description");
        setFrametitle("ADF Import");
        setCancelButton("Cancel");
        setValidateButton("Import");
    }

    @Override
    public void setPath() {
        try {
            if (this.path.equals(""))
                this.path = CPSwarmModule.getInstance().getModuleContext().getProjectStructure().getPath().toAbsolutePath().toString();
        
            this.fileChooserComposite.getDialog().setFilterPath(this.path);
            this.fileChooserComposite.getDialog().setFileName("");
            this.fileChooserComposite.setText(this.path);
        } catch (@SuppressWarnings ("unused") final NoClassDefFoundError e) {
            this.fileChooserComposite.setText("");
        }
    }

    @Override
    public void setDefaultDialog() {
        this.fileChooserComposite.getDialog().setFilterNames(new String[] { "ADF Files (*.json)" });
        this.fileChooserComposite.getDialog().setFilterExtensions(new String[] {  "*.json" });
        setPath();
    }

    /**
     * @param style : the SWT style
     * 
     * @param parent : the parent shell
     */
    public ADFImportWindow(final Shell parent) {
        super(parent);
    }

    @Override
    public Object open() {
        createContents();
        return super.open();
    }

}
