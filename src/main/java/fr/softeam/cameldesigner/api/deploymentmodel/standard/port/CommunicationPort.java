/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.00

 * This file was generated on 12/10/20 11:37 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.deploymentmodel.standard.port;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.Feature;
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
import org.modelio.metamodel.uml.statik.Port;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Port} with << CommunicationPort >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("25c6d854-7691-4b15-a2cb-b76b325613c6")
public class CommunicationPort extends Feature {
    @objid ("9996d7c9-2847-41b4-814a-62cee8047287")
    public static final String STEREOTYPE_NAME = "CommunicationPort";

    @objid ("f53f8ca3-3623-43ce-8157-92ec3cf1b93b")
    public static final String HIGHPORTNUMBER_TAGTYPE = "highPortNumber";

    @objid ("dc12300f-7f15-4cfb-a07c-c7fb1ae9688e")
    public static final String ISMANDATORY_TAGTYPE = "isMandatory";

    @objid ("8f56c934-4917-4cf5-8922-d124792a43a8")
    public static final String LOWPORTNUMBER_TAGTYPE = "lowPortNumber";

    /**
     * Tells whether a {@link CommunicationPort proxy} can be instantiated from a {@link MObject} checking it is a {@link Port} stereotyped << CommunicationPort >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("7d98f1bc-5f0b-46e9-9f80-47910b35e80a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Port) && ((Port) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CommunicationPort.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Port} stereotyped << CommunicationPort >> then instantiate a {@link CommunicationPort} proxy.
     * 
     * @return a {@link CommunicationPort} proxy on the created {@link Port}.
     */
    @objid ("336d1181-e195-4ede-b65e-aaddbd0f75a9")
    public static CommunicationPort create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Port");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, CommunicationPort.STEREOTYPE_NAME);
        return CommunicationPort.instantiate((Port)e);
    }

    /**
     * Tries to instantiate a {@link CommunicationPort} proxy from a {@link Port} stereotyped << CommunicationPort >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Port
     * @return a {@link CommunicationPort} proxy or <i>null</i>.
     */
    @objid ("ec3a6ae8-4e8f-4e9a-a80e-0261cae9abcb")
    public static CommunicationPort instantiate(final Port obj) {
        return CommunicationPort.canInstantiate(obj) ? new CommunicationPort(obj) : null;
    }

    /**
     * Tries to instantiate a {@link CommunicationPort} proxy from a {@link Port} stereotyped << CommunicationPort >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Port}
     * @return a {@link CommunicationPort} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("1a089585-df46-47ae-a6e1-359ff1285219")
    public static CommunicationPort safeInstantiate(final Port obj) throws IllegalArgumentException {
        if (CommunicationPort.canInstantiate(obj))
        	return new CommunicationPort(obj);
        else
        	throw new IllegalArgumentException("CommunicationPort: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("ac76e118-c5ef-4d55-ac1c-45ba5e0e6e29")
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
        CommunicationPort other = (CommunicationPort) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Port}. 
     * @return the Port represented by this proxy, never null.
     */
    @objid ("72a85278-b3d6-49c9-b44f-3b0c6eb0f657")
    @Override
    public Port getElement() {
        return (Port)super.getElement();
    }

    /**
     * Getter for string property 'highPortNumber'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("badfdcb5-91e6-4ac8-9bbd-9564c0634499")
    public String getHighPortNumber() {
        return this.elt.getTagValue(CommunicationPort.MdaTypes.HIGHPORTNUMBER_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'lowPortNumber'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("e316e1fd-7e6a-4f22-aa70-d3b9ee74c203")
    public String getLowPortNumber() {
        return this.elt.getTagValue(CommunicationPort.MdaTypes.LOWPORTNUMBER_TAGTYPE_ELT);
    }

    @objid ("9d1017e7-1663-4fff-b835-c19e45839b5d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'isMandatory'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("43a31cdb-b035-4cb7-9265-6bb5a320429d")
    public boolean isIsMandatory() {
        return this.elt.isTagged(CommunicationPort.MdaTypes.ISMANDATORY_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'highPortNumber'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("db94beff-3c22-4772-9fa4-e8526ab85654")
    public void setHighPortNumber(final String value) {
        this.elt.putTagValue(CommunicationPort.MdaTypes.HIGHPORTNUMBER_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'isMandatory'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("054e26d3-cccc-4bc6-9ff5-bcc26ff04853")
    public void setIsMandatory(final boolean value) {
        if (value)
          CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(CommunicationPort.MdaTypes.ISMANDATORY_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(CommunicationPort.MdaTypes.ISMANDATORY_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'lowPortNumber'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("1d90cd64-b83d-4c99-9642-2b9d8b1ac4aa")
    public void setLowPortNumber(final String value) {
        this.elt.putTagValue(CommunicationPort.MdaTypes.LOWPORTNUMBER_TAGTYPE_ELT, value);
    }

    @objid ("39596231-4b50-4bff-9acb-eb5842a27ffa")
    protected CommunicationPort(final Port elt) {
        super(elt);
    }

    @objid ("4372cf5a-f8d4-4bb8-ad18-085c5dd70583")
    public static final class MdaTypes {
        @objid ("88f6c98c-8765-4b99-80c2-fa2932b53f04")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("de75b49d-e91b-4ee7-9f68-ec254322c12c")
        public static TagType LOWPORTNUMBER_TAGTYPE_ELT;

        @objid ("61323582-b327-4236-8359-81fe41e0d0df")
        public static TagType HIGHPORTNUMBER_TAGTYPE_ELT;

        @objid ("3242c129-e658-45bf-b2c6-a43aca16b7c1")
        public static TagType ISMANDATORY_TAGTYPE_ELT;

        @objid ("d6275b3c-7d59-4aa4-ad25-849d9b139cca")
        private static Stereotype MDAASSOCDEP;

        @objid ("74e48bf7-4761-4b48-b731-e1626fdf2967")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("4207ede6-037d-459b-bef9-997d4bfccb58")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "c3c6e0a4-b112-4a00-9c2f-964e3093c423");
            LOWPORTNUMBER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "6a5677a8-e95a-48ca-9d2c-17c3eb64fb84");
            HIGHPORTNUMBER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4ea4c624-90ec-4d17-bed6-7bbba5114296");
            ISMANDATORY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "db6301a8-58c7-4502-a816-681c606c13cf");
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
