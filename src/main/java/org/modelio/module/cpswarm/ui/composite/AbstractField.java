package org.modelio.module.cpswarm.ui.composite;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.forms.widgets.FormToolkit;

/**
 * An abstract implementation of IField composed of:
 * <ul>
 * <li>a Label</li>
 * <li>an edition control</li>
 * </ul>
 * <br/>
 * The composite field controls are layouted as follows:<br/>
 * [--- label ---] [-------- edition control -------- ] <br/>
 * [----------- help text ------------]<br/>
 * 
 * where the help text if folded/unfolded by the help button. The class is in charge of creating the different widgets and of their
 * layout. the creation of the edition control is delegated to concrete sub-classes.
 */
public abstract class AbstractField implements IField {
    private static final String EMPTY_STRING = "";

    private final FormToolkit toolkit;

    private String value;

    private Label label;

    private Control control;

    private Composite fieldComposite;

    private final Composite parent;

    public abstract Control createControl(FormToolkit toolkit, Composite p);

    public AbstractField(FormToolkit toolkit, Composite parent, String value) {
        this.toolkit = toolkit;
        this.parent = parent;
        this.value = value;
    }

    /**
     * Layouts the label, edition control and help button in their container ({@link IField#getComposite()})
     * 
     * This method can be redefined by subclasses who need to change the standard layout for label, control and help button.<br/>
     * When it is called default LayoutData have already been applied to the widgets so that this method can typically either modify
     * or replace the existing LayoutData of the widgets.
     * 
     * The container layout is a FormLayout, therefore widget LayoutData must be FormData.
     * 
     * Note the the helpText will always be layouted so that it appears under the control (same width and X position).
     */
    @Override
    public void layout(Label label, Control control) {
        // The label
        FormData formData = new FormData();
        formData.top = new FormAttachment(this.control, 0, SWT.TOP);
        formData.bottom = new FormAttachment(this.control, 0, SWT.BOTTOM);
        formData.left = new FormAttachment(0);
        formData.right = new FormAttachment(20);
        label.setLayoutData(formData);
                
        // The Control
        formData = new FormData();
        formData.top = new FormAttachment(0, 0);
        formData.bottom = new FormAttachment(this.label, 0, SWT.BOTTOM);
        formData.left = new FormAttachment(this.label, 10);
        formData.right = new FormAttachment(100);
        control.setLayoutData(formData);
    }

    /**
     * Gets the top most container control of the field which must be a <code>Composite</code>.
     */
    @Override
    public Composite getComposite() {
        // Ensure widgets exist.
        if (this.fieldComposite == null) {
            buildGui();
            assert (this.fieldComposite != null);
        }
        return this.fieldComposite;
    }

    /**
     * Gets the control in charge of displaying/editing the field value.
     */
    @Override
    public Control getControl() {
        if (this.control == null) {
            buildGui();
            assert (this.control != null);
        }
        return this.control;
    }

    /**
     * Gets the IfieldData model of this field.
     */
    @Override
    public String getValue() {
        return this.value;
    }

    public final Label getLabel() {
        return this.label;
    }

    private void buildGui() {
        // The composite field is build on a Composite using a FormLayout
        this.fieldComposite = this.toolkit.createComposite(this.parent);
        this.fieldComposite.setBackground(this.parent.getBackground());
        final FormLayout l = new FormLayout();
        this.fieldComposite.setLayout(l);
        
        // Create the composite field controls
        
        this.label = this.toolkit.createLabel(this.fieldComposite, EMPTY_STRING);
        this.label.setBackground(this.parent.getBackground());
             
        
        // Create the control
        this.control = createControl(this.toolkit, this.fieldComposite);
        if (this.control == null) {
            throw new NullPointerException(String.format("%s.createControl(...) returned null", this));
        }
        
        // Layout the composite field controls
        layout(this.label, this.control);
        
        assert (this.label.getLayoutData() instanceof FormData);
        assert (this.control.getLayoutData() instanceof FormData);
    }

    public AbstractField(FormToolkit toolkit, Composite parent) {
        this.toolkit = toolkit;
        this.parent = parent;
        this.value = EMPTY_STRING;
    }

    @Override
    public void setValue(String data) {
        this.value = value;
    }

    @Override
    public void setEditable(boolean onoff) {
        if (this.control != null) {
            this.control.setEnabled(onoff);
        }
        refresh();
    }

}
