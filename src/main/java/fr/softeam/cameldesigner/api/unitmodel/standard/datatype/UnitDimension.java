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
 * Proxy class to handle a {@link DataType} with << UnitDimension >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("1707f141-4e9c-4725-b618-05f025f22d01")
public class UnitDimension extends Feature {
    @objid ("3aaf6e96-9955-476a-baa6-c95d82fb6a6d")
    public static final String STEREOTYPE_NAME = "UnitDimension";

    /**
     * Tells whether a {@link UnitDimension proxy} can be instantiated from a {@link MObject} checking it is a {@link DataType} stereotyped << UnitDimension >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("1ba06140-79b5-492d-97e5-f4fbea2a2143")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof DataType) && ((DataType) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, UnitDimension.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link DataType} stereotyped << UnitDimension >> then instantiate a {@link UnitDimension} proxy.
     * 
     * @return a {@link UnitDimension} proxy on the created {@link DataType}.
     */
    @objid ("876d532c-fc19-4771-8639-4692952efbe9")
    public static UnitDimension create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.DataType");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, UnitDimension.STEREOTYPE_NAME);
        return UnitDimension.instantiate((DataType)e);
    }

    /**
     * Tries to instantiate a {@link UnitDimension} proxy from a {@link DataType} stereotyped << UnitDimension >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a DataType
     * @return a {@link UnitDimension} proxy or <i>null</i>.
     */
    @objid ("a3a9f486-dd4f-4cce-9680-fe449b43fb5e")
    public static UnitDimension instantiate(final DataType obj) {
        return UnitDimension.canInstantiate(obj) ? new UnitDimension(obj) : null;
    }

    /**
     * Tries to instantiate a {@link UnitDimension} proxy from a {@link DataType} stereotyped << UnitDimension >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link DataType}
     * @return a {@link UnitDimension} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("5cd80339-aa2a-42d4-af2d-6f1e85ee4706")
    public static UnitDimension safeInstantiate(final DataType obj) throws IllegalArgumentException {
        if (UnitDimension.canInstantiate(obj))
        	return new UnitDimension(obj);
        else
        	throw new IllegalArgumentException("UnitDimension: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("e8042419-0ceb-41c4-b096-829864d97ea1")
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
        UnitDimension other = (UnitDimension) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link DataType}. 
     * @return the DataType represented by this proxy, never null.
     */
    @objid ("868faa01-ba12-4496-830c-07bd3fbd12c9")
    @Override
    public DataType getElement() {
        return (DataType)super.getElement();
    }

    @objid ("a9f987f0-3fb3-4e4e-8887-8ca98d0b8e53")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("57db889b-5d8e-4efe-a525-abf6423feecb")
    protected UnitDimension(final DataType elt) {
        super(elt);
    }

    @objid ("75da9eb1-b40f-49c3-9600-695ba46ea42f")
    public static final class MdaTypes {
        @objid ("48b4de05-c2fd-41bd-a904-e92807a50849")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("5bebf806-aac0-41f7-bf6d-9a754109c516")
        private static Stereotype MDAASSOCDEP;

        @objid ("5ad4300f-efa3-455a-bee2-ce9c8e8f4d00")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("7816f994-4b98-4908-bb37-2a5c0fa4e0f3")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "ce437f2d-07f2-4127-9702-da4eb627b157");
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
