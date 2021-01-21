package fr.softeam.cameldesigner.conversion.process.reverse;

import java.util.Map;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.LogicalConstraint;
import fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.MetricConstraint;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricContext;
import org.eclipse.emf.cdo.CDOObject;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("fbb40d5f-4d55-4ca5-8749-d9c38003bf08")
public class ReverseProcessConstraint extends AbstractReverseProcess {
    @objid ("871cccb1-747e-49e2-a3bf-0a6d1fd45004")
    public ReverseProcessConstraint(ModelElement umlElementParent, Map<CDOObject, CamelElement> processedCamelElements) {
        super(umlElementParent, processedCamelElements);
    }

    @objid ("d1557ca4-c63d-496a-bb05-43db16442605")
    @Override
    protected CamelElement switchReverse(CDOObject element) {
        //        if(element instanceof camel.constraint.MetricConstraint) {
        //            return reverse ((camel.constraint.MetricConstraint)element);
        //        } else if (element instanceof camel.constraint.MetricConstraint) {
        //            return reverse ((camel.constraint.LogicalConstraint)element);
        //        }
        return null;
    }

    @objid ("6ea8b43b-51ac-473d-835e-e54138907cb1")
    private CamelElement reverse(camel.constraint.LogicalConstraint element) {
        LogicalConstraint logicalConstraintProxy = LogicalConstraint.create();
        
        logicalConstraintProxy.setLogicalOperator(element.getLogicalOperator().toString());
        
        // TODO
        //        for(camel.constraint.Constraint constraint : element.getConstraints()) {
        //            Constraint referencedConstraint = retrieveReferencedConstraint(constraint));
        //            if(referencedConstraint != null) {
        //                logicalConstraintProxy.getConstraints.add(referencedConstraint);
        //            }
        //        }
        return logicalConstraintProxy;
    }

    @objid ("4413f172-50af-4c54-8cee-a0e935079e39")
    private CamelElement reverse(camel.constraint.MetricConstraint element) {
        MetricConstraint metricConstraintProxy = MetricConstraint.create();
        //TODO
        //        if(element.getMetricContext() != null) {
        //            MetricContext referencedMetricContext = retrieveReferencedMetricContext(element.getMetricContext());
        //            if(referencedMetricContext != null) {
        //                metricConstraintProxy.setMetricContext(referencedMetricContext);
        //            }
        //        }
        
        metricConstraintProxy.setComparisonOperator(element.getComparisonOperator().toString());
        metricConstraintProxy.setThreshold(Double.toString(element.getThreshold()));
        return metricConstraintProxy;
    }

    @objid ("bd9ac50c-efff-42d8-857d-253a1b942600")
    private MetricContext retrieveReferencedMetricContext(camel.metric.MetricContext metricContext) {
        MetricContext referencedMetricContext = null;
        if(this.processedCamelElements.containsKey(metricContext)) {
            referencedMetricContext = (MetricContext) this.processedCamelElements.get(metricContext);
        } else {
            referencedMetricContext = (MetricContext) (new ReverseProcessMetricType(null, this.processedCamelElements)).switchReverse(metricContext);
            if(referencedMetricContext != null) {
                referencedMetricContext.getElement().setName(metricContext.getName());
                this.processedCamelElements.put(metricContext, referencedMetricContext);
            }
        }
        return referencedMetricContext;
    }

}
