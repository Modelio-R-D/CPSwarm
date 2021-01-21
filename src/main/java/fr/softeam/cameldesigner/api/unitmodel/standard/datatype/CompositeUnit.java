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
import fr.softeam.cameldesigner.api.unitmodel.standard.datatype.Unit;
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
 * Proxy class to handle a {@link DataType} with << CompositeUnit >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("f5225f72-6f20-48b4-a955-1025a1e63d7c")
public class CompositeUnit extends DimensionedUnit {
    @objid ("987a7406-6c00-473e-acf1-56a299ed60e6")
    public static final String STEREOTYPE_NAME = "CompositeUnit";

    @objid ("a242360f-525f-446e-960b-363a96d667ea")
    public static final String FORMULA_TAGTYPE = "formula";

    /**
     * Tells whether a {@link CompositeUnit proxy} can be instantiated from a {@link MObject} checking it is a {@link DataType} stereotyped << CompositeUnit >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("b809e38f-e33c-4305-8fc9-55ef7a07328b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof DataType) && ((DataType) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CompositeUnit.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link DataType} stereotyped << CompositeUnit >> then instantiate a {@link CompositeUnit} proxy.
     * 
     * @return a {@link CompositeUnit} proxy on the created {@link DataType}.
     */
    @objid ("ba3c3f9c-1cfa-4d9c-902e-345fa193290c")
    public static CompositeUnit create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.DataType");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, CompositeUnit.STEREOTYPE_NAME);
        return CompositeUnit.instantiate((DataType)e);
    }

    /**
     * Tries to instantiate a {@link CompositeUnit} proxy from a {@link DataType} stereotyped << CompositeUnit >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a DataType
     * @return a {@link CompositeUnit} proxy or <i>null</i>.
     */
    @objid ("bea2743e-4207-4a47-9cd4-e8f11acb2f05")
    public static CompositeUnit instantiate(final DataType obj) {
        return CompositeUnit.canInstantiate(obj) ? new CompositeUnit(obj) : null;
    }

    /**
     * Tries to instantiate a {@link CompositeUnit} proxy from a {@link DataType} stereotyped << CompositeUnit >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link DataType}
     * @return a {@link CompositeUnit} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("7febdebd-1a12-4757-81f1-5bf42898a4ef")
    public static CompositeUnit safeInstantiate(final DataType obj) throws IllegalArgumentException {
        if (CompositeUnit.canInstantiate(obj))
        	return new CompositeUnit(obj);
        else
        	throw new IllegalArgumentException("CompositeUnit: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'componentsUnits' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("ddd3fcd3-8804-4e69-abec-a92def8420d1")
    public void addComponentsUnits(final Unit obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), CompositeUnit.MdaTypes.MDAASSOCDEP);
            d.setName("componentsUnits");
            d.putTagValue(CompositeUnit.MdaTypes.MDAASSOCDEP_ROLE, "componentsUnits");
        }
    }

    @objid ("5299274f-5341-440c-b26f-c7dc216d0d65")
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
        CompositeUnit other = (CompositeUnit) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the values of the 'componentsUnits' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("f2ce60ea-4e2b-45fe-9fe8-82349ef4804d")
    public List<Unit> getComponentsUnits() {
        List<Unit> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(CompositeUnit.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(CompositeUnit.MdaTypes.MDAASSOCDEP_ROLE), "componentsUnits")
              && Unit.canInstantiate(d.getDependsOn()))
                results.add((Unit)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Unit.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the underlying {@link DataType}. 
     * @return the DataType represented by this proxy, never null.
     */
    @objid ("4c5c8253-f80d-4715-91a2-03ecc5f2d5e1")
    @Override
    public DataType getElement() {
        return (DataType)super.getElement();
    }

    /**
     * Getter for string property 'formula'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("53a7b8b0-f51f-4307-91ca-a9c63330c70e")
    public String getFormula() {
        return this.elt.getTagValue(CompositeUnit.MdaTypes.FORMULA_TAGTYPE_ELT);
    }

    @objid ("26251a2a-da9f-43cd-93d0-d6fe0701a7dd")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'componentsUnits' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("decfa1f4-daa8-4cb6-bc02-6714622f680c")
    public boolean removeComponentsUnits(final Unit obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(CompositeUnit.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(CompositeUnit.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    /**
     * Setter for string property 'formula'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("e00edc09-eaed-4b07-943c-a5a76957a9ae")
    public void setFormula(final String value) {
        this.elt.putTagValue(CompositeUnit.MdaTypes.FORMULA_TAGTYPE_ELT, value);
    }

    @objid ("3020b495-cf74-4048-87ac-8e201dce28a2")
    protected CompositeUnit(final DataType elt) {
        super(elt);
    }

    @objid ("fb4ae2ef-3762-478f-83ef-6a6c6af48a4e")
    public static final class MdaTypes {
        @objid ("249410ef-5687-4dd9-b882-726d214fa178")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("cf9d13d2-2112-49b5-b6c8-89ebbcbc9974")
        public static TagType FORMULA_TAGTYPE_ELT;

        @objid ("49c016f9-4fe7-4897-a645-332bce65e8c6")
        private static Stereotype MDAASSOCDEP;

        @objid ("18b2d3a9-3a8a-4815-90e4-4458c9c6421a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("8501fcf8-27ed-4bd4-b6e5-c32dc4ecf4a7")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "54731af6-c46a-4304-996c-2e03b9035567");
            FORMULA_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "a2bb36cd-c4c0-4f75-b9ed-ec821fa8774e");
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
