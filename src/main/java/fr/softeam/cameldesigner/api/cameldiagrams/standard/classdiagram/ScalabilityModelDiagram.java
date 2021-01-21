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
 * Proxy class to handle a {@link ClassDiagram} with << ScalabilityModelDiagram >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("1aefa3bd-afe8-4cd0-8d7f-d240cb6f7cff")
public class ScalabilityModelDiagram extends AbstractCamelDiagram {
    @objid ("91287829-6865-49ae-bc20-a2dd608497da")
    public static final String STEREOTYPE_NAME = "ScalabilityModelDiagram";

    /**
     * Tells whether a {@link ScalabilityModelDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link ClassDiagram} stereotyped << ScalabilityModelDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("6cf1a3d0-c032-476e-914b-69d9e9197218")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ClassDiagram) && ((ClassDiagram) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ScalabilityModelDiagram.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ClassDiagram} stereotyped << ScalabilityModelDiagram >> then instantiate a {@link ScalabilityModelDiagram} proxy.
     * 
     * @return a {@link ScalabilityModelDiagram} proxy on the created {@link ClassDiagram}.
     */
    @objid ("9b37b058-2954-4444-8d2a-d400ae583bf9")
    public static ScalabilityModelDiagram create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.ClassDiagram");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, ScalabilityModelDiagram.STEREOTYPE_NAME);
        return ScalabilityModelDiagram.instantiate((ClassDiagram)e);
    }

    /**
     * Tries to instantiate a {@link ScalabilityModelDiagram} proxy from a {@link ClassDiagram} stereotyped << ScalabilityModelDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ClassDiagram
     * @return a {@link ScalabilityModelDiagram} proxy or <i>null</i>.
     */
    @objid ("cd6cb442-e6a0-4e9b-a2c9-bc1dc8a77b38")
    public static ScalabilityModelDiagram instantiate(final ClassDiagram obj) {
        return ScalabilityModelDiagram.canInstantiate(obj) ? new ScalabilityModelDiagram(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ScalabilityModelDiagram} proxy from a {@link ClassDiagram} stereotyped << ScalabilityModelDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ClassDiagram}
     * @return a {@link ScalabilityModelDiagram} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("899e5e6c-5600-4915-b156-7e07e6c65567")
    public static ScalabilityModelDiagram safeInstantiate(final ClassDiagram obj) throws IllegalArgumentException {
        if (ScalabilityModelDiagram.canInstantiate(obj))
        	return new ScalabilityModelDiagram(obj);
        else
        	throw new IllegalArgumentException("ScalabilityModelDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("7927ec72-4521-48ca-877b-f541f3bd06f8")
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
        ScalabilityModelDiagram other = (ScalabilityModelDiagram) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ClassDiagram}. 
     * @return the ClassDiagram represented by this proxy, never null.
     */
    @objid ("557eec96-cf96-43b8-976e-b7ba90d46edd")
    @Override
    public ClassDiagram getElement() {
        return (ClassDiagram)super.getElement();
    }

    @objid ("6fb26009-4252-47f2-9544-15015b8d9dc4")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("e4adc1ac-9f88-42d4-86c6-cda1cafd0cab")
    protected ScalabilityModelDiagram(final ClassDiagram elt) {
        super(elt);
    }

    @objid ("60219e4b-13d2-4abf-8e42-424d1c32a3ca")
    public static final class MdaTypes {
        @objid ("2bd0b8ce-e838-4203-8286-0813ee572510")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("19bbc36f-b5ac-417d-b020-c9fcb74755c2")
        private static Stereotype MDAASSOCDEP;

        @objid ("6f401069-4241-4144-b7c1-c96ef50fe633")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("7e071b33-d216-4629-94b5-5b50996fe0b3")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "7f111587-b577-4533-9e55-41832442bd71");
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
