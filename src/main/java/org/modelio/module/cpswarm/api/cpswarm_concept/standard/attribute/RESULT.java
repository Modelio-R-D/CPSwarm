/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CPSwarm v3.9.03

 * This file was generated on 4/15/20 8:10 AM by Modelio Studio.
 */
package org.modelio.module.cpswarm.api.cpswarm_concept.standard.attribute;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
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
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.cpswarm.api.CPSwarmProxyFactory;
import org.modelio.module.cpswarm.api.ICPSwarmPeerModule;
import org.modelio.module.cpswarm.impl.CPSwarmModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Attribute} with << RESULT >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
public class RESULT {
    public static final String STEREOTYPE_NAME = "RESULT";

    /**
     * The underlying {@link Attribute} represented by this proxy, never null.
     */
    protected final Attribute elt;

    /**
     * Tells whether a {@link RESULT proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << RESULT >>.
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(ICPSwarmPeerModule.MODULE_NAME, RESULT.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << RESULT >> then instantiate a {@link RESULT} proxy.
     * 
     * @return a {@link RESULT} proxy on the created {@link Attribute}.
     */
    public static RESULT create() {
        ModelElement e = (ModelElement)CPSwarmModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Attribute");
        e.addStereotype(ICPSwarmPeerModule.MODULE_NAME, RESULT.STEREOTYPE_NAME);
        return RESULT.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link RESULT} proxy from a {@link Attribute} stereotyped << RESULT >>checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Attribute
     * @return a {@link RESULT} proxy or <i>null</i>.
     */
    public static RESULT instantiate(final Attribute obj) {
        return RESULT.canInstantiate(obj) ? new RESULT(obj) : null;
    }

    /**
     * Tries to instantiate a {@link RESULT} proxy from a {@link Attribute} stereotyped << RESULT >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Attribute}
     * @return a {@link RESULT} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static RESULT safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (RESULT.canInstantiate(obj))
            return new RESULT(obj);
        else
            throw new IllegalArgumentException("RESULT: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

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
        RESULT other = (RESULT) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}.
     * 
     * @return the Attribute represented by this proxy, never null.
     */
    public Attribute getElement() {
        return this.elt;
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    protected RESULT(final Attribute elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "de05dfa4-5538-4a5e-b96f-9b2107ea3994");
            MDAASSOCDEP = ctx.getModelingSession().findElementById(Stereotype.class, "94b7efa5-f94c-4d1d-896f-f103e56a8e2e");
            MDAASSOCDEP_ROLE = ctx.getModelingSession().findElementById(TagType.class, "7637f2fd-b750-43c1-a15c-5d0b084ca1cd");
        }


static {
        if(CPSwarmModule.getInstance() != null) {
            init(CPSwarmModule.getInstance().getModuleContext());
        }
    }
    }

}
