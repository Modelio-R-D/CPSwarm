package fr.softeam.cameldesigner.api;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.locationmodel.standard.enumeration.CloudLocation;
import fr.softeam.cameldesigner.api.locationmodel.standard.enumeration.GeographicalRegion;
import fr.softeam.cameldesigner.api.metadatamodel.standard.attribute.MmsProperty;
import fr.softeam.cameldesigner.api.metadatamodel.standard.attributelink.MmsPropertyInstance;
import fr.softeam.cameldesigner.api.metadatamodel.standard.class_.MmsConcept;
import fr.softeam.cameldesigner.api.metadatamodel.standard.instance.MmsConceptInstance;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.CompositeMetricContext;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.RawMetricContext;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("c3658e2d-fc5c-464d-b712-717d91e8711f")
public class CamelDesignerAbstractProxy {
    @objid ("a44464ad-cc45-40a0-8e17-0b7cccaa0f04")
    public static List<CamelElement> getCamelElements() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

    @objid ("a1aa9003-620d-4567-95d4-790575c68bc7")
    public static List<ModelElement> getMetricContexts() {
        List<ModelElement> result = new ArrayList<>();
        
        //Composite Metric Context
        result.addAll(CompositeMetricContext.MdaTypes.STEREOTYPE_ELT.getExtendedElement()) ;
        
        //Raw Metric Context
        result.addAll(RawMetricContext.MdaTypes.STEREOTYPE_ELT.getExtendedElement());
        return result;
    }

    @objid ("80c2fd20-12c7-456e-b3e0-44dfd861d5fd")
    public static List<ModelElement> getMMSObject() {
        List<ModelElement> result = new ArrayList<>();
        
        //MmsConcept
        result.addAll(MmsConcept.MdaTypes.STEREOTYPE_ELT.getExtendedElement());
        
        //MmsConcept
        result.addAll(MmsConceptInstance.MdaTypes.STEREOTYPE_ELT.getExtendedElement());
        
        //MmsConcept
        result.addAll(MmsProperty.MdaTypes.STEREOTYPE_ELT.getExtendedElement());
        
        //MmsConcept
        result.addAll(MmsPropertyInstance.MdaTypes.STEREOTYPE_ELT.getExtendedElement());
        return result;
    }

    @objid ("9c3a6b73-9dbd-4f40-b9b5-fa54a8eb2c65")
    public static Boolean isLocation(ModelElement elt) {
        //CloudLocation
        if (elt.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CloudLocation.STEREOTYPE_NAME)) {
            return true;
        }
        
        //GeographicalRegion
        if (elt.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, GeographicalRegion.STEREOTYPE_NAME)) {
            return true;
        }
        return false;
    }

}
