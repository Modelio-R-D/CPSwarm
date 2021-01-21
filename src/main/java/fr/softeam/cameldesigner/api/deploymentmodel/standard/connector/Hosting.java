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
 * Proxy class to handle a {@link Connector} with << Hosting >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("48ee1919-d6f2-4da9-bbe0-d4d5b45b6d43")
public class Hosting extends ComponentRelation {
    @objid ("f51faf54-ea7a-42f1-99ee-192d08cec7b5")
    public static final String STEREOTYPE_NAME = "Hosting";

    /**
     * Tells whether a {@link Hosting proxy} can be instantiated from a {@link MObject} checking it is a {@link Connector} stereotyped << Hosting >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("e42c1558-1d91-4715-bf71-28b6525e71bd")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Connector) && ((Connector) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Hosting.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Connector} stereotyped << Hosting >> then instantiate a {@link Hosting} proxy.
     * 
     * @return a {@link Hosting} proxy on the created {@link Connector}.
     */
    @objid ("1009b3b0-fb15-4cf2-9aa8-82e6560e3687")
    public static Hosting create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Connector");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, Hosting.STEREOTYPE_NAME);
        return Hosting.instantiate((Connector)e);
    }

    /**
     * Tries to instantiate a {@link Hosting} proxy from a {@link Connector} stereotyped << Hosting >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Connector
     * @return a {@link Hosting} proxy or <i>null</i>.
     */
    @objid ("75fe127a-cd87-4ec1-9cee-4cf2927646a7")
    public static Hosting instantiate(final Connector obj) {
        return Hosting.canInstantiate(obj) ? new Hosting(obj) : null;
    }

    /**
     * Tries to instantiate a {@link Hosting} proxy from a {@link Connector} stereotyped << Hosting >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Connector}
     * @return a {@link Hosting} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("7f463f97-02ce-4426-bce3-a1db1b02efac")
    public static Hosting safeInstantiate(final Connector obj) throws IllegalArgumentException {
        if (Hosting.canInstantiate(obj))
        	return new Hosting(obj);
        else
        	throw new IllegalArgumentException("Hosting: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("00212af3-1f6c-40c3-96c4-f84c6427d667")
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
        Hosting other = (Hosting) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Connector}. 
     * @return the Connector represented by this proxy, never null.
     */
    @objid ("9a9e31bb-681a-411b-969a-c66d31aa7018")
    @Override
    public Connector getElement() {
        return (Connector)super.getElement();
    }

    @objid ("7bc9fb7a-3907-4cae-a95c-e14b15ca52c6")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("ce76431f-4b54-4e22-bf96-f3527d68394f")
    protected Hosting(final Connector elt) {
        super(elt);
    }

    @objid ("71058a75-05c8-4604-b534-ff2d31f52287")
    public static final class MdaTypes {
        @objid ("869e785d-8e1e-4db0-8373-918070a9ef72")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c2f2aad4-d962-44d2-83d6-7c09f093b41b")
        private static Stereotype MDAASSOCDEP;

        @objid ("c7a550dd-77dc-4da5-914f-1c5772da1a23")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d4a934f2-8483-4e77-a429-7f4f7e36c1bf")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "d727bc20-8640-446b-8252-f7e3783e8efe");
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
