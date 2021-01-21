/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.00

 * This file was generated on 12/10/20 11:37 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.typemodel.standard.datatype;

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
import org.modelio.metamodel.uml.statik.DataType;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link DataType} with << RangeUnion >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("418feac3-a018-487d-af79-66ed2a10b317")
public class RangeUnion extends ValueType {
    @objid ("d17b8d31-dc32-4c1a-8fa3-a7b1a5164888")
    public static final String STEREOTYPE_NAME = "RangeUnion";

    /**
     * Tells whether a {@link RangeUnion proxy} can be instantiated from a {@link MObject} checking it is a {@link DataType} stereotyped << RangeUnion >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("a77c9ae6-48d6-45a9-8d7f-26aa19886c0e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof DataType) && ((DataType) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, RangeUnion.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link DataType} stereotyped << RangeUnion >> then instantiate a {@link RangeUnion} proxy.
     * 
     * @return a {@link RangeUnion} proxy on the created {@link DataType}.
     */
    @objid ("814b1e69-66db-4f74-aa34-91dc3c56fa61")
    public static RangeUnion create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.DataType");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, RangeUnion.STEREOTYPE_NAME);
        return RangeUnion.instantiate((DataType)e);
    }

    /**
     * Tries to instantiate a {@link RangeUnion} proxy from a {@link DataType} stereotyped << RangeUnion >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a DataType
     * @return a {@link RangeUnion} proxy or <i>null</i>.
     */
    @objid ("c36d1a7c-0596-4286-aa98-e30fdb8e0013")
    public static RangeUnion instantiate(final DataType obj) {
        return RangeUnion.canInstantiate(obj) ? new RangeUnion(obj) : null;
    }

    /**
     * Tries to instantiate a {@link RangeUnion} proxy from a {@link DataType} stereotyped << RangeUnion >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link DataType}
     * @return a {@link RangeUnion} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("5a13b284-a3f4-4341-82d9-aa09a265c47a")
    public static RangeUnion safeInstantiate(final DataType obj) throws IllegalArgumentException {
        if (RangeUnion.canInstantiate(obj))
        	return new RangeUnion(obj);
        else
        	throw new IllegalArgumentException("RangeUnion: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("0d454dff-8f0e-4320-ba8f-2b76bab3c633")
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
        RangeUnion other = (RangeUnion) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link DataType}. 
     * @return the DataType represented by this proxy, never null.
     */
    @objid ("dc297f9f-ac25-4050-b007-2a6219f45da5")
    @Override
    public DataType getElement() {
        return (DataType)super.getElement();
    }

    @objid ("6258689b-9657-4b89-b10a-2d031e1787dc")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("235a36d4-f1f1-4792-acd8-6df1bc93b56f")
    protected RangeUnion(final DataType elt) {
        super(elt);
    }

    @objid ("a86c3c8e-3fec-4d3f-8ea5-0137b2bd07d5")
    public static final class MdaTypes {
        @objid ("7cbac6a6-78b4-48b4-a68a-56642f2b02fb")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b30caa30-0e75-4607-8383-3cb329025696")
        private static Stereotype MDAASSOCDEP;

        @objid ("87eaa171-452f-4646-81b3-6d1cb94e47cd")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d5b134f1-f73e-4325-aeb1-9bbc5c0c63f8")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "aeb307d4-49c6-4201-b285-a8ba93b291fb");
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
