package org.modelio.module.cpswarm.ui.window;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.modelio.api.ui.form.models.IFormFieldData;
import org.modelio.module.cpswarm.ui.composite.IField;
import org.modelio.module.cpswarm.ui.composite.StringField;
import org.modelio.module.cpswarm.ui.composite.TextField;

/**
 * This class provides the XMI export dialog
 * @author ebrosse
 */
public class CPDTWizard extends AbstractSwtWizardWindow {
    @Override
    public Object open() {
        createContents();
        return super.open();
    }

    private void createContents() {
        boolean isEditable = this.selectedElt.isModifiable();
        
        setLabels();
        
        FormToolkit toolkit = new FormToolkit(Display.getCurrent());
        toolkit.setBorderStyle(SWT.BORDER);
        
        this.shell = new Shell(getParent(), 67696 | SWT.APPLICATION_MODAL | SWT.RESIZE | SWT.TITLE);
        this.shell.setLayout( new FormLayout());
        this.shell.setText(this.frametitle);
        
        
        // Name
        //        IFormFieldData nameModel = new FormFieldData((AnalystItem) input, new SimpleFieldType(SimpleFieldType.ID_KEY));
        IFormFieldData nameModel = null;
        IField nameField = new StringField(toolkit, this.shell, this.selectedElt.getName());
        final GridData ld_name = new GridData(SWT.FILL, SWT.CENTER, true, false);
        ld_name.widthHint = 600;
        nameField.getComposite().setLayoutData(ld_name);
        nameField.setEditable(isEditable);
        
        
        // Definition
        //        IFormFieldData definitionModel = new FormFieldData((AnalystItem) input, new SimpleFieldType(SimpleFieldType.DEFINITION_KEY));
        String definitionModel = "";
        IField definitionField = new TextField(toolkit, this.shell, definitionModel, 8);
        final GridData ls_definition = new GridData(SWT.FILL, SWT.FILL, true, true);
        ls_definition.widthHint = 600;
        definitionField.getComposite().setLayoutData(ls_definition);
        definitionField.setEditable(isEditable);
        //        fields.add(definitionField);
        
        //        // Properties
        //        PropertyTableDefinition ptype = ((AnalystItem) input).getAnalystProperties().getType();
        //
        //        IField field;
        //
        //        for (PropertyDefinition pdef : ptype.getOwned()) {
        //            PropertyType type = pdef.getType();
        //
        //            IFormFieldData model = new FormFieldData((AnalystItem) input, new PropertyFieldType(pdef));
        //
        //            final GridData layoutData = new GridData(SWT.FILL, SWT.TOP, true, false);
        //            layoutData.widthHint = 600;
        //            switch (type.getBaseType()) {
        //            case TEXT:
        //                field = new TextField(toolkit, parent, model);
        //                fields.add(field);
        //                Composite cText = field.getComposite();
        //                cText.setLayoutData(layoutData);
        //                break;
        //            case ENUMERATE:
        //                field = new EnumField(toolkit, parent, model);
        //                fields.add(field);
        //                Composite cEnum = field.getComposite();
        //                cEnum.setLayoutData(layoutData);
        //                break;
        //            case BOOLEAN:
        //                field = new BooleanField(toolkit, parent, model);
        //                fields.add(field);
        //                Composite cBool = field.getComposite();
        //                cBool.setLayoutData(layoutData);
        //                break;
        //            case DATE:
        //                field = new DateField(toolkit, parent, model);
        //                fields.add(field);
        //                Composite cDate = field.getComposite();
        //                cDate.setLayoutData(layoutData);
        //                break;
        //            case TIME:
        //                field = new TimeField(toolkit, parent, model);
        //                fields.add(field);
        //                Composite cTime = field.getComposite();
        //                cTime.setLayoutData(layoutData);
        //                break;
        //            case ELEMENT:
        //                field = new ElementField(toolkit, parent, model);
        //                fields.add(field);
        //                Composite cElement = field.getComposite();
        //                cElement.setLayoutData(layoutData);
        //                break;
        //            case RICHTEXT:
        //                field = new RichTextField(toolkit, parent, model, CoreSession.getSession(pdef));
        //                fields.add(field);
        //                Composite cRichText = field.getComposite();
        //                cRichText.setLayoutData(layoutData);
        //                break;
        //            case FLOAT:
        //            case INTEGER:
        //            case STRING:
        //            case UNSIGNED:
        //            default:
        //                field = new StringField(toolkit, parent, model);
        //                fields.add(field);
        //                Composite c = field.getComposite();
        //                c.setLayoutData(layoutData);
        //                break;
        //            }
        //
        //            // If is locked, field is not editable
        //            field.setEditable(isEditable);
        //
        //            // If the property definition has a description put it as help
        //            String desc = pdef.getNoteContent("ModelerModule", "description");
        //            if (desc != null) {
        //                field.setHelpText(desc);
        //            }
        //
        //        }
        //        return fields;
    }

    public CPDTWizard(Shell parent) {
        super(parent);
    }

    @Override
    public void setLabels() {
        setTitle("Title");
        setDescription("Description");
        setFrametitle("DSE Export");
        setCancelButton("Cancel");
        setValidateButton("Export");
    }

    @Override
    public void validationAction() {
    }

    @Override
    public void setDefaultDialog() {
    }

    @Override
    public void setPath() {
        // TODO Auto-generated method stub
    }

}
