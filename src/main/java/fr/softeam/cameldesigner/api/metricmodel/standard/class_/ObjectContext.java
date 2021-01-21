/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.00

 * This file was generated on 12/10/20 11:37 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.metricmodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.FeatureClass;
import fr.softeam.cameldesigner.api.datamodel.standard.class_.Data;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.CamelComponent;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.connector.Communication;
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
 * Proxy class to handle a {@link Class} with << ObjectContext >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("6b0e8788-1e8c-4f51-b3be-5895fa33507f")
public class ObjectContext extends FeatureClass {
    @objid ("7091e98f-e465-4fd0-8315-e89606c41bdc")
    public static final String STEREOTYPE_NAME = "ObjectContext";

    /**
     * Tells whether a {@link ObjectContext proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << ObjectContext >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("b6e571b0-68ed-4844-b1ae-bc18d097e8e9")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ObjectContext.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << ObjectContext >> then instantiate a {@link ObjectContext} proxy.
     * 
     * @return a {@link ObjectContext} proxy on the created {@link Class}.
     */
    @objid ("479c83a9-82c9-4ad4-a309-5a0ebb5a2a20")
    public static ObjectContext create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, ObjectContext.STEREOTYPE_NAME);
        return ObjectContext.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link ObjectContext} proxy from a {@link Class} stereotyped << ObjectContext >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link ObjectContext} proxy or <i>null</i>.
     */
    @objid ("4c27e23f-312c-41c0-960e-ab4a56b2ea08")
    public static ObjectContext instantiate(final Class obj) {
        return ObjectContext.canInstantiate(obj) ? new ObjectContext(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ObjectContext} proxy from a {@link Class} stereotyped << ObjectContext >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link ObjectContext} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("272c76c2-7c7f-4029-b7f2-5a26d3392ad2")
    public static ObjectContext safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (ObjectContext.canInstantiate(obj))
        	return new ObjectContext(obj);
        else
        	throw new IllegalArgumentException("ObjectContext: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("ac54f799-8319-461f-bca0-b4602d0cc2c9")
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
        ObjectContext other = (ObjectContext) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the value of the 'communication' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("47c9853c-2559-46e5-b129-f876384545b7")
    public Communication getCommunication() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(ObjectContext.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(ObjectContext.MdaTypes.MDAASSOCDEP_ROLE), "communication")
                  && Communication.canInstantiate(d.getDependsOn())) {
                     return (Communication)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Communication.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the value of the 'component' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("e3da34bd-5592-4334-90db-bcdaa304fa4f")
    public CamelComponent getComponent() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(ObjectContext.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(ObjectContext.MdaTypes.MDAASSOCDEP_ROLE), "component")
                  && CamelComponent.canInstantiate(d.getDependsOn())) {
                     return (CamelComponent)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), CamelComponent.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the value of the 'data' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("c7599244-2aad-4b7a-88f4-fd2675ce5380")
    public Data getData() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(ObjectContext.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(ObjectContext.MdaTypes.MDAASSOCDEP_ROLE), "data")
                  && Data.canInstantiate(d.getDependsOn())) {
                     return (Data)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Data.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("d753ee33-34b7-488a-9932-2d1094036a52")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("6325c238-03b7-4d6f-901a-9501066658a9")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'communication' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("3dc0853b-db86-4541-abef-554281deabac")
    public void setCommunication(final Communication obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(ObjectContext.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(ObjectContext.MdaTypes.MDAASSOCDEP_ROLE), "communication")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), ObjectContext.MdaTypes.MDAASSOCDEP);
              dep.setName("communication");      dep.putTagValue(ObjectContext.MdaTypes.MDAASSOCDEP_ROLE, "communication");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Set the value of the 'component' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("fa675f37-260a-40ad-9dde-17d59b27235e")
    public void setComponent(final CamelComponent obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(ObjectContext.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(ObjectContext.MdaTypes.MDAASSOCDEP_ROLE), "component")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), ObjectContext.MdaTypes.MDAASSOCDEP);
              dep.setName("component");      dep.putTagValue(ObjectContext.MdaTypes.MDAASSOCDEP_ROLE, "component");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Set the value of the 'data' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("9e3a60d2-9a72-4925-80c0-c18716a98b7f")
    public void setData(final Data obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(ObjectContext.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(ObjectContext.MdaTypes.MDAASSOCDEP_ROLE), "data")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), ObjectContext.MdaTypes.MDAASSOCDEP);
              dep.setName("data");      dep.putTagValue(ObjectContext.MdaTypes.MDAASSOCDEP_ROLE, "data");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    @objid ("2e1c6861-1670-40a1-9424-d2a1f00f71c4")
    protected ObjectContext(final Class elt) {
        super(elt);
    }

    @objid ("5fffe97f-3562-4512-9295-ad884699b40d")
    public static final class MdaTypes {
        @objid ("97c9999f-364b-420b-8151-5fc9e6b9c659")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("3e613670-467b-4524-905c-991c2606bc2d")
        private static Stereotype MDAASSOCDEP;

        @objid ("5e6816ad-72ca-4071-aaaa-1e607d8e100a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("44b4d965-9136-4a5e-8a73-b1c1b8429bd4")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "b5ec870a-0a52-4a49-a5f3-ee6a50acb0c7");
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
