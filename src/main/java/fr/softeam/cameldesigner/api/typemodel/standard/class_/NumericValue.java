/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.00

 * This file was generated on 12/10/20 11:37 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.typemodel.standard.class_;

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
 * Proxy class to handle a {@link Class} with << NumericValue >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("3ba92fa8-b783-47f9-9069-045fba14f562")
public abstract class NumericValue extends Value {
    @objid ("e326774b-8355-4192-8c19-7db2f19e9bb4")
    public static final String STEREOTYPE_NAME = "NumericValue";

    @objid ("6d51cf90-1a8d-404d-8d8d-1d29bd4261a6")
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
        NumericValue other = (NumericValue) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("b44bf4f5-471e-4355-a438-5a7168fe7d47")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("247890c6-5b9f-4426-9a8a-af982e6ec986")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("b66d9084-bbf1-4916-aedb-499f039c4a11")
    protected NumericValue(final Class elt) {
        super(elt);
    }

    @objid ("06397469-0f26-401c-adeb-30da7a165128")
    public static final class MdaTypes {
        @objid ("d01c47ec-f10e-4610-93ce-81b9109b3f82")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("3a77b0a4-5d66-43e5-844d-a61e185f4a30")
        private static Stereotype MDAASSOCDEP;

        @objid ("59e71486-2cac-43c4-973b-1de5527efba4")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e27a1d6e-5382-4c0e-a09e-7fb49f175695")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "a8d40881-b0b9-4426-a68a-cba902a74a5e");
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
