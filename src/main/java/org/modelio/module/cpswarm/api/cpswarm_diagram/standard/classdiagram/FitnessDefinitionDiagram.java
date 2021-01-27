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
 * Proxy class to handle a {@link ClassDiagram} with << FitnessDefinitionDiagram >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
public class FitnessDefinitionDiagram {
    public static final String STEREOTYPE_NAME = "FitnessDefinitionDiagram";

    /**
     * The underlying {@link ClassDiagram} represented by this proxy, never null.
     */
    protected final ClassDiagram elt;

    /**
     * Tells whether a {@link FitnessDefinitionDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link ClassDiagram} stereotyped << FitnessDefinitionDiagram >>.
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ClassDiagram) && ((ClassDiagram) elt).isStereotyped(ICPSwarmPeerModule.MODULE_NAME, FitnessDefinitionDiagram.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ClassDiagram} stereotyped << FitnessDefinitionDiagram >> then instantiate a {@link FitnessDefinitionDiagram} proxy.
     * 
     * @return a {@link FitnessDefinitionDiagram} proxy on the created {@link ClassDiagram}.
     */
    public static FitnessDefinitionDiagram create() {
        ModelElement e = (ModelElement)CPSwarmModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("ClassDiagram");
        e.addStereotype(ICPSwarmPeerModule.MODULE_NAME, FitnessDefinitionDiagram.STEREOTYPE_NAME);
        return FitnessDefinitionDiagram.instantiate((ClassDiagram)e);
    }

    /**
     * Tries to instantiate a {@link FitnessDefinitionDiagram} proxy from a {@link ClassDiagram} stereotyped << FitnessDefinitionDiagram >>checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a ClassDiagram
     * @return a {@link FitnessDefinitionDiagram} proxy or <i>null</i>.
     */
    public static FitnessDefinitionDiagram instantiate(final ClassDiagram obj) {
        return FitnessDefinitionDiagram.canInstantiate(obj) ? new FitnessDefinitionDiagram(obj) : null;
    }

    /**
     * Tries to instantiate a {@link FitnessDefinitionDiagram} proxy from a {@link ClassDiagram} stereotyped << FitnessDefinitionDiagram >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link ClassDiagram}
     * @return a {@link FitnessDefinitionDiagram} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static FitnessDefinitionDiagram safeInstantiate(final ClassDiagram obj) throws IllegalArgumentException {
        if (FitnessDefinitionDiagram.canInstantiate(obj))
            return new FitnessDefinitionDiagram(obj);
        else
            throw new IllegalArgumentException("FitnessDefinitionDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        FitnessDefinitionDiagram other = (FitnessDefinitionDiagram) obj;
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

    protected FitnessDefinitionDiagram(final ClassDiagram elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "8031ba42-b3e3-4930-9600-9b8f2ead875e");
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
