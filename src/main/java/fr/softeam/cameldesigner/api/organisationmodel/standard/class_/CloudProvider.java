/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.00

 * This file was generated on 12/10/20 11:37 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.organisationmodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
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
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Class} with << CloudProvider >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("fb9d9a88-d4a0-4e3f-a3de-0a99ce0662d5")
public class CloudProvider extends Organisation {
    @objid ("a6fd671b-8c35-4f1c-9268-df7e7b7cc313")
    public static final String STEREOTYPE_NAME = "CloudProvider";

    @objid ("4d71a7aa-210f-40ec-9f1f-a571ee4a79fc")
    public static final String IAAS_TAGTYPE = "IaaS";

    @objid ("e867cf87-2d62-41b7-91ff-b3056e5fbe09")
    public static final String PAAS_TAGTYPE = "PaaS";

    @objid ("70eb8b99-e443-4c12-8a3c-f7be11bbe0ab")
    public static final String SAAS_TAGTYPE = "SaaS";

    @objid ("d3e78921-538e-4b65-9bc5-ff80db69b729")
    public static final String PUBLIC_TAGTYPE = "public";

    /**
     * Tells whether a {@link CloudProvider proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << CloudProvider >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("84cbaa04-69a3-4a7a-9de9-7bc873a13958")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CloudProvider.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << CloudProvider >> then instantiate a {@link CloudProvider} proxy.
     * 
     * @return a {@link CloudProvider} proxy on the created {@link Class}.
     */
    @objid ("6ef09348-d5e2-4698-b894-fd01f5cc20ec")
    public static CloudProvider create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, CloudProvider.STEREOTYPE_NAME);
        return CloudProvider.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link CloudProvider} proxy from a {@link Class} stereotyped << CloudProvider >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link CloudProvider} proxy or <i>null</i>.
     */
    @objid ("3c189a6f-6d53-4c13-a672-2c1923427d4c")
    public static CloudProvider instantiate(final Class obj) {
        return CloudProvider.canInstantiate(obj) ? new CloudProvider(obj) : null;
    }

    /**
     * Tries to instantiate a {@link CloudProvider} proxy from a {@link Class} stereotyped << CloudProvider >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link CloudProvider} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("8cf8fbd3-713f-4c16-a2a6-1935527d99c2")
    public static CloudProvider safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (CloudProvider.canInstantiate(obj))
        	return new CloudProvider(obj);
        else
        	throw new IllegalArgumentException("CloudProvider: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("ce0e963a-6c92-44b8-9fc9-12d8195ee88c")
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
        CloudProvider other = (CloudProvider) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("1f30853c-c83f-430b-87c0-a657778ac5ee")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'IaaS'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("e2158ca4-708e-4b03-951e-e679427a8ac9")
    public String getIaaS() {
        return this.elt.getTagValue(CloudProvider.MdaTypes.IAAS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'PaaS'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("b0228b89-d017-4e6c-8629-f3c5ceb2cdcc")
    public String getPaaS() {
        return this.elt.getTagValue(CloudProvider.MdaTypes.PAAS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'public'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("04f7e160-9088-4d07-90b0-ab49fb65ae79")
    public String getPublic() {
        return this.elt.getTagValue(CloudProvider.MdaTypes.PUBLIC_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SaaS'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("53bf1ee3-2181-41ae-8702-a1ad6e2d8f6d")
    public String getSaaS() {
        return this.elt.getTagValue(CloudProvider.MdaTypes.SAAS_TAGTYPE_ELT);
    }

    @objid ("734b572b-d453-4885-87c7-4cc89ef2855c")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'IaaS'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("e7e2fd0e-c9d5-4456-8b56-bb801cf36314")
    public void setIaaS(final String value) {
        this.elt.putTagValue(CloudProvider.MdaTypes.IAAS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'PaaS'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("38ba4d12-ed6e-4dce-8295-644c758cd737")
    public void setPaaS(final String value) {
        this.elt.putTagValue(CloudProvider.MdaTypes.PAAS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'public'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("a20f8a64-0258-423f-b5ce-08861c770d3d")
    public void setPublic(final String value) {
        this.elt.putTagValue(CloudProvider.MdaTypes.PUBLIC_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SaaS'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("b803c0f5-6c42-4213-94ee-48637b3b61ad")
    public void setSaaS(final String value) {
        this.elt.putTagValue(CloudProvider.MdaTypes.SAAS_TAGTYPE_ELT, value);
    }

    @objid ("1dfa6bac-814f-4042-96dd-aa8027825dc9")
    protected CloudProvider(final Class elt) {
        super(elt);
    }

    @objid ("3a9e1b7d-4edb-4361-aa5d-657d494731fb")
    public static final class MdaTypes {
        @objid ("d7fb75af-e8d8-4a3f-9454-f4cf7affb594")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("3a989b55-79b5-4a2a-8a48-aca3044406ac")
        public static TagType PUBLIC_TAGTYPE_ELT;

        @objid ("7fa5bbeb-29d0-4cd6-a4b7-1e8c485a9626")
        public static TagType SAAS_TAGTYPE_ELT;

        @objid ("fa51a298-2268-4f8d-acd7-d52dd8f50b24")
        public static TagType PAAS_TAGTYPE_ELT;

        @objid ("e811e4bb-ac9c-411e-8d24-2d1c4f1fc47f")
        public static TagType IAAS_TAGTYPE_ELT;

        @objid ("16832cdf-9126-44ca-9a4e-8df6ebf60a7c")
        private static Stereotype MDAASSOCDEP;

        @objid ("96db17f5-fd42-4e62-9132-0d3cf383f83e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("974f96d0-a83c-41f0-8d00-b497835e1b67")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "eb3e5683-72bd-4e46-8bda-1ea07af0c09e");
            PUBLIC_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "a7b7a414-a54a-45b1-a53e-3126883211b8");
            SAAS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "f42c6540-bd96-497b-9689-075610b04eda");
            PAAS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d89c42d7-ad3d-49e1-a24d-46b82e7965ac");
            IAAS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "e33192b2-ce6c-499c-98c5-167d63c32690");
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
