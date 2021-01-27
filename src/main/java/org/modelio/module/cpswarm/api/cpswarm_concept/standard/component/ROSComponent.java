/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CPSwarm v3.9.03

 * This file was generated on 4/15/20 8:10 AM by Modelio Studio.
 */
package org.modelio.module.cpswarm.api.cpswarm_concept.standard.component;

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
import org.modelio.metamodel.uml.statik.Component;
import org.modelio.module.cpswarm.api.CPSwarmProxyFactory;
import org.modelio.module.cpswarm.api.ICPSwarmPeerModule;
import org.modelio.module.cpswarm.impl.CPSwarmModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Component} with << ROSComponent >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
public class ROSComponent {
    public static final String STEREOTYPE_NAME = "ROSComponent";

    /**
     * The underlying {@link Component} represented by this proxy, never null.
     */
    protected final Component elt;

    /**
     * Tells whether a {@link ROSComponent proxy} can be instantiated from a {@link MObject} checking it is a {@link Component} stereotyped << ROSComponent >>.
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Component) && ((Component) elt).isStereotyped(ICPSwarmPeerModule.MODULE_NAME, ROSComponent.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Component} stereotyped << ROSComponent >> then instantiate a {@link ROSComponent} proxy.
     * 
     * @return a {@link ROSComponent} proxy on the created {@link Component}.
     */
    public static ROSComponent create() {
        ModelElement e = (ModelElement)CPSwarmModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Component");
        e.addStereotype(ICPSwarmPeerModule.MODULE_NAME, ROSComponent.STEREOTYPE_NAME);
        return ROSComponent.instantiate((Component)e);
    }

    /**
     * Tries to instantiate a {@link ROSComponent} proxy from a {@link Component} stereotyped << ROSComponent >>checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Component
     * @return a {@link ROSComponent} proxy or <i>null</i>.
     */
    public static ROSComponent instantiate(final Component obj) {
        return ROSComponent.canInstantiate(obj) ? new ROSComponent(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ROSComponent} proxy from a {@link Component} stereotyped << ROSComponent >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Component}
     * @return a {@link ROSComponent} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static ROSComponent safeInstantiate(final Component obj) throws IllegalArgumentException {
        if (ROSComponent.canInstantiate(obj))
            return new ROSComponent(obj);
        else
            throw new IllegalArgumentException("ROSComponent: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        ROSComponent other = (ROSComponent) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Component}.
     * 
     * @return the Component represented by this proxy, never null.
     */
    public Component getElement() {
        return this.elt;
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    protected ROSComponent(final Component elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "29dfda8e-6dff-4e42-8b00-a1c9d874a911");
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
