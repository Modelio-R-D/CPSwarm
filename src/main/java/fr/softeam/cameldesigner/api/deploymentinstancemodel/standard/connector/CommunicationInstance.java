/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.00

 * This file was generated on 12/10/20 11:37 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.connector;

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
 * Proxy class to handle a {@link Connector} with << CommunicationInstance >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("355d42b2-d4dd-49ae-bfd1-58fbf281ecd1")
public class CommunicationInstance extends ComponentRelationInstance {
    @objid ("7b403dd2-6e2f-4b5e-a62a-6402890ce31d")
    public static final String STEREOTYPE_NAME = "CommunicationInstance";

    /**
     * Tells whether a {@link CommunicationInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Connector} stereotyped << CommunicationInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("2ceee59c-6d08-4d9a-97d8-ce016729d6d4")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Connector) && ((Connector) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CommunicationInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Connector} stereotyped << CommunicationInstance >> then instantiate a {@link CommunicationInstance} proxy.
     * 
     * @return a {@link CommunicationInstance} proxy on the created {@link Connector}.
     */
    @objid ("25c1635e-28e4-46a9-8a7c-01f09b1d09a9")
    public static CommunicationInstance create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Connector");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, CommunicationInstance.STEREOTYPE_NAME);
        return CommunicationInstance.instantiate((Connector)e);
    }

    /**
     * Tries to instantiate a {@link CommunicationInstance} proxy from a {@link Connector} stereotyped << CommunicationInstance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Connector
     * @return a {@link CommunicationInstance} proxy or <i>null</i>.
     */
    @objid ("eeb9555d-b7ad-4432-ae6e-702376bc07ac")
    public static CommunicationInstance instantiate(final Connector obj) {
        return CommunicationInstance.canInstantiate(obj) ? new CommunicationInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link CommunicationInstance} proxy from a {@link Connector} stereotyped << CommunicationInstance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Connector}
     * @return a {@link CommunicationInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("97e3e32e-dc0c-4c58-b598-4e398cd57cf4")
    public static CommunicationInstance safeInstantiate(final Connector obj) throws IllegalArgumentException {
        if (CommunicationInstance.canInstantiate(obj))
        	return new CommunicationInstance(obj);
        else
        	throw new IllegalArgumentException("CommunicationInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("e14fee5c-99fb-4976-b06e-477a73e7b2d6")
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
        CommunicationInstance other = (CommunicationInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Connector}. 
     * @return the Connector represented by this proxy, never null.
     */
    @objid ("9cce376c-689a-4b19-ae4f-6fd1541fecd7")
    @Override
    public Connector getElement() {
        return (Connector)super.getElement();
    }

    @objid ("1b8e4dbd-0c68-4a79-b4fc-4b9471bbde5e")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("2aac0732-f84d-4f49-b769-558e718aab20")
    protected CommunicationInstance(final Connector elt) {
        super(elt);
    }

    @objid ("cf21fdd9-ead8-4cfe-914e-4a923f9c983f")
    public static final class MdaTypes {
        @objid ("d1ab9ce1-8aa5-4789-bc6d-5a98ad03e20a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("3cd2dce8-443a-4df1-97b8-d42586cadc77")
        private static Stereotype MDAASSOCDEP;

        @objid ("d6a5e25b-f297-43a3-8981-780c205a6ef3")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c76fef27-63a2-4652-9656-34d6ff04463d")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "479fff80-8075-4f90-b7f8-e148699ee433");
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
