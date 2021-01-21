/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.00

 * This file was generated on 12/10/20 11:37 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.standard.attribute.AttributeAttribute;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.BuildConfiguration;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.EventConfiguration;
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
import org.modelio.metamodel.uml.statik.Artifact;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Artifact} with << ServerlessConfiguration >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("db495a2b-edb1-4bc6-b8dc-73585d54cb3e")
public class ServerlessConfiguration extends Configuration {
    @objid ("5017788f-15e9-4502-8cb5-41b314cb5b43")
    public static final String STEREOTYPE_NAME = "ServerlessConfiguration";

    @objid ("e53d8f3c-48e6-40f9-8a31-115e133f7cec")
    public static final String BINARYCODEURL_TAGTYPE = "binaryCodeURL";

    @objid ("a4882fd1-d3a0-4f8f-adfe-26d73edf9030")
    public static final String CONTINUOUSDEPLOYMENT_TAGTYPE = "continuousDeployment";

    /**
     * Tells whether a {@link ServerlessConfiguration proxy} can be instantiated from a {@link MObject} checking it is a {@link Artifact} stereotyped << ServerlessConfiguration >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("579b5e06-78e0-4b0b-9943-962b079671d9")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Artifact) && ((Artifact) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ServerlessConfiguration.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Artifact} stereotyped << ServerlessConfiguration >> then instantiate a {@link ServerlessConfiguration} proxy.
     * 
     * @return a {@link ServerlessConfiguration} proxy on the created {@link Artifact}.
     */
    @objid ("9c4a29ec-83d6-4341-967a-d3445a831ca9")
    public static ServerlessConfiguration create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Artifact");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, ServerlessConfiguration.STEREOTYPE_NAME);
        return ServerlessConfiguration.instantiate((Artifact)e);
    }

    /**
     * Tries to instantiate a {@link ServerlessConfiguration} proxy from a {@link Artifact} stereotyped << ServerlessConfiguration >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Artifact
     * @return a {@link ServerlessConfiguration} proxy or <i>null</i>.
     */
    @objid ("f09149a9-3dab-42f4-96dc-1ddd28061f47")
    public static ServerlessConfiguration instantiate(final Artifact obj) {
        return ServerlessConfiguration.canInstantiate(obj) ? new ServerlessConfiguration(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ServerlessConfiguration} proxy from a {@link Artifact} stereotyped << ServerlessConfiguration >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Artifact}
     * @return a {@link ServerlessConfiguration} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("030950c9-6a5b-45c3-b960-5f224b04b7ab")
    public static ServerlessConfiguration safeInstantiate(final Artifact obj) throws IllegalArgumentException {
        if (ServerlessConfiguration.canInstantiate(obj))
        	return new ServerlessConfiguration(obj);
        else
        	throw new IllegalArgumentException("ServerlessConfiguration: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'environmentConfigParams' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("e2649a7f-e0fe-4952-8157-6bb93d6dd130")
    public void addEnvironmentConfigParams(final AttributeAttribute obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), ServerlessConfiguration.MdaTypes.MDAASSOCDEP);
            d.setName("environmentConfigParams");
            d.putTagValue(ServerlessConfiguration.MdaTypes.MDAASSOCDEP_ROLE, "environmentConfigParams");
        }
    }

    @objid ("29126cdb-296a-4aac-8a97-57956e99ccf2")
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
        ServerlessConfiguration other = (ServerlessConfiguration) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for string property 'binaryCodeURL'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("28ea9293-7a06-45bd-875b-1b7a746d0c69")
    public String getBinaryCodeURL() {
        return this.elt.getTagValue(ServerlessConfiguration.MdaTypes.BINARYCODEURL_TAGTYPE_ELT);
    }

    /**
     * Get the value of the 'buildConfiguration' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("f407f9ea-d059-4bbb-9e21-159493aecd09")
    public BuildConfiguration getBuildConfiguration() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(ServerlessConfiguration.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(ServerlessConfiguration.MdaTypes.MDAASSOCDEP_ROLE), "buildConfiguration")
                  && BuildConfiguration.canInstantiate(d.getDependsOn())) {
                     return (BuildConfiguration)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), BuildConfiguration.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Getter for string property 'continuousDeployment'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("38dc08b1-29b1-475c-b58a-57453ae44816")
    public String getContinuousDeployment() {
        return this.elt.getTagValue(ServerlessConfiguration.MdaTypes.CONTINUOUSDEPLOYMENT_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Artifact}. 
     * @return the Artifact represented by this proxy, never null.
     */
    @objid ("a37fff76-3f31-44ec-b96e-fa4378f71668")
    @Override
    public Artifact getElement() {
        return (Artifact)super.getElement();
    }

    /**
     * Get the values of the 'environmentConfigParams' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("55ed8973-6589-4e2e-bc2e-fce493e82a21")
    public List<AttributeAttribute> getEnvironmentConfigParams() {
        List<AttributeAttribute> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(ServerlessConfiguration.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(ServerlessConfiguration.MdaTypes.MDAASSOCDEP_ROLE), "environmentConfigParams")
              && AttributeAttribute.canInstantiate(d.getDependsOn()))
                results.add((AttributeAttribute)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), AttributeAttribute.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the value of the 'eventConfiguration' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("1a09ea53-7053-4991-9195-74bc1354402b")
    public EventConfiguration getEventConfiguration() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(ServerlessConfiguration.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(ServerlessConfiguration.MdaTypes.MDAASSOCDEP_ROLE), "eventConfiguration")
                  && EventConfiguration.canInstantiate(d.getDependsOn())) {
                     return (EventConfiguration)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), EventConfiguration.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    @objid ("4f914d66-495c-4ae6-a13e-b3422ae4bc0d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'environmentConfigParams' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("b3f371c3-fe32-4800-944e-c50740e243d9")
    public boolean removeEnvironmentConfigParams(final AttributeAttribute obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(ServerlessConfiguration.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(ServerlessConfiguration.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    /**
     * Setter for string property 'binaryCodeURL'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("41ed23e9-77fe-4c32-b28e-2f28620ce314")
    public void setBinaryCodeURL(final String value) {
        this.elt.putTagValue(ServerlessConfiguration.MdaTypes.BINARYCODEURL_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'buildConfiguration' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("ce0a26f7-471a-4845-98ae-bd140fba9015")
    public void setBuildConfiguration(final BuildConfiguration obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(ServerlessConfiguration.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(ServerlessConfiguration.MdaTypes.MDAASSOCDEP_ROLE), "buildConfiguration")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), ServerlessConfiguration.MdaTypes.MDAASSOCDEP);
              dep.setName("buildConfiguration");      dep.putTagValue(ServerlessConfiguration.MdaTypes.MDAASSOCDEP_ROLE, "buildConfiguration");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Setter for string property 'continuousDeployment'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("96b36cf3-582f-40c6-a883-bd31dc8285b7")
    public void setContinuousDeployment(final String value) {
        this.elt.putTagValue(ServerlessConfiguration.MdaTypes.CONTINUOUSDEPLOYMENT_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'eventConfiguration' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("5fa51d0f-72db-4a04-8edd-801d25ff2f1a")
    public void setEventConfiguration(final EventConfiguration obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(ServerlessConfiguration.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(ServerlessConfiguration.MdaTypes.MDAASSOCDEP_ROLE), "eventConfiguration")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), ServerlessConfiguration.MdaTypes.MDAASSOCDEP);
              dep.setName("eventConfiguration");      dep.putTagValue(ServerlessConfiguration.MdaTypes.MDAASSOCDEP_ROLE, "eventConfiguration");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    @objid ("de78109b-f4c5-42b2-88b0-a96e0dded7f5")
    protected ServerlessConfiguration(final Artifact elt) {
        super(elt);
    }

    @objid ("96beea79-8c81-4296-8902-a428d2abe0d8")
    public static final class MdaTypes {
        @objid ("e9d96691-8ba7-4df4-8cc5-55f23d0d53e0")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("85985faf-6291-4249-b3f7-004096a5976f")
        public static TagType BINARYCODEURL_TAGTYPE_ELT;

        @objid ("0b71de23-a526-4908-b78c-8bb5e409adf8")
        public static TagType CONTINUOUSDEPLOYMENT_TAGTYPE_ELT;

        @objid ("94b858f8-a96d-435b-aa4d-43708eaf1559")
        private static Stereotype MDAASSOCDEP;

        @objid ("44ccfa0c-3691-4f6f-9c75-6c91dc671127")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f4fdaadc-0b3f-435a-9062-5abd154ad1cc")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "9f4ca31f-e397-4c28-b2d2-031f838cfe99");
            BINARYCODEURL_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "a9a8e449-cba1-4eb1-86c5-d6776d809a5f");
            CONTINUOUSDEPLOYMENT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b19002d3-1aa5-4739-b9db-e55a4a2126db");
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
