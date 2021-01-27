/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CPSwarm v3.9.03

 * This file was generated on 4/15/20 8:10 AM by Modelio Studio.
 */
package org.modelio.module.cpswarm.api.cpswarm_concept.standard.port;

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
import org.modelio.metamodel.uml.statik.Port;
import org.modelio.module.cpswarm.api.CPSwarmProxyFactory;
import org.modelio.module.cpswarm.api.ICPSwarmPeerModule;
import org.modelio.module.cpswarm.api.cpswarm_concept.standard.umlmodelelement.OptimisedArgument;
import org.modelio.module.cpswarm.impl.CPSwarmModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Port} with << Optimised_Port >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
public class OptimisedPort extends OptimisedArgument {
    public static final String STEREOTYPE_NAME = "Optimised_Port";

    /**
     * Tells whether a {@link OptimisedPort proxy} can be instantiated from a {@link MObject} checking it is a {@link Port} stereotyped << Optimised_Port >>.
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Port) && ((Port) elt).isStereotyped(ICPSwarmPeerModule.MODULE_NAME, OptimisedPort.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Port} stereotyped << Optimised_Port >> then instantiate a {@link OptimisedPort} proxy.
     * 
     * @return a {@link OptimisedPort} proxy on the created {@link Port}.
     */
    public static OptimisedPort create() {
        ModelElement e = (ModelElement)CPSwarmModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Port");
        e.addStereotype(ICPSwarmPeerModule.MODULE_NAME, OptimisedPort.STEREOTYPE_NAME);
        return OptimisedPort.instantiate((Port)e);
    }

    /**
     * Tries to instantiate a {@link OptimisedPort} proxy from a {@link Port} stereotyped << Optimised_Port >>checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Port
     * @return a {@link OptimisedPort} proxy or <i>null</i>.
     */
    public static OptimisedPort instantiate(final Port obj) {
        return OptimisedPort.canInstantiate(obj) ? new OptimisedPort(obj) : null;
    }

    /**
     * Tries to instantiate a {@link OptimisedPort} proxy from a {@link Port} stereotyped << Optimised_Port >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Port}
     * @return a {@link OptimisedPort} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static OptimisedPort safeInstantiate(final Port obj) throws IllegalArgumentException {
        if (OptimisedPort.canInstantiate(obj))
            return new OptimisedPort(obj);
        else
            throw new IllegalArgumentException("OptimisedPort: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        OptimisedPort other = (OptimisedPort) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Port}.
     * 
     * @return the Port represented by this proxy, never null.
     */
    @Override
    public Port getElement() {
        return (Port)super.getElement();
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    protected OptimisedPort(final Port elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "7126f7f9-776f-4dbb-84a6-dec48bb7997f");
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
