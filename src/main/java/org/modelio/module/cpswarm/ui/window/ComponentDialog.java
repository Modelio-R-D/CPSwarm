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
import org.eclipse.swt.widgets.Control;
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
import org.modelio.metamodel.diagrams.StateMachineDiagram;
import org.modelio.metamodel.uml.behavior.stateMachineModel.FinalState;
import org.modelio.metamodel.uml.behavior.stateMachineModel.InitialPseudoState;
import org.modelio.metamodel.uml.behavior.stateMachineModel.State;
import org.modelio.metamodel.uml.behavior.stateMachineModel.StateMachine;
import org.modelio.metamodel.uml.behavior.stateMachineModel.Transition;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.DataType;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.metamodel.uml.statik.PortOrientation;
import org.modelio.module.cpswarm.i18n.I18nMessageService;
import org.modelio.module.cpswarm.impl.CPSwarmModule;
import org.modelio.module.cpswarm.type.swarm.SwarmComponentType;
import org.modelio.module.cpswarm.utils.CPSwarmFactory;
import org.modelio.module.cpswarm.utils.ModelUtils;
import org.modelio.module.sysml.api.SysMLStereotypes;
import org.modelio.module.sysml.impl.SysMLPeerModule;

public class ComponentDialog extends Dialog {
    private static final int DEFAULT_MARGIN = 20;

    private List componentTypeWidgetList;

    private static final String FINAL_STATE_DEFAULT_NAME = "Final State";

    private static final String STATE_DEFAULT_NAME = "State";

    private static final String INITIAL_STATE_DEFAULT_NAME = "Initial State";

    private static final String BEHAVIOR_DIAGRAM_NAME_EXTENSION = "Behavior Diagram";

    private static final int DEFAULT_SPACING = 100;

    private static final String BEHAVIOR_NAME_EXTENSION = "Behavior";

    private Text componentNameText;

    private Text componentDescriptionText;

    private Button behaviourCheckbox;

    private Button cancelButton;

    private Button okButton;

    private ModelElement selectedElement = null;

    private Shell shell;

    private Table listPortTable;

    private java.util.List<DataType> allValueTypeList;

    private Button addPortButton;

    private Button removePortButton;

    private TableEditor listPortTableEditor;

    public ComponentDialog(Shell parent, int style) {
        super (parent, style);
        
        initializeValueTypeList();
    }

    public ComponentDialog(Shell activeShell) {
        this (activeShell, SWT.NONE);
    }

    public void setSelectedElement(ModelElement selectedElement) {
        this.selectedElement = selectedElement;
    }

