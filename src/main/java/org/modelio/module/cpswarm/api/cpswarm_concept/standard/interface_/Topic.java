/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CPSwarm v3.9.03

 * This file was generated on 4/6/20 4:14 PM by Modelio Studio.
 */
package org.modelio.module.cpswarm.api.cpswarm_concept.standard.interface_;

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
import org.modelio.metamodel.uml.statik.Interface;
import org.modelio.module.cpswarm.api.CPSwarmProxyFactory;
import org.modelio.module.cpswarm.api.ICPSwarmPeerModule;
import org.modelio.module.cpswarm.impl.CPSwarmModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Interface} with << Topic >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
public class Topic {
    public static final String STEREOTYPE_NAME = "Topic";

    /**
     * The underlying {@link Interface} represented by this proxy, never null.
     */
    protected final Interface elt;

    /**
     * Tells whether a {@link Topic proxy} can be instantiated from a {@link MObject} checking it is a {@link Interface} stereotyped << Topic >>.
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Interface) && ((Interface) elt).isStereotyped(ICPSwarmPeerModule.MODULE_NAME, Topic.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Interface} stereotyped << Topic >> then instantiate a {@link Topic} proxy.
     * 
     * @return a {@link Topic} proxy on the created {@link Interface}.
     */
    public static Topic create() {
        ModelElement e = (ModelElement)CPSwarmModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Interface");
        e.addStereotype(ICPSwarmPeerModule.MODULE_NAME, Topic.STEREOTYPE_NAME);
        return Topic.instantiate((Interface)e);
    }

    /**
     * Tries to instantiate a {@link Topic} proxy from a {@link Interface} stereotyped << Topic >>checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Interface
     * @return a {@link Topic} proxy or <i>null</i>.
     */
    public static Topic instantiate(final Interface obj) {
        return Topic.canInstantiate(obj) ? new Topic(obj) : null;
    }

    /**
     * Tries to instantiate a {@link Topic} proxy from a {@link Interface} stereotyped << Topic >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Interface}
     * @return a {@link Topic} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static Topic safeInstantiate(final Interface obj) throws IllegalArgumentException {
        if (Topic.canInstantiate(obj))
            return new Topic(obj);
        else
            throw new IllegalArgumentException("Topic: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        Topic other = (Topic) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Interface}.
     * 
     * @return the Interface represented by this proxy, never null.
     */
    public Interface getElement() {
        return this.elt;
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    protected Topic(final Interface elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "8029f5c0-1f69-4fc0-abc6-705d4692a835");
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
