/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.00

 * This file was generated on 12/10/20 11:37 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.unitmodel.standard.datatype;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.unitmodel.standard.datatype.UnitDimension;
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
 * Proxy class to handle a {@link DataType} with << DimensionedUnit >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("2e234a26-ab74-44b2-9156-be36441cff03")
public abstract class DimensionedUnit extends Unit {
    @objid ("d2b725c2-f60f-47c9-addf-8dc0ad2ca8d0")
    public static final String STEREOTYPE_NAME = "DimensionedUnit";

    @objid ("1f5caab6-3d47-42ae-80df-d686fee795fb")
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
        DimensionedUnit other = (DimensionedUnit) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the value of the 'dimension' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("eb96d423-136c-4640-87d8-513a23ced355")
    public UnitDimension getDimension() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(DimensionedUnit.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(DimensionedUnit.MdaTypes.MDAASSOCDEP_ROLE), "dimension")
                  && UnitDimension.canInstantiate(d.getDependsOn())) {
                     return (UnitDimension)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), UnitDimension.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the underlying {@link DataType}. 
     * @return the DataType represented by this proxy, never null.
     */
    @objid ("fb117682-6341-44ce-94be-2a4386c1b39e")
    @Override
    public DataType getElement() {
        return (DataType)super.getElement();
    }

    @objid ("e195ced5-ccb2-4eca-a30d-b10ef8af2f2c")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'dimension' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("4226d263-dc55-44c0-952b-f6ffa86c010c")
    public void setDimension(final UnitDimension obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(DimensionedUnit.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(DimensionedUnit.MdaTypes.MDAASSOCDEP_ROLE), "dimension")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), DimensionedUnit.MdaTypes.MDAASSOCDEP);
              dep.setName("dimension");      dep.putTagValue(DimensionedUnit.MdaTypes.MDAASSOCDEP_ROLE, "dimension");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    @objid ("778758f3-027c-4c7c-81a8-bf6ea8854912")
    protected DimensionedUnit(final DataType elt) {
        super(elt);
    }

    @objid ("7020bdc9-61ca-45e7-b8b0-e04dd997a97d")
    public static final class MdaTypes {
        @objid ("1fdc9750-9d43-4771-ae24-9b3cb6b4a06b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ad6e10eb-2eb6-4f6d-b507-d399e542ff3e")
        private static Stereotype MDAASSOCDEP;

        @objid ("f98ae806-4c4a-424c-9648-85d40567dd94")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("58a57886-9950-4c1c-9b9e-393cc6143719")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "7e307b11-f18c-4c69-8c76-7b57b8d1bb8e");
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
