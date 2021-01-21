package fr.softeam.cameldesigner.handlers.propertypage.requirementproperties;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerAbstractProxy;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricContext;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricVariable;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.OptimisationRequirement;
import fr.softeam.cameldesigner.handlers.propertypage.coreproperties.NamedElementPropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("c3e9b4ba-ab8f-4f6d-9854-e4538c9a7b64")
public class OptimisationRequirementPropertyPage<T extends OptimisationRequirement> extends NamedElementPropertyPage<T> {
    @objid ("e0236b4a-e72f-488e-8d31-89143eb90ec2")
    private static List<ModelElement> _metricContexts;

    @objid ("8980fa76-e701-4a9b-b0c5-6a6f29b18777")
    private static List<ModelElement> _metricVariables;

    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("98b13921-4105-45c6-affa-78aeb0d8cd83")
    @Override
    public int changeProperty(int row, String value) {
        int currentRow = super.changeProperty(row, value);
        
        switch (currentRow) {
        
        case 1 :
            if (value.equals("")) {
                this.element.setMetricContext(null);
            }else {
                ModelElement metricContex = getModelElt(_metricContexts, value);
                if (MetricContext.canInstantiate(metricContex)) {
                    this.element.setMetricContext((MetricContext) CamelDesignerProxyFactory.instantiate(metricContex));
                }
            }
        
        case 2 :
            if (value.equals("")) {
                this.element.setMetricVariable(null);
            }else {
                ModelElement metricVariable = getModelElt(_metricVariables, value);
                if (MetricVariable.canInstantiate(metricVariable)) {
                    this.element.setMetricVariable((MetricVariable) CamelDesignerProxyFactory.instantiate(metricVariable));
                }
            }
        
        case 3 :
            Boolean minimise = Boolean.valueOf(value);
            this.element.setMinimise(minimise);
        }
        return currentRow - 3;
    }

    /**
     * This method handles the construction of the property table of a selected element
     * @param MObject : the selected element
     * 
     * @param table : the property table to fulfill
     */
    @objid ("b1a3c12c-6a16-47d2-b9a4-c7485ef9178a")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
        //MetricContext
        table.addProperty("Metric Context", getCamelName(this.element.getMetricContext()), getCamelNames(this._metricContexts));
        
        //MetricVariable
        table.addProperty("Metric Variable", getCamelName(this.element.getMetricVariable()), getCamelNames(this._metricVariables));
        
        //Mimimise
        table.addProperty("Minimise", this.element.isMinimise());
    }

    @objid ("6a58484f-f876-4481-af04-afc6fffcae84")
    public OptimisationRequirementPropertyPage(T elt) {
        super(elt);
        
        _metricContexts = CamelDesignerAbstractProxy.getMetricContexts();
        
        _metricVariables = MetricVariable.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
    }

}
