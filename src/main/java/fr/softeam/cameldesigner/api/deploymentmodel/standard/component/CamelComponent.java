/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.00

 * This file was generated on 12/10/20 11:37 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.deploymentmodel.standard.component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.Feature;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.Configuration;
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
import org.modelio.metamodel.uml.statik.Component;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Component} with << CamelComponent >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("a91a167f-9c29-4c56-bc2c-ba8458b6d7fa")
public abstract class CamelComponent extends Feature {
    @objid ("dbcb286a-b923-42d7-90e1-a20d78cd79f0")
    public static final String STEREOTYPE_NAME = "CamelComponent";

    /**
     * Add a value to the 'configurations' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("88f38558-1f7d-483f-b008-36fdc8b3d7eb")
    public void addConfigurations(final Configuration obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), CamelComponent.MdaTypes.MDAASSOCDEP);
            d.setName("configurations");
            d.putTagValue(CamelComponent.MdaTypes.MDAASSOCDEP_ROLE, "configurations");
        }
    }

    /**
     * Add a value to the 'providedCommunications' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("c668e9ac-9b4f-4e79-9bd1-b822fe30ee0f")
    public void addProvidedCommunications(final CommunicationPort obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), CamelComponent.MdaTypes.MDAASSOCDEP);
            d.setName("providedCommunications");
            d.putTagValue(CamelComponent.MdaTypes.MDAASSOCDEP_ROLE, "providedCommunications");
        }
    }

    /**
     * Add a value to the 'providedHosts' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("427c4586-012c-4903-9fc0-e4a8370c72cc")
    public void addProvidedHosts(final HostingPort obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), CamelComponent.MdaTypes.MDAASSOCDEP);
            d.setName("providedHosts");
            d.putTagValue(CamelComponent.MdaTypes.MDAASSOCDEP_ROLE, "providedHosts");
        }
    }

    @objid ("b8c4435f-b0a6-4a91-ba02-1fe7c622ccea")
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
        CamelComponent other = (CamelComponent) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the values of the 'configurations' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("d19253cb-f2b4-43e5-85c9-21b37edd3a2c")
    public List<Configuration> getConfigurations() {
        List<Configuration> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(CamelComponent.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(CamelComponent.MdaTypes.MDAASSOCDEP_ROLE), "configurations")
              && Configuration.canInstantiate(d.getDependsOn()))
                results.add((Configuration)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Configuration.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the underlying {@link Component}. 
     * @return the Component represented by this proxy, never null.
     */
    @objid ("9ae9ed7f-8555-4317-a6b7-fdc4f8ff87ee")
    @Override
    public Component getElement() {
        return (Component)super.getElement();
    }

    /**
     * Get the values of the 'providedCommunications' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("628c7c70-7b1e-40a9-a347-27dfe6c67cf8")
    public List<CommunicationPort> getProvidedCommunications() {
        List<CommunicationPort> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(CamelComponent.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(CamelComponent.MdaTypes.MDAASSOCDEP_ROLE), "providedCommunications")
              && CommunicationPort.canInstantiate(d.getDependsOn()))
                results.add((CommunicationPort)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), CommunicationPort.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'providedHosts' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("a4cc2233-e4b7-44b6-9775-a57c0b420ddf")
    public List<HostingPort> getProvidedHosts() {
        List<HostingPort> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(CamelComponent.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(CamelComponent.MdaTypes.MDAASSOCDEP_ROLE), "providedHosts")
              && HostingPort.canInstantiate(d.getDependsOn()))
                results.add((HostingPort)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), HostingPort.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("fd2b3aff-fbe7-44aa-a1f0-d65b192b3d98")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'configurations' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("5637e663-b426-49c5-8163-c34899f0b04c")
    public boolean removeConfigurations(final Configuration obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(CamelComponent.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(CamelComponent.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    /**
     * Remove a value from the 'providedCommunications' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("a0da00f5-dc76-45d5-a9a6-d92ca6f9bc1b")
    public boolean removeProvidedCommunications(final CommunicationPort obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(CamelComponent.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(CamelComponent.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    /**
     * Remove a value from the 'providedHosts' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("054ad3c1-9d1f-440a-91b2-22e980c55877")
    public boolean removeProvidedHosts(final HostingPort obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(CamelComponent.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(CamelComponent.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    @objid ("a1a43dcc-1149-49a1-948a-0557a96630e5")
    protected CamelComponent(final Component elt) {
        super(elt);
    }

    @objid ("b119b6ad-b4ac-465e-9b4b-68e0a2014905")
    public static final class MdaTypes {
        @objid ("e9464bc5-0594-45b3-97c9-d45a4840fde1")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("8917af9c-cab9-4e5a-b3ba-d83f4c848339")
        private static Stereotype MDAASSOCDEP;

        @objid ("1bd82f01-fb71-4862-8aa9-a6374a4eca03")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("9c923f70-79ea-420d-ae35-69c4a200bba0")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "abb7159a-fde4-40d9-8e5e-8f9ad94f2b31");
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
