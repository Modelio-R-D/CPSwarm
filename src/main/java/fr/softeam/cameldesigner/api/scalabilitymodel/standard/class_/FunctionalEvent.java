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
 * Proxy class to handle a {@link Class} with << FunctionalEvent >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("6506e3fc-10e0-4ba7-b4b6-3bccd0b9a073")
public class FunctionalEvent extends SingleEvent {
    @objid ("1b900c20-4c1d-40e0-9f74-b6c6f584d06a")
    public static final String STEREOTYPE_NAME = "FunctionalEvent";

    /**
     * Tells whether a {@link FunctionalEvent proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << FunctionalEvent >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("8d6017b6-73e7-49bb-b3a2-fd3a3c7aed04")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, FunctionalEvent.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << FunctionalEvent >> then instantiate a {@link FunctionalEvent} proxy.
     * 
     * @return a {@link FunctionalEvent} proxy on the created {@link Class}.
     */
    @objid ("0d4c671d-d721-4ee1-a5ad-3182939118b9")
    public static FunctionalEvent create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, FunctionalEvent.STEREOTYPE_NAME);
        return FunctionalEvent.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link FunctionalEvent} proxy from a {@link Class} stereotyped << FunctionalEvent >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link FunctionalEvent} proxy or <i>null</i>.
     */
    @objid ("97ba8732-2d65-4e76-923f-0ca58ecdf935")
    public static FunctionalEvent instantiate(final Class obj) {
        return FunctionalEvent.canInstantiate(obj) ? new FunctionalEvent(obj) : null;
    }

    /**
     * Tries to instantiate a {@link FunctionalEvent} proxy from a {@link Class} stereotyped << FunctionalEvent >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link FunctionalEvent} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("aa05d943-e517-4f32-a78d-523d12862a22")
    public static FunctionalEvent safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (FunctionalEvent.canInstantiate(obj))
        	return new FunctionalEvent(obj);
        else
        	throw new IllegalArgumentException("FunctionalEvent: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("b437835c-41d4-4559-ba06-633c0e1bed81")
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
        FunctionalEvent other = (FunctionalEvent) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("ab780ae2-5ca9-45df-9d7a-a41a24029e6c")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("6fee39d9-bae3-4362-a6ff-6bd9c95affaa")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("0b16c8db-1647-48c6-91c1-314289098483")
    protected FunctionalEvent(final Class elt) {
        super(elt);
    }

    @objid ("1a266afd-186e-43cc-a4d6-d8eda707e81a")
    public static final class MdaTypes {
        @objid ("9a00197b-9fd6-4a3c-95c1-89701ceb08af")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("141fd03e-3475-49d9-8626-6a6861cd0f13")
        private static Stereotype MDAASSOCDEP;

        @objid ("941a6e51-d868-44f6-84eb-71400e33cdab")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("32d6cf20-4955-4142-9dd0-1d2d6005dc9d")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "8d4865c6-d973-416b-ba6e-62311853e410");
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
