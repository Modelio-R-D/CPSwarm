/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v0.1.05

 * This file was generated on 11/27/20 11:19 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.cameldiagrams.standard.staticdiagram;

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
import org.modelio.metamodel.diagrams.StaticDiagram;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link StaticDiagram} with << DataInstanceModelDiagram >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("a66644f2-30f7-474f-a4c0-d51f0bf1ec59")
public class DataInstanceModelDiagram {
    @objid ("8a7aa131-55c0-4399-a0f1-e706cc4dec8c")
    public static final String STEREOTYPE_NAME = "DataInstanceModelDiagram";

    /**
     * The underlying {@link StaticDiagram} represented by this proxy, never null.
     */
    @objid ("ded142c1-9a1b-4083-9ac1-68cf42cd1e0c")
    protected final StaticDiagram elt;

    /**
     * Tells whether a {@link DataInstanceModelDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link StaticDiagram} stereotyped << DataInstanceModelDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("196c95a1-f402-4733-8c3f-70f76b04363f")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof StaticDiagram) && ((StaticDiagram) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DataInstanceModelDiagram.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link StaticDiagram} stereotyped << DataInstanceModelDiagram >> then instantiate a {@link DataInstanceModelDiagram} proxy.
     * 
     * @return a {@link DataInstanceModelDiagram} proxy on the created {@link StaticDiagram}.
     */
    @objid ("bd84cefe-7ba6-4e45-af0b-12cf9b08971a")
    public static DataInstanceModelDiagram create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.StaticDiagram");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, DataInstanceModelDiagram.STEREOTYPE_NAME);
        return DataInstanceModelDiagram.instantiate((StaticDiagram)e);
    }

    /**
     * Tries to instantiate a {@link DataInstanceModelDiagram} proxy from a {@link StaticDiagram} stereotyped << DataInstanceModelDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a StaticDiagram
     * @return a {@link DataInstanceModelDiagram} proxy or <i>null</i>.
     */
    @objid ("e40117e0-483d-4fbb-9e31-30fff9360250")
    public static DataInstanceModelDiagram instantiate(final StaticDiagram obj) {
        return DataInstanceModelDiagram.canInstantiate(obj) ? new DataInstanceModelDiagram(obj) : null;
    }

    /**
     * Tries to instantiate a {@link DataInstanceModelDiagram} proxy from a {@link StaticDiagram} stereotyped << DataInstanceModelDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link StaticDiagram}
     * @return a {@link DataInstanceModelDiagram} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("9df7f198-5ede-4b65-acf9-b93f443981d4")
    public static DataInstanceModelDiagram safeInstantiate(final StaticDiagram obj) throws IllegalArgumentException {
        if (DataInstanceModelDiagram.canInstantiate(obj))
        	return new DataInstanceModelDiagram(obj);
        else
        	throw new IllegalArgumentException("DataInstanceModelDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("40fe9990-53e2-4cd5-8e28-e0e352fa853b")
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
        DataInstanceModelDiagram other = (DataInstanceModelDiagram) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link StaticDiagram}. 
     * @return the StaticDiagram represented by this proxy, never null.
     */
    @objid ("78a7d6ef-6bef-4e23-93d2-dbb2e91a431d")
    public StaticDiagram getElement() {
        return this.elt;
    }

    @objid ("16d352b9-ad12-48c8-92dd-1c0080fbc9f4")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("6d241bfe-c31b-4892-a0d9-fc7e5de5cbb0")
    protected DataInstanceModelDiagram(final StaticDiagram elt) {
        this.elt = elt;
    }

    @objid ("19e4dc36-6bf0-44bb-b9cb-e6f5a07270ec")
    public static final class MdaTypes {
        @objid ("6bc47259-be23-4173-bb1f-f3e1821d219a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b9d38ad3-1cd1-4ba2-9954-161432a82ee5")
        private static Stereotype MDAASSOCDEP;

        @objid ("6ccdadb2-e4af-41b6-a1f5-cfdb784e5348")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("face00ac-cfb4-4cfc-ae9b-9b190a94f23c")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "2a7f32d7-2589-426a-b8ac-21cc062c7781");
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
