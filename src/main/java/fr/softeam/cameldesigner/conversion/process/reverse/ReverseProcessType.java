package fr.softeam.cameldesigner.conversion.process.reverse;

import java.util.Map;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.typemodel.standard.datatype.BooleanValueType;
import fr.softeam.cameldesigner.api.typemodel.standard.datatype.List;
import fr.softeam.cameldesigner.api.typemodel.standard.datatype.Range;
import fr.softeam.cameldesigner.api.typemodel.standard.datatype.RangeUnion;
import fr.softeam.cameldesigner.api.typemodel.standard.datatype.StringValueType;
import fr.softeam.cameldesigner.api.typemodel.standard.datatype.ValueType;
import org.eclipse.emf.cdo.CDOObject;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("00a43af2-5509-4f36-a3ce-1f5cdf80c7cb")
public class ReverseProcessType extends AbstractReverseProcess {
    @objid ("6e8487da-305e-4225-b10d-e837117cff7b")
    public ReverseProcessType(ModelElement umlElementParent, Map<CDOObject, CamelElement> processedCamelElements) {
        super(umlElementParent, processedCamelElements);
    }

    @objid ("6c9c4856-e729-423e-8d8e-9156213af19d")
    @Override
    protected CamelElement switchReverse(CDOObject element) {
        if(element instanceof camel.type.ValueType) {
            return reverse ((camel.type.ValueType)element);
        } else if (element instanceof camel.type.Value) {
            return reverse ((camel.type.Value)element);
        }
        return null;
    }

    @objid ("68d786d3-b90b-424d-b963-96da79c83ded")
    private CamelElement reverse(camel.type.Value element) {
        // TODO
        return null;
    }

    @objid ("99cbffec-5323-4c89-b78a-5166a9f31e53")
    private CamelElement reverse(camel.type.ValueType element) {
        ValueType valueTypeProxy = null;
        
        if(element instanceof camel.type.BooleanValueType) {
            valueTypeProxy = BooleanValueType.create();
        
        } else if(element instanceof camel.type.List) {
            valueTypeProxy = List.create();
        
        } else if(element instanceof camel.type.Range) {
            valueTypeProxy = Range.create();
        
        } else if(element instanceof camel.type.RangeUnion) {
            valueTypeProxy = RangeUnion.create();
        
        } else if(element instanceof camel.type.StringValueType) {
            valueTypeProxy = StringValueType.create();
        }
        
        if(valueTypeProxy != null && element.getPrimitiveType() != null) {
            valueTypeProxy.setPrimitiveType(element.getPrimitiveType().toString());
        }
        return valueTypeProxy;
    }

}
