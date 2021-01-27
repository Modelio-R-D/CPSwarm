package org.modelio.module.cpswarm.ui.composite;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;

/**
 * Represents a field in an edition form.<br/>
 * A field is composed of:
 * <ul>
 * <li>a label - informative</li>
 * <li>a control - where edition takes place</li>
 * </ul>
 */
public interface IField {
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
    void layout(Label label, Control control);

    /**
     * Gets the top most container control of the field which must be a <code>Composite</code>.
     */
    Composite getComposite();

    /**
     * Gets the control in charge of displaying/editing the field value.
     */
    Control getControl();

    /**
     * Refresh the value displayed by the field. The field will typically query its IFiledData model and refresh its contents.
     */
    void refresh();

    void setEditable(boolean onoff);

    /**
     * Gets the IfieldData model of this field.
     */
    String getValue();

    void setValue(String data);

}
