/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CPSwarm v3.9.03

 * This file was generated on 4/15/20 8:10 AM by Modelio Studio.
 */
package org.modelio.module.cpswarm.api.cpswarm_concept.standard.parameter;

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
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.module.cpswarm.api.CPSwarmProxyFactory;
import org.modelio.module.cpswarm.api.ICPSwarmPeerModule;
import org.modelio.module.cpswarm.api.cpswarm_concept.standard.umlmodelelement.OptimisedArgument;
import org.modelio.module.cpswarm.impl.CPSwarmModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Parameter} with << Optimised_Parameter >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
public class OptimisedParameter extends OptimisedArgument {
    public static final String STEREOTYPE_NAME = "Optimised_Parameter";

    public static final String FILE_TAGTYPE = "file";

    /**
     * Tells whether a {@link OptimisedParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << Optimised_Parameter >>.
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(ICPSwarmPeerModule.MODULE_NAME, OptimisedParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << Optimised_Parameter >> then instantiate a {@link OptimisedParameter} proxy.
     * 
     * @return a {@link OptimisedParameter} proxy on the created {@link Parameter}.
     */
    public static OptimisedParameter create() {
        ModelElement e = (ModelElement)CPSwarmModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Parameter");
        e.addStereotype(ICPSwarmPeerModule.MODULE_NAME, OptimisedParameter.STEREOTYPE_NAME);
        return OptimisedParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link OptimisedParameter} proxy from a {@link Parameter} stereotyped << Optimised_Parameter >>checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Parameter
     * @return a {@link OptimisedParameter} proxy or <i>null</i>.
     */
    public static OptimisedParameter instantiate(final Parameter obj) {
        return OptimisedParameter.canInstantiate(obj) ? new OptimisedParameter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link OptimisedParameter} proxy from a {@link Parameter} stereotyped << Optimised_Parameter >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Parameter}
     * @return a {@link OptimisedParameter} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static OptimisedParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (OptimisedParameter.canInstantiate(obj))
            return new OptimisedParameter(obj);
        else
            throw new IllegalArgumentException("OptimisedParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        OptimisedParameter other = (OptimisedParameter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Parameter}.
     * 
     * @return the Parameter represented by this proxy, never null.
     */
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    /**
     * Getter for string property 'file'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    public String getFile() {
        return this.elt.getTagValue(OptimisedParameter.MdaTypes.FILE_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'file'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    public void setFile(final String value) {
        this.elt.putTagValue(OptimisedParameter.MdaTypes.FILE_TAGTYPE_ELT, value);
    }

    protected OptimisedParameter(final Parameter elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType FILE_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "3d061da0-d6df-4f49-902a-3abc6419139e");
            FILE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0ee88c79-d86d-43ec-b709-0ffa72aacac6");
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
