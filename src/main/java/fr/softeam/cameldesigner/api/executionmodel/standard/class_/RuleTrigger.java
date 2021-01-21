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
 * Proxy class to handle a {@link Class} with << RuleTrigger >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("92bee481-90ec-4831-ae16-86a6451589ef")
public class RuleTrigger extends Cause {
    @objid ("87c4bd06-72a2-462a-a97d-f182359fff7b")
    public static final String STEREOTYPE_NAME = "RuleTrigger";

    /**
     * Tells whether a {@link RuleTrigger proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << RuleTrigger >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("8af0febd-3a96-4e84-84fe-d04c8264f075")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, RuleTrigger.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << RuleTrigger >> then instantiate a {@link RuleTrigger} proxy.
     * 
     * @return a {@link RuleTrigger} proxy on the created {@link Class}.
     */
    @objid ("14d3c8eb-6ac8-46db-9583-eb0819bfbf84")
    public static RuleTrigger create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, RuleTrigger.STEREOTYPE_NAME);
        return RuleTrigger.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link RuleTrigger} proxy from a {@link Class} stereotyped << RuleTrigger >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link RuleTrigger} proxy or <i>null</i>.
     */
    @objid ("4b3ddbb0-864e-442b-a71a-becf5e608222")
    public static RuleTrigger instantiate(final Class obj) {
        return RuleTrigger.canInstantiate(obj) ? new RuleTrigger(obj) : null;
    }

    /**
     * Tries to instantiate a {@link RuleTrigger} proxy from a {@link Class} stereotyped << RuleTrigger >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link RuleTrigger} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("c6a5242e-159e-434c-a6ac-16631696f934")
    public static RuleTrigger safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (RuleTrigger.canInstantiate(obj))
        	return new RuleTrigger(obj);
        else
        	throw new IllegalArgumentException("RuleTrigger: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("6fa551ae-08b7-431b-9a9a-8235492d06b8")
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
        RuleTrigger other = (RuleTrigger) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("b9c14bb0-0f99-4c0e-ac43-71bcb985c0ee")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("af898fe1-a509-4e83-b6d4-c83ca29d65f0")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("928a94bb-79e1-4fef-b3e3-77fe923065a7")
    protected RuleTrigger(final Class elt) {
        super(elt);
    }

    @objid ("4d25ae3c-a321-44a2-bbb9-74f641ada07d")
    public static final class MdaTypes {
        @objid ("5b9162b8-bcd9-406a-800d-1739eb95bdaa")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("827bfdb5-be81-4571-8dab-7681866325a7")
        private static Stereotype MDAASSOCDEP;

        @objid ("da76657d-ec46-44a7-9aaf-f173e4700e5c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("fbb058d0-4bae-4f7e-b638-f8bb536abb18")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "6feb668e-fc53-4354-93a8-d98b00fdb186");
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
