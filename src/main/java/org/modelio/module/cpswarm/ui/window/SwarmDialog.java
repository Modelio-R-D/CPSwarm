package org.modelio.module.cpswarm.ui.window;

import java.util.ArrayList;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.TableEditor;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Dialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;
import org.modelio.api.modelio.IModelioServices;
import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.modelio.diagram.IDiagramService;
import org.modelio.api.modelio.diagram.dg.IDiagramDG;
import org.modelio.api.modelio.diagram.style.IStyleHandle;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.diagrams.ClassDiagram;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.module.cpswarm.api.CPSwarmStereotypes;
import org.modelio.module.cpswarm.api.ICPSwarmPeerModule;
import org.modelio.module.cpswarm.i18n.I18nMessageService;
import org.modelio.module.cpswarm.impl.CPSwarmModule;
import org.modelio.module.cpswarm.utils.CPSwarmFactory;
import org.modelio.module.cpswarm.utils.ModelUtils;

public class SwarmDialog extends Dialog {
    private static final int DEFAULT_MARGIN = 20;

    private static final String COMPOSITION_DIAGRAM_NAME_EXTENSION = "Composition Diagram";

    private static final int DEFAULT_SPACING = 100;

    private Text swarmNameText;

    private Text swarmDescriptionText;

    private Button cancelButton;

    private Button okButton;

    private ModelElement selectedElement = null;

    private Shell shell;

    private Table swarmMembersTable;

    private Button addMemberButton;

    private Button removeMemberButton;

    private TableEditor swarmMembersTableEditor;

    private Button newMemberButton;

    private java.util.List<Class> allSwarmMembersList;

    public SwarmDialog(Shell parent, int style) {
        super (parent, style);
        
        initializeSwarmMembersList();
    }

    public SwarmDialog(Shell activeShell) {
        this (activeShell, SWT.NONE);
    }

    public void setSelectedElement(ModelElement selectedElement) {
        this.selectedElement = selectedElement;
    }

