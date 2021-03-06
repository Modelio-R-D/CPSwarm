package org.modelio.module.cpswarm.ui.composite;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

/**
 * This class defines the file chooser composite.
 * This composite is composed of
 * - a text field in order to specify the desired file
 * 
 * It is a SWT composite
 * @author ebrosse
 */
public class StringComposite extends Composite {
    private Label label = null;

    private Text text = null;

    /**
     * This method sets the label of the composite
     * 
     * @param label : the label of the composite
     */
    public void setText(final String label) {
        if (label != null)
            this.text.setText(label);
    }

    public void setLabel(final String label) {
        if (label != null)
            this.label.setText(label);
    }

    /**
     * Constructor of the FileChooserComposite.
     * It needs :
     * - the parent composite
     * - its SWT style
     * - the selection type of the SWT FileDialog
     * 
     * @param parent : the SWT composite owner
     * @param style : the SWT style
     * @param typeSelection : the SWT selection type
     */
    public StringComposite(final Composite parent, final int style, final int typeSelection) {
        super(parent, style);
        
        setLayout(new FormLayout());
        
        final GridLayout gridLayout = new GridLayout();
        gridLayout.numColumns = 2;
        this.setLayout(gridLayout);
        
        this.label = new Label(this, SWT.BORDER);
        
        this.text = new Text(this, SWT.None);
        //        this.text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
        this.text.setEnabled(true);
    }

    /**
     * This methods returns the text available in the SWT FileDialog
     * 
     * @return the text of the FileDialog
     */
    public String getText() {
        return this.text.getText();
    }

    /**
     * This method returns the SWT Text owned by the FileChooserComposite
     * 
     * @return the owned SWT TEXT
     */
    public Text getTextButton() {
        return this.text;
    }

}
