/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CPSwarm v3.9.03

 * This file was generated on 4/15/20 8:10 AM by Modelio Studio.
 */
package org.modelio.module.cpswarm.api.cpswarm_concept.standard.internaltransition;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.stateMachineModel.InternalTransition;
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
 * Proxy class to handle a {@link InternalTransition} with << Mapped >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
public class Mapped {
    public static final String STEREOTYPE_NAME = "Mapped";

    public static final String MAPPING_TAGTYPE = "Mapping";

    /**
     * The underlying {@link InternalTransition} represented by this proxy, never null.
     */
    protected final InternalTransition elt;

    /**
     * Tells whether a {@link Mapped proxy} can be instantiated from a {@link MObject} checking it is a {@link InternalTransition} stereotyped << Mapped >>.
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof InternalTransition) && ((InternalTransition) elt).isStereotyped(ICPSwarmPeerModule.MODULE_NAME, Mapped.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link InternalTransition} stereotyped << Mapped >> then instantiate a {@link Mapped} proxy.
     * 
     * @return a {@link Mapped} proxy on the created {@link InternalTransition}.
     */
    public static Mapped create() {
        ModelElement e = (ModelElement)CPSwarmModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("InternalTransition");
        e.addStereotype(ICPSwarmPeerModule.MODULE_NAME, Mapped.STEREOTYPE_NAME);
        return Mapped.instantiate((InternalTransition)e);
    }

    /**
     * Tries to instantiate a {@link Mapped} proxy from a {@link InternalTransition} stereotyped << Mapped >>checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a InternalTransition
     * @return a {@link Mapped} proxy or <i>null</i>.
     */
    public static Mapped instantiate(final InternalTransition obj) {
        return Mapped.canInstantiate(obj) ? new Mapped(obj) : null;
    }

    /**
     * Tries to instantiate a {@link Mapped} proxy from a {@link InternalTransition} stereotyped << Mapped >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link InternalTransition}
     * @return a {@link Mapped} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static Mapped safeInstantiate(final InternalTransition obj) throws IllegalArgumentException {
        if (Mapped.canInstantiate(obj))
            return new Mapped(obj);
        else
            throw new IllegalArgumentException("Mapped: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        Mapped other = (Mapped) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link InternalTransition}.
     * 
     * @return the InternalTransition represented by this proxy, never null.
     */
    public InternalTransition getElement() {
        return this.elt;
    }

    /**
     * Getter for List<String> property 'Mapping'
     * <p>Property description:<br/>
     * <i>null</i></p>
     */
    public List<String> getMapping() {
        return this.elt.getTagValues(Mapped.MdaTypes.MAPPING_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'Mapping'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    public void setMapping(final List<String> values) {
        this.elt.putTagValues(Mapped.MdaTypes.MAPPING_TAGTYPE_ELT, values);
    }

    protected Mapped(final InternalTransition elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType MAPPING_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "27c0b9bb-b173-4a80-8712-1daa12b7736f");
            MAPPING_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "346728a9-a878-439d-8edb-a6216fadf8da");
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
