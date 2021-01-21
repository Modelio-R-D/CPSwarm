/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.00

 * This file was generated on 12/10/20 11:37 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.deploymentmodel.standard.connector;

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
import org.modelio.metamodel.uml.statik.Connector;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Connector} with << Communication >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("f5a1e8b4-c495-4efa-a525-7238dae641c0")
public class Communication extends ComponentRelation {
    @objid ("a1d440a0-8a5c-4635-8d86-b48cfa1e2c92")
    public static final String STEREOTYPE_NAME = "Communication";

    /**
     * Tells whether a {@link Communication proxy} can be instantiated from a {@link MObject} checking it is a {@link Connector} stereotyped << Communication >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("f85c35c3-8bb3-451e-b281-b0e133efe71e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Connector) && ((Connector) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Communication.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Connector} stereotyped << Communication >> then instantiate a {@link Communication} proxy.
     * 
     * @return a {@link Communication} proxy on the created {@link Connector}.
     */
    @objid ("9b03be25-fd42-41e0-bc22-d154411ae5bd")
    public static Communication create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Connector");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, Communication.STEREOTYPE_NAME);
        return Communication.instantiate((Connector)e);
    }

    /**
     * Tries to instantiate a {@link Communication} proxy from a {@link Connector} stereotyped << Communication >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Connector
     * @return a {@link Communication} proxy or <i>null</i>.
     */
    @objid ("46b8627c-b923-4212-a8d1-65fff9cf685a")
    public static Communication instantiate(final Connector obj) {
        return Communication.canInstantiate(obj) ? new Communication(obj) : null;
    }

    /**
     * Tries to instantiate a {@link Communication} proxy from a {@link Connector} stereotyped << Communication >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Connector}
     * @return a {@link Communication} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("3e391147-e4a3-4d26-bf6f-8041c7e003f6")
    public static Communication safeInstantiate(final Connector obj) throws IllegalArgumentException {
        if (Communication.canInstantiate(obj))
        	return new Communication(obj);
        else
        	throw new IllegalArgumentException("Communication: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("fd14fefb-3b9e-495d-81c9-28f5e0ecc94a")
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
        Communication other = (Communication) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Connector}. 
     * @return the Connector represented by this proxy, never null.
     */
    @objid ("91d4577b-2c00-43e5-85aa-954b669e3a05")
    @Override
    public Connector getElement() {
        return (Connector)super.getElement();
    }

    @objid ("08714490-6466-4df3-9efd-a410d28b0d68")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("608a7777-84c9-4637-8318-83bce8b1b8d1")
    protected Communication(final Connector elt) {
        super(elt);
    }

    @objid ("32a673a4-c270-4514-b3a4-c875b717ae42")
    public static final class MdaTypes {
        @objid ("44188e27-d636-4af7-80f9-be4fe4812384")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ab18e18b-96d3-4db9-9e0a-32724936130b")
        private static Stereotype MDAASSOCDEP;

        @objid ("0664e7e8-4a0d-42a5-a1cf-8203b8d01553")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c0cb6e66-aed9-4095-9dba-da53829c617f")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "141875d2-e648-4750-9fff-84c1b21e9b54");
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
