package org.modelio.module.cpswarm.ui.composite;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

/**
 * This class creates the validation composite.
 * It composed of two SWT button:
 * - one for the validation of the export or the import
 * - the second for the cancellation of the export or the import
 * 
 * @author ebrosse
 */
public class ValidationBoutonComposite extends Composite {
    private Button validationButton;

    private Button cancelButton;

    /**
     * This methods return the Cancel Button
     * 
     * @return SWT button
     */
    public Button getCancelButton() {
        return this.cancelButton;
    }

    /**
     * This methods return the Validation Button
     * 
     * @return SWT button
     */
    public Button getValidationButton() {
        return this.validationButton;
    }

    /**
     * Contructor of the composite.
     * it needs a parent composite, its SWT style, the label of the cancellation button and the label of the validation button
     * 
     * @param parent : the parent composition
     * @param style : the SWT style
     * @param cancelField : the label of the cancellation button
     * @param validateField : the label of the validation button
     */
    public ValidationBoutonComposite(final Composite parent, final int style, final String cancelField, final String validateField) {
        super(parent, style);
        setLayout(new FormLayout());
              
        this.validationButton = new Button(this, SWT.NONE);
        final FormData fd_validationButton = new FormData();
        fd_validationButton.right = new FormAttachment(100, -104);
        fd_validationButton.left = new FormAttachment(100, -183);
        this.validationButton.setLayoutData(fd_validationButton);
        this.validationButton.setText(validateField);
        
        this.cancelButton = new Button(this, SWT.NONE);
        fd_validationButton.bottom = new FormAttachment(this.cancelButton, 0, SWT.BOTTOM);
        final FormData fd_cancelButton = new FormData();
        fd_cancelButton.right = new FormAttachment(100, -5);
        fd_cancelButton.left = new FormAttachment(this.validationButton, 10, SWT.DEFAULT);
        this. cancelButton.setLayoutData(fd_cancelButton);
        this.cancelButton.setText(cancelField);
    }

}
