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
 * Proxy class to handle a {@link Class} with << BooleanValue >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("189044d4-f590-4d4b-94d6-f2503fd76c82")
public class BooleanValue extends Value {
    @objid ("a0441b98-b63b-4a4b-ad21-62b95373930d")
    public static final String STEREOTYPE_NAME = "BooleanValue";

    @objid ("2616f829-7d58-429c-af20-948b2a8a168d")
    public static final String VALUE_TAGTYPE = "value";

    /**
     * Tells whether a {@link BooleanValue proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << BooleanValue >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("f7e74c3c-708f-4fe4-8c5f-848fe35d7b1c")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, BooleanValue.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << BooleanValue >> then instantiate a {@link BooleanValue} proxy.
     * 
     * @return a {@link BooleanValue} proxy on the created {@link Class}.
     */
    @objid ("6bd33f21-96e5-4707-862a-2a1918493b74")
    public static BooleanValue create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, BooleanValue.STEREOTYPE_NAME);
        return BooleanValue.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link BooleanValue} proxy from a {@link Class} stereotyped << BooleanValue >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link BooleanValue} proxy or <i>null</i>.
     */
    @objid ("abaa519a-923f-420f-b196-83371dd5d73f")
    public static BooleanValue instantiate(final Class obj) {
        return BooleanValue.canInstantiate(obj) ? new BooleanValue(obj) : null;
    }

    /**
     * Tries to instantiate a {@link BooleanValue} proxy from a {@link Class} stereotyped << BooleanValue >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link BooleanValue} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("0296acc3-eab7-441b-b390-f421d93102a4")
    public static BooleanValue safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (BooleanValue.canInstantiate(obj))
        	return new BooleanValue(obj);
        else
        	throw new IllegalArgumentException("BooleanValue: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("0ee2c910-badd-4007-a342-b792879cc213")
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
        BooleanValue other = (BooleanValue) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("251ef9cf-b70f-4678-b90e-21a05a86198a")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("95f824bc-8240-4ba9-81d3-5cf63482e9ad")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'value'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("c47e0be9-f676-48e9-bbc6-b584915df083")
    public boolean isValue() {
        return this.elt.isTagged(BooleanValue.MdaTypes.VALUE_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'value'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("ca20e48a-6872-483b-82d2-ac85e6743786")
    public void setValue(final boolean value) {
        if (value)
          CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(BooleanValue.MdaTypes.VALUE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(BooleanValue.MdaTypes.VALUE_TAGTYPE_ELT);
    }

    @objid ("6e9959c5-1fc0-49ae-9399-2fd5eaa69d47")
    protected BooleanValue(final Class elt) {
        super(elt);
    }

    @objid ("2d228821-481c-49eb-a387-abae42f72daf")
    public static final class MdaTypes {
        @objid ("dafacd9c-4302-4509-8375-a248efdf1af5")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("4550d1fa-b287-4e2e-b5d6-935f4ce16379")
        public static TagType VALUE_TAGTYPE_ELT;

        @objid ("d3ae743b-0cfd-4f62-a17f-12da6e6d1e10")
        private static Stereotype MDAASSOCDEP;

        @objid ("304bedf1-daaf-41f9-a43c-f461c98f8f74")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("3ea861b6-4988-488d-9858-d104d19b34f7")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "b4355a7e-9eca-4a9e-8c4c-d49344a0c9a5");
            VALUE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "2fabd851-ad25-472c-927a-770ef9217dd9");
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
