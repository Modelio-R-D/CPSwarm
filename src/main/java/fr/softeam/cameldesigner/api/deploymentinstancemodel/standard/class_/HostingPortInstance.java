/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v0.0.10

 * This file was generated on 7/24/20 11:19 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.Feature;
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
 * Proxy class to handle a {@link Class} with << HostingPortInstance >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("1ad255c6-dbf2-463e-82f7-c6ae39b76dbb")
public abstract class HostingPortInstance extends Feature {
    @objid ("68ab514b-8fe3-408c-86eb-894a17a54f68")
    public static final String STEREOTYPE_NAME = "HostingPortInstance";

    @objid ("eee39196-ac5e-4d42-bdf1-37a6bf8aa593")
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
        HostingPortInstance other = (HostingPortInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}.
     * 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("3e3bed95-860d-4a90-a56a-5cadaf12f0d0")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("4c4e2663-d70c-44e9-87e0-196d0a8fb18a")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("c2a72c33-132f-4c53-b2e7-c36ed417c730")
    protected HostingPortInstance(final Class elt) {
        super(elt);
    }

    @objid ("40393267-157d-47cf-affe-b94d6d18f7cb")
    public static final class MdaTypes {
        @objid ("04f5a388-b607-469a-86a2-ed257142afcf")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("329a6e9e-e69c-4e80-a1c8-156de133c19b")
        private static Stereotype MDAASSOCDEP;

        @objid ("fbf1e964-cfe7-479b-9d03-85182fe56a4c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("49982203-2627-4f18-988a-074f6306a99b")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "2fed7d9c-a1d5-47c7-b116-7da13b93adcd");
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
