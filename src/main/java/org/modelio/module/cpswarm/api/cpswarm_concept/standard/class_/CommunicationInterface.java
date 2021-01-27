/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CPSwarm v3.9.03

 * This file was generated on 4/15/20 8:10 AM by Modelio Studio.
 */
package org.modelio.module.cpswarm.api.cpswarm_concept.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
 * Proxy class to handle a {@link Class} with << CommunicationInterface >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
public class CommunicationInterface extends CPSwarmComponent {
    public static final String STEREOTYPE_NAME = "CommunicationInterface";

    public static final String COMMUNICATIONPARAMS_TAGTYPE = "communicationParams";

    public static final String COMMUNICATIONTYPE_TAGTYPE = "communicationType";

    /**
     * Tells whether a {@link CommunicationInterface proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << CommunicationInterface >>.
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICPSwarmPeerModule.MODULE_NAME, CommunicationInterface.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << CommunicationInterface >> then instantiate a {@link CommunicationInterface} proxy.
     * 
     * @return a {@link CommunicationInterface} proxy on the created {@link Class}.
     */
    public static CommunicationInterface create() {
        ModelElement e = (ModelElement)CPSwarmModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Class");
        e.addStereotype(ICPSwarmPeerModule.MODULE_NAME, CommunicationInterface.STEREOTYPE_NAME);
        return CommunicationInterface.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link CommunicationInterface} proxy from a {@link Class} stereotyped << CommunicationInterface >>checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Class
     * @return a {@link CommunicationInterface} proxy or <i>null</i>.
     */
    public static CommunicationInterface instantiate(final Class obj) {
        return CommunicationInterface.canInstantiate(obj) ? new CommunicationInterface(obj) : null;
    }

    /**
     * Tries to instantiate a {@link CommunicationInterface} proxy from a {@link Class} stereotyped << CommunicationInterface >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Class}
     * @return a {@link CommunicationInterface} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static CommunicationInterface safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (CommunicationInterface.canInstantiate(obj))
            return new CommunicationInterface(obj);
        else
            throw new IllegalArgumentException("CommunicationInterface: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        CommunicationInterface other = (CommunicationInterface) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for List<String> property 'communicationParams'
     * <p>Property description:<br/>
     * <i>null</i></p>
     */
    public List<String> getCommunicationParams() {
        return this.elt.getTagValues(CommunicationInterface.MdaTypes.COMMUNICATIONPARAMS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'communicationType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    public String getCommunicationType() {
        return this.elt.getTagValue(CommunicationInterface.MdaTypes.COMMUNICATIONTYPE_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Class}.
     * 
     * @return the Class represented by this proxy, never null.
     */
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'communicationParams'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    public void setCommunicationParams(final List<String> values) {
        this.elt.putTagValues(CommunicationInterface.MdaTypes.COMMUNICATIONPARAMS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'communicationType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    public void setCommunicationType(final String value) {
        this.elt.putTagValue(CommunicationInterface.MdaTypes.COMMUNICATIONTYPE_TAGTYPE_ELT, value);
    }

    protected CommunicationInterface(final Class elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType COMMUNICATIONTYPE_TAGTYPE_ELT;

        public static TagType COMMUNICATIONPARAMS_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "6893d58e-559b-4b17-93d5-6172401f6980");
            COMMUNICATIONTYPE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "c3d7a97c-f68b-46d1-ba9e-aa7cad603d4a");
            COMMUNICATIONPARAMS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "362bdaaf-d951-4437-8fad-0d5bfaee39d4");
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
