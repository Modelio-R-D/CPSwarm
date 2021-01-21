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
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Class} with << Entity >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("0ddd50cd-81bd-4d73-85c7-ab182d264a9c")
public class Entity extends Feature {
    @objid ("b63d3bea-8fcb-4e7e-a454-6b36fb97fb32")
    public static final String STEREOTYPE_NAME = "Entity";

    /**
     * Tells whether a {@link Entity proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Entity >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("536868fa-1078-4903-842b-54eb09842dab")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Entity.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << Entity >> then instantiate a {@link Entity} proxy.
     * 
     * @return a {@link Entity} proxy on the created {@link Class}.
     */
    @objid ("0f956739-a63f-482e-b796-c0f4961319ad")
    public static Entity create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, Entity.STEREOTYPE_NAME);
        return Entity.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link Entity} proxy from a {@link Class} stereotyped << Entity >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link Entity} proxy or <i>null</i>.
     */
    @objid ("3c02342d-6809-42fe-86ed-d2e9f373bec9")
    public static Entity instantiate(final Class obj) {
        return Entity.canInstantiate(obj) ? new Entity(obj) : null;
    }

    /**
     * Tries to instantiate a {@link Entity} proxy from a {@link Class} stereotyped << Entity >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link Entity} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("f909fe4d-75ad-4b46-ae0f-f5e95418f5a0")
    public static Entity safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (Entity.canInstantiate(obj))
        	return new Entity(obj);
        else
        	throw new IllegalArgumentException("Entity: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("6eeb6ab2-1f89-46b5-a21a-f132aa6fb790")
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
        Entity other = (Entity) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("d2511ca4-afe2-459a-ac86-cf070f6a117d")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("b6987e3b-a026-4391-bd9b-dd493c708290")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("068208b5-742f-43df-bfe0-cd953874758c")
    protected Entity(final Class elt) {
        super(elt);
    }

    @objid ("261036c6-676a-487a-934e-2dea0ceb0b28")
    public static final class MdaTypes {
        @objid ("d1b63a6a-a225-4bf4-8871-14de62819a83")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("feb1f59d-e48f-4ca4-8043-ed226f0a075a")
        private static Stereotype MDAASSOCDEP;

        @objid ("601688f1-b922-430f-8ecd-89202ef20c51")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("31952b5d-62d5-4622-9db9-109cf0d9ffdc")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "8edda027-b2f3-43bb-b101-0058aaa1550f");
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
