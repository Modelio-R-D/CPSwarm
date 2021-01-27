/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CPSwarm v3.9.03

 * This file was generated on 4/15/20 8:10 AM by Modelio Studio.
 */
package org.modelio.module.cpswarm.api.cpswarm_concept.standard.operation;

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
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.module.cpswarm.api.CPSwarmProxyFactory;
import org.modelio.module.cpswarm.api.ICPSwarmPeerModule;
import org.modelio.module.cpswarm.impl.CPSwarmModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Operation} with << RoSAlgorithm >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
public class RoSAlgorithm extends ROSBehavior {
    public static final String STEREOTYPE_NAME = "RoSAlgorithm";

    /**
     * Tells whether a {@link RoSAlgorithm proxy} can be instantiated from a {@link MObject} checking it is a {@link Operation} stereotyped << RoSAlgorithm >>.
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Operation) && ((Operation) elt).isStereotyped(ICPSwarmPeerModule.MODULE_NAME, RoSAlgorithm.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Operation} stereotyped << RoSAlgorithm >> then instantiate a {@link RoSAlgorithm} proxy.
     * 
     * @return a {@link RoSAlgorithm} proxy on the created {@link Operation}.
     */
    public static RoSAlgorithm create() {
        ModelElement e = (ModelElement)CPSwarmModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Operation");
        e.addStereotype(ICPSwarmPeerModule.MODULE_NAME, RoSAlgorithm.STEREOTYPE_NAME);
        return RoSAlgorithm.instantiate((Operation)e);
    }

    /**
     * Tries to instantiate a {@link RoSAlgorithm} proxy from a {@link Operation} stereotyped << RoSAlgorithm >>checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Operation
     * @return a {@link RoSAlgorithm} proxy or <i>null</i>.
     */
    public static RoSAlgorithm instantiate(final Operation obj) {
        return RoSAlgorithm.canInstantiate(obj) ? new RoSAlgorithm(obj) : null;
    }

    /**
     * Tries to instantiate a {@link RoSAlgorithm} proxy from a {@link Operation} stereotyped << RoSAlgorithm >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Operation}
     * @return a {@link RoSAlgorithm} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static RoSAlgorithm safeInstantiate(final Operation obj) throws IllegalArgumentException {
        if (RoSAlgorithm.canInstantiate(obj))
            return new RoSAlgorithm(obj);
        else
            throw new IllegalArgumentException("RoSAlgorithm: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        RoSAlgorithm other = (RoSAlgorithm) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Operation}.
     * 
     * @return the Operation represented by this proxy, never null.
     */
    @Override
    public Operation getElement() {
        return (Operation)super.getElement();
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    protected RoSAlgorithm(final Operation elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "792ec7b4-e211-4544-bf4a-244e9d0ca6b0");
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
