/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CPSwarm v3.9.03

 * This file was generated on 4/6/20 9:22 AM by Modelio Studio.
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
 * Proxy class to handle a {@link Package} with << ROSRoot >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
public class ROSRoot {
    public static final String STEREOTYPE_NAME = "ROSRoot";

    /**
     * The underlying {@link Package} represented by this proxy, never null.
     */
    protected final Package elt;

    /**
     * Tells whether a {@link ROSRoot proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << ROSRoot >>.
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICPSwarmPeerModule.MODULE_NAME, ROSRoot.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Package} stereotyped << ROSRoot >> then instantiate a {@link ROSRoot} proxy.
     * 
     * @return a {@link ROSRoot} proxy on the created {@link Package}.
     */
    public static ROSRoot create() {
        ModelElement e = (ModelElement)CPSwarmModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Package");
        e.addStereotype(ICPSwarmPeerModule.MODULE_NAME, ROSRoot.STEREOTYPE_NAME);
        return ROSRoot.instantiate((Package)e);
    }

    /**
     * Tries to instantiate a {@link ROSRoot} proxy from a {@link Package} stereotyped << ROSRoot >>checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Package
     * @return a {@link ROSRoot} proxy or <i>null</i>.
     */
    public static ROSRoot instantiate(final Package obj) {
        return ROSRoot.canInstantiate(obj) ? new ROSRoot(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ROSRoot} proxy from a {@link Package} stereotyped << ROSRoot >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Package}
     * @return a {@link ROSRoot} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static ROSRoot safeInstantiate(final Package obj) throws IllegalArgumentException {
        if (ROSRoot.canInstantiate(obj))
            return new ROSRoot(obj);
        else
            throw new IllegalArgumentException("ROSRoot: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        ROSRoot other = (ROSRoot) obj;
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

    protected ROSRoot(final Package elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "20427d35-0067-4d93-a775-75061dd4ba21");
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
