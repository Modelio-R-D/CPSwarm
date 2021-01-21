/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.00

 * This file was generated on 12/10/20 11:37 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.locationmodel.standard.enumeration.Location;
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
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Instance} with << VMInstance >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("8d75b5a3-1b22-4793-a4d1-8b8d4ec31008")
public class VMInstance extends ComponentInstance {
    @objid ("a002c9e9-d1e5-4ae9-92f5-f4af6f74d0a1")
    public static final String STEREOTYPE_NAME = "VMInstance";

    /**
     * Tells whether a {@link VMInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << VMInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("26bba5b7-3fc4-4671-a6ef-5c9d69a82759")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, VMInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << VMInstance >> then instantiate a {@link VMInstance} proxy.
     * 
     * @return a {@link VMInstance} proxy on the created {@link Instance}.
     */
    @objid ("21a3944f-2282-4be7-8d5e-34a4764a3fa9")
    public static VMInstance create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Instance");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, VMInstance.STEREOTYPE_NAME);
        return VMInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link VMInstance} proxy from a {@link Instance} stereotyped << VMInstance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link VMInstance} proxy or <i>null</i>.
     */
    @objid ("d0e54cda-37af-45b8-aabe-6a457c47b0ed")
    public static VMInstance instantiate(final Instance obj) {
        return VMInstance.canInstantiate(obj) ? new VMInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link VMInstance} proxy from a {@link Instance} stereotyped << VMInstance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link VMInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("a839c894-6cfe-44b6-9d5a-58f9cef5c473")
    public static VMInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (VMInstance.canInstantiate(obj))
        	return new VMInstance(obj);
        else
        	throw new IllegalArgumentException("VMInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("281e11dd-8431-49dd-b9a1-5d569fe97ffd")
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
        VMInstance other = (VMInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("e99e7aac-bc5a-41a3-baa9-036d25b51135")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Get the value of the 'location' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("be315bcc-83ea-4f06-9fae-23391ea0d0af")
    public Location getLocation() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(VMInstance.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(VMInstance.MdaTypes.MDAASSOCDEP_ROLE), "location")
                  && Location.canInstantiate(d.getDependsOn())) {
                     return (Location)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Location.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    @objid ("6db9bc16-afa0-42d9-a40b-48798bca2c3b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'location' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("079da96e-2112-4cf5-b90a-3d668270af28")
    public void setLocation(final Location obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(VMInstance.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(VMInstance.MdaTypes.MDAASSOCDEP_ROLE), "location")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), VMInstance.MdaTypes.MDAASSOCDEP);
              dep.setName("location");      dep.putTagValue(VMInstance.MdaTypes.MDAASSOCDEP_ROLE, "location");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    @objid ("a83d0062-c4cb-41c7-9eca-59a46b8f1cc9")
    protected VMInstance(final Instance elt) {
        super(elt);
    }

    @objid ("fe234d2a-6b82-4461-8b1d-47db446666cf")
    public static final class MdaTypes {
        @objid ("954db132-1d35-4641-8e43-12127d5e98b3")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c28ae419-9d39-4611-b6bd-b2fcdea1eaa7")
        private static Stereotype MDAASSOCDEP;

        @objid ("341424d3-5604-428f-a2c4-1dbb5ac27e83")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("3684774b-0ff4-45ea-ba2e-bc61997a90c9")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "a9a4550c-517a-4781-a3c9-5eb56d430f48");
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
