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
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.Feature;
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
 * Proxy class to handle a {@link Class} with << CommunicationPortInstance >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("9d5c718b-9435-4589-a6d7-7f200b8c2dc2")
public class CommunicationPortInstance extends Feature {
    @objid ("8b42022a-b462-4c28-bb51-6d9a0624f08b")
    public static final String STEREOTYPE_NAME = "CommunicationPortInstance";

    /**
     * Tells whether a {@link CommunicationPortInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << CommunicationPortInstance >>.
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("d391ed7b-7753-404a-9437-0cee209233ad")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CommunicationPortInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << CommunicationPortInstance >> then instantiate a {@link CommunicationPortInstance} proxy.
     * 
     * @return a {@link CommunicationPortInstance} proxy on the created {@link Class}.
     */
    @objid ("a7f7e877-0ce1-4387-ac8f-d57f57b49af3")
    public static CommunicationPortInstance create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, CommunicationPortInstance.STEREOTYPE_NAME);
        return CommunicationPortInstance.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link CommunicationPortInstance} proxy from a {@link Class} stereotyped << CommunicationPortInstance >>checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Class
     * @return a {@link CommunicationPortInstance} proxy or <i>null</i>.
     */
    @objid ("17f1fb2f-0a08-408a-a57f-048395f49b19")
    public static CommunicationPortInstance instantiate(final Class obj) {
        return CommunicationPortInstance.canInstantiate(obj) ? new CommunicationPortInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link CommunicationPortInstance} proxy from a {@link Class} stereotyped << CommunicationPortInstance >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Class}
     * @return a {@link CommunicationPortInstance} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("e42cc7fc-430f-4061-bbee-94fb14e70c3b")
    public static CommunicationPortInstance safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (CommunicationPortInstance.canInstantiate(obj))
            return new CommunicationPortInstance(obj);
        else
            throw new IllegalArgumentException("CommunicationPortInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("be4594a5-1bdb-4781-9a40-7912cf4e64a4")
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
        CommunicationPortInstance other = (CommunicationPortInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}.
     * 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("b29b641c-eb5a-4a33-8efd-f342787244ae")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("66d367e7-13f2-4d67-889f-0b370d9df0a1")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("e43c7e1e-4cbf-4b06-9b95-f594badab1d7")
    protected CommunicationPortInstance(final Class elt) {
        super(elt);
    }

    @objid ("646a537b-eb5e-4552-8106-645c9ae156ec")
    public static final class MdaTypes {
        @objid ("f827cfb2-b11b-46a8-aff3-685d65f8cd62")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b75c8a21-64aa-42c1-8325-604940172ce4")
        private static Stereotype MDAASSOCDEP;

        @objid ("0937062c-353e-4103-915d-8437cfda9ea8")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("91ccffdc-1e9a-4204-9a20-6517431644ad")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "4f812306-2046-41d0-895a-096c9d094143");
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
