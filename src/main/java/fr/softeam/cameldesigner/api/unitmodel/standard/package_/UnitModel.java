/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.00

 * This file was generated on 12/10/20 11:37 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.unitmodel.standard.package_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.standard.package_.CamelModel;
import fr.softeam.cameldesigner.api.camelcore.standard.package_.SubModel;
import fr.softeam.cameldesigner.api.unitmodel.standard.datatype.Unit;
import fr.softeam.cameldesigner.api.unitmodel.standard.datatype.UnitDimension;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Package} with << UnitModel >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("7988540c-148d-49c6-853a-5b32ce9e826d")
public class UnitModel extends SubModel {
    @objid ("937a92fd-0212-4529-a490-702cf34f1b04")
    public static final String STEREOTYPE_NAME = "UnitModel";

    /**
     * Tells whether a {@link UnitModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << UnitModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("c0f0119f-eca0-41e2-8bf8-fccd9aafd7e8")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, UnitModel.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Package} stereotyped << UnitModel >> then instantiate a {@link UnitModel} proxy.
     * 
     * @return a {@link UnitModel} proxy on the created {@link Package}.
     */
    @objid ("a82b826d-4b0f-4d4d-b202-85d12ecefe02")
    public static UnitModel create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Package");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, UnitModel.STEREOTYPE_NAME);
        return UnitModel.instantiate((Package)e);
    }

    /**
     * Tries to instantiate a {@link UnitModel} proxy from a {@link Package} stereotyped << UnitModel >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Package
     * @return a {@link UnitModel} proxy or <i>null</i>.
     */
    @objid ("bf1caa34-88ad-47b1-a139-c5663916dd8b")
    public static UnitModel instantiate(final Package obj) {
        return UnitModel.canInstantiate(obj) ? new UnitModel(obj) : null;
    }

    /**
     * Tries to instantiate a {@link UnitModel} proxy from a {@link Package} stereotyped << UnitModel >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Package}
     * @return a {@link UnitModel} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("54a0adc3-df14-482c-b664-597f6706f57e")
    public static UnitModel safeInstantiate(final Package obj) throws IllegalArgumentException {
        if (UnitModel.canInstantiate(obj))
        	return new UnitModel(obj);
        else
        	throw new IllegalArgumentException("UnitModel: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'dimensions' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("47342576-7574-4680-89ba-290bcb0b3008")
    public void addDimensions(final UnitDimension obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'units' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("693a6c5a-1d6c-4af6-9bcb-5ed79d8126ee")
    public void addUnits(final Unit obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    @objid ("c1885095-b149-45ab-929a-dee16e66d141")
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
        UnitModel other = (UnitModel) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the value to the 'camelModel' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("363b2854-6c20-4d1d-8acd-ff1c0f4a3134")
    public CamelModel getCamelModel() {
        return (CamelModel)CamelDesignerProxyFactory.instantiate(((Package) this.elt).getOwner(), CamelModel.STEREOTYPE_NAME);
    }

    /**
     * Get the values of the 'dimensions' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("15a0fef6-a1f2-4be2-9b59-11637463a34f")
    public List<UnitDimension> getDimensions() {
        List<UnitDimension> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement())
        	if (UnitDimension.canInstantiate(mObj))
        			results.add((UnitDimension)CamelDesignerProxyFactory.instantiate(mObj, UnitDimension.STEREOTYPE_NAME));
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the underlying {@link Package}. 
     * @return the Package represented by this proxy, never null.
     */
    @objid ("97200fb9-cb7d-4369-b5cc-a8ad3ef50d57")
    @Override
    public Package getElement() {
        return (Package)super.getElement();
    }

    /**
     * Get the values of the 'units' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("2d74ab6f-b919-488d-b7ec-ba8c9b1bb36f")
    public List<Unit> getUnits() {
        List<Unit> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement())
        	if (Unit.canInstantiate(mObj))
        			results.add((Unit)CamelDesignerProxyFactory.instantiate(mObj, Unit.STEREOTYPE_NAME));
        return Collections.unmodifiableList(results);
    }

    @objid ("81a30c78-2953-4ad6-b822-d834f27a3162")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'dimensions' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("ecd43c2d-98a4-43bf-a4ed-49f6bc6b4612")
    public boolean removeDimensions(final UnitDimension obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'units' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("8821c8b5-3202-4b3b-8aa3-7804847b38bf")
    public boolean removeUnits(final Unit obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Set the value of the 'camelModel' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("50014021-46d5-4ccc-b7d1-7210e942ac75")
    public void setCamelModel(final CamelModel obj) {
        ((Package) this.elt).setOwner((obj != null) ? obj.getElement() : null);
    }

    @objid ("d617281d-c735-492f-9a7a-8c639e70b339")
    protected UnitModel(final Package elt) {
        super(elt);
    }

    @objid ("fbd51035-faf8-4064-a217-af4ea824c639")
    public static final class MdaTypes {
        @objid ("95d65c78-490c-4e64-8f98-e811f3212b6d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("59e6688b-f746-4b93-857f-075d21827010")
        private static Stereotype MDAASSOCDEP;

        @objid ("364ebec8-39aa-4fc7-98b3-e635b6530dc4")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("253894fe-61e6-463f-9c60-97c65f36312f")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "59acf7f4-2a84-41d4-8fcb-ec300340062c");
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
