/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CPSwarm v3.9.03

 * This file was generated on 4/15/20 8:10 AM by Modelio Studio.
 */
package org.modelio.module.cpswarm.api.cpswarm_concept.standard.umlmodelelement;

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
import org.modelio.metamodel.uml.infrastructure.UmlModelElement;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.module.cpswarm.api.CPSwarmProxyFactory;
import org.modelio.module.cpswarm.api.ICPSwarmPeerModule;
import org.modelio.module.cpswarm.impl.CPSwarmModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link UmlModelElement} with << OptimisedArgument >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
public class OptimisedArgument {
    public static final String STEREOTYPE_NAME = "OptimisedArgument";

    public static final String MAX_TAGTYPE = "max";

    public static final String MIN_TAGTYPE = "min";

    public static final String SCALE_TAGTYPE = "scale";

    /**
     * The underlying {@link UmlModelElement} represented by this proxy, never null.
     */
    protected final UmlModelElement elt;

    /**
     * Tells whether a {@link OptimisedArgument proxy} can be instantiated from a {@link MObject} checking it is a {@link UmlModelElement} stereotyped << OptimisedArgument >>.
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof UmlModelElement) && ((UmlModelElement) elt).isStereotyped(ICPSwarmPeerModule.MODULE_NAME, OptimisedArgument.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link UmlModelElement} stereotyped << OptimisedArgument >> then instantiate a {@link OptimisedArgument} proxy.
     * 
     * @return a {@link OptimisedArgument} proxy on the created {@link UmlModelElement}.
     */
    public static OptimisedArgument create() {
        ModelElement e = (ModelElement)CPSwarmModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("UmlModelElement");
        e.addStereotype(ICPSwarmPeerModule.MODULE_NAME, OptimisedArgument.STEREOTYPE_NAME);
        return OptimisedArgument.instantiate((UmlModelElement)e);
    }

    /**
     * Tries to instantiate a {@link OptimisedArgument} proxy from a {@link UmlModelElement} stereotyped << OptimisedArgument >>checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a UmlModelElement
     * @return a {@link OptimisedArgument} proxy or <i>null</i>.
     */
    public static OptimisedArgument instantiate(final UmlModelElement obj) {
        return OptimisedArgument.canInstantiate(obj) ? new OptimisedArgument(obj) : null;
    }

    /**
     * Tries to instantiate a {@link OptimisedArgument} proxy from a {@link UmlModelElement} stereotyped << OptimisedArgument >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link UmlModelElement}
     * @return a {@link OptimisedArgument} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static OptimisedArgument safeInstantiate(final UmlModelElement obj) throws IllegalArgumentException {
        if (OptimisedArgument.canInstantiate(obj))
            return new OptimisedArgument(obj);
        else
            throw new IllegalArgumentException("OptimisedArgument: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        OptimisedArgument other = (OptimisedArgument) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link UmlModelElement}.
     * 
     * @return the UmlModelElement represented by this proxy, never null.
     */
    public UmlModelElement getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'max'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    public String getMax() {
        return this.elt.getTagValue(OptimisedArgument.MdaTypes.MAX_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'min'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    public String getMin() {
        return this.elt.getTagValue(OptimisedArgument.MdaTypes.MIN_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'scale'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    public String getScale() {
        return this.elt.getTagValue(OptimisedArgument.MdaTypes.SCALE_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'max'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    public void setMax(final String value) {
        this.elt.putTagValue(OptimisedArgument.MdaTypes.MAX_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'min'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    public void setMin(final String value) {
        this.elt.putTagValue(OptimisedArgument.MdaTypes.MIN_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'scale'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    public void setScale(final String value) {
        this.elt.putTagValue(OptimisedArgument.MdaTypes.SCALE_TAGTYPE_ELT, value);
    }

    protected OptimisedArgument(final UmlModelElement elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType SCALE_TAGTYPE_ELT;

        public static TagType MIN_TAGTYPE_ELT;

        public static TagType MAX_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "df23066a-482d-4ac0-a757-7e581cee88c7");
            SCALE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "2d02c528-765e-468c-b610-8636b5739291");
            MIN_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4f414038-8f63-4816-a52e-df06287dbf0e");
            MAX_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "51f3d8f5-ef5d-4e0a-ad42-a3eda4e5e78a");
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
