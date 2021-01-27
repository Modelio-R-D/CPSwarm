/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CPSwarm v3.9.03

 * This file was generated on 4/15/20 8:10 AM by Modelio Studio.
 */
package org.modelio.module.cpswarm.api.cpswarm_concept.infrastructure.dependency;

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
import org.modelio.module.cpswarm.api.CPSwarmProxyFactory;
import org.modelio.module.cpswarm.api.ICPSwarmPeerModule;
import org.modelio.module.cpswarm.impl.CPSwarmModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Dependency} with << DepMsg >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
public class DepMsg {
    public static final String STEREOTYPE_NAME = "DepMsg";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    protected final Dependency elt;

    /**
     * Tells whether a {@link DepMsg proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << DepMsg >>.
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(ICPSwarmPeerModule.MODULE_NAME, DepMsg.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << DepMsg >> then instantiate a {@link DepMsg} proxy.
     * 
     * @return a {@link DepMsg} proxy on the created {@link Dependency}.
     */
    public static DepMsg create() {
        ModelElement e = (ModelElement)CPSwarmModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(ICPSwarmPeerModule.MODULE_NAME, DepMsg.STEREOTYPE_NAME);
        return DepMsg.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link DepMsg} proxy from a {@link Dependency} stereotyped << DepMsg >>checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Dependency
     * @return a {@link DepMsg} proxy or <i>null</i>.
     */
    public static DepMsg instantiate(final Dependency obj) {
        return DepMsg.canInstantiate(obj) ? new DepMsg(obj) : null;
    }

    /**
     * Tries to instantiate a {@link DepMsg} proxy from a {@link Dependency} stereotyped << DepMsg >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Dependency}
     * @return a {@link DepMsg} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static DepMsg safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (DepMsg.canInstantiate(obj))
            return new DepMsg(obj);
        else
            throw new IllegalArgumentException("DepMsg: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        DepMsg other = (DepMsg) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}.
     * 
     * @return the Dependency represented by this proxy, never null.
     */
    public Dependency getElement() {
        return this.elt;
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    protected DepMsg(final Dependency elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "21e11c33-b511-47d5-9375-6e859480aba4");
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
