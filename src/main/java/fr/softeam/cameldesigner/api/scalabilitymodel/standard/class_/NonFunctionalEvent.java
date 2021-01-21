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
 * Proxy class to handle a {@link Class} with << NonFunctionalEvent >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("91c5901d-2f7a-441c-aea0-ec0a3019dafd")
public class NonFunctionalEvent extends SingleEvent {
    @objid ("e1f0e553-a5af-4947-bf08-978f86f6af89")
    public static final String STEREOTYPE_NAME = "NonFunctionalEvent";

    @objid ("0b06919f-f8a1-43a0-ab25-9dfb598fd55c")
    public static final String ISVIOLATION_TAGTYPE = "isViolation";

    /**
     * Tells whether a {@link NonFunctionalEvent proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << NonFunctionalEvent >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("dec1991a-c420-425f-8b28-375a3c144a2e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, NonFunctionalEvent.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << NonFunctionalEvent >> then instantiate a {@link NonFunctionalEvent} proxy.
     * 
     * @return a {@link NonFunctionalEvent} proxy on the created {@link Class}.
     */
    @objid ("a4fdb430-a663-4656-810d-1769a9346bb4")
    public static NonFunctionalEvent create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, NonFunctionalEvent.STEREOTYPE_NAME);
        return NonFunctionalEvent.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link NonFunctionalEvent} proxy from a {@link Class} stereotyped << NonFunctionalEvent >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link NonFunctionalEvent} proxy or <i>null</i>.
     */
    @objid ("f593889f-f9ce-4bf8-9d87-ba163b9fe339")
    public static NonFunctionalEvent instantiate(final Class obj) {
        return NonFunctionalEvent.canInstantiate(obj) ? new NonFunctionalEvent(obj) : null;
    }

    /**
     * Tries to instantiate a {@link NonFunctionalEvent} proxy from a {@link Class} stereotyped << NonFunctionalEvent >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link NonFunctionalEvent} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("2f3e7ed1-0876-47ef-9be9-b83b315a7094")
    public static NonFunctionalEvent safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (NonFunctionalEvent.canInstantiate(obj))
        	return new NonFunctionalEvent(obj);
        else
        	throw new IllegalArgumentException("NonFunctionalEvent: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("c8fb20da-29f1-4628-90e2-5854f71e5044")
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
        NonFunctionalEvent other = (NonFunctionalEvent) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("f070112d-c39e-41e3-8f68-639d5ff56fdb")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'isViolation'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("afe2813e-8ee2-438d-907b-0712a1bf1695")
    public String getIsViolation() {
        return this.elt.getTagValue(NonFunctionalEvent.MdaTypes.ISVIOLATION_TAGTYPE_ELT);
    }

    @objid ("7a641ea1-90a0-40e3-8b97-0b45deb975b7")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'isViolation'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("2477a061-87ca-417a-a232-75018a512996")
    public void setIsViolation(final String value) {
        this.elt.putTagValue(NonFunctionalEvent.MdaTypes.ISVIOLATION_TAGTYPE_ELT, value);
    }

    @objid ("e793bd56-bf4d-484c-9f5d-d559043f1d69")
    protected NonFunctionalEvent(final Class elt) {
        super(elt);
    }

    @objid ("49bec042-33dd-4ad1-9b09-4dcfbe3512b3")
    public static final class MdaTypes {
        @objid ("68bff9fb-5fab-40fe-a4c7-4dfec14b3d9e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("6137c5c0-7611-4217-818f-f3f051152420")
        public static TagType ISVIOLATION_TAGTYPE_ELT;

        @objid ("48872e51-5de7-4891-9bee-15b28f93c3af")
        private static Stereotype MDAASSOCDEP;

        @objid ("3fb3512a-e12f-41b9-b76a-91ead3a5b41b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c8d38603-4a4a-460e-b25c-59101be82a35")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "af2fc032-7f83-4251-9a0c-8ef45959bb71");
            ISVIOLATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "7adb963c-c7f7-4e56-9770-80f01813f2b5");
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