    public void open() {
        Shell parent = getParent();
        Display display = parent.getDisplay();
        
        this.shell = new Shell(parent, SWT.DIALOG_TRIM | SWT.APPLICATION_MODAL);
        
        
        this.shell.setText(I18nMessageService.getString ("Ui.Command.ComponentWizardCommand.Dialog.Label"));
        this.shell.setLocation(parent.getBounds().x + (parent.getBounds().width/4), parent.getBounds().y + (parent.getBounds().height/4));
        // Layout with 2 columns
        GridLayout gridLayout = new GridLayout(3, false);
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
        label.setLayoutData(gridData);
        
        this.componentNameText = new Text(this.shell, SWT.SINGLE | SWT.BORDER);
        gridData = new GridData(GridData.HORIZONTAL_ALIGN_FILL);
        gridData.widthHint = 280;
        gridData.horizontalSpan = 2;
        this.componentNameText.setLayoutData(gridData);
        
        
        // 2nd row
        label = new Label(this.shell, SWT.NULL);
        label.setText(I18nMessageService.getString ("Ui.Command.Dialog.Description.Label"));
        gridData = new GridData(GridData.HORIZONTAL_ALIGN_FILL | GridData.VERTICAL_ALIGN_BEGINNING);
        gridData.widthHint = 140;
        label.setLayoutData(gridData);
        
        this.componentDescriptionText = new Text(this.shell, SWT.BORDER | SWT.WRAP | SWT.V_SCROLL);
        gridData = new GridData(GridData.HORIZONTAL_ALIGN_FILL);
        gridData.widthHint = 280;
        gridData.heightHint = 120;
        gridData.horizontalSpan = 2;
        this.componentDescriptionText.setLayoutData(gridData);
        
        
        // 3rd row
        label = new Label(this.shell, SWT.NULL);
        label.setText(I18nMessageService.getString ("Ui.Command.Dialog.Type.Label"));
        gridData = new GridData(GridData.HORIZONTAL_ALIGN_FILL | GridData.VERTICAL_ALIGN_BEGINNING);
        gridData.widthHint = 140;
        label.setLayoutData(gridData);
        
        this.componentTypeWidgetList = new List (this.shell, SWT.BORDER | SWT.V_SCROLL);
        for (SwarmComponentType swarmMemberType : SwarmComponentType.values()) {
            this.componentTypeWidgetList.add(swarmMemberType.toString());
        }
        gridData = new GridData(GridData.HORIZONTAL_ALIGN_FILL);
        gridData.widthHint = 280;
        gridData.heightHint = 120;
        gridData.horizontalSpan = 2;
        this.componentTypeWidgetList.setLayoutData(gridData);
        
        // 4th row
        label = new Label(this.shell, SWT.NULL);
        label.setText(I18nMessageService.getString ("Ui.Command.Dialog.Behavior.Label"));
        gridData = new GridData(GridData.HORIZONTAL_ALIGN_FILL | GridData.VERTICAL_ALIGN_BEGINNING);
        gridData.widthHint = 140;
        label.setLayoutData(gridData);
        
        this.behaviourCheckbox = new Button(this.shell, SWT.CHECK);
        gridData = new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING);
        gridData.horizontalSpan = 2;
        this.behaviourCheckbox.setLayoutData(gridData);
        
        
        
