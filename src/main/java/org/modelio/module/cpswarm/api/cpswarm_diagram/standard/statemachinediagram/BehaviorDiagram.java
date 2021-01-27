/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CPSwarm v3.9.03

 * This file was generated on 4/15/20 8:10 AM by Modelio Studio.
 */
package org.modelio.module.cpswarm.api.cpswarm_diagram.standard.statemachinediagram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.diagrams.StateMachineDiagram;
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
 * Proxy class to handle a {@link StateMachineDiagram} with << BehaviorDiagram >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
public class BehaviorDiagram {
    public static final String STEREOTYPE_NAME = "BehaviorDiagram";

    /**
     * The underlying {@link StateMachineDiagram} represented by this proxy, never null.
     */
    protected final StateMachineDiagram elt;

    /**
     * Tells whether a {@link BehaviorDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link StateMachineDiagram} stereotyped << BehaviorDiagram >>.
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof StateMachineDiagram) && ((StateMachineDiagram) elt).isStereotyped(ICPSwarmPeerModule.MODULE_NAME, BehaviorDiagram.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link StateMachineDiagram} stereotyped << BehaviorDiagram >> then instantiate a {@link BehaviorDiagram} proxy.
     * 
     * @return a {@link BehaviorDiagram} proxy on the created {@link StateMachineDiagram}.
     */
    public static BehaviorDiagram create() {
        ModelElement e = (ModelElement)CPSwarmModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("StateMachineDiagram");
        e.addStereotype(ICPSwarmPeerModule.MODULE_NAME, BehaviorDiagram.STEREOTYPE_NAME);
        return BehaviorDiagram.instantiate((StateMachineDiagram)e);
    }

    /**
     * Tries to instantiate a {@link BehaviorDiagram} proxy from a {@link StateMachineDiagram} stereotyped << BehaviorDiagram >>checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a StateMachineDiagram
     * @return a {@link BehaviorDiagram} proxy or <i>null</i>.
     */
    public static BehaviorDiagram instantiate(final StateMachineDiagram obj) {
        return BehaviorDiagram.canInstantiate(obj) ? new BehaviorDiagram(obj) : null;
    }

    /**
     * Tries to instantiate a {@link BehaviorDiagram} proxy from a {@link StateMachineDiagram} stereotyped << BehaviorDiagram >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link StateMachineDiagram}
     * @return a {@link BehaviorDiagram} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static BehaviorDiagram safeInstantiate(final StateMachineDiagram obj) throws IllegalArgumentException {
        if (BehaviorDiagram.canInstantiate(obj))
            return new BehaviorDiagram(obj);
        else
            throw new IllegalArgumentException("BehaviorDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        BehaviorDiagram other = (BehaviorDiagram) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link StateMachineDiagram}.
     * 
     * @return the StateMachineDiagram represented by this proxy, never null.
     */
    public StateMachineDiagram getElement() {
        return this.elt;
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    protected BehaviorDiagram(final StateMachineDiagram elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "9f47abac-02a3-4be2-b622-f63ca2351668");
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
