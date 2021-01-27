/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CPSwarm v3.9.03

 * This file was generated on 4/15/20 8:10 AM by Modelio Studio.
 */
package org.modelio.module.cpswarm.api.cpswarm_diagram.standard.classdiagram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.diagrams.ClassDiagram;
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
 * Proxy class to handle a {@link ClassDiagram} with << SwarmBlockDiagram >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
public class SwarmBlockDiagram {
    public static final String STEREOTYPE_NAME = "SwarmBlockDiagram";

    /**
     * The underlying {@link ClassDiagram} represented by this proxy, never null.
     */
    protected final ClassDiagram elt;

    /**
     * Tells whether a {@link SwarmBlockDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link ClassDiagram} stereotyped << SwarmBlockDiagram >>.
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ClassDiagram) && ((ClassDiagram) elt).isStereotyped(ICPSwarmPeerModule.MODULE_NAME, SwarmBlockDiagram.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ClassDiagram} stereotyped << SwarmBlockDiagram >> then instantiate a {@link SwarmBlockDiagram} proxy.
     * 
     * @return a {@link SwarmBlockDiagram} proxy on the created {@link ClassDiagram}.
     */
    public static SwarmBlockDiagram create() {
        ModelElement e = (ModelElement)CPSwarmModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("ClassDiagram");
        e.addStereotype(ICPSwarmPeerModule.MODULE_NAME, SwarmBlockDiagram.STEREOTYPE_NAME);
        return SwarmBlockDiagram.instantiate((ClassDiagram)e);
    }

    /**
     * Tries to instantiate a {@link SwarmBlockDiagram} proxy from a {@link ClassDiagram} stereotyped << SwarmBlockDiagram >>checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a ClassDiagram
     * @return a {@link SwarmBlockDiagram} proxy or <i>null</i>.
     */
    public static SwarmBlockDiagram instantiate(final ClassDiagram obj) {
        return SwarmBlockDiagram.canInstantiate(obj) ? new SwarmBlockDiagram(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwarmBlockDiagram} proxy from a {@link ClassDiagram} stereotyped << SwarmBlockDiagram >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link ClassDiagram}
     * @return a {@link SwarmBlockDiagram} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static SwarmBlockDiagram safeInstantiate(final ClassDiagram obj) throws IllegalArgumentException {
        if (SwarmBlockDiagram.canInstantiate(obj))
            return new SwarmBlockDiagram(obj);
        else
            throw new IllegalArgumentException("SwarmBlockDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        SwarmBlockDiagram other = (SwarmBlockDiagram) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ClassDiagram}.
     * 
     * @return the ClassDiagram represented by this proxy, never null.
     */
    public ClassDiagram getElement() {
        return this.elt;
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    protected SwarmBlockDiagram(final ClassDiagram elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "cad88314-8a9d-4eec-b2bc-6b00f4a4ff40");
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
