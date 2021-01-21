/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.00

 * This file was generated on 12/10/20 11:37 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.requirementmodel.standard.generalclass;

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
import org.modelio.metamodel.uml.statik.GeneralClass;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link GeneralClass} with << HardRequirement >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("892ed9c7-a02c-433e-a591-388ee6839707")
public abstract class HardRequirement extends Requirement {
    @objid ("f0f7be89-1678-4351-9c1f-acfad2d97851")
    public static final String STEREOTYPE_NAME = "HardRequirement";

    @objid ("bd927c31-896c-4da5-bb8d-be9e2cde5073")
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
        HardRequirement other = (HardRequirement) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link GeneralClass}. 
     * @return the GeneralClass represented by this proxy, never null.
     */
    @objid ("fa0534d1-90ae-4aef-ad4d-27706324bd60")
    @Override
    public GeneralClass getElement() {
        return (GeneralClass)super.getElement();
    }

    @objid ("827f0a7b-1e5e-4128-8cf8-41791e746994")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("a852c125-f363-48b9-8332-6bd425a74972")
    protected HardRequirement(final GeneralClass elt) {
        super(elt);
    }

    @objid ("024b0a43-76f9-4df6-8a5c-e5e800794153")
    public static final class MdaTypes {
        @objid ("d10effbe-4eac-4341-8b52-e70b0f21a0bc")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b3c3c2b7-0185-4a62-bf15-fb48e0a9cf65")
        private static Stereotype MDAASSOCDEP;

        @objid ("984792aa-c9d0-4e5c-9e3f-77dd9e070e02")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("73d4e9b0-f9d1-4af4-abe8-cd259f3932fd")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "2955347c-7823-427d-af9e-c725897bba1c");
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
