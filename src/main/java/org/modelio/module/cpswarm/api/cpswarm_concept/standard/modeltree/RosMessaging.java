/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CPSwarm v3.9.03

 * This file was generated on 3/27/20 5:27 PM by Modelio Studio.
 */
package org.modelio.module.cpswarm.api.cpswarm_concept.standard.modeltree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.module.cpswarm.api.CPSwarmProxyFactory;
import org.modelio.module.cpswarm.api.ICPSwarmPeerModule;
import org.modelio.module.cpswarm.impl.CPSwarmModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link ModelTree} with << RosMessaging >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
public abstract class RosMessaging {
    public static final String STEREOTYPE_NAME = "RosMessaging";

    public static final String PREFIX_TAGTYPE = "prefix";

    /**
     * The underlying {@link ModelTree} represented by this proxy, never null.
     */
    protected final ModelTree elt;

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
        RosMessaging other = (RosMessaging) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelTree}.
     * 
     * @return the ModelTree represented by this proxy, never null.
     */
    public ModelTree getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'prefix'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    public String getPrefix() {
        return this.elt.getTagValue(RosMessaging.MdaTypes.PREFIX_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'prefix'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    public void setPrefix(final String value) {
        this.elt.putTagValue(RosMessaging.MdaTypes.PREFIX_TAGTYPE_ELT, value);
    }

    protected RosMessaging(final ModelTree elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType PREFIX_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "b1e7d7ef-a99a-4ade-84a3-fe0190b3d9ba");
            PREFIX_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "58072df4-2eeb-48ef-b169-d99b9bb5c6ba");
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
