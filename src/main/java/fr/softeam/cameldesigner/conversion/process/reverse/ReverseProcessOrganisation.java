package fr.softeam.cameldesigner.conversion.process.reverse;

import java.util.Map;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.MeasurableAttribute;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricContext;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricTemplate;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.Organisation;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.PlatformCredentials;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.User;
import fr.softeam.cameldesigner.api.typemodel.standard.datatype.ValueType;
import fr.softeam.cameldesigner.api.unitmodel.standard.datatype.Unit;
import org.eclipse.emf.cdo.CDOObject;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("d30338e3-97a0-4bb1-9b5d-ea1f13e706f9")
public class ReverseProcessOrganisation extends AbstractReverseProcess {
    @objid ("1b7a5272-f603-47b4-a74a-71612929579e")
    public ReverseProcessOrganisation(ModelElement umlElementParent, Map<CDOObject, CamelElement> processedCamelElements) {
        super(umlElementParent, processedCamelElements);
    }

    @objid ("5a5c56fc-aa09-4d25-9d6d-8ce39e571249")
    @Override
    protected CamelElement switchReverse(CDOObject element) {
        if(element instanceof camel.organisation.Organisation) {
            return reverse ((camel.organisation.Organisation)element);
        }
        else if (element instanceof camel.organisation.User) {
            return reverse ((camel.organisation.User)element);            
        } 
        //        else if (element instanceof camel.organisation.PlatformCredentials) {
        //            return reverse ((camel.organisation.PlatformCredentials)element);            
        //        }
        return null;
    }

//    private CamelElement reverse(camel.organisation.PlatformCredentials element) {
//        PlatformCredentials platformCredentials = PlatformCredentials.create();
//        platformCredentials.setPassword(element.getPassword());
//        return platformCredentials;
//    }
    @objid ("243ed4f9-2168-4879-9fe5-b9cfb5cc01b9")
    private CamelElement reverse(camel.organisation.User element) {
        User user = User.create();
        
        if(element.getFirstName() != null) {
            user.setFirstName(element.getFirstName());
        }
        
        if(element.getLastName() != null) {
            user.setLastName(element.getLastName());
        }
        
        if(element.getEmail() != null) {
            user.setEmail(element.getEmail());
        }
        
        if(element.getPlatformCredentials() != null) {
            //PlatformCredentials platformCredentials = retrieveReferencedPlatformCredentials(element.getPlatformCredentials());
            user.setPlatformCredentialName(element.getPlatformCredentials().getName());
            user.setPlatformCredentialPassword(element.getPlatformCredentials().getPassword());
        }
        return user;
    }

//    private PlatformCredentials retrieveReferencedPlatformCredentials(camel.organisation.PlatformCredentials platformCredentials) {
//        PlatformCredentials referencedPlatformCredentials = null;
//        if(this.processedCamelElements.containsKey(platformCredentials)) {
//            referencedPlatformCredentials = (PlatformCredentials) this.processedCamelElements.get(platformCredentials);
//        } else {
//            referencedPlatformCredentials = this.switchReverse(platformCredentials);
//
//            return null;
//        }
//
//    }
    @objid ("07383228-b50d-43ef-9be7-2789e1258396")
    private CamelElement reverse(camel.organisation.Organisation element) {
        Organisation organisation = Organisation.create();
        
        if(organisation.getEmail() != null) {
            organisation.setEmail(organisation.getEmail());
        }
        
        if(organisation.getWww() != null) {
            organisation.setWww(element.getWww());
        }
        return organisation;
    }

}
