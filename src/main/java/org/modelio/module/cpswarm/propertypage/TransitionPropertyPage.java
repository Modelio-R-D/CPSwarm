/**
 * Java Class : TransitionPropertyPage.java
 **/
package org.modelio.module.cpswarm.propertypage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Event;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Signal;
import org.modelio.metamodel.uml.behavior.stateMachineModel.Transition;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.cpswarm.impl.CPSwarmModule;

/**
 * This class handles the properties of TRansition metaclasse
 * @author ebrosse
 */
public class TransitionPropertyPage implements IPropertyContent {
    private static Collection<Event> _events = null;

    private static Collection<Signal> _signals = null;

    private static Signal _sigModel = null;

    /**
     * Constructor TransitionPropertyPage
     * @author ebrosse
     */
    public TransitionPropertyPage() {
    }

    @Override
    public void update(ModelElement element, IModulePropertyTable table) {
        //Events
        _events = CPSwarmModule.getInstance().getModuleContext().getModelingSession().findByClass(Event.class);  
        List<String> opNames = new ArrayList<>();
        for (Event op : _events) {
            opNames.add(op.getCompositionOwner().getName() + "::" + op.getName());
        }
        
        String value = "";
        if (element instanceof Transition) {
            Transition tran = (Transition) element;
            Event process = tran.getTrigger();
            if (process != null) {
                value = process.getName();
            }
        }
        String[] result = opNames.toArray(new String[opNames.size()]);
        table.addProperty("Event", value, result);
        
        //Signals
        _signals = CPSwarmModule.getInstance().getModuleContext().getModelingSession().findByClass(Signal.class);  
        List<String> sigNames = new ArrayList<>();
        for (Signal sig : _signals) {
            sigNames.add(sig.getCompositionOwner().getName() + "::" + sig.getName());
        }
        
        String sigvalue = "";
        if (element instanceof Transition) {
            Transition tran = (Transition) element;
            Event process = tran.getTrigger();
            if (process != null) {
                _sigModel = process.getModel();
                if (_sigModel != null) {
                    sigvalue = _sigModel.getName();
                }
            }
        }
        String[] sigresult = sigNames.toArray(new String[sigNames.size()]);
        table.addProperty("Signal", sigvalue, sigresult);
        
        //SignalProperties
        if (_sigModel != null) {
            for (Attribute att : _sigModel.getOwnedAttribute()) {
                table.addProperty(_sigModel.getName() + "." + att.getName(), att.getValue());
            }
        }
    }

    @Override
    public int changeProperty(ModelElement element, int row, String value) {
        if (row == 1) {
            for (Event op : _events) {
                if (value.equals(op.getCompositionOwner().getName() + "::" + op.getName())) {
                    ((Transition) element).setTrigger(op);
                    break;
                }
            }
        }else  if (row == 2) {
            for (Signal sig : _signals) {
                if (value.equals(sig.getCompositionOwner().getName() + "::" + sig.getName())) {
                    ((Transition) element).getTrigger().setModel(sig);
                    break;
                }
            }
        }else {
            Attribute att = _sigModel.getOwnedAttribute().get(row);
            att.setValue(value);
        }
        return 3;
    }

}
