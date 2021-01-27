/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CPSwarm v3.9.03

 * This file was generated on 4/15/20 8:10 AM by Modelio Studio.
 */
package org.modelio.module.cpswarm.api.cpswarm_concept.standard.package_;

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
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.module.cpswarm.api.CPSwarmProxyFactory;
import org.modelio.module.cpswarm.api.ICPSwarmPeerModule;
import org.modelio.module.cpswarm.impl.CPSwarmModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Package} with << EnvironmentDefinition >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class EnvironmentDefinition {
    public static final String STEREOTYPE_NAME = "EnvironmentDefinition";

    /**
     * The underlying {@link Package} represented by this proxy, never null.
     */
    protected final Package elt;

    /**
     * Tells whether a {@link EnvironmentDefinition proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << EnvironmentDefinition >>.
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICPSwarmPeerModule.MODULE_NAME, EnvironmentDefinition.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Package} stereotyped << EnvironmentDefinition >> then instantiate a {@link EnvironmentDefinition} proxy.
     * 
     * @return a {@link EnvironmentDefinition} proxy on the created {@link Package}.
     */
    public static EnvironmentDefinition create() {
        ModelElement e = (ModelElement)CPSwarmModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Package");
        e.addStereotype(ICPSwarmPeerModule.MODULE_NAME, EnvironmentDefinition.STEREOTYPE_NAME);
        return EnvironmentDefinition.instantiate((Package)e);
    }

    /**
     * Tries to instantiate a {@link EnvironmentDefinition} proxy from a {@link Package} stereotyped << EnvironmentDefinition >>checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Package
     * @return a {@link EnvironmentDefinition} proxy or <i>null</i>.
     */
    public static EnvironmentDefinition instantiate(final Package obj) {
        return EnvironmentDefinition.canInstantiate(obj) ? new EnvironmentDefinition(obj) : null;
    }

    /**
     * Tries to instantiate a {@link EnvironmentDefinition} proxy from a {@link Package} stereotyped << EnvironmentDefinition >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Package}
     * @return a {@link EnvironmentDefinition} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static EnvironmentDefinition safeInstantiate(final Package obj) throws IllegalArgumentException {
        if (EnvironmentDefinition.canInstantiate(obj))
            return new EnvironmentDefinition(obj);
        else
            throw new IllegalArgumentException("EnvironmentDefinition: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        EnvironmentDefinition other = (EnvironmentDefinition) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Package}.
     * 
     * @return the Package represented by this proxy, never null.
     */
    public Package getElement() {
        return this.elt;
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    protected EnvironmentDefinition(final Package elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "308a413a-7415-46f0-b2f5-3a0abc21a4b4");
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
