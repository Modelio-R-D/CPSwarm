/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.00

 * This file was generated on 12/10/20 11:37 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.deploymentmodel.standard.package_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.standard.package_.CamelModel;
import fr.softeam.cameldesigner.api.camelcore.standard.package_.SubModel;
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
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Package} with << DeploymentModel >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("6e4c7b4b-d381-4e52-a43d-fcb0cea6173f")
public class DeploymentModel extends SubModel {
    @objid ("a05e7927-7f73-4a48-885e-5463b0fe9c95")
    public static final String STEREOTYPE_NAME = "DeploymentModel";

    /**
     * Tells whether a {@link DeploymentModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << DeploymentModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("42f2510f-39de-4c12-b23e-bf8a21bef85d")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DeploymentModel.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Package} stereotyped << DeploymentModel >> then instantiate a {@link DeploymentModel} proxy.
     * 
     * @return a {@link DeploymentModel} proxy on the created {@link Package}.
     */
    @objid ("5d6b157c-38b9-455b-8f29-25980129b1e9")
    public static DeploymentModel create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Package");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, DeploymentModel.STEREOTYPE_NAME);
        return DeploymentModel.instantiate((Package)e);
    }

    /**
     * Tries to instantiate a {@link DeploymentModel} proxy from a {@link Package} stereotyped << DeploymentModel >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Package
     * @return a {@link DeploymentModel} proxy or <i>null</i>.
     */
    @objid ("7bf3f745-133b-44dc-9c36-a7be1f42801e")
    public static DeploymentModel instantiate(final Package obj) {
        return DeploymentModel.canInstantiate(obj) ? new DeploymentModel(obj) : null;
    }

    /**
     * Tries to instantiate a {@link DeploymentModel} proxy from a {@link Package} stereotyped << DeploymentModel >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Package}
     * @return a {@link DeploymentModel} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("06793be7-1bba-49b6-a47c-2cb8e431aa89")
    public static DeploymentModel safeInstantiate(final Package obj) throws IllegalArgumentException {
        if (DeploymentModel.canInstantiate(obj))
        	return new DeploymentModel(obj);
        else
        	throw new IllegalArgumentException("DeploymentModel: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("8aa3e2ea-06f1-45f6-b1e2-75ae600b323a")
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
        DeploymentModel other = (DeploymentModel) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the value to the 'camelModel' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("69134e81-de43-4543-8c82-960a70bc6940")
    public CamelModel getCamelModel() {
        return (CamelModel)CamelDesignerProxyFactory.instantiate(((Package) this.elt).getOwner(), CamelModel.STEREOTYPE_NAME);
    }

    /**
     * Get the underlying {@link Package}. 
     * @return the Package represented by this proxy, never null.
     */
    @objid ("4cd829b9-5809-47e7-8180-7c0ea133d1b7")
    @Override
    public Package getElement() {
        return (Package)super.getElement();
    }

    @objid ("bd66f6f3-d330-4c6c-b915-b1024d503c97")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'camelModel' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("879f2266-7507-46b7-b480-eb7bbc5b723e")
    public void setCamelModel(final CamelModel obj) {
        ((Package) this.elt).setOwner((obj != null) ? obj.getElement() : null);
    }

    @objid ("f1dec3cb-e70a-40fa-a01d-e0b6201d7985")
    protected DeploymentModel(final Package elt) {
        super(elt);
    }

    @objid ("bcfd6f5c-46e7-47aa-9a4b-79a22339b9f4")
    public static final class MdaTypes {
        @objid ("523dc2a5-1224-472e-8390-dae517878aa0")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ad1ca3e0-e347-48c6-bd72-98c345880ac3")
        private static Stereotype MDAASSOCDEP;

        @objid ("44aaf983-f437-4161-8929-5ee7837d35a5")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d373fb53-579c-4ac4-a5e6-1929f7633862")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "7d620068-3fc6-4fec-8829-0444c0c3186f");
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
