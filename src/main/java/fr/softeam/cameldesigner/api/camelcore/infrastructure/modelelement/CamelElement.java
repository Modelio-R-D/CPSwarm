/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.00

 * This file was generated on 12/10/20 11:37 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement;

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
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link ModelElement} with << CamelElement >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("e19016d0-0edb-4a41-bbf9-7506c03fcd5e")
public abstract class CamelElement {
    @objid ("a7bfea97-0bdd-4b85-94e8-5be690d7278e")
    public static final String STEREOTYPE_NAME = "CamelElement";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("7178ca6c-cca6-4713-9447-b74ed4d2b760")
    protected final ModelElement elt;

    @objid ("12d48216-734e-4052-96f2-87d53c08ce89")
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
        CamelElement other = (CamelElement) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("0f45d72a-866e-4212-912b-42f63575b835")
    public ModelElement getElement() {
        return this.elt;
    }

    @objid ("d5258ff8-4597-47b4-aaff-182942bf27c0")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("bf6844ab-eb88-4b4a-a664-5f97e9847111")
    protected CamelElement(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("1755d7a2-ba56-47fd-b0d2-652ed674f106")
    public static final class MdaTypes {
        @objid ("425003e9-0486-4735-98cf-f416be8c8aa8")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("3ab7c3bc-2024-4ce3-bea9-643e5cd8412b")
        private static Stereotype MDAASSOCDEP;

        @objid ("901cf092-464c-4b9c-831d-d8c263de3aa6")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f724e08d-405f-42bc-9311-1e4b888a3b25")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "9aef4bd8-fa92-4231-9295-3eb5a619ceab");
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
