/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CPSwarm v3.9.03

 * This file was generated on 4/15/20 8:10 AM by Modelio Studio.
 */
package org.modelio.module.cpswarm.api.cpswarm_concept.standard.class_;

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
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.module.cpswarm.api.CPSwarmProxyFactory;
import org.modelio.module.cpswarm.api.ICPSwarmPeerModule;
import org.modelio.module.cpswarm.impl.CPSwarmModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Class} with << SwarmMember >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class SwarmMember {
    public static final String STEREOTYPE_NAME = "SwarmMember";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    protected final Class elt;

    /**
     * Tells whether a {@link SwarmMember proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << SwarmMember >>.
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICPSwarmPeerModule.MODULE_NAME, SwarmMember.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << SwarmMember >> then instantiate a {@link SwarmMember} proxy.
     * 
     * @return a {@link SwarmMember} proxy on the created {@link Class}.
     */
    public static SwarmMember create() {
        ModelElement e = (ModelElement)CPSwarmModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Class");
        e.addStereotype(ICPSwarmPeerModule.MODULE_NAME, SwarmMember.STEREOTYPE_NAME);
        return SwarmMember.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link SwarmMember} proxy from a {@link Class} stereotyped << SwarmMember >>checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Class
     * @return a {@link SwarmMember} proxy or <i>null</i>.
     */
    public static SwarmMember instantiate(final Class obj) {
        return SwarmMember.canInstantiate(obj) ? new SwarmMember(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwarmMember} proxy from a {@link Class} stereotyped << SwarmMember >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Class}
     * @return a {@link SwarmMember} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static SwarmMember safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (SwarmMember.canInstantiate(obj))
            return new SwarmMember(obj);
        else
            throw new IllegalArgumentException("SwarmMember: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        SwarmMember other = (SwarmMember) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}.
     * 
     * @return the Class represented by this proxy, never null.
     */
    public Class getElement() {
        return this.elt;
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    protected SwarmMember(final Class elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "716ed069-c82d-4d0e-a2c8-c19ca8eeb165");
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
