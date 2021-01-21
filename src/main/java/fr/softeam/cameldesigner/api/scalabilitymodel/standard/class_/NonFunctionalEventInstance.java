/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.00

 * This file was generated on 12/10/20 11:37 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_;

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
 * Proxy class to handle a {@link Class} with << NonFunctionalEventInstance >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("336dc8da-4ec0-48bb-ba62-dc9f2f7602db")
public class NonFunctionalEventInstance extends EventInstance {
    @objid ("4bb4d6d8-0b54-4ef4-bcf3-43c8b151e23c")
    public static final String STEREOTYPE_NAME = "NonFunctionalEventInstance";

    /**
     * Tells whether a {@link NonFunctionalEventInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << NonFunctionalEventInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("c3ae02a0-de17-470b-a444-5c0553e4ac98")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, NonFunctionalEventInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << NonFunctionalEventInstance >> then instantiate a {@link NonFunctionalEventInstance} proxy.
     * 
     * @return a {@link NonFunctionalEventInstance} proxy on the created {@link Class}.
     */
    @objid ("b73601ff-040b-4d84-8e4b-11c5eb071f13")
    public static NonFunctionalEventInstance create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, NonFunctionalEventInstance.STEREOTYPE_NAME);
        return NonFunctionalEventInstance.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link NonFunctionalEventInstance} proxy from a {@link Class} stereotyped << NonFunctionalEventInstance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link NonFunctionalEventInstance} proxy or <i>null</i>.
     */
    @objid ("6e6b5a8d-f065-4532-989f-76f0566fa791")
    public static NonFunctionalEventInstance instantiate(final Class obj) {
        return NonFunctionalEventInstance.canInstantiate(obj) ? new NonFunctionalEventInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link NonFunctionalEventInstance} proxy from a {@link Class} stereotyped << NonFunctionalEventInstance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link NonFunctionalEventInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("b92c8379-9b67-4247-a4aa-f00ba5ae6a65")
    public static NonFunctionalEventInstance safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (NonFunctionalEventInstance.canInstantiate(obj))
        	return new NonFunctionalEventInstance(obj);
        else
        	throw new IllegalArgumentException("NonFunctionalEventInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("aa89b8fd-6763-4d5c-bacd-5767e58b31aa")
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
        NonFunctionalEventInstance other = (NonFunctionalEventInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("f4c6625f-9924-41cd-b708-99269490957e")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("4e174396-8c61-44e5-b35f-43fcfcdda1ff")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("433e35b2-3ebe-4dcd-ad68-fc48831caae9")
    protected NonFunctionalEventInstance(final Class elt) {
        super(elt);
    }

    @objid ("11d17a88-036d-4853-bc89-7f651cdb717d")
    public static final class MdaTypes {
        @objid ("c747c497-cf13-4e85-a8bf-8d28fc15dbc4")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("dd245e04-9e6d-4b58-be02-c628cb3bef9d")
        private static Stereotype MDAASSOCDEP;

        @objid ("c808f058-8acc-4542-9c0b-0966a5673b3a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a696ac4a-9ee2-485c-bd74-61fcaeb9d846")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "d6b986dc-6dc7-40b3-b2a3-c0fe9f6add0e");
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
