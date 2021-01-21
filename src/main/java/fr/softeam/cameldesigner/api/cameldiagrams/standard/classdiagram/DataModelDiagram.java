/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.00

 * This file was generated on 12/10/20 11:37 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram;

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
import org.modelio.metamodel.diagrams.ClassDiagram;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link ClassDiagram} with << DataModelDiagram >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("05f54bfd-dbfd-4864-835a-f9d72e6569b8")
public class DataModelDiagram extends AbstractCamelDiagram {
    @objid ("bc052a03-fc50-436a-9b20-fcdfc43af23c")
    public static final String STEREOTYPE_NAME = "DataModelDiagram";

    /**
     * Tells whether a {@link DataModelDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link ClassDiagram} stereotyped << DataModelDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("0ee106a4-ce77-4812-b34d-d2d592084e2d")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ClassDiagram) && ((ClassDiagram) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DataModelDiagram.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ClassDiagram} stereotyped << DataModelDiagram >> then instantiate a {@link DataModelDiagram} proxy.
     * 
     * @return a {@link DataModelDiagram} proxy on the created {@link ClassDiagram}.
     */
    @objid ("e3bf722b-4041-46c9-84c9-b912f3cdd158")
    public static DataModelDiagram create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.ClassDiagram");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, DataModelDiagram.STEREOTYPE_NAME);
        return DataModelDiagram.instantiate((ClassDiagram)e);
    }

    /**
     * Tries to instantiate a {@link DataModelDiagram} proxy from a {@link ClassDiagram} stereotyped << DataModelDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ClassDiagram
     * @return a {@link DataModelDiagram} proxy or <i>null</i>.
     */
    @objid ("1132f4dd-e27b-410f-adb9-7b834f67b8fc")
    public static DataModelDiagram instantiate(final ClassDiagram obj) {
        return DataModelDiagram.canInstantiate(obj) ? new DataModelDiagram(obj) : null;
    }

    /**
     * Tries to instantiate a {@link DataModelDiagram} proxy from a {@link ClassDiagram} stereotyped << DataModelDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ClassDiagram}
     * @return a {@link DataModelDiagram} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("b888527f-6117-4db7-8c4e-9d5510e99a45")
    public static DataModelDiagram safeInstantiate(final ClassDiagram obj) throws IllegalArgumentException {
        if (DataModelDiagram.canInstantiate(obj))
        	return new DataModelDiagram(obj);
        else
        	throw new IllegalArgumentException("DataModelDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("08b3679d-874d-4b1e-929a-60c5c3964b11")
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
        DataModelDiagram other = (DataModelDiagram) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ClassDiagram}. 
     * @return the ClassDiagram represented by this proxy, never null.
     */
    @objid ("218e686c-8c82-4945-887e-23145c35e7da")
    @Override
    public ClassDiagram getElement() {
        return (ClassDiagram)super.getElement();
    }

    @objid ("8428150c-1671-4b51-a7d8-127cff9b0848")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("60098330-7ccf-4edf-a563-24fa3275bdfa")
    protected DataModelDiagram(final ClassDiagram elt) {
        super(elt);
    }

    @objid ("2da9cb4c-8a06-4c65-8a65-2240141641c4")
    public static final class MdaTypes {
        @objid ("772647be-715c-440d-bb29-f6e3accfddc6")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("7e193fe6-1250-4d56-8835-84e825832340")
        private static Stereotype MDAASSOCDEP;

        @objid ("5f39b406-de06-4ebe-b648-5108ffd6dcea")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("0e4c0984-17f2-4455-a804-b8d5c431ffe3")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "fc779080-0243-43b7-a1e1-9ddf71de93d7");
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
