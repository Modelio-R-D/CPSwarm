/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.00

 * This file was generated on 12/10/20 11:37 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.typemodel.standard.class_;

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
 * Proxy class to handle a {@link Class} with << StringValue >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("108ceff7-c9cf-4dcb-8e30-e9a6e0322996")
public class StringValue extends Value {
    @objid ("3d3e8174-d64a-4d67-95bf-45f070d98d31")
    public static final String STEREOTYPE_NAME = "StringValue";

    @objid ("a7751494-eace-49f6-9c10-660d177acab5")
    public static final String VALUE_TAGTYPE = "value";

    /**
     * Tells whether a {@link StringValue proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << StringValue >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("7f19eb50-e147-4678-957a-e1cfc7b71368")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, StringValue.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << StringValue >> then instantiate a {@link StringValue} proxy.
     * 
     * @return a {@link StringValue} proxy on the created {@link Class}.
     */
    @objid ("2f683258-29a4-42f6-b113-f642c00c8900")
    public static StringValue create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, StringValue.STEREOTYPE_NAME);
        return StringValue.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link StringValue} proxy from a {@link Class} stereotyped << StringValue >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link StringValue} proxy or <i>null</i>.
     */
    @objid ("e1e6f8f9-6e4c-44a1-9861-595e3213e958")
    public static StringValue instantiate(final Class obj) {
        return StringValue.canInstantiate(obj) ? new StringValue(obj) : null;
    }

    /**
     * Tries to instantiate a {@link StringValue} proxy from a {@link Class} stereotyped << StringValue >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link StringValue} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("92dcc626-2843-4872-b045-b5360166607a")
    public static StringValue safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (StringValue.canInstantiate(obj))
        	return new StringValue(obj);
        else
        	throw new IllegalArgumentException("StringValue: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("2c8d0194-0a2b-451c-bc62-a684cb49d7f6")
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
        StringValue other = (StringValue) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("9da7a698-8e8f-45a1-a938-9884caf2c3e4")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'value'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("7ce7a52d-037d-471b-a826-cdb0f5f58bb9")
    public String getValue() {
        return this.elt.getTagValue(StringValue.MdaTypes.VALUE_TAGTYPE_ELT);
    }

    @objid ("8bd4fe92-db66-4a31-8adf-07e923e82bd3")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'value'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("31cb7729-3a6e-4325-b7f9-cbbbce670227")
    public void setValue(final String value) {
        this.elt.putTagValue(StringValue.MdaTypes.VALUE_TAGTYPE_ELT, value);
    }

    @objid ("57c2c14a-572a-4f1c-bc3e-6bcabddd4f60")
    protected StringValue(final Class elt) {
        super(elt);
    }

    @objid ("9399a459-61a5-4415-942d-4d13e631e29a")
    public static final class MdaTypes {
        @objid ("b95a45f1-bbfb-4324-bcbe-d141ce570c67")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("350b43b9-685c-468d-8497-2e9103b6f74a")
        public static TagType VALUE_TAGTYPE_ELT;

        @objid ("fa607700-491a-47b1-b0ed-39a5c2224637")
        private static Stereotype MDAASSOCDEP;

        @objid ("d319235f-85b5-451d-adc6-41d2ebf2b079")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("3a8d64cc-c21d-4f0e-ba2e-c5051225e1a1")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "6150e77e-8a8a-40f6-9270-79aa182fc926");
            VALUE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "dc99a44c-debc-43d9-a8f2-cf3b62a7138f");
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
