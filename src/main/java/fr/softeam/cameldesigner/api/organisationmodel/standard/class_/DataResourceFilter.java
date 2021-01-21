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
 * Proxy class to handle a {@link Class} with << DataResourceFilter >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("791b2878-7c50-4215-a525-604369238537")
public class DataResourceFilter extends ResourceFilter {
    @objid ("e12529e2-600f-472d-bb51-520900fafef7")
    public static final String STEREOTYPE_NAME = "DataResourceFilter";

    @objid ("71a33e86-2fe7-4ca0-bfaa-541f2e21299f")
    public static final String EVERYDATA_TAGTYPE = "everyData";

    /**
     * Tells whether a {@link DataResourceFilter proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << DataResourceFilter >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("8540781e-4234-4eae-a629-b00fb9d1da79")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DataResourceFilter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << DataResourceFilter >> then instantiate a {@link DataResourceFilter} proxy.
     * 
     * @return a {@link DataResourceFilter} proxy on the created {@link Class}.
     */
    @objid ("3a332b5c-4cca-4e70-8465-12f4a538bbf0")
    public static DataResourceFilter create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, DataResourceFilter.STEREOTYPE_NAME);
        return DataResourceFilter.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link DataResourceFilter} proxy from a {@link Class} stereotyped << DataResourceFilter >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link DataResourceFilter} proxy or <i>null</i>.
     */
    @objid ("5201aa14-43f5-4302-a0f5-e56500c94a71")
    public static DataResourceFilter instantiate(final Class obj) {
        return DataResourceFilter.canInstantiate(obj) ? new DataResourceFilter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link DataResourceFilter} proxy from a {@link Class} stereotyped << DataResourceFilter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link DataResourceFilter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("f57c39a8-70ee-45fb-986f-66ba17d5e498")
    public static DataResourceFilter safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (DataResourceFilter.canInstantiate(obj))
        	return new DataResourceFilter(obj);
        else
        	throw new IllegalArgumentException("DataResourceFilter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("652a3e01-5b15-40ba-911c-3c12c04f4e7c")
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
        DataResourceFilter other = (DataResourceFilter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("288a11a0-dfd6-4129-a8b5-e0388113ee9c")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'everyData'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("7ad965bb-405e-406b-b3dd-91c84515bc58")
    public String getEveryData() {
        return this.elt.getTagValue(DataResourceFilter.MdaTypes.EVERYDATA_TAGTYPE_ELT);
    }

    @objid ("32446c01-a2dd-4391-9ba3-08016fd88d90")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'everyData'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("f58ac5b8-885c-4a6b-822e-a79911ae63cd")
    public void setEveryData(final String value) {
        this.elt.putTagValue(DataResourceFilter.MdaTypes.EVERYDATA_TAGTYPE_ELT, value);
    }

    @objid ("c6072f8a-5cb3-4a1a-873c-26a4763241b8")
    protected DataResourceFilter(final Class elt) {
        super(elt);
    }

    @objid ("a60319da-e29b-4af0-b3aa-4b4d80f83f8b")
    public static final class MdaTypes {
        @objid ("763acd1c-46fc-4492-96c0-d3f51e3116e9")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("014afbd1-a73a-4481-8c00-6a458dd0fc92")
        public static TagType EVERYDATA_TAGTYPE_ELT;

        @objid ("87f8364a-93ca-4520-9d2c-0459738f9454")
        private static Stereotype MDAASSOCDEP;

        @objid ("59b5e7f2-269f-477e-ad91-74b8effd1568")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("92d0b19f-a0e7-4f87-b4e8-9b31b1455451")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "db53c8ff-ef9a-4bc2-bbfa-af051fcaa66d");
            EVERYDATA_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "224a9d86-f0da-48c2-aee2-621dc2822fd3");
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
