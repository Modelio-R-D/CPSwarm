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
 * Proxy class to handle a {@link DataType} with << List >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("74dc4c59-0c01-4785-91ec-67fd63d087d4")
public class List extends ValueType {
    @objid ("d7431bd2-cc36-4c36-8973-6926e6a1d305")
    public static final String STEREOTYPE_NAME = "List";

    /**
     * Tells whether a {@link List proxy} can be instantiated from a {@link MObject} checking it is a {@link DataType} stereotyped << List >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("e19a0c5a-c895-46cc-8d4d-ed78868001f6")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof DataType) && ((DataType) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, List.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link DataType} stereotyped << List >> then instantiate a {@link List} proxy.
     * 
     * @return a {@link List} proxy on the created {@link DataType}.
     */
    @objid ("76730303-269c-4db1-8ecb-a624ca1ab5b3")
    public static List create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.DataType");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, List.STEREOTYPE_NAME);
        return List.instantiate((DataType)e);
    }

    /**
     * Tries to instantiate a {@link List} proxy from a {@link DataType} stereotyped << List >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a DataType
     * @return a {@link List} proxy or <i>null</i>.
     */
    @objid ("4eadf25b-f36e-4ac7-8fe4-b7288973c0f6")
    public static List instantiate(final DataType obj) {
        return List.canInstantiate(obj) ? new List(obj) : null;
    }

    /**
     * Tries to instantiate a {@link List} proxy from a {@link DataType} stereotyped << List >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link DataType}
     * @return a {@link List} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("95b805b1-2ae2-4c51-8a4f-dced5d1948b3")
    public static List safeInstantiate(final DataType obj) throws IllegalArgumentException {
        if (List.canInstantiate(obj))
        	return new List(obj);
        else
        	throw new IllegalArgumentException("List: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("3d46f1f6-7ee9-40f1-8816-33dc0abee5d2")
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
        List other = (List) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link DataType}. 
     * @return the DataType represented by this proxy, never null.
     */
    @objid ("c39aef49-3186-46ad-a076-875a3f350248")
    @Override
    public DataType getElement() {
        return (DataType)super.getElement();
    }

    @objid ("16576567-5cec-4a2f-afe9-7bf47aa27a43")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("f6c53e4d-798a-4b96-9090-17df21902490")
    protected List(final DataType elt) {
        super(elt);
    }

    @objid ("93dc7140-11bf-49e8-a555-177609936c7a")
    public static final class MdaTypes {
        @objid ("57336e59-0d7e-473c-a0a4-b1290f489de6")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d46f4505-bb06-4c0b-a99e-53205911fc02")
        private static Stereotype MDAASSOCDEP;

        @objid ("5be7e60d-ca06-406a-9f3e-7a27b2a1bdf9")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("7809353f-3292-4170-9dae-7a92c4d8d351")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "789c3b87-cb58-4659-a04c-7f948aae0e2e");
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
