package fr.softeam.cameldesigner.conversion.process.reverse;

import java.util.Map;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricContext;
import fr.softeam.cameldesigner.api.unitmodel.standard.datatype.SingleUnit;
import fr.softeam.cameldesigner.api.unitmodel.standard.datatype.UnitDimension;
import org.eclipse.emf.cdo.CDOObject;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("d73f925e-7cd0-4eb4-b89c-283c47824dff")
public class ReverseProcessUnit extends AbstractReverseProcess {
    @objid ("794307ee-c5bc-479e-a251-993d2c7401b3")
    public ReverseProcessUnit(ModelElement umlElementParent, Map<CDOObject, CamelElement> processedCamelElements) {
        super(umlElementParent, processedCamelElements);
        // TODO Auto-generated constructor stub
    }

    @objid ("89a4ff1d-6f4c-4ce2-94ac-f3951e178bbc")
    @Override
    protected CamelElement switchReverse(CDOObject element) {
        if(element instanceof camel.unit.CompositeUnit) {
            return reverse ((camel.unit.CompositeUnit)element);
        } else if(element instanceof camel.unit.SingleUnit) {
            return reverse ((camel.unit.SingleUnit)element);
        } else if(element instanceof camel.unit.Dimensionless) {
            return reverse ((camel.unit.Dimensionless)element);
        } else if(element instanceof camel.unit.CompositeUnit) {
            return reverse ((camel.unit.CompositeUnit)element);
        } else if(element instanceof camel.unit.UnitDimension) {
            return reverse ((camel.unit.UnitDimension)element);
        }
        return null;
    }

    @objid ("19e80f6b-9e7e-4eb6-a75c-9179bf85d959")
    private CamelElement reverse(camel.unit.Dimensionless element) {
        // TODO Auto-generated method stub
        return null;
    }

    @objid ("377b7ae8-a454-46e6-82dc-966dcc8dbb69")
    private CamelElement reverse(camel.unit.SingleUnit element) {
        SingleUnit singleUnit = SingleUnit.create();
        if(element.getDimension() != null) {
            UnitDimension  referencedDimension = retrieveReferencedDimension(element.getDimension());
            if(referencedDimension != null) {
                singleUnit.setDimension(referencedDimension);
            }
        }
        return singleUnit;
    }

    @objid ("743e0e04-e6e5-4bad-b958-b0163c5463ef")
    private CamelElement reverse(camel.unit.UnitDimension element) {
        UnitDimension unitDimension = UnitDimension.create();
        return unitDimension;
    }

    @objid ("a98635ce-1392-44a3-b051-6dbb12359eec")
    private CamelElement reverse(camel.unit.CompositeUnit element) {
        // TODO Auto-generated method stub
        return null;
    }

    @objid ("5da86f2d-0d1e-4c8d-880d-1e83a8f4a956")
    private UnitDimension retrieveReferencedDimension(camel.unit.UnitDimension dimension) {
        UnitDimension referencedUnitDimension = null;
        if(this.processedCamelElements.containsKey(dimension)) {
            referencedUnitDimension = (UnitDimension) this.processedCamelElements.get(dimension);
        } else {
            referencedUnitDimension = (UnitDimension) (new ReverseProcessMetricType(null, this.processedCamelElements)).switchReverse(dimension);
            if(referencedUnitDimension != null) {
                referencedUnitDimension.getElement().setName(dimension.getName());
                this.processedCamelElements.put(dimension, referencedUnitDimension);
            }
        }
        return referencedUnitDimension;
    }

}
