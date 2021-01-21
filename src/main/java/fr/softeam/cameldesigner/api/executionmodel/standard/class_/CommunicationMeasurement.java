/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.00

 * This file was generated on 12/10/20 11:37 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.executionmodel.standard.class_;

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
 * Proxy class to handle a {@link Class} with << CommunicationMeasurement >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("edb868dc-4070-4b7f-8e36-da2647d6198a")
public class CommunicationMeasurement extends Measurement {
    @objid ("484699b1-5395-4b28-a479-bd340bcdc6fc")
    public static final String STEREOTYPE_NAME = "CommunicationMeasurement";

    /**
     * Tells whether a {@link CommunicationMeasurement proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << CommunicationMeasurement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("4db9cc85-46f5-45e2-923f-9da52c575278")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CommunicationMeasurement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << CommunicationMeasurement >> then instantiate a {@link CommunicationMeasurement} proxy.
     * 
     * @return a {@link CommunicationMeasurement} proxy on the created {@link Class}.
     */
    @objid ("9555dfde-ae22-49b7-bbc4-a8a7a3e2728e")
    public static CommunicationMeasurement create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, CommunicationMeasurement.STEREOTYPE_NAME);
        return CommunicationMeasurement.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link CommunicationMeasurement} proxy from a {@link Class} stereotyped << CommunicationMeasurement >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link CommunicationMeasurement} proxy or <i>null</i>.
     */
    @objid ("826f2b45-9458-4f77-92a9-7543316b8512")
    public static CommunicationMeasurement instantiate(final Class obj) {
        return CommunicationMeasurement.canInstantiate(obj) ? new CommunicationMeasurement(obj) : null;
    }

    /**
     * Tries to instantiate a {@link CommunicationMeasurement} proxy from a {@link Class} stereotyped << CommunicationMeasurement >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link CommunicationMeasurement} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("2b0bcaaa-e657-4ce3-818d-ef47e308e84c")
    public static CommunicationMeasurement safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (CommunicationMeasurement.canInstantiate(obj))
        	return new CommunicationMeasurement(obj);
        else
        	throw new IllegalArgumentException("CommunicationMeasurement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("05b8f112-83aa-4805-b4a7-fd166dfff9b4")
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
        CommunicationMeasurement other = (CommunicationMeasurement) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("91b2470d-4ab2-4633-bc37-d7c1f6e40129")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("bd48f266-79a4-4fba-b189-ec58a0395f7a")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("ef2473c2-20a6-4825-9b01-4d83bd96921a")
    protected CommunicationMeasurement(final Class elt) {
        super(elt);
    }

    @objid ("2bc724e6-be76-4f04-8dd1-ded2cd7a4cf6")
    public static final class MdaTypes {
        @objid ("21c289af-87b1-4476-83b9-3ce790bf15ec")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("215483e4-266d-4760-aae0-767ca7254fa9")
        private static Stereotype MDAASSOCDEP;

        @objid ("04c4b782-6dfd-4350-90d0-0128f0504bfb")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f65d1317-2174-4ae8-a69e-99773d6b4d04")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "438c005e-3455-4a76-ba8b-3791473a3e5a");
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