        // Add / Remove Button  5th row
        label = new Label(this.shell, SWT.NULL);
        label.setText(I18nMessageService.getString ("Ui.Command.ComponentWizardCommand.ListPort.Label"));
        gridData = new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING);
        //gridData.horizontalSpan = 1;
        label.setLayoutData(gridData);
        
        
        //  --> Add Button
        this.addPortButton = new Button(this.shell, SWT.PUSH);
        this.addPortButton.setText("+");
        gridData = new GridData();
        gridData.widthHint = 40;
        this.addPortButton.setLayoutData(gridData);
        this.addPortButton.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                openChoosePortTypeDialog();
            }
        });
        
        
        //  --> Remove Button
        this.removePortButton = new Button(this.shell, SWT.PUSH);
        this.removePortButton.setText("-");
        gridData = new GridData();
        gridData.widthHint = 40;
        this.removePortButton.setLayoutData(gridData);
        this.removePortButton.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
        
                int[] selectedIndices = ComponentDialog.this.listPortTable.getSelectionIndices();
                if (selectedIndices.length == 0) {
                    MessageDialog.openInformation(Display.getDefault().getActiveShell(), 
                            I18nMessageService.getString ("Ui.Dialog.NoSelectedElement.Label"), 
                            I18nMessageService.getString ("Ui.Dialog.NoSelectedElement.Message"));
                } else {
        
                    for(int selectedIndex:selectedIndices) {
                        ComponentDialog.this.listPortTable.remove(selectedIndex);
                    }
                }
            }
        });
        
        
        
        // Table Row row
        this.listPortTable = new Table(this.shell, SWT.BORDER | SWT.V_SCROLL | SWT.H_SCROLL);
        this.listPortTable.setHeaderVisible(true);
        String[] titles = { I18nMessageService.getString ("Ui.Command.ComponentWizardCommand.PortName.Label"), 
                I18nMessageService.getString ("Ui.Command.ComponentWizardCommand.PortType.Label"), 
                I18nMessageService.getString ("Ui.Command.ComponentWizardCommand.PortDirection.Label")};
        
        TableColumn column = new TableColumn(this.listPortTable, SWT.NULL);
        column.setText(titles[0]);
        column.setWidth(70);
        
        column = new TableColumn(this.listPortTable, SWT.NULL);
        column.setText(titles[1]);
        column.setWidth(240);
        
        column = new TableColumn(this.listPortTable, SWT.NULL);
        column.setText(titles[2]);
        column.setWidth(70);
        
        
        gridData = new GridData(SWT.FILL, SWT.FILL, true, true);
        gridData.heightHint = 200;
        gridData.horizontalSpan = 3;
        this.listPortTable.setLayoutData(gridData);
        
        
        // Handle Edit elements in Port List Table
        handleTableEditor();
        
        
        // Last row  (Cancel, OK Buttons)
        
        Composite compositeRowButtons = new Composite(this.shell, SWT.NULL);
        GridLayout compositeLayout = new GridLayout();
        compositeLayout.numColumns = 2;
        compositeRowButtons.setLayout(compositeLayout);
        
        
        //  --> Cancel Button
        this.cancelButton = new Button(compositeRowButtons, SWT.PUSH);
        this.cancelButton.setText(I18nMessageService.getString ("Ui.Button.Cancel.Label"));
        gridData = new GridData();
        gridData.widthHint = 100;
        this.cancelButton.setLayoutData(gridData);
        this.cancelButton.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                ComponentDialog.this.shell.close();
            }
        });
        
        
        
        //  --> OK Button
        this.okButton = new Button(compositeRowButtons, SWT.PUSH);
        this.okButton.setText(I18nMessageService.getString ("Ui.Button.OK.Label"));
        gridData = new GridData();
        gridData.widthHint = 100;
        this.okButton.setLayoutData(gridData);
        this.okButton.addSelectionListener(new SelectionAdapter() {
        
            @Override
            public void widgetSelected(SelectionEvent e) {
                if(ComponentDialog.this.selectedElement == null) {
                    MessageDialog.openInformation(Display.getDefault().getActiveShell(), 
                            I18nMessageService.getString ("Ui.Dialog.NoSelectedElement.Label"), 
                            I18nMessageService.getString ("Ui.Dialog.NoSelectedElement.Message"));
                    ComponentDialog.this.shell.close();
                } else if (ComponentDialog.this.componentNameText.getText().isEmpty()) {
                    MessageDialog.openInformation(Display.getDefault().getActiveShell(), 
                            I18nMessageService.getString ("Ui.Dialog.EmptyName.Label"), 
                            I18nMessageService.getString ("Ui.Dialog.EmptyName.Message"));
        
                } else if (ComponentDialog.this.componentTypeWidgetList.getSelectionCount() == 0 ) {
                    MessageDialog.openInformation(Display.getDefault().getActiveShell(), 
                            I18nMessageService.getString ("Ui.ComponentWizardCommand.NoSelectedType.Label"), 
                            I18nMessageService.getString ("Ui.ComponentWizardCommand.NoSelectedType.Message"));
        
                } else  {
                    createNewComponent();
                }
            }
        
        });
        
        gridData = new GridData(GridData.CENTER, GridData.CENTER, false, false);
        gridData.horizontalSpan = 3;
        compositeRowButtons.setLayoutData(gridData);
        
        this.shell.pack();        
        this.shell.open();
        
        while (!this.shell.isDisposed()) {
            if (!display.readAndDispatch()) display.sleep();
        }
    }

    private void createNewComponent() {
        IModuleContext moduleContext = CPSwarmModule.getInstance().getModuleContext();
        IModelingSession modelingSession = moduleContext.getModelingSession();
        
        try (ITransaction transaction = modelingSession.createTransaction(Class.MNAME);){
        
            // Create Swarm Component
            Class swarmComponent = CPSwarmFactory.createSwarmComponent((Package) this.selectedElement, this.componentNameText.getText() , 
                    this.componentDescriptionText.getText(), 
                    SwarmComponentType.getSwarmComponentType(this.componentTypeWidgetList.getSelection()[0]));
        
        
            // Create Swarm Component Ports
            for( TableItem tableItem : this.listPortTable.getItems()) {
                CPSwarmFactory.createPort(swarmComponent, tableItem.getText(0), 
                        (DataType) ModelUtils.getElementByPath(tableItem.getText(1)), 
                        PortOrientation.getByName(tableItem.getText(2)));                                
            }
        
            // Create Swarm Component Behavior      
            if(this.behaviourCheckbox.getSelection()) {
        
                StateMachineDiagram behaviorDiagram = CPSwarmFactory.createBehaviorDiagram(swarmComponent, 
                        swarmComponent.getName() + " " + BEHAVIOR_NAME_EXTENSION, swarmComponent.getName() + " " + BEHAVIOR_DIAGRAM_NAME_EXTENSION);
        
                if(behaviorDiagram != null) {
        
                    IModelioServices modelioServices = moduleContext.getModelioServices();
                    IDiagramService diagramService = modelioServices.getDiagramService();
        
                    try(  IDiagramHandle diagramHandle = diagramService.getDiagramHandle(behaviorDiagram);){
                        IDiagramDG diagramGraphic = diagramHandle.getDiagramNode();
                        for (IStyleHandle style : diagramService.listStyles()){
                            if (style.getName().equals("CPSwarm"))
                                diagramGraphic.setStyle(style);
                        }            
        
                        // Create and unmask initial state
                        StateMachine stateMachine = (StateMachine) behaviorDiagram.getCompositionOwner();
                        InitialPseudoState initialState = CPSwarmFactory.createInitialState(stateMachine, INITIAL_STATE_DEFAULT_NAME);
                        State state = CPSwarmFactory.createState(stateMachine, STATE_DEFAULT_NAME);
                        FinalState finalState = CPSwarmFactory.createFinalState(stateMachine, FINAL_STATE_DEFAULT_NAME);
        
                        Transition transition1 = CPSwarmFactory.createTransition(initialState, state);
                        Transition transition2 = CPSwarmFactory.createTransition(state, finalState);
        
                        diagramHandle.unmask(initialState, DEFAULT_SPACING, DEFAULT_SPACING);
                        diagramHandle.unmask(state, 3 * DEFAULT_SPACING, DEFAULT_SPACING);
                        diagramHandle.unmask(finalState, 5 * DEFAULT_SPACING, DEFAULT_SPACING);
                        diagramHandle.unmask(transition1, 0, 0);
                        diagramHandle.unmask(transition2, 0, 0);
                        diagramHandle.save();
                        diagramHandle.close();
                        modelioServices.getEditionService().openEditor(behaviorDiagram);
                    }                                        
                }                
            }
        
            transaction.commit();
        }
        
        ComponentDialog.this.shell.close();
    }

    private void handleTableEditor() {
        this.listPortTableEditor = new TableEditor(this.listPortTable);
        this.listPortTableEditor.horizontalAlignment = SWT.LEFT;
        this.listPortTableEditor.grabHorizontal = true;
        this.listPortTableEditor.minimumWidth = 50;
        
        
        this.listPortTable.addListener(SWT.MouseDown, new Listener() {
            @Override
            public void handleEvent(Event event) {
        
        
                Control oldEditor = ComponentDialog.this.listPortTableEditor.getEditor();
                if (oldEditor != null) {
                    oldEditor.dispose();
                }
        
                Rectangle clientArea = ComponentDialog.this.listPortTable.getClientArea();
                Point clickPoint = new Point(event.x, event.y);
                int index = ComponentDialog.this.listPortTable.getTopIndex();
                while (index < ComponentDialog.this.listPortTable.getItemCount()) {
                    boolean visible = false;
                    final TableItem selectedTableItem = ComponentDialog.this.listPortTable.getItem(index);
                    for (int i = 0; i < ComponentDialog.this.listPortTable.getColumnCount(); i++) {
                        Rectangle selectionBounds = selectedTableItem.getBounds(i);
                        if (selectionBounds.contains(clickPoint)) {
        
                            final int selectedColumn = i;
                            if (selectedColumn == 0) {
        
                                // Role
                                Text roleText = new Text(ComponentDialog.this.listPortTable, SWT.NONE);
                                handleTextEdit(selectedTableItem, selectedColumn, roleText, selectionBounds);
        
                            } else if (selectedColumn == 2) {
                                List portDirectionList = new List(ComponentDialog.this.listPortTable,  SWT.BORDER  | SWT.V_SCROLL);
                                //portDirectionList.setBounds(selectionBounds.x, selectionBounds.y, selectionBounds.width, 100);
                                handleListEdit(selectedTableItem, selectedColumn, portDirectionList, selectionBounds);
        
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

    private void openChoosePortTypeDialog() {
        Display display = this.shell.getDisplay();
        
        Shell choosePortTypeDialog = new Shell(this.shell, SWT.DIALOG_TRIM | SWT.APPLICATION_MODAL);
        
        ;
        
        choosePortTypeDialog.setText(I18nMessageService.getString ("Ui.Command.ComponentWizardCommand.ChoosePortType.Label"));
        choosePortTypeDialog.setLocation(this.shell.getBounds().x + (this.shell.getBounds().width/4), this.shell.getBounds().y + (this.shell.getBounds().height/4));
        
        GridLayout gridLayout = new GridLayout(2, false);
        choosePortTypeDialog.setLayout(gridLayout);
        
        gridLayout.marginTop = DEFAULT_MARGIN/2;
        gridLayout.marginRight = DEFAULT_MARGIN;
        gridLayout.marginLeft = DEFAULT_MARGIN;
        gridLayout.marginBottom = DEFAULT_MARGIN/2;
        gridLayout.verticalSpacing = DEFAULT_MARGIN/2;
        
        
        GridData gridData; 
        
        
        
        
        
        
        // 
        Label label = new Label(choosePortTypeDialog, SWT.NULL);
        label.setText(I18nMessageService.getString ("Ui.Command.Dialog.ValueTypeList.Label"));
        gridData = new GridData(GridData.HORIZONTAL_ALIGN_FILL | GridData.VERTICAL_ALIGN_BEGINNING);
        //gridData.widthHint = 80;
        label.setLayoutData(gridData);
        
        List portTypesWidgetList =  new List (choosePortTypeDialog, SWT.BORDER | SWT.MULTI | SWT.V_SCROLL );
        gridData = new GridData(GridData.HORIZONTAL_ALIGN_FILL);
        gridData.heightHint = 200;
        portTypesWidgetList.setLayoutData(gridData);
        for (DataType valueType : this.allValueTypeList) {
            portTypesWidgetList.add(ModelUtils.getElementAbsolutePath(valueType));
        }
        portTypesWidgetList.setLayoutData(gridData);
        
        
        //  --> New Value Type Button
        Button newValueTypeButton = new Button(choosePortTypeDialog, SWT.PUSH);
        newValueTypeButton.setText(I18nMessageService.getString ("Ui.Button.NewValueType.Label"));
        gridData = new GridData(GridData.HORIZONTAL_ALIGN_END);
        //        gridData.widthHint = 100;
        gridData.minimumWidth = 100;
        gridData.horizontalSpan = 2;
        newValueTypeButton.setLayoutData(gridData);
        newValueTypeButton.addSelectionListener(new SelectionAdapter() {
        
            @Override
            public void widgetSelected(SelectionEvent e) {
                openCreateNewValueTypeDialog(choosePortTypeDialog, portTypesWidgetList);
            }
        });
        
        //  --> Add Port Type : Cancel Button
        Button chooseTypeDialogCancelButton = new Button(choosePortTypeDialog, SWT.PUSH);
        chooseTypeDialogCancelButton.setText(I18nMessageService.getString ("Ui.Button.Cancel.Label"));
        gridData = new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING);
        gridData.widthHint = 100;
        chooseTypeDialogCancelButton.setLayoutData(gridData);
        chooseTypeDialogCancelButton.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                choosePortTypeDialog.close();
            }
        });
        
        
        
        //  -->  Add Port Type : OK Button
        Button chooseTypeDialogCancelButtonn = new Button(choosePortTypeDialog, SWT.PUSH);
        chooseTypeDialogCancelButtonn.setText(I18nMessageService.getString ("Ui.Button.OK.Label"));
        gridData = new GridData(GridData.HORIZONTAL_ALIGN_END);
        gridData.widthHint = 100;
        chooseTypeDialogCancelButtonn.setLayoutData(gridData);
        chooseTypeDialogCancelButtonn.addSelectionListener(new SelectionAdapter() {
        
            @Override
            public void widgetSelected(SelectionEvent e) {
                if(portTypesWidgetList.getSelectionIndices().length == 0) {
                    MessageDialog.openInformation(Display.getDefault().getActiveShell(), 
                            I18nMessageService.getString ("Ui.Dialog.NoSelectedElement.Label"), 
                            I18nMessageService.getString ("Ui.Dialog.NoSelectedElement.Message"));
                } else  {        
                    for(int selectedTypeIndex : portTypesWidgetList.getSelectionIndices()) {
                        TableItem item = new TableItem(ComponentDialog.this.listPortTable, SWT.NULL);
                        item.setText(0, ComponentDialog.this.allValueTypeList.get(selectedTypeIndex).getName());
                        item.setText(1, ModelUtils.getElementAbsolutePath(ComponentDialog.this.allValueTypeList.get(selectedTypeIndex)));
                        item.setText(2, "In");
                    }
                    choosePortTypeDialog.close();
                }
            }
        
        });
        
        
        choosePortTypeDialog.pack();        
        choosePortTypeDialog.open();
        
        while (!choosePortTypeDialog.isDisposed()) {
            if (!display.readAndDispatch()) display.sleep();
        }
    }

    private void handleTextEdit(final TableItem selectedTableItem, final int selectedColumn, final Text text, Rectangle selectionBounds) {
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
        //        NewComponentDialog.this.listPortTableEditor.setEditor(text, selectedTableItem, selectedColumn);
        ComponentDialog.this.listPortTableEditor.setEditor(text);
        text.setBounds(selectionBounds.x, selectionBounds.y, selectionBounds.width, selectionBounds.height);
        
        text.setText(selectedTableItem.getText(selectedColumn));
        text.selectAll();
        text.setFocus();
    }

    private void handleListEdit(TableItem selectedTableItem, int selectedColumn, List portDirectionList, Rectangle selectionBounds) {
        Listener listListener = new Listener() {
            @Override
            public void handleEvent(final Event e) {
                switch (e.type) {
                case SWT.FocusOut:
                    if(portDirectionList.getSelectionCount() > 0) {
                        selectedTableItem.setText(selectedColumn, portDirectionList.getSelection()[0]);
                    }
                    portDirectionList.dispose();
                    break;
                case SWT.Traverse:
                    switch (e.detail) {
                    case SWT.TRAVERSE_RETURN:
                        if(portDirectionList.getSelectionCount() > 0) {
                            selectedTableItem.setText(selectedColumn, portDirectionList.getSelection()[0]);
                        }
                        // FALL THROUGH
                    case SWT.TRAVERSE_ESCAPE:
                        portDirectionList.dispose();
                        e.doit = false;
                    }
                    break;
                    //                case SWT.Selection:
                    //                    selectedTableItem.setText(selectedColumn, portDirectionList.getSelection()[0]);
                    //                    portDirectionList.dispose();
                    //                    break;
                case SWT.MouseDown:
                    if(portDirectionList.getSelectionCount() > 0) {
                        selectedTableItem.setText(selectedColumn, portDirectionList.getSelection()[0]);
                    }
                    portDirectionList.dispose();
                    break;
                }
            }
        };
        portDirectionList.addListener(SWT.FocusOut, listListener);
        portDirectionList.addListener(SWT.Traverse, listListener);
        portDirectionList.addListener(SWT.MouseDown, listListener);
        
        ComponentDialog.this.listPortTableEditor.setEditor(portDirectionList);
        
        portDirectionList.add(PortOrientation.IN.toString());
        portDirectionList.add(PortOrientation.OUT.toString());
        portDirectionList.add(PortOrientation.INOUT.toString());
        
        portDirectionList.setBounds(selectionBounds.x, selectionBounds.y, selectionBounds.width, 100);
        
        
        portDirectionList.select(0);
        portDirectionList.setFocus();
    }

    private void initializeValueTypeList() {
        this.allValueTypeList = new ArrayList<>();
        for(DataType dataType: CPSwarmModule.getInstance().getModuleContext().getModelingSession().findByClass(DataType.class)) {
            if(dataType.isStereotyped(SysMLPeerModule.MODULE_NAME, SysMLStereotypes.VALUETYPE) ) {
                this.allValueTypeList.add(dataType);
            }
        }
    }

    private void openCreateNewValueTypeDialog(Shell choosePortTypeDialog, List portTypesWidgetList) {
        Display display = choosePortTypeDialog.getDisplay();
        Shell createNewValueTypeDialog = new Shell(choosePortTypeDialog, SWT.DIALOG_TRIM | SWT.APPLICATION_MODAL);
        
        createNewValueTypeDialog.setText(I18nMessageService.getString ("Ui.Dialog.CreateNewValueType.Label"));
        createNewValueTypeDialog.setLocation(choosePortTypeDialog.getBounds().x + (choosePortTypeDialog.getBounds().width/4), 
                choosePortTypeDialog.getBounds().y + (choosePortTypeDialog.getBounds().height/4));
        
        
        GridLayout gridLayout = new GridLayout(2, false);
        createNewValueTypeDialog.setLayout(gridLayout);
        
        
        gridLayout.marginTop = DEFAULT_MARGIN/2;
        gridLayout.marginRight = DEFAULT_MARGIN;
        gridLayout.marginLeft = DEFAULT_MARGIN;
        gridLayout.marginBottom = DEFAULT_MARGIN/2;
        gridLayout.verticalSpacing = DEFAULT_MARGIN/2;
        
        GridData gridData; 
        
        
        
        Label label = new Label(createNewValueTypeDialog, SWT.NULL);
        label.setText(I18nMessageService.getString ("Ui.Dialog.ValueTypeName.Label"));
        gridData = new GridData(GridData.HORIZONTAL_ALIGN_FILL);
        gridData.widthHint = 140;
        label.setLayoutData(gridData);
        
        Text newValueNameText = new Text(createNewValueTypeDialog, SWT.SINGLE | SWT.BORDER);
        gridData = new GridData(GridData.HORIZONTAL_ALIGN_FILL);
        gridData.widthHint = 280;
        newValueNameText.setLayoutData(gridData);
        
        
        
        //  --> New ValueType : Cancel Button
        Button newValueTypeCancelButton = new Button(createNewValueTypeDialog, SWT.PUSH);
        newValueTypeCancelButton.setText(I18nMessageService.getString ("Ui.Button.Cancel.Label"));
        gridData = new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING);
        gridData.widthHint = 100;
        newValueTypeCancelButton.setLayoutData(gridData);
        newValueTypeCancelButton.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                createNewValueTypeDialog.close();
            }
        });
        
        
        //  -->  NewValueType : OK Button
        Button newValueTypeOKButtonn = new Button(createNewValueTypeDialog, SWT.PUSH);
        newValueTypeOKButtonn.setText(I18nMessageService.getString ("Ui.Button.OK.Label"));
        gridData = new GridData(GridData.HORIZONTAL_ALIGN_END);
        gridData.widthHint = 100;
        newValueTypeOKButtonn.setLayoutData(gridData);
        newValueTypeOKButtonn.addSelectionListener(new SelectionAdapter() {
        
            @Override
            public void widgetSelected(SelectionEvent e) {
                if(newValueNameText.getText().isEmpty()) {
                    MessageDialog.openInformation(Display.getDefault().getActiveShell(), 
                            I18nMessageService.getString ("Ui.Dialog.EmptyName.Label"), 
                            I18nMessageService.getString ("Ui.Dialog.EmptyName.Message"));
                } else  {        
        
                    IModuleContext moduleContext = CPSwarmModule.getInstance().getModuleContext();
                    IModelingSession modelingSession = moduleContext.getModelingSession();
        
                    try (ITransaction transaction = modelingSession.createTransaction(DataType.MNAME);){
        
        
                        CPSwarmFactory.createValueType((Package) ComponentDialog.this.selectedElement, newValueNameText.getText());
        
                        transaction.commit();
                    }
                    
                    initializeValueTypeList();
                    portTypesWidgetList.removeAll();
                    for (DataType valueType : ComponentDialog.this.allValueTypeList) {
                        portTypesWidgetList.add(ModelUtils.getElementAbsolutePath(valueType));
                    }
                    createNewValueTypeDialog.close();
        
                }
        
            }
        
        
        });
        
        
        createNewValueTypeDialog.pack();        
        createNewValueTypeDialog.open();
        
        while (!createNewValueTypeDialog.isDisposed()) {
            if (!display.readAndDispatch()) display.sleep();
        }
    }

}
