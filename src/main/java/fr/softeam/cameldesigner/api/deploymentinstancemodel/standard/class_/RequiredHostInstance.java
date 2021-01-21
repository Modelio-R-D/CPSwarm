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
 * Proxy class to handle a {@link Class} with << RequiredHostInstance >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("1de02adc-2ca8-4388-9b30-e8d146c43def")
public class RequiredHostInstance extends HostingPortInstance {
    @objid ("ee4add15-1bfb-4331-9afa-734ce40055b6")
    public static final String STEREOTYPE_NAME = "RequiredHostInstance";

    /**
     * Tells whether a {@link RequiredHostInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << RequiredHostInstance >>.
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("52946ce5-4dd1-41a3-ac8d-bde3be4ce07c")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, RequiredHostInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << RequiredHostInstance >> then instantiate a {@link RequiredHostInstance} proxy.
     * 
     * @return a {@link RequiredHostInstance} proxy on the created {@link Class}.
     */
    @objid ("71e76b48-56f9-4ec6-b474-7898bea5154c")
    public static RequiredHostInstance create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, RequiredHostInstance.STEREOTYPE_NAME);
        return RequiredHostInstance.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link RequiredHostInstance} proxy from a {@link Class} stereotyped << RequiredHostInstance >>checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Class
     * @return a {@link RequiredHostInstance} proxy or <i>null</i>.
     */
    @objid ("7ddd6b0b-e586-4b3c-bfe8-f835332701ee")
    public static RequiredHostInstance instantiate(final Class obj) {
        return RequiredHostInstance.canInstantiate(obj) ? new RequiredHostInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link RequiredHostInstance} proxy from a {@link Class} stereotyped << RequiredHostInstance >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Class}
     * @return a {@link RequiredHostInstance} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("f981fc2f-8f7e-426e-9ae9-fa3d380ff012")
    public static RequiredHostInstance safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (RequiredHostInstance.canInstantiate(obj))
            return new RequiredHostInstance(obj);
        else
            throw new IllegalArgumentException("RequiredHostInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("b1872c09-8251-4d17-b9d7-d58cc5a0d1bf")
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
        RequiredHostInstance other = (RequiredHostInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}.
     * 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("2e5be867-8d1b-4aa5-84b1-e3b8740b06fe")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("50519179-46fb-45d9-8e11-0b570d85e214")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("6f16fe62-f0db-41ec-aa17-2eadf56bbeae")
    protected RequiredHostInstance(final Class elt) {
        super(elt);
    }

    @objid ("1b8464aa-7b43-4cc5-ad04-54d90b1841f9")
    public static final class MdaTypes {
        @objid ("cb5cd890-0a16-4cae-a3d9-29e6574bd4ab")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("938b179d-0e79-4680-b627-3736884af73a")
        private static Stereotype MDAASSOCDEP;

        @objid ("d0442f43-d769-4cdd-bc30-200f33ec1df3")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2b7f9a0c-4ad9-4ab8-ad10-6cd860930001")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "7faad06c-bb7c-42a4-a44e-388b039ad4af");
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