    public void open() {
        Shell parent = getParent();
        Display display = parent.getDisplay();
        
        this.shell = new Shell(parent, SWT.DIALOG_TRIM | SWT.APPLICATION_MODAL);
        
        
        this.shell.setText(I18nMessageService.getString ("Ui.Command.SwarmWizardCommand.Dialog.Label"));
        this.shell.setLocation(parent.getBounds().x + (parent.getBounds().width/4), parent.getBounds().y + (parent.getBounds().height/4));
        // Layout with 2 columns
        GridLayout gridLayout = new GridLayout(6, false);
        this.shell.setLayout(gridLayout);
        
        gridLayout.marginTop = DEFAULT_MARGIN/2;
        gridLayout.marginRight = DEFAULT_MARGIN;
        gridLayout.marginLeft = DEFAULT_MARGIN;
        gridLayout.marginBottom = DEFAULT_MARGIN/2;
        gridLayout.verticalSpacing = DEFAULT_MARGIN/2;
        
        GridData gridData;
        // First row
        Label label = new Label(this.shell, SWT.NULL);
        label.setText(I18nMessageService.getString ("Ui.Command.Dialog.Name.Label"));
        gridData = new GridData(GridData.HORIZONTAL_ALIGN_FILL);
        gridData.widthHint = 140;
        gridData.horizontalSpan = 2;
        label.setLayoutData(gridData);
        
        this.swarmNameText = new Text(this.shell, SWT.SINGLE | SWT.BORDER);
        gridData = new GridData(GridData.HORIZONTAL_ALIGN_FILL);
        gridData.widthHint = 280;
        gridData.horizontalSpan = 4;
        this.swarmNameText.setLayoutData(gridData);
        
        
        // 2nd row
        label = new Label(this.shell, SWT.NULL);
        label.setText(I18nMessageService.getString ("Ui.Command.Dialog.Description.Label"));
        gridData = new GridData(GridData.HORIZONTAL_ALIGN_FILL | GridData.VERTICAL_ALIGN_BEGINNING);
        gridData.widthHint = 140;
        gridData.horizontalSpan = 2;
        label.setLayoutData(gridData);
        
        this.swarmDescriptionText = new Text(this.shell, SWT.MULTI | SWT.BORDER | SWT.WRAP | SWT.V_SCROLL);
        gridData = new GridData(GridData.HORIZONTAL_ALIGN_FILL);
        gridData.widthHint = 280;
        gridData.heightHint = 120;
        gridData.horizontalSpan = 4;
        this.swarmDescriptionText.setLayoutData(gridData);
        
        // New member Button Row
        this.newMemberButton = new Button(this.shell, SWT.PUSH);
        this.newMemberButton.setText(I18nMessageService.getString ("Ui.Button.NewMember.Label"));
        gridData = new GridData(GridData.HORIZONTAL_ALIGN_END);
        gridData.minimumWidth = 100;
        gridData.horizontalSpan = 6;
        this.newMemberButton.addSelectionListener(new SelectionAdapter() {
        
            @Override
            public void widgetSelected(SelectionEvent e) {
                openCreateNewMemberDialog();
            }
        });
        this.newMemberButton.setLayoutData(gridData);
        
        // Add / Delete Button row
        label = new Label(this.shell, SWT.NULL);
        label.setText(I18nMessageService.getString ("Ui.Command.SwarmWizardCommand.SwarmMembers.Label"));
        gridData = new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING);
        gridData.horizontalSpan = 4;
        label.setLayoutData(gridData);
        
        
        //  --> Add Button
        this.addMemberButton = new Button(this.shell, SWT.PUSH);
        this.addMemberButton.setText("+");
        gridData = new GridData();
        gridData.widthHint = 40;
        this.addMemberButton.setLayoutData(gridData);
        this.addMemberButton.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                openChooseTypeDialog();
            }
        });
        
        
        //  --> Remove Button
        this.removeMemberButton = new Button(this.shell, SWT.PUSH);
        this.removeMemberButton.setText("-");
        gridData = new GridData();
        gridData.widthHint = 40;
        this.removeMemberButton.setLayoutData(gridData);
        this.removeMemberButton.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
        
                int[] selectedIndices = SwarmDialog.this.swarmMembersTable.getSelectionIndices();
                if (selectedIndices.length == 0) {
                    MessageDialog.openInformation(Display.getDefault().getActiveShell(),
                            I18nMessageService.getString ("Ui.Dialog.NoSelectedElement.Label"),
                            I18nMessageService.getString ("Ui.Dialog.NoSelectedElement.Message"));
                } else {
        
                    for(int selectedIndex:selectedIndices) {
                        SwarmDialog.this.swarmMembersTable.remove(selectedIndex);
                    }
                }
            }
        });
        
        
        
        // Table Row row
        this.swarmMembersTable = new Table(this.shell, SWT.BORDER | SWT.V_SCROLL | SWT.H_SCROLL);
        this.swarmMembersTable.setHeaderVisible(true);
        String[] titles = { I18nMessageService.getString ("Ui.Command.SwarmWizardCommand.Type.Label"),
                I18nMessageService.getString ("Ui.Command.SwarmWizardCommand.Role.Label"),
                I18nMessageService.getString ("Ui.Command.SwarmWizardCommand.Number.Label")};
        
        TableColumn column = new TableColumn(this.swarmMembersTable, SWT.NULL);
        column.setText(titles[0]);
        column.setWidth(280);
        
        for (int i = 1; i < titles.length; i++) {
            column = new TableColumn(this.swarmMembersTable, SWT.NULL);
            column.setText(titles[i]);
            column.setWidth(70);
        }
        
        
        gridData = new GridData(SWT.FILL, SWT.FILL, true, true);
        gridData.heightHint = 200;
        gridData.horizontalSpan = 6;
        this.swarmMembersTable.setLayoutData(gridData);
        
        
        handleTableEditor();
        
        
        // Last row
        
        Composite compositeRowButtons = new Composite(this.shell, SWT.NULL);
        GridLayout compositeLayout = new GridLayout();
        compositeLayout.numColumns = 2;
        compositeRowButtons.setLayout(compositeLayout);
        
        
        //  --> Cancel Button
        this.cancelButton = new Button(compositeRowButtons, SWT.PUSH);
        this.cancelButton.setText(I18nMessageService.getString ("Ui.Button.Cancel.Label"));
        gridData = new GridData();
        //gridData.horizontalSpan = 2;
        //gridData.horizontalAlignment = GridData.BEGINNING;
        gridData.widthHint = 100;
        this.cancelButton.setLayoutData(gridData);
        this.cancelButton.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                SwarmDialog.this.shell.close();
            }
        });
        
        
        
        //  --> OK Button
        this.okButton = new Button(compositeRowButtons, SWT.PUSH);
        this.okButton.setText(I18nMessageService.getString ("Ui.Button.OK.Label"));
        gridData = new GridData();
        //gridData.horizontalAlignment = GridData.END;
        gridData.widthHint = 100;
        this.okButton.setLayoutData(gridData);
        this.okButton.addSelectionListener(new SelectionAdapter() {
        
            @Override
            public void widgetSelected(SelectionEvent e) {
                if(SwarmDialog.this.selectedElement == null
                        //|| NewSwarmDialog.this.swarmMembersTable.getItemCount() == 0
                        ) {
                    MessageDialog.openInformation(Display.getDefault().getActiveShell(),
                            I18nMessageService.getString ("Ui.Dialog.NoSelectedElement.Label"),
                            I18nMessageService.getString ("Ui.Dialog.NoSelectedElementAdd.Message"));
                    SwarmDialog.this.shell.close();
                } else if (SwarmDialog.this.swarmNameText.getText().isEmpty()) {
                    MessageDialog.openInformation(Display.getDefault().getActiveShell(),
                            I18nMessageService.getString ("Ui.Dialog.EmptyName.Label"),
                            I18nMessageService.getString ("Ui.Dialog.EmptyName.Message"));
        
                } else  {
                    createNewSwarm();
                }
            }
        
        
        
        });
        
        gridData = new GridData(GridData.CENTER, GridData.CENTER, false, false);
        //new GridData(GridData.HORIZONTAL_ALIGN_FILL);
        //gridData.widthHint = 80;
        gridData.horizontalSpan = 6;
        compositeRowButtons.setLayoutData(gridData);
        
        
        this.shell.pack();
        
        this.shell.open();
        
        while (!this.shell.isDisposed()) {
            if (!display.readAndDispatch()) display.sleep();
        }
    }

    private void createNewSwarm() {
        // Create Swam Member Class, Diagram
        IModuleContext moduleContext = CPSwarmModule.getInstance().getModuleContext();
        IModelingSession modelingSession = moduleContext.getModelingSession();
        
        try (ITransaction transaction = modelingSession.createTransaction(ClassDiagram.MNAME);){
        
            ClassDiagram compositionDiagram = CPSwarmFactory.createSwarmCompositionDiagram(this.selectedElement,
                    this.swarmNameText.getText() + " " + COMPOSITION_DIAGRAM_NAME_EXTENSION);
        
            if (compositionDiagram != null) {
        
                IModelioServices modelioServices = moduleContext.getModelioServices();
                IDiagramService diagramService = modelioServices.getDiagramService();
                try(  IDiagramHandle diagramHandle = diagramService.getDiagramHandle(compositionDiagram);){
                    IDiagramDG diagramGraphic = diagramHandle.getDiagramNode();
                    for (IStyleHandle style : diagramService.listStyles()){
                        if (style.getName().equals("CPSwarm"))
                            diagramGraphic.setStyle(style);
                    }
        
        
                    // Swarm
                    Class swarm = CPSwarmFactory.createSwarm((Package) this.selectedElement,
                            this.swarmNameText.getText(),
                            this.swarmDescriptionText.getText());
                    //java.util.List<IDiagramGraphic> diagramGraphics =
                    diagramHandle.unmask(swarm, DEFAULT_SPACING, DEFAULT_SPACING);
                    //                    diagramGraphics.get(0)
                    //                    for (IDiagramGraphic elementGraphic : diagramGraphics) {
                    //                        if(diagramGraphic.getElement().equals(rootElement)){
                    //                            ((IDiagramNode) diagramGraphic).setBounds(DiagramElementBounds.ROOT.createRectangleBounds());
                    //                        }
                    //                    }
        
                    // Unmask Swarm members and Create dependencies
                    int swarmMemberOrder=1;
                    for( TableItem tableItem : this.swarmMembersTable.getItems()) {
                        Class swarmMember = (Class) ModelUtils.getElementByPath(tableItem.getText(0));
                        diagramHandle.unmask(swarmMember, 4 * DEFAULT_SPACING, swarmMemberOrder * DEFAULT_SPACING);
        
                        Association association = CPSwarmFactory.createComposition(swarm, swarmMember, tableItem.getText(1), tableItem.getText(2));
                        diagramHandle.unmask(association, 0, 0);
                        swarmMemberOrder++;
        
                    }
        
                    diagramHandle.save();
                    diagramHandle.close();
                    modelioServices.getEditionService().openEditor(compositionDiagram);
                }
            }
        
        
        
        
            transaction.commit();
        }
        
        SwarmDialog.this.shell.close();
    }

    private void handleTableEditor() {
        this.swarmMembersTableEditor = new TableEditor(this.swarmMembersTable);
        this.swarmMembersTableEditor.horizontalAlignment = SWT.LEFT;
        this.swarmMembersTableEditor.grabHorizontal = true;
        this.swarmMembersTable.addListener(SWT.MouseDown, new Listener() {
            @Override
            public void handleEvent(Event event) {
                Rectangle clientArea = SwarmDialog.this.swarmMembersTable.getClientArea();
                Point clickPoint = new Point(event.x, event.y);
                int index = SwarmDialog.this.swarmMembersTable.getTopIndex();
                while (index < SwarmDialog.this.swarmMembersTable.getItemCount()) {
                    boolean visible = false;
                    final TableItem selectedTableItem = SwarmDialog.this.swarmMembersTable.getItem(index);
                    for (int i = 0; i < SwarmDialog.this.swarmMembersTable.getColumnCount(); i++) {
                        Rectangle selectionBounds = selectedTableItem.getBounds(i);
                        if (selectionBounds.contains(clickPoint)) {
        
                            final int selectedColumn = i;
                            if (selectedColumn == 1 || selectedColumn == 2) {
        
                                // Role
                                final Text roleText = new Text(SwarmDialog.this.swarmMembersTable, SWT.NONE);
                                handleTextEdit(selectedTableItem, selectedColumn, roleText);
        
                            }
        
                            return;
        
                        }
                        if (!visible && selectionBounds.intersects(clientArea)) {
                            visible = true;
                        }
                    }
                    if (!visible)
                        return;
                    index++;
                }
            }
        
        
        
        
        });
    }

    private void openChooseTypeDialog() {
        Display display = this.shell.getDisplay();
        
        Shell chooseTypeDialog = new Shell(this.shell, SWT.DIALOG_TRIM | SWT.APPLICATION_MODAL);
        
        
        chooseTypeDialog.setText(I18nMessageService.getString ("Ui.Command.SwarmWizardCommand.ChooseType.Label"));
        chooseTypeDialog.setLocation(this.shell.getBounds().x + (this.shell.getBounds().width/4), this.shell.getBounds().y + (this.shell.getBounds().height/4));
        
        GridLayout gridLayout = new GridLayout(2, false);
        chooseTypeDialog.setLayout(gridLayout);
        
        gridLayout.marginTop = DEFAULT_MARGIN/2;
        gridLayout.marginRight = DEFAULT_MARGIN;
        gridLayout.marginLeft = DEFAULT_MARGIN;
        gridLayout.marginBottom = DEFAULT_MARGIN/2;
        gridLayout.verticalSpacing = DEFAULT_MARGIN/2;
        
        
        GridData gridData;
        
        Label label = new Label(chooseTypeDialog, SWT.NULL);
        label.setText("Members List: ");
        gridData = new GridData(GridData.HORIZONTAL_ALIGN_FILL | GridData.VERTICAL_ALIGN_BEGINNING);
        gridData.widthHint = 80;
        label.setLayoutData(gridData);
        
        
        List memberTypesWidgetList = new List (chooseTypeDialog, SWT.BORDER | SWT.MULTI | SWT.V_SCROLL );
        gridData = new GridData(GridData.HORIZONTAL_ALIGN_FILL);
        //gridData.widthHint = 120;
        gridData.heightHint = 200;
        memberTypesWidgetList.setLayoutData(gridData);
        
        
        for (Class clazz : this.allSwarmMembersList) {
            memberTypesWidgetList.add(ModelUtils.getElementAbsolutePath(clazz));
        }
        
        
        //  --> Cancel Button
        Button chooseTypeDialogCancelButton = new Button(chooseTypeDialog, SWT.PUSH);
        chooseTypeDialogCancelButton.setText(I18nMessageService.getString ("Ui.Button.Cancel.Label"));
        gridData = new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING);
        //gridData.horizontalSpan = 2;
        //gridData.horizontalAlignment = GridData.BEGINNING;
        gridData.widthHint = 100;
        chooseTypeDialogCancelButton.setLayoutData(gridData);
        chooseTypeDialogCancelButton.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                chooseTypeDialog.close();
            }
        });
        
        
        //  --> OK Button
        Button chooseTypeDialogCancelButtonn = new Button(chooseTypeDialog, SWT.PUSH);
        chooseTypeDialogCancelButtonn.setText(I18nMessageService.getString ("Ui.Button.OK.Label"));
        gridData = new GridData(GridData.HORIZONTAL_ALIGN_END);
        //gridData.horizontalAlignment = GridData.END;
        gridData.widthHint = 100;
        chooseTypeDialogCancelButtonn.setLayoutData(gridData);
        chooseTypeDialogCancelButtonn.addSelectionListener(new SelectionAdapter() {
        
            @Override
            public void widgetSelected(SelectionEvent e) {
                if(memberTypesWidgetList.getSelectionIndices().length == 0) {
                    MessageDialog.openInformation(Display.getDefault().getActiveShell(),
                            I18nMessageService.getString ("Ui.Dialog.NoSelectedElement.Label"),
                            I18nMessageService.getString ("Ui.Dialog.NoSelectedElementAdd.Message"));
                } else  {
        
                    for(int selectedTypeIndex : memberTypesWidgetList.getSelectionIndices()) {
                        // check if selected member type already exists
                        boolean selectedMemberTypeAlreadyExists = false;
                        for(TableItem tableItem : SwarmDialog.this.swarmMembersTable.getItems()) {
                            if(
                                    ModelUtils.getElementAbsolutePath(
                                            SwarmDialog.this.allSwarmMembersList.get(selectedTypeIndex))
                                    .equals(tableItem.getText(0))) {
                                selectedMemberTypeAlreadyExists = true;
                                break;
                            }
                        }
                        if(! selectedMemberTypeAlreadyExists ) {
                            TableItem newTableItem = new TableItem(SwarmDialog.this.swarmMembersTable, SWT.NULL);
                            newTableItem.setText(0, ModelUtils.getElementAbsolutePath(SwarmDialog.this.allSwarmMembersList.get(selectedTypeIndex)));
                            newTableItem.setText(1, SwarmDialog.this.allSwarmMembersList.get(selectedTypeIndex).getName());
                            newTableItem.setText(2, "1");
                        }
        
                    }
        
                    chooseTypeDialog.close();
                }
            }
        
        });
        
        
        chooseTypeDialog.pack();
        
        chooseTypeDialog.open();
        
        while (!chooseTypeDialog.isDisposed()) {
            if (!display.readAndDispatch()) display.sleep();
        }
    }

    private void handleTextEdit(final TableItem selectedTableItem, final int selectedColumn, final Text text) {
        Listener textListener = new Listener() {
            @Override
            public void handleEvent(final Event e) {
                switch (e.type) {
                case SWT.FocusOut:
                    selectedTableItem.setText(selectedColumn, text.getText());
                    text.dispose();
                    break;
                case SWT.Traverse:
                    switch (e.detail) {
                    case SWT.TRAVERSE_RETURN:
                        selectedTableItem
                        .setText(selectedColumn, text
                                .getText());
                        // FALL THROUGH
                    case SWT.TRAVERSE_ESCAPE:
                        text.dispose();
                        e.doit = false;
                    }
                    break;
                }
            }
        };
        text.addListener(SWT.FocusOut, textListener);
        text.addListener(SWT.Traverse, textListener);
        SwarmDialog.this.swarmMembersTableEditor.setEditor(text, selectedTableItem, selectedColumn);
        text.setText(selectedTableItem.getText(selectedColumn));
        text.selectAll();
        text.setFocus();
    }

    private void initializeSwarmMembersList() {
        this.allSwarmMembersList = new ArrayList<>();
        for(Class clazz: CPSwarmModule.getInstance().getModuleContext().getModelingSession().findByClass(Class.class)) {
            if(clazz.isStereotyped(ICPSwarmPeerModule.MODULE_NAME, CPSwarmStereotypes.SWARMMEMBER) ) {
                this.allSwarmMembersList.add(clazz);
            }
        }
    }

    private void openCreateNewMemberDialog() {
        Display display = this.shell.getDisplay();
        Shell createNewMemberDialog = new Shell(this.shell, SWT.DIALOG_TRIM | SWT.APPLICATION_MODAL);
        
        createNewMemberDialog.setText(I18nMessageService.getString ("Ui.Dialog.CreateNewMember.Label"));
        createNewMemberDialog.setLocation(this.shell.getBounds().x + (this.shell.getBounds().width/4),
                this.shell.getBounds().y + (this.shell.getBounds().height/4));
        
        
        GridLayout gridLayout = new GridLayout(2, false);
        createNewMemberDialog.setLayout(gridLayout);
        
        
        gridLayout.marginTop = DEFAULT_MARGIN/2;
        gridLayout.marginRight = DEFAULT_MARGIN;
        gridLayout.marginLeft = DEFAULT_MARGIN;
        gridLayout.marginBottom = DEFAULT_MARGIN/2;
        gridLayout.verticalSpacing = DEFAULT_MARGIN/2;
        
        GridData gridData;
        
        // 1st row
        Label label = new Label(createNewMemberDialog, SWT.NULL);
        label.setText(I18nMessageService.getString ("Ui.Dialog.NewMemberName.Label"));
        gridData = new GridData(GridData.HORIZONTAL_ALIGN_FILL);
        label.setLayoutData(gridData);
        
        Text newMemberNameText = new Text(createNewMemberDialog, SWT.SINGLE | SWT.BORDER);
        gridData = new GridData(GridData.HORIZONTAL_ALIGN_FILL);
        gridData.widthHint = 280;
        newMemberNameText.setLayoutData(gridData);
        
        // 2nd row
        //  --> New ValueType : Cancel Button
        Button newValueTypeCancelButton = new Button(createNewMemberDialog, SWT.PUSH);
        newValueTypeCancelButton.setText(I18nMessageService.getString ("Ui.Button.Cancel.Label"));
        gridData = new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING);
        gridData.widthHint = 100;
        newValueTypeCancelButton.setLayoutData(gridData);
        newValueTypeCancelButton.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                createNewMemberDialog.close();
            }
        });
        
        
        //  -->  NewValueType : OK Button
        Button newValueTypeOKButtonn = new Button(createNewMemberDialog, SWT.PUSH);
        newValueTypeOKButtonn.setText(I18nMessageService.getString ("Ui.Button.OK.Label"));
        gridData = new GridData(GridData.HORIZONTAL_ALIGN_END);
        gridData.widthHint = 100;
        newValueTypeOKButtonn.setLayoutData(gridData);
        newValueTypeOKButtonn.addSelectionListener(new SelectionAdapter() {
        
            @Override
            public void widgetSelected(SelectionEvent e) {
                if(newMemberNameText.getText().isEmpty()) {
                    MessageDialog.openInformation(Display.getDefault().getActiveShell(),
                            I18nMessageService.getString ("Ui.Dialog.EmptyName.Label"),
                            I18nMessageService.getString ("Ui.Dialog.EmptyName.Message"));
                } else  {
        
                    IModuleContext moduleContext = CPSwarmModule.getInstance().getModuleContext();
                    IModelingSession modelingSession = moduleContext.getModelingSession();
        
                    try (ITransaction transaction = modelingSession.createTransaction(Class.MNAME);){
        
                        CPSwarmFactory.createSwarmMember((Package) SwarmDialog.this.selectedElement, newMemberNameText.getText());
        
                        transaction.commit();
                    }
        
                    initializeSwarmMembersList();
                    createNewMemberDialog.close();
        
                }
        
            }
        
        
        });
        
        
        createNewMemberDialog.pack();
        createNewMemberDialog.open();
        
        while (!createNewMemberDialog.isDisposed()) {
            if (!display.readAndDispatch()) display.sleep();
        }
    }

}
