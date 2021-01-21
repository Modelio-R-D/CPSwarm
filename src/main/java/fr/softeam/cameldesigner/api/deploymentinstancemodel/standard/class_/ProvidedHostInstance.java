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
 * Proxy class to handle a {@link Class} with << ProvidedHostInstance >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("d69d21c3-6c3e-44ea-8d45-038dd626525b")
public class ProvidedHostInstance extends HostingPortInstance {
    @objid ("e1175d96-6c55-44a8-9614-5cb74c1a010c")
    public static final String STEREOTYPE_NAME = "ProvidedHostInstance";

    /**
     * Tells whether a {@link ProvidedHostInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << ProvidedHostInstance >>.
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("1fe32605-d9f4-4f70-ac69-b83636a69ea9")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ProvidedHostInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << ProvidedHostInstance >> then instantiate a {@link ProvidedHostInstance} proxy.
     * 
     * @return a {@link ProvidedHostInstance} proxy on the created {@link Class}.
     */
    @objid ("34c63470-3147-4575-88fa-e1b6181cc0c1")
    public static ProvidedHostInstance create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, ProvidedHostInstance.STEREOTYPE_NAME);
        return ProvidedHostInstance.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link ProvidedHostInstance} proxy from a {@link Class} stereotyped << ProvidedHostInstance >>checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Class
     * @return a {@link ProvidedHostInstance} proxy or <i>null</i>.
     */
    @objid ("ca8d30d9-ee35-4a45-92c2-fac43e661240")
    public static ProvidedHostInstance instantiate(final Class obj) {
        return ProvidedHostInstance.canInstantiate(obj) ? new ProvidedHostInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProvidedHostInstance} proxy from a {@link Class} stereotyped << ProvidedHostInstance >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Class}
     * @return a {@link ProvidedHostInstance} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("4360d2c0-91ba-49af-baca-b555fefd9391")
    public static ProvidedHostInstance safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (ProvidedHostInstance.canInstantiate(obj))
            return new ProvidedHostInstance(obj);
        else
            throw new IllegalArgumentException("ProvidedHostInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("05aaf9f6-754f-4fcf-909b-7d8213ffa3a1")
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
        ProvidedHostInstance other = (ProvidedHostInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}.
     * 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("001e887c-6459-42d6-a5ca-13b5f6738748")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("672d1bd0-a6fb-4c3f-901c-4ee40e2ec4bd")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("c7e0df99-d996-4a76-8736-f425cb468991")
    protected ProvidedHostInstance(final Class elt) {
        super(elt);
    }

    @objid ("28699506-866e-44d9-896f-7ef61577ccbb")
    public static final class MdaTypes {
        @objid ("73b0e601-a0e6-4df3-9284-3e18a4da3aa6")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("2e16acc7-f1c8-4601-9b20-14b554190d11")
        private static Stereotype MDAASSOCDEP;

        @objid ("32b365c0-a4e2-4c18-9c2b-03f14e1d6486")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f68d4a4d-194e-439a-887f-d1f8604b0aef")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "2c50eddf-762f-492a-9bbd-1760ba8eac6a");
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
