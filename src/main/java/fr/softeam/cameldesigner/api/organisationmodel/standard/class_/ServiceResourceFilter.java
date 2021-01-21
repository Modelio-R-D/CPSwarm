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
 * Proxy class to handle a {@link Class} with << ServiceResourceFilter >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("e74e8963-d51d-4407-92a7-54bf8fb74b46")
public class ServiceResourceFilter extends ResourceFilter {
    @objid ("5604977e-2de4-4616-8444-509d91ad6347")
    public static final String STEREOTYPE_NAME = "ServiceResourceFilter";

    @objid ("1e7520c9-a27c-441b-9768-3dbee4856064")
    public static final String EVERYSERVICE_TAGTYPE = "everyService";

    @objid ("3275e6f0-e2e5-4e25-993a-f81b721af0ab")
    public static final String SERVICEURL_TAGTYPE = "serviceURL";

    /**
     * Tells whether a {@link ServiceResourceFilter proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << ServiceResourceFilter >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("9ac82a82-6d7b-472e-986c-4f97a2d0b506")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ServiceResourceFilter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << ServiceResourceFilter >> then instantiate a {@link ServiceResourceFilter} proxy.
     * 
     * @return a {@link ServiceResourceFilter} proxy on the created {@link Class}.
     */
    @objid ("898d0c50-5ee2-4cbf-b0cb-7acaf00562a1")
    public static ServiceResourceFilter create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, ServiceResourceFilter.STEREOTYPE_NAME);
        return ServiceResourceFilter.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link ServiceResourceFilter} proxy from a {@link Class} stereotyped << ServiceResourceFilter >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link ServiceResourceFilter} proxy or <i>null</i>.
     */
    @objid ("4442a551-d90e-4ec0-896c-b5d973875c9d")
    public static ServiceResourceFilter instantiate(final Class obj) {
        return ServiceResourceFilter.canInstantiate(obj) ? new ServiceResourceFilter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ServiceResourceFilter} proxy from a {@link Class} stereotyped << ServiceResourceFilter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link ServiceResourceFilter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("42dd0263-eae6-43c7-8aae-57c651b372d4")
    public static ServiceResourceFilter safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (ServiceResourceFilter.canInstantiate(obj))
        	return new ServiceResourceFilter(obj);
        else
        	throw new IllegalArgumentException("ServiceResourceFilter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("945f6b1d-c030-44e6-aa66-51ee615ad1d8")
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
        ServiceResourceFilter other = (ServiceResourceFilter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("821402cc-112a-46af-96d1-acbe731bc453")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'everyService'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("aebd22cf-c75b-4e13-8d15-ca94e1460ed9")
    public String getEveryService() {
        return this.elt.getTagValue(ServiceResourceFilter.MdaTypes.EVERYSERVICE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'serviceURL'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("de9a05e6-d1ae-4c91-97e1-8e80c1b17ef2")
    public String getServiceURL() {
        return this.elt.getTagValue(ServiceResourceFilter.MdaTypes.SERVICEURL_TAGTYPE_ELT);
    }

    @objid ("125ae1b0-24a4-4841-a03b-9b47fd89b1cc")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'everyService'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("1c470af4-8fa2-4507-8a5f-a8567f053b33")
    public void setEveryService(final String value) {
        this.elt.putTagValue(ServiceResourceFilter.MdaTypes.EVERYSERVICE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'serviceURL'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("c0e5f3c8-b0bf-44cc-9145-0b96ec1d6e1b")
    public void setServiceURL(final String value) {
        this.elt.putTagValue(ServiceResourceFilter.MdaTypes.SERVICEURL_TAGTYPE_ELT, value);
    }

    @objid ("85425ccd-fcaf-4491-adb2-c125e6eb15e9")
    protected ServiceResourceFilter(final Class elt) {
        super(elt);
    }

    @objid ("6e1dac0f-8361-4302-8dc4-0b2938970e17")
    public static final class MdaTypes {
        @objid ("9439ce34-547f-44f1-9afb-4d650d7a0f2a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("810308f8-1ac3-43eb-8c65-7348e1f2c45f")
        public static TagType SERVICEURL_TAGTYPE_ELT;

        @objid ("1e4f1dc4-0794-4e52-9704-17a9efe9ef25")
        public static TagType EVERYSERVICE_TAGTYPE_ELT;

        @objid ("f93398c3-088c-4153-ba8c-173ffa58aefb")
        private static Stereotype MDAASSOCDEP;

        @objid ("d339f918-b915-4e0c-97e1-7d8c90b2991a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("17c248a5-4e99-4f87-8db3-e448cb9d453f")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0012ff53-c300-4f0c-bdce-8583f97e3236");
            SERVICEURL_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1b4c10c8-5621-4bb6-aa2e-3f00deea0d5e");
            EVERYSERVICE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "a2aaca30-b509-469a-b65c-99a30cd09e16");
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
