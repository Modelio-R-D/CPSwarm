/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.00

 * This file was generated on 12/10/20 11:37 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.Feature;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.CamelComponent;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.port.CommunicationPort;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.port.HostingPort;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Instance} with << ComponentInstance >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("5558f77d-42a8-4e10-8393-56d67ba21511")
public abstract class ComponentInstance extends Feature {
    @objid ("09491ca9-1ba6-4819-932c-2e8cc7098d45")
    public static final String STEREOTYPE_NAME = "ComponentInstance";

    @objid ("cbcbe9e2-e6d9-47c9-8190-30d79f89c6c7")
    public static final String DESTROYEDON_TAGTYPE = "destroyedOn";

    @objid ("e610a6c8-5190-4240-a5f9-1b9ff6bd3df1")
    public static final String INSTANTIATEDON_TAGTYPE = "instantiatedOn";

    /**
     * Add a value to the 'providedCommunicationInstances' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("f90176cb-4308-4aad-b077-0e77fe048d6d")
    public void addProvidedCommunicationInstances(final CommunicationPort obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), ComponentInstance.MdaTypes.MDAASSOCDEP);
            d.setName("providedCommunicationInstances");
            d.putTagValue(ComponentInstance.MdaTypes.MDAASSOCDEP_ROLE, "providedCommunicationInstances");
        }
    }

    /**
     * Add a value to the 'providedHostInstances' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("fca31031-9abf-4efe-af5b-538a6167fa12")
    public void addProvidedHostInstances(final HostingPort obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), ComponentInstance.MdaTypes.MDAASSOCDEP);
            d.setName("providedHostInstances");
            d.putTagValue(ComponentInstance.MdaTypes.MDAASSOCDEP_ROLE, "providedHostInstances");
        }
    }

    @objid ("7e298b70-59f6-4ccd-ba57-d2c3656a7e73")
    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        ComponentInstance other = (ComponentInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for string property 'destroyedOn'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("1c567b93-b7b9-4b69-a64b-f781fe15aa01")
    public String getDestroyedOn() {
        return this.elt.getTagValue(ComponentInstance.MdaTypes.DESTROYEDON_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("1acfd333-fbcf-4877-a731-4030ccbdb8f1")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Getter for string property 'instantiatedOn'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("dbdb1387-2b78-48c9-a073-e5338f726a6d")
    public String getInstantiatedOn() {
        return this.elt.getTagValue(ComponentInstance.MdaTypes.INSTANTIATEDON_TAGTYPE_ELT);
    }

    /**
     * Get the values of the 'providedCommunicationInstances' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("5c8ab471-7587-4705-b988-ba097ce7dba4")
    public List<CommunicationPort> getProvidedCommunicationInstances() {
        List<CommunicationPort> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(ComponentInstance.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(ComponentInstance.MdaTypes.MDAASSOCDEP_ROLE), "providedCommunicationInstances")
              && CommunicationPort.canInstantiate(d.getDependsOn()))
                results.add((CommunicationPort)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), CommunicationPort.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'providedHostInstances' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("4232c2af-a29d-4a0a-aff5-2d80acb45eed")
    public List<HostingPort> getProvidedHostInstances() {
        List<HostingPort> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(ComponentInstance.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(ComponentInstance.MdaTypes.MDAASSOCDEP_ROLE), "providedHostInstances")
              && HostingPort.canInstantiate(d.getDependsOn()))
                results.add((HostingPort)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), HostingPort.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the value to the 'type' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("9ae870dd-3c89-4394-ba8d-a0fe9e97b2df")
    public CamelComponent getType() {
        return (CamelComponent)CamelDesignerProxyFactory.instantiate(((Instance) this.elt).getBase(), CamelComponent.STEREOTYPE_NAME);
    }

    @objid ("57a88ab5-297c-4dc6-88f4-03e8a1f52982")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'providedCommunicationInstances' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("f1f449cf-879d-4c8f-b53c-8eb1ab4ea8a9")
    public boolean removeProvidedCommunicationInstances(final CommunicationPort obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(ComponentInstance.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(ComponentInstance.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    /**
     * Remove a value from the 'providedHostInstances' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("0d575d50-24e9-40b2-88bf-91dc8c1b9efb")
    public boolean removeProvidedHostInstances(final HostingPort obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(ComponentInstance.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(ComponentInstance.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    /**
     * Setter for string property 'destroyedOn'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("f0ebd240-898b-4b35-a0a4-8e4581286b09")
    public void setDestroyedOn(final String value) {
        this.elt.putTagValue(ComponentInstance.MdaTypes.DESTROYEDON_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'instantiatedOn'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("fdc6b4ad-f482-4c6e-bd67-d6a3d9eb5b6e")
    public void setInstantiatedOn(final String value) {
        this.elt.putTagValue(ComponentInstance.MdaTypes.INSTANTIATEDON_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'type' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("acebda11-5e1b-41e3-b518-a053e092d4ac")
    public void setType(final CamelComponent obj) {
        ((Instance) this.elt).setBase((obj != null) ? obj.getElement() : null);
    }

    @objid ("b22dc77e-3988-41c6-a6fa-8d0ee9f12f26")
    protected ComponentInstance(final Instance elt) {
        super(elt);
    }

    @objid ("410e6123-df3d-46bd-81d2-a929ad0d6a01")
    public static final class MdaTypes {
        @objid ("9a024c7d-061a-44b1-9584-5d8c6536b113")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("28a307a9-53da-460b-8377-e71ca3b220c0")
        public static TagType INSTANTIATEDON_TAGTYPE_ELT;

        @objid ("6e1fd417-df9c-4056-9657-5b51830f1fe6")
        public static TagType DESTROYEDON_TAGTYPE_ELT;

        @objid ("db5f94da-a874-4698-b29e-c3237a542930")
        private static Stereotype MDAASSOCDEP;

        @objid ("94f158e6-a33a-44ae-8685-4dc3c17cd170")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b166ba8c-74ab-4ae8-861b-ac1682e4c8a1")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "aba476b3-2629-42d6-9138-1bf866332333");
            INSTANTIATEDON_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "e6ac56dd-6986-41e3-944d-c5fad2bd2b84");
            DESTROYEDON_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "fb31df1a-95e1-40e6-aea3-f1c4fc314882");
            MDAASSOCDEP = ctx.getModelingSession().findElementById(Stereotype.class, "94b7efa5-f94c-4d1d-896f-f103e56a8e2e");
            MDAASSOCDEP_ROLE = ctx.getModelingSession().findElementById(TagType.class, "7637f2fd-b750-43c1-a15c-5d0b084ca1cd");
        }


	static {
		if(CamelDesignerModule.getInstance() != null) {
			init(CamelDesignerModule.getInstance().getModuleContext());
		}
	}
    }

}
