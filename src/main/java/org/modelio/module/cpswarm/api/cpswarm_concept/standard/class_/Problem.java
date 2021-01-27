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
 * Proxy class to handle a {@link Class} with << Problem >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class Problem {
    public static final String STEREOTYPE_NAME = "Problem";

    public static final String MAXSTEPS_TAGTYPE = "maxSteps";

    public static final String NAME_TAGTYPE = "name";

    public static final String NUMEVALUATIONS_TAGTYPE = "numEvaluations";

    public static final String SEED_TAGTYPE = "seed";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    protected final Class elt;

    /**
     * Tells whether a {@link Problem proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Problem >>.
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICPSwarmPeerModule.MODULE_NAME, Problem.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << Problem >> then instantiate a {@link Problem} proxy.
     * 
     * @return a {@link Problem} proxy on the created {@link Class}.
     */
    public static Problem create() {
        ModelElement e = (ModelElement)CPSwarmModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Class");
        e.addStereotype(ICPSwarmPeerModule.MODULE_NAME, Problem.STEREOTYPE_NAME);
        return Problem.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link Problem} proxy from a {@link Class} stereotyped << Problem >>checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Class
     * @return a {@link Problem} proxy or <i>null</i>.
     */
    public static Problem instantiate(final Class obj) {
        return Problem.canInstantiate(obj) ? new Problem(obj) : null;
    }

    /**
     * Tries to instantiate a {@link Problem} proxy from a {@link Class} stereotyped << Problem >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Class}
     * @return a {@link Problem} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static Problem safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (Problem.canInstantiate(obj))
            return new Problem(obj);
        else
            throw new IllegalArgumentException("Problem: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        Problem other = (Problem) obj;
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

    /**
     * Getter for string property 'maxSteps'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getMaxSteps() {
        return this.elt.getTagValue(Problem.MdaTypes.MAXSTEPS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    public String getName() {
        return this.elt.getTagValue(Problem.MdaTypes.NAME_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'numEvaluations'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    public String getNumEvaluations() {
        return this.elt.getTagValue(Problem.MdaTypes.NUMEVALUATIONS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'seed'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    public String getSeed() {
        return this.elt.getTagValue(Problem.MdaTypes.SEED_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'maxSteps'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMaxSteps(final String value) {
        this.elt.putTagValue(Problem.MdaTypes.MAXSTEPS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    public void setName(final String value) {
        this.elt.putTagValue(Problem.MdaTypes.NAME_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'numEvaluations'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    public void setNumEvaluations(final String value) {
        this.elt.putTagValue(Problem.MdaTypes.NUMEVALUATIONS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'seed'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    public void setSeed(final String value) {
        this.elt.putTagValue(Problem.MdaTypes.SEED_TAGTYPE_ELT, value);
    }

    protected Problem(final Class elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType MAXSTEPS_TAGTYPE_ELT;

        public static TagType NAME_TAGTYPE_ELT;

        public static TagType NUMEVALUATIONS_TAGTYPE_ELT;

        public static TagType SEED_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "5bfe0e67-fb3e-49db-a10e-7b62c4d44aed");
            MAXSTEPS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "664ec57a-18d2-485f-be50-e480e4b7c530");
            NAME_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "2a0aac55-08e8-41f2-aadf-3f6f20ffafb6");
            NUMEVALUATIONS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "20c47eda-b426-4986-bd63-940083400422");
            SEED_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "f26564b3-a099-4ce4-a6bf-560a2b4f9219");
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
