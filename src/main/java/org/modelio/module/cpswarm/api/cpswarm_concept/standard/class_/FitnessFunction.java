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
 * Proxy class to handle a {@link Class} with << FitnessFunction >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class FitnessFunction {
    public static final String STEREOTYPE_NAME = "FitnessFunction";

    public static final String MAXIMUMCANDIDATES_TAGTYPE = "maximumCandidates";

    public static final String MINIMUMCANDIDATES_TAGTYPE = "minimumCandidates";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    protected final Class elt;

    /**
     * Tells whether a {@link FitnessFunction proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << FitnessFunction >>.
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICPSwarmPeerModule.MODULE_NAME, FitnessFunction.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << FitnessFunction >> then instantiate a {@link FitnessFunction} proxy.
     * 
     * @return a {@link FitnessFunction} proxy on the created {@link Class}.
     */
    public static FitnessFunction create() {
        ModelElement e = (ModelElement)CPSwarmModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Class");
        e.addStereotype(ICPSwarmPeerModule.MODULE_NAME, FitnessFunction.STEREOTYPE_NAME);
        return FitnessFunction.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link FitnessFunction} proxy from a {@link Class} stereotyped << FitnessFunction >>checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Class
     * @return a {@link FitnessFunction} proxy or <i>null</i>.
     */
    public static FitnessFunction instantiate(final Class obj) {
        return FitnessFunction.canInstantiate(obj) ? new FitnessFunction(obj) : null;
    }

    /**
     * Tries to instantiate a {@link FitnessFunction} proxy from a {@link Class} stereotyped << FitnessFunction >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Class}
     * @return a {@link FitnessFunction} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static FitnessFunction safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (FitnessFunction.canInstantiate(obj))
            return new FitnessFunction(obj);
        else
            throw new IllegalArgumentException("FitnessFunction: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        FitnessFunction other = (FitnessFunction) obj;
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
     * Getter for string property 'maximumCandidates'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    public String getMaximumCandidates() {
        return this.elt.getTagValue(FitnessFunction.MdaTypes.MAXIMUMCANDIDATES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'minimumCandidates'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    public String getMinimumCandidates() {
        return this.elt.getTagValue(FitnessFunction.MdaTypes.MINIMUMCANDIDATES_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'maximumCandidates'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    public void setMaximumCandidates(final String value) {
        this.elt.putTagValue(FitnessFunction.MdaTypes.MAXIMUMCANDIDATES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'minimumCandidates'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    public void setMinimumCandidates(final String value) {
        this.elt.putTagValue(FitnessFunction.MdaTypes.MINIMUMCANDIDATES_TAGTYPE_ELT, value);
    }

    protected FitnessFunction(final Class elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType MINIMUMCANDIDATES_TAGTYPE_ELT;

        public static TagType MAXIMUMCANDIDATES_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "67792719-f8fd-47e6-b093-2c5244565789");
            MINIMUMCANDIDATES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "04028dbd-2c81-41f4-ade6-95da3f3a4fce");
            MAXIMUMCANDIDATES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d5d00754-2592-4ad8-bd95-bb22c7b80a78");
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
