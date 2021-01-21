/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.00

 * This file was generated on 12/10/20 11:37 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.camelcore.standard.package_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.NamedElement;
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
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Package} with << SubModel >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("f07e87ba-586c-403f-a02b-a1871d8d3882")
public abstract class SubModel extends NamedElement {
    @objid ("6bae0bd0-0748-4a88-8ddb-56aa1e24171c")
    public static final String STEREOTYPE_NAME = "SubModel";

    @objid ("09f2c2cc-3512-41c0-a985-111bbca181bf")
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
        SubModel other = (SubModel) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Package}. 
     * @return the Package represented by this proxy, never null.
     */
    @objid ("e389fe6c-4cf4-40fb-b7b0-8d106e71b025")
    @Override
    public Package getElement() {
        return (Package)super.getElement();
    }

    @objid ("26ca9471-0dca-479c-913d-5e9158705c17")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("a9c598d0-ba22-4e09-a89f-a8c17bd76901")
    protected SubModel(final Package elt) {
        super(elt);
    }

    @objid ("272d938f-b497-426d-a404-96b884126080")
    public static final class MdaTypes {
        @objid ("8bc05ab7-8a57-4706-b12d-e31954e6a312")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ab26c1be-3e04-421e-a2d5-803087094a9b")
        private static Stereotype MDAASSOCDEP;

        @objid ("aa3a38da-9995-48cf-8276-0f045dbf415b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("041c1230-2c9d-408a-ad43-3d6fce006475")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "577c153e-42b8-4f36-9686-1a6109ffdc16");
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
