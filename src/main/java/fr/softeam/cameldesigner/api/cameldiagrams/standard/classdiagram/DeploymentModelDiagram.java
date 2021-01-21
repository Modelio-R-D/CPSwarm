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
 * Proxy class to handle a {@link ClassDiagram} with << DeploymentModelDiagram >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("85540842-c7cb-455a-a265-21e99c9177ad")
public class DeploymentModelDiagram extends AbstractCamelDiagram {
    @objid ("c9d8dbbd-74bf-41da-903e-6340c23d2577")
    public static final String STEREOTYPE_NAME = "DeploymentModelDiagram";

    /**
     * Tells whether a {@link DeploymentModelDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link ClassDiagram} stereotyped << DeploymentModelDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("efbb96d9-a7b1-4373-a5ee-d18b7167c345")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ClassDiagram) && ((ClassDiagram) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DeploymentModelDiagram.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ClassDiagram} stereotyped << DeploymentModelDiagram >> then instantiate a {@link DeploymentModelDiagram} proxy.
     * 
     * @return a {@link DeploymentModelDiagram} proxy on the created {@link ClassDiagram}.
     */
    @objid ("69c449de-8fc0-4ba5-93e7-b41d369e4a0c")
    public static DeploymentModelDiagram create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.ClassDiagram");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, DeploymentModelDiagram.STEREOTYPE_NAME);
        return DeploymentModelDiagram.instantiate((ClassDiagram)e);
    }

    /**
     * Tries to instantiate a {@link DeploymentModelDiagram} proxy from a {@link ClassDiagram} stereotyped << DeploymentModelDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ClassDiagram
     * @return a {@link DeploymentModelDiagram} proxy or <i>null</i>.
     */
    @objid ("5ec94853-47bc-4dd0-87cd-91c03395a6fe")
    public static DeploymentModelDiagram instantiate(final ClassDiagram obj) {
        return DeploymentModelDiagram.canInstantiate(obj) ? new DeploymentModelDiagram(obj) : null;
    }

    /**
     * Tries to instantiate a {@link DeploymentModelDiagram} proxy from a {@link ClassDiagram} stereotyped << DeploymentModelDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ClassDiagram}
     * @return a {@link DeploymentModelDiagram} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("4108a3c5-e3e6-45e2-b0a5-bc270834cef5")
    public static DeploymentModelDiagram safeInstantiate(final ClassDiagram obj) throws IllegalArgumentException {
        if (DeploymentModelDiagram.canInstantiate(obj))
        	return new DeploymentModelDiagram(obj);
        else
        	throw new IllegalArgumentException("DeploymentModelDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("6ab9fb11-2566-4ba8-9d49-f505aaf0e114")
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
        DeploymentModelDiagram other = (DeploymentModelDiagram) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ClassDiagram}. 
     * @return the ClassDiagram represented by this proxy, never null.
     */
    @objid ("31ed2770-2411-4556-9bc3-2b363e8f56d4")
    @Override
    public ClassDiagram getElement() {
        return (ClassDiagram)super.getElement();
    }

    @objid ("cd7437a4-8fdf-44f0-aad6-996de4dc3026")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("c3470d50-7d7f-4681-8e89-63b87b51967a")
    protected DeploymentModelDiagram(final ClassDiagram elt) {
        super(elt);
    }

    @objid ("e60b30af-a064-499b-bd68-785456b8cd45")
    public static final class MdaTypes {
        @objid ("9931795d-9964-419e-809b-d253bd1e86a3")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("5a84f90a-1b0a-4ee8-8f86-1f56444a3da4")
        private static Stereotype MDAASSOCDEP;

        @objid ("670851aa-9a0b-4e50-819a-25bf4622a370")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("0a468838-b95e-4867-aa71-30051abe6993")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "b78ff0fe-e31c-4034-ba6a-7a3d0626819e");
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
