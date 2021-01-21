/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.00

 * This file was generated on 12/10/20 11:37 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact;

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
import org.modelio.metamodel.uml.statik.Artifact;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Artifact} with << PaaSConfiguration >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("ce90fefb-5b15-4e21-9681-cb6da152b51c")
public class PaaSConfiguration extends Configuration {
    @objid ("da1c4f9c-e80a-4e3e-a592-7eac32ef0b3f")
    public static final String STEREOTYPE_NAME = "PaaSConfiguration";

    @objid ("78e79fb3-6640-4770-9ddc-b21e32231846")
    public static final String API_TAGTYPE = "api";

    @objid ("bab52e94-67ee-4d71-a372-b719a37e6b58")
    public static final String DOWNLOADURL_TAGTYPE = "downloadURL";

    @objid ("195c1a50-10b5-443d-982f-8ba0f7a3b74f")
    public static final String ENDPOINT_TAGTYPE = "endpoint";

    @objid ("7cb54424-fbae-4673-af5c-381eadd45949")
    public static final String VERSION_TAGTYPE = "version";

    /**
     * Tells whether a {@link PaaSConfiguration proxy} can be instantiated from a {@link MObject} checking it is a {@link Artifact} stereotyped << PaaSConfiguration >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("ec7c84c7-29c2-4e8f-980b-fd1320f823c5")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Artifact) && ((Artifact) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, PaaSConfiguration.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Artifact} stereotyped << PaaSConfiguration >> then instantiate a {@link PaaSConfiguration} proxy.
     * 
     * @return a {@link PaaSConfiguration} proxy on the created {@link Artifact}.
     */
    @objid ("76d5cb4c-5aa5-450c-8690-f5b14f6db966")
    public static PaaSConfiguration create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Artifact");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, PaaSConfiguration.STEREOTYPE_NAME);
        return PaaSConfiguration.instantiate((Artifact)e);
    }

    /**
     * Tries to instantiate a {@link PaaSConfiguration} proxy from a {@link Artifact} stereotyped << PaaSConfiguration >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Artifact
     * @return a {@link PaaSConfiguration} proxy or <i>null</i>.
     */
    @objid ("544c0f9c-b34b-45ae-9cef-4d8d62ab6a72")
    public static PaaSConfiguration instantiate(final Artifact obj) {
        return PaaSConfiguration.canInstantiate(obj) ? new PaaSConfiguration(obj) : null;
    }

    /**
     * Tries to instantiate a {@link PaaSConfiguration} proxy from a {@link Artifact} stereotyped << PaaSConfiguration >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Artifact}
     * @return a {@link PaaSConfiguration} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("d3712773-132c-46dc-b798-5d5c50a22739")
    public static PaaSConfiguration safeInstantiate(final Artifact obj) throws IllegalArgumentException {
        if (PaaSConfiguration.canInstantiate(obj))
        	return new PaaSConfiguration(obj);
        else
        	throw new IllegalArgumentException("PaaSConfiguration: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("9da4e4b3-6572-4345-b7a6-e0f236591362")
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
        PaaSConfiguration other = (PaaSConfiguration) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for string property 'api'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("eca2193b-35ac-42bd-a9c3-dff76326adaf")
    public String getApi() {
        return this.elt.getTagValue(PaaSConfiguration.MdaTypes.API_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'downloadURL'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("2a518204-0179-4fa8-b797-9860379819c6")
    public String getDownloadURL() {
        return this.elt.getTagValue(PaaSConfiguration.MdaTypes.DOWNLOADURL_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Artifact}. 
     * @return the Artifact represented by this proxy, never null.
     */
    @objid ("d7aa313c-0f57-47aa-a163-d33a91e34dc1")
    @Override
    public Artifact getElement() {
        return (Artifact)super.getElement();
    }

    /**
     * Getter for string property 'endpoint'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("21a93652-06c0-4490-99c8-ff224aa8b1c9")
    public String getEndpoint() {
        return this.elt.getTagValue(PaaSConfiguration.MdaTypes.ENDPOINT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'version'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("2ab10b9e-1300-46e4-b8ae-7e3a35dd3410")
    public String getVersion() {
        return this.elt.getTagValue(PaaSConfiguration.MdaTypes.VERSION_TAGTYPE_ELT);
    }

    @objid ("af6af296-a958-4ff9-8f0d-c97de3391dbe")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'api'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("e1109102-e674-4f05-b38e-6b80d14ce820")
    public void setApi(final String value) {
        this.elt.putTagValue(PaaSConfiguration.MdaTypes.API_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'downloadURL'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("01102dd0-f946-45d4-86d7-414218d66f97")
    public void setDownloadURL(final String value) {
        this.elt.putTagValue(PaaSConfiguration.MdaTypes.DOWNLOADURL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'endpoint'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("38e51bab-63e7-4dbb-af6d-da611414b90e")
    public void setEndpoint(final String value) {
        this.elt.putTagValue(PaaSConfiguration.MdaTypes.ENDPOINT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'version'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("549c664d-7666-45f2-8b9b-45283a325f1f")
    public void setVersion(final String value) {
        this.elt.putTagValue(PaaSConfiguration.MdaTypes.VERSION_TAGTYPE_ELT, value);
    }

    @objid ("308b31e5-4657-4f32-a7b7-b43aaa96ef3f")
    protected PaaSConfiguration(final Artifact elt) {
        super(elt);
    }

    @objid ("7782d259-fea0-4b7d-98db-5a791c033e34")
    public static final class MdaTypes {
        @objid ("4053ef97-5d39-4f27-b8e5-6411738848ba")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("eebd9673-c612-4f60-80aa-5c8260f8fa94")
        public static TagType API_TAGTYPE_ELT;

        @objid ("4c09f01c-7417-4e7f-9006-0ee637a2675f")
        public static TagType VERSION_TAGTYPE_ELT;

        @objid ("ba976504-2506-44dd-b61a-e2d38df2e44e")
        public static TagType ENDPOINT_TAGTYPE_ELT;

        @objid ("854f563d-c4a8-4fb7-af36-6b1c41809871")
        public static TagType DOWNLOADURL_TAGTYPE_ELT;

        @objid ("668fbdcd-c747-4c69-8d2f-175b8e43b2f6")
        private static Stereotype MDAASSOCDEP;

        @objid ("c7f61a0d-2b36-415d-aa08-f997bc52b3fa")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("9a666de8-7f43-442d-885d-70d2f953413c")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "708a5ac1-972a-428b-8eb9-2caa4bc35dbd");
            API_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "f030f8ad-63ae-42c6-8eaf-af3bd34ffc29");
            VERSION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "714f9b40-e02b-4d11-9d33-c41aebe5fc2a");
            ENDPOINT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b29d207b-7ea1-4215-98ec-ca376e600523");
            DOWNLOADURL_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "a187ac30-8cda-4e5a-bf97-c52a98987e17");
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
