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
 * Proxy class to handle a {@link Class} with << FunctionalEventInstance >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("e892cbaa-0b93-4e5d-87c4-bb250351cbe6")
public class FunctionalEventInstance extends EventInstance {
    @objid ("bc5650e8-ca1c-4394-9744-cf1ba57521e5")
    public static final String STEREOTYPE_NAME = "FunctionalEventInstance";

    /**
     * Tells whether a {@link FunctionalEventInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << FunctionalEventInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("e4b773f1-9cca-4685-9dd1-b7c4cfb75f53")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, FunctionalEventInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << FunctionalEventInstance >> then instantiate a {@link FunctionalEventInstance} proxy.
     * 
     * @return a {@link FunctionalEventInstance} proxy on the created {@link Class}.
     */
    @objid ("cd789b18-6a71-4803-b733-9c1cfe0436ce")
    public static FunctionalEventInstance create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, FunctionalEventInstance.STEREOTYPE_NAME);
        return FunctionalEventInstance.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link FunctionalEventInstance} proxy from a {@link Class} stereotyped << FunctionalEventInstance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link FunctionalEventInstance} proxy or <i>null</i>.
     */
    @objid ("23d43185-f255-46ce-a3fa-54eb7346b64e")
    public static FunctionalEventInstance instantiate(final Class obj) {
        return FunctionalEventInstance.canInstantiate(obj) ? new FunctionalEventInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link FunctionalEventInstance} proxy from a {@link Class} stereotyped << FunctionalEventInstance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link FunctionalEventInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("0a312e38-78bf-403b-8517-847f8b7d1006")
    public static FunctionalEventInstance safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (FunctionalEventInstance.canInstantiate(obj))
        	return new FunctionalEventInstance(obj);
        else
        	throw new IllegalArgumentException("FunctionalEventInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("c05e0987-7857-4dfd-9d60-90e6fb7b4fc2")
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
        FunctionalEventInstance other = (FunctionalEventInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("c5072c40-329a-4391-9884-2072c354f00c")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("b34a16b0-9e26-4794-b134-4a79590ae065")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("bad796d6-37fc-44df-862a-f1bee3ffdf6c")
    protected FunctionalEventInstance(final Class elt) {
        super(elt);
    }

    @objid ("7d48d9ad-5adb-4e21-b67a-3ad6d334d9f2")
    public static final class MdaTypes {
        @objid ("1aa2e8e6-bdfa-41fe-bb81-2225936eeb53")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("8bbba208-7c8e-48b7-97a8-b28fe1e5dea5")
        private static Stereotype MDAASSOCDEP;

        @objid ("42695487-853a-4079-97cb-b59940525e41")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("fd749c30-55f9-4422-95a0-6e65140873b4")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "b88afca5-ed15-48f1-a81b-29da4a453701");
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
