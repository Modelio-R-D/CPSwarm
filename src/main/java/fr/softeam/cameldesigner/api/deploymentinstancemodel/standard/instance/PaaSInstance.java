/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.00

 * This file was generated on 12/10/20 11:37 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance;

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
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Instance} with << PaaSInstance >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("dddfb99b-2d25-4bf8-a552-181e1549079a")
public class PaaSInstance extends ComponentInstance {
    @objid ("d98755c4-1076-4cc3-ae64-cbed7fdd4935")
    public static final String STEREOTYPE_NAME = "PaaSInstance";

    /**
     * Tells whether a {@link PaaSInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << PaaSInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("a6858b61-b8c6-41c3-b0bb-0b160ae14e1a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, PaaSInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << PaaSInstance >> then instantiate a {@link PaaSInstance} proxy.
     * 
     * @return a {@link PaaSInstance} proxy on the created {@link Instance}.
     */
    @objid ("0600c40f-619e-4cb3-9ae8-40ce2fa765ae")
    public static PaaSInstance create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Instance");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, PaaSInstance.STEREOTYPE_NAME);
        return PaaSInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link PaaSInstance} proxy from a {@link Instance} stereotyped << PaaSInstance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link PaaSInstance} proxy or <i>null</i>.
     */
    @objid ("f3399fc6-e0ef-40c6-adbf-8c09059ed220")
    public static PaaSInstance instantiate(final Instance obj) {
        return PaaSInstance.canInstantiate(obj) ? new PaaSInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link PaaSInstance} proxy from a {@link Instance} stereotyped << PaaSInstance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link PaaSInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("6c03f6ec-31fe-491a-8c35-1c5d7468efb4")
    public static PaaSInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (PaaSInstance.canInstantiate(obj))
        	return new PaaSInstance(obj);
        else
        	throw new IllegalArgumentException("PaaSInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("ac3c03aa-84e6-4087-b5ee-59e6335c228e")
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
        PaaSInstance other = (PaaSInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("c41c02d4-c7eb-4820-bd95-0148dd9ecfb7")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    @objid ("af09b6cd-505d-4f97-ac99-a5eb727f9805")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("2e7c52d1-4ac6-459e-9eeb-87cc8b0c7db9")
    protected PaaSInstance(final Instance elt) {
        super(elt);
    }

    @objid ("387fa399-3754-4069-9e53-4383d23163dc")
    public static final class MdaTypes {
        @objid ("232a9171-3e6a-4bf7-b6f2-f537e08c95aa")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("58faa779-fe21-4911-a657-ff142ecdc260")
        private static Stereotype MDAASSOCDEP;

        @objid ("23ebe057-d825-42df-bbdf-879bd2019c46")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("78dd6ff5-f44d-4d9b-aada-ea6ad6641aac")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "8d6e2b24-ed30-4aad-9c44-39b18b4c76d8");
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
