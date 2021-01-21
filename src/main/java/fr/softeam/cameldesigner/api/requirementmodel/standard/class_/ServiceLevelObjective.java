/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.00

 * This file was generated on 12/10/20 11:37 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.requirementmodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.requirementmodel.standard.generalclass.HardRequirement;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.Event;
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
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Class} with << ServiceLevelObjective >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("c1a7b9fb-e797-4f38-a956-d25268a52f8d")
public class ServiceLevelObjective extends HardRequirement {
    @objid ("b7d7d2a7-8f89-4115-8863-647604ed01a3")
    public static final String STEREOTYPE_NAME = "ServiceLevelObjective";

    /**
     * Tells whether a {@link ServiceLevelObjective proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << ServiceLevelObjective >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("b27ecae0-41ad-426f-8706-dfd32f8acd63")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ServiceLevelObjective.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << ServiceLevelObjective >> then instantiate a {@link ServiceLevelObjective} proxy.
     * 
     * @return a {@link ServiceLevelObjective} proxy on the created {@link Class}.
     */
    @objid ("934639e1-6287-46f2-aacd-44fbf1c07904")
    public static ServiceLevelObjective create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, ServiceLevelObjective.STEREOTYPE_NAME);
        return ServiceLevelObjective.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link ServiceLevelObjective} proxy from a {@link Class} stereotyped << ServiceLevelObjective >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link ServiceLevelObjective} proxy or <i>null</i>.
     */
    @objid ("4d7b1802-e2b6-4052-9706-c511a7c4a451")
    public static ServiceLevelObjective instantiate(final Class obj) {
        return ServiceLevelObjective.canInstantiate(obj) ? new ServiceLevelObjective(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ServiceLevelObjective} proxy from a {@link Class} stereotyped << ServiceLevelObjective >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link ServiceLevelObjective} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("d811f95b-1312-4e56-a4dc-cdcedcefac86")
    public static ServiceLevelObjective safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (ServiceLevelObjective.canInstantiate(obj))
        	return new ServiceLevelObjective(obj);
        else
        	throw new IllegalArgumentException("ServiceLevelObjective: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("1e8293d7-78af-460b-9514-0218e393daed")
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
        ServiceLevelObjective other = (ServiceLevelObjective) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("2b67284e-8538-4ca8-ba9b-cea56943a4bc")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Get the value of the 'violationEvent' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("8dcc686b-54e3-412c-8578-760f5a052562")
    public Event getViolationEvent() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(ServiceLevelObjective.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(ServiceLevelObjective.MdaTypes.MDAASSOCDEP_ROLE), "violationEvent")
                  && Event.canInstantiate(d.getDependsOn())) {
                     return (Event)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Event.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    @objid ("d89ebca8-d646-4376-836f-831f5466beb1")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'violationEvent' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("bc421f65-35d5-41d3-94b3-be75cfc8032a")
    public void setViolationEvent(final Event obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(ServiceLevelObjective.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(ServiceLevelObjective.MdaTypes.MDAASSOCDEP_ROLE), "violationEvent")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), ServiceLevelObjective.MdaTypes.MDAASSOCDEP);
              dep.setName("violationEvent");      dep.putTagValue(ServiceLevelObjective.MdaTypes.MDAASSOCDEP_ROLE, "violationEvent");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    @objid ("01fb3280-beb3-48f9-b307-3198e6b78dc7")
    protected ServiceLevelObjective(final Class elt) {
        super(elt);
    }

    @objid ("798dc94a-b673-4408-9cfc-a760eac81e13")
    public static final class MdaTypes {
        @objid ("b2dd7aaa-51d3-4ad0-a826-6ad1e33c46aa")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("5524bada-4fd1-4322-9747-61eef38cd8c1")
        private static Stereotype MDAASSOCDEP;

        @objid ("18afb990-86c9-45cc-923c-39ee28a7f068")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b4471660-ac26-4539-adaf-162f2ef68623")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "72de5d29-7d68-48f4-a3ac-eace289da2c6");
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
