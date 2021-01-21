/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.00

 * This file was generated on 12/10/20 11:37 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.unitmodel.standard.datatype;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
import org.modelio.metamodel.uml.statik.DataType;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link DataType} with << Unit >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("ad5e8f7b-b3a0-4678-bcf5-5ad638242927")
public abstract class Unit extends Feature {
    @objid ("de9a3ddd-87b3-4cc9-a05f-9d19b9f80a72")
    public static final String STEREOTYPE_NAME = "Unit";

    /**
     * Add a value of the 'multipleOf' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("6304638f-b898-4525-9a29-644ff947ba52")
    public void addMultipleOf(final Unit obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(obj.getElement(), this.elt, Unit.MdaTypes.MDAASSOCDEP);
            d.setName("");
            d.putTagValue(Unit.MdaTypes.MDAASSOCDEP_ROLE, "");
        }
    }

    @objid ("474c86a3-dbce-4892-8c55-517dcc7f5de8")
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
        Unit other = (Unit) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link DataType}. 
     * @return the DataType represented by this proxy, never null.
     */
    @objid ("d8902381-7f79-4756-92c1-f0c06b8fe838")
    @Override
    public DataType getElement() {
        return (DataType)super.getElement();
    }

    /**
     * Get the values of the 'multipleOf' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("3abe971b-17ce-4f1d-99fb-78f22b985af7")
    public List<Unit> getMultipleOf() {
        List<Unit> results = new ArrayList<>();
        for (Dependency d : this.elt.getImpactedDependency()) {
          if (d.isStereotyped(Unit.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(Unit.MdaTypes.MDAASSOCDEP_ROLE), "")
              && Unit.canInstantiate(d.getImpacted())) {
                 results.add((Unit)CamelDesignerProxyFactory.instantiate(d.getImpacted(), Unit.STEREOTYPE_NAME));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("fcc6aad6-924e-4246-aa4c-121fa6c3ebda")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from 'multipleOf' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("dccd14bf-40ac-4c8e-aa86-65daf9014a9a")
    public boolean removeMultipleOf(final Unit obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getImpactedDependency())) {
            if (d.isStereotyped(Unit.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(Unit.MdaTypes.MDAASSOCDEP_ROLE), ""))
              if (Objects.equals(d.getImpacted(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    @objid ("9f414625-cc72-4ee6-8a48-1f75cc024a30")
    protected Unit(final DataType elt) {
        super(elt);
    }

    @objid ("6a12e779-f186-4ba1-ab98-47ecdcdb6ad2")
    public static final class MdaTypes {
        @objid ("7978b000-7c82-4d05-b57f-331a2156f90e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("707bffb8-5567-4602-9830-38c3927ebbb7")
        private static Stereotype MDAASSOCDEP;

        @objid ("4e332f27-650f-4e03-8afd-e5d6754d867f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c1e6a6e7-ccc3-4a5f-a2c0-adde92d2f259")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "56c9f56b-274d-4816-80c8-72536d1d7295");
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
