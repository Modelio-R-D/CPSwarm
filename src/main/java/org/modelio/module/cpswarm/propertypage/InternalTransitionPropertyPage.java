/**
 * Java Class : TransitionPropertyPage.java
 **/
package org.modelio.module.cpswarm.propertypage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.behavior.stateMachineModel.InternalTransition;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.module.cpswarm.impl.CPSwarmModule;

/**
 * This class handles the properties of Internal Transition metaclass
 * @author ebrosse
 */
public class InternalTransitionPropertyPage implements IPropertyContent {
    private static Collection<Operation> _ops = null;

    /**
     * Constructor Internal TransitionPropertyPage
     * @author ebrosse
     */
    public InternalTransitionPropertyPage() {
    }

    @Override
    public void update(ModelElement element, IModulePropertyTable table) {
        //Operations
        _ops = CPSwarmModule.getInstance().getModuleContext().getModelingSession().findByClass(Operation.class);
        List<String> opNames = new ArrayList<>();
        for (Operation op : _ops) {
            opNames.add(op.getCompositionOwner().getName() + "::" + op.getName());
        }
        
        String value = "";
        if (element instanceof InternalTransition) {
            InternalTransition tran = (InternalTransition) element;
            Operation process = tran.getProcessed();
            if (process != null) {
                value = process.getName();
            }
        }
        String[] result = opNames.toArray(new String[opNames.size()]);
        table.addProperty("Function", value, result);
    }

    @Override
    public int changeProperty(ModelElement element, int row, String value) {
        if (row == 1) {
            for (Operation op : _ops) {
                if (value.equals(op.getCompositionOwner().getName() + "::" + op.getName())) {
                    ((InternalTransition) element).setProcessed(op);
                    break;
                }
            }
        }
        return 1;
    }

}
