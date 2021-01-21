/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v0.0.10

 * This file was generated on 7/24/20 11:19 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
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
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Class} with << ProvidedCommunicationInstance >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("9b989609-4137-4ea7-9a9f-9718fd0cf736")
public class ProvidedCommunicationInstance extends CommunicationPortInstance {
    @objid ("70373e04-a787-4680-bd23-30061d30e706")
    public static final String STEREOTYPE_NAME = "ProvidedCommunicationInstance";

    /**
     * Tells whether a {@link ProvidedCommunicationInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << ProvidedCommunicationInstance >>.
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("d9056b54-77f0-4e7f-ab41-0304849854cd")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ProvidedCommunicationInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << ProvidedCommunicationInstance >> then instantiate a {@link ProvidedCommunicationInstance} proxy.
     * 
     * @return a {@link ProvidedCommunicationInstance} proxy on the created {@link Class}.
     */
    @objid ("df0d5311-89d1-4435-b563-1bcad397cf7f")
    public static ProvidedCommunicationInstance create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, ProvidedCommunicationInstance.STEREOTYPE_NAME);
        return ProvidedCommunicationInstance.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link ProvidedCommunicationInstance} proxy from a {@link Class} stereotyped << ProvidedCommunicationInstance >>checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Class
     * @return a {@link ProvidedCommunicationInstance} proxy or <i>null</i>.
     */
    @objid ("910a52bf-0451-4e99-a788-9d987c09a3dc")
    public static ProvidedCommunicationInstance instantiate(final Class obj) {
        return ProvidedCommunicationInstance.canInstantiate(obj) ? new ProvidedCommunicationInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProvidedCommunicationInstance} proxy from a {@link Class} stereotyped << ProvidedCommunicationInstance >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Class}
     * @return a {@link ProvidedCommunicationInstance} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("2e9d0d33-7be3-4f01-ae39-f86b17fae9ee")
    public static ProvidedCommunicationInstance safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (ProvidedCommunicationInstance.canInstantiate(obj))
            return new ProvidedCommunicationInstance(obj);
        else
            throw new IllegalArgumentException("ProvidedCommunicationInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("242b882a-de70-4fef-922e-8c7ed3cf1d28")
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
        ProvidedCommunicationInstance other = (ProvidedCommunicationInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}.
     * 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("1fedc096-ffba-477a-87ac-58968df48e4e")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("4036a69b-547e-4758-9097-67b37323ffee")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("4d3d5c48-f2b3-4fe1-9631-2ee88b4be3fb")
    protected ProvidedCommunicationInstance(final Class elt) {
        super(elt);
    }

    @objid ("e7f783a1-f2ae-4167-8970-7584cb62082b")
    public static final class MdaTypes {
        @objid ("6319b6f2-5e0a-40bd-b07b-01bb0d67a184")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f1c62158-0eeb-4d70-bc6c-09eac6152efc")
        private static Stereotype MDAASSOCDEP;

        @objid ("9293e5d2-c48b-47ff-888d-f28e94d74864")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("88b5698e-71b4-48fc-9840-f5310568efc7")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "14dc9190-6dc2-4fc7-8b65-3133b305552f");
            MDAASSOCDEP = ctx.getModelingSession().findElementById(Stereotype.class, "94b7efa5-f94c-4d1d-896f-f103e56a8e2e");
            MDAASSOCDEP_ROLE = ctx.getModelingSession().findElementById(TagType.class, "7637f2fd-b750-43c1-a15c-5d0b084ca1cd");
        }


static {
        if(CamelDesignerModule.getInstance() != null) {
            init(CamelDesignerModule.getInstance().getModuleContext());
        }
    }
    }

}
