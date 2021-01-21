/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.00

 * This file was generated on 12/10/20 11:37 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.requirementmodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.requirementmodel.standard.generalclass.ScaleRequirement;
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
 * Proxy class to handle a {@link Class} with << VerticalScaleRequirement >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("b293b21a-97ae-47e2-95a3-32cbf8990a9b")
public class VerticalScaleRequirement extends ScaleRequirement {
    @objid ("eeb5fcfa-9528-47e7-a862-47b60e01916e")
    public static final String STEREOTYPE_NAME = "VerticalScaleRequirement";

    /**
     * Tells whether a {@link VerticalScaleRequirement proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << VerticalScaleRequirement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("7c644d50-13b8-49a0-9d51-13f9413afaa7")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, VerticalScaleRequirement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << VerticalScaleRequirement >> then instantiate a {@link VerticalScaleRequirement} proxy.
     * 
     * @return a {@link VerticalScaleRequirement} proxy on the created {@link Class}.
     */
    @objid ("840431f8-8f60-4ecd-bc84-2ee53d2c0541")
    public static VerticalScaleRequirement create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, VerticalScaleRequirement.STEREOTYPE_NAME);
        return VerticalScaleRequirement.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link VerticalScaleRequirement} proxy from a {@link Class} stereotyped << VerticalScaleRequirement >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link VerticalScaleRequirement} proxy or <i>null</i>.
     */
    @objid ("19af373a-8808-488a-a017-862f750e17aa")
    public static VerticalScaleRequirement instantiate(final Class obj) {
        return VerticalScaleRequirement.canInstantiate(obj) ? new VerticalScaleRequirement(obj) : null;
    }

    /**
     * Tries to instantiate a {@link VerticalScaleRequirement} proxy from a {@link Class} stereotyped << VerticalScaleRequirement >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link VerticalScaleRequirement} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("1596ee28-8833-4da2-b555-7850ce9810e5")
    public static VerticalScaleRequirement safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (VerticalScaleRequirement.canInstantiate(obj))
        	return new VerticalScaleRequirement(obj);
        else
        	throw new IllegalArgumentException("VerticalScaleRequirement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("80358f4b-44de-462d-8790-096cfb2df311")
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
        VerticalScaleRequirement other = (VerticalScaleRequirement) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("6a0570a4-50af-4269-8f55-960aba5ab56a")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("3a673c1e-18cd-40e3-9c86-bba314b7d23d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("54812abe-9a77-41d6-9ea2-a2908a78998e")
    protected VerticalScaleRequirement(final Class elt) {
        super(elt);
    }

    @objid ("b9142a65-96fb-46c9-ae04-0835babb830d")
    public static final class MdaTypes {
        @objid ("70b8db7e-df13-415a-bf11-d6e1fde3f700")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("5d7dce95-ddae-45b3-af1d-a645c9c08666")
        private static Stereotype MDAASSOCDEP;

        @objid ("c537da72-041e-4df0-bc9b-1694e3e84b10")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("87c55a4a-9858-414b-a28e-f538a54559e2")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "1090f8fc-a713-4641-89db-bd23c8a82ab1");
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
