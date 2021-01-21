/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.00

 * This file was generated on 12/10/20 11:37 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.deploymentmodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.Feature;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.HorizontalScaleRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.LocationRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.OSRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.PaaSRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ProviderRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ResourceRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.SecurityRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.VerticalScaleRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.enumeration.ImageRequirement;
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
 * Proxy class to handle a {@link Class} with << RequirementSet >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("e40108e4-3b57-462c-a46e-00c47710d45a")
public class RequirementSet extends Feature {
    @objid ("4162af3e-1491-4886-82b0-1d493b1b63d7")
    public static final String STEREOTYPE_NAME = "RequirementSet";

    /**
     * Tells whether a {@link RequirementSet proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << RequirementSet >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("4b3e7c86-7d90-4532-a404-3deb117d08a9")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, RequirementSet.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << RequirementSet >> then instantiate a {@link RequirementSet} proxy.
     * 
     * @return a {@link RequirementSet} proxy on the created {@link Class}.
     */
    @objid ("a923cc4a-ca46-4ced-a709-57c162fbe0da")
    public static RequirementSet create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, RequirementSet.STEREOTYPE_NAME);
        return RequirementSet.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link RequirementSet} proxy from a {@link Class} stereotyped << RequirementSet >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link RequirementSet} proxy or <i>null</i>.
     */
    @objid ("b368c24c-a370-4098-bcec-79cc7a44e2da")
    public static RequirementSet instantiate(final Class obj) {
        return RequirementSet.canInstantiate(obj) ? new RequirementSet(obj) : null;
    }

    /**
     * Tries to instantiate a {@link RequirementSet} proxy from a {@link Class} stereotyped << RequirementSet >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link RequirementSet} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("ec8f7f4e-5a9b-4888-aa48-8a064732ae85")
    public static RequirementSet safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (RequirementSet.canInstantiate(obj))
        	return new RequirementSet(obj);
        else
        	throw new IllegalArgumentException("RequirementSet: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("17bdfd14-297c-45af-a759-c79ba646297d")
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
        RequirementSet other = (RequirementSet) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("fe0b62e6-96a5-4ff1-a014-989cbc44b3f7")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Get the value of the 'horizontalScaleRequirement' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("6c80dbe9-04e1-42cf-975e-721ae5651546")
    public HorizontalScaleRequirement getHorizontalScaleRequirement() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(RequirementSet.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(RequirementSet.MdaTypes.MDAASSOCDEP_ROLE), "horizontalScaleRequirement")
                  && HorizontalScaleRequirement.canInstantiate(d.getDependsOn())) {
                     return (HorizontalScaleRequirement)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), HorizontalScaleRequirement.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the value of the 'imageRequirement' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("95166601-2b62-48a9-a0b6-b0ce73ee0f3e")
    public ImageRequirement getImageRequirement() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(RequirementSet.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(RequirementSet.MdaTypes.MDAASSOCDEP_ROLE), "imageRequirement")
                  && ImageRequirement.canInstantiate(d.getDependsOn())) {
                     return (ImageRequirement)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), ImageRequirement.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the value of the 'locationRequirement' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("ddd50cae-9bba-44e4-a959-9d86d870533c")
    public LocationRequirement getLocationRequirement() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(RequirementSet.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(RequirementSet.MdaTypes.MDAASSOCDEP_ROLE), "locationRequirement")
                  && LocationRequirement.canInstantiate(d.getDependsOn())) {
                     return (LocationRequirement)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), LocationRequirement.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the value of the 'osRequirement' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("a8373d8b-7787-47d7-9fe8-cd19f8d719ad")
    public OSRequirement getOsRequirement() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(RequirementSet.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(RequirementSet.MdaTypes.MDAASSOCDEP_ROLE), "osRequirement")
                  && OSRequirement.canInstantiate(d.getDependsOn())) {
                     return (OSRequirement)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), OSRequirement.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the value of the 'paasRequirement' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("cd5a3b32-6fee-451f-8559-1ae045183a9e")
    public PaaSRequirement getPaasRequirement() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(RequirementSet.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(RequirementSet.MdaTypes.MDAASSOCDEP_ROLE), "paasRequirement")
                  && PaaSRequirement.canInstantiate(d.getDependsOn())) {
                     return (PaaSRequirement)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), PaaSRequirement.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the value of the 'providerRequirement' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("16972ea2-7ef4-4519-8ec1-afcddf6d6700")
    public ProviderRequirement getProviderRequirement() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(RequirementSet.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(RequirementSet.MdaTypes.MDAASSOCDEP_ROLE), "providerRequirement")
                  && ProviderRequirement.canInstantiate(d.getDependsOn())) {
                     return (ProviderRequirement)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), ProviderRequirement.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the value of the 'resourceRequirement' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("f281cf0f-13c1-44a4-a253-2fdfa7d1724a")
    public ResourceRequirement getResourceRequirement() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(RequirementSet.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(RequirementSet.MdaTypes.MDAASSOCDEP_ROLE), "resourceRequirement")
                  && ResourceRequirement.canInstantiate(d.getDependsOn())) {
                     return (ResourceRequirement)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), ResourceRequirement.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the value of the 'securityRequirement' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("e945b783-88d3-4cd9-ac0b-ee371204ff74")
    public SecurityRequirement getSecurityRequirement() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(RequirementSet.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(RequirementSet.MdaTypes.MDAASSOCDEP_ROLE), "securityRequirement")
                  && SecurityRequirement.canInstantiate(d.getDependsOn())) {
                     return (SecurityRequirement)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), SecurityRequirement.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the value of the 'verticalScaleRequirement' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("eb3362c9-667c-4575-9bcb-2af5e21f33c3")
    public VerticalScaleRequirement getVerticalScaleRequirement() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(RequirementSet.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(RequirementSet.MdaTypes.MDAASSOCDEP_ROLE), "verticalScaleRequirement")
                  && VerticalScaleRequirement.canInstantiate(d.getDependsOn())) {
                     return (VerticalScaleRequirement)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), VerticalScaleRequirement.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    @objid ("f226e948-eff4-4445-87a9-7479b69ec8a5")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'horizontalScaleRequirement' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("bb446211-5188-446d-ba04-35f1724a4bca")
    public void setHorizontalScaleRequirement(final HorizontalScaleRequirement obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(RequirementSet.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(RequirementSet.MdaTypes.MDAASSOCDEP_ROLE), "horizontalScaleRequirement")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), RequirementSet.MdaTypes.MDAASSOCDEP);
              dep.setName("horizontalScaleRequirement");      dep.putTagValue(RequirementSet.MdaTypes.MDAASSOCDEP_ROLE, "horizontalScaleRequirement");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Set the value of the 'imageRequirement' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("f4e721d7-b794-49d4-a2fd-f5ebebcf9bc9")
    public void setImageRequirement(final ImageRequirement obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(RequirementSet.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(RequirementSet.MdaTypes.MDAASSOCDEP_ROLE), "imageRequirement")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), RequirementSet.MdaTypes.MDAASSOCDEP);
              dep.setName("imageRequirement");      dep.putTagValue(RequirementSet.MdaTypes.MDAASSOCDEP_ROLE, "imageRequirement");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Set the value of the 'locationRequirement' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("c06e4b47-d747-4177-9337-23bc0cd4d15b")
    public void setLocationRequirement(final LocationRequirement obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(RequirementSet.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(RequirementSet.MdaTypes.MDAASSOCDEP_ROLE), "locationRequirement")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), RequirementSet.MdaTypes.MDAASSOCDEP);
              dep.setName("locationRequirement");      dep.putTagValue(RequirementSet.MdaTypes.MDAASSOCDEP_ROLE, "locationRequirement");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Set the value of the 'osRequirement' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("059bca5c-bfe6-417c-84d0-ac76ebf0ad78")
    public void setOsRequirement(final OSRequirement obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(RequirementSet.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(RequirementSet.MdaTypes.MDAASSOCDEP_ROLE), "osRequirement")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), RequirementSet.MdaTypes.MDAASSOCDEP);
              dep.setName("osRequirement");      dep.putTagValue(RequirementSet.MdaTypes.MDAASSOCDEP_ROLE, "osRequirement");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Set the value of the 'paasRequirement' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("d5dd1c73-668f-44d3-92dd-ad8a79efc90a")
    public void setPaasRequirement(final PaaSRequirement obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(RequirementSet.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(RequirementSet.MdaTypes.MDAASSOCDEP_ROLE), "paasRequirement")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), RequirementSet.MdaTypes.MDAASSOCDEP);
              dep.setName("paasRequirement");      dep.putTagValue(RequirementSet.MdaTypes.MDAASSOCDEP_ROLE, "paasRequirement");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Set the value of the 'providerRequirement' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("e860d078-4637-46d4-851e-12caa4148220")
    public void setProviderRequirement(final ProviderRequirement obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(RequirementSet.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(RequirementSet.MdaTypes.MDAASSOCDEP_ROLE), "providerRequirement")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), RequirementSet.MdaTypes.MDAASSOCDEP);
              dep.setName("providerRequirement");      dep.putTagValue(RequirementSet.MdaTypes.MDAASSOCDEP_ROLE, "providerRequirement");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Set the value of the 'resourceRequirement' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("97e46b50-a0f5-4b19-8e2f-49c115dd87f3")
    public void setResourceRequirement(final ResourceRequirement obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(RequirementSet.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(RequirementSet.MdaTypes.MDAASSOCDEP_ROLE), "resourceRequirement")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), RequirementSet.MdaTypes.MDAASSOCDEP);
              dep.setName("resourceRequirement");      dep.putTagValue(RequirementSet.MdaTypes.MDAASSOCDEP_ROLE, "resourceRequirement");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Set the value of the 'securityRequirement' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("41443b83-b64e-4ca5-a7ee-c6017acf6232")
    public void setSecurityRequirement(final SecurityRequirement obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(RequirementSet.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(RequirementSet.MdaTypes.MDAASSOCDEP_ROLE), "securityRequirement")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), RequirementSet.MdaTypes.MDAASSOCDEP);
              dep.setName("securityRequirement");      dep.putTagValue(RequirementSet.MdaTypes.MDAASSOCDEP_ROLE, "securityRequirement");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Set the value of the 'verticalScaleRequirement' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("2bf59bf6-d822-4d96-8846-3f1bcfadf227")
    public void setVerticalScaleRequirement(final VerticalScaleRequirement obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(RequirementSet.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(RequirementSet.MdaTypes.MDAASSOCDEP_ROLE), "verticalScaleRequirement")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), RequirementSet.MdaTypes.MDAASSOCDEP);
              dep.setName("verticalScaleRequirement");      dep.putTagValue(RequirementSet.MdaTypes.MDAASSOCDEP_ROLE, "verticalScaleRequirement");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    @objid ("0dc69ba9-64ff-41ca-8d6f-74e92d3d7f6e")
    protected RequirementSet(final Class elt) {
        super(elt);
    }

    @objid ("56f9723e-57a0-4b68-946b-a3f85b1617ce")
    public static final class MdaTypes {
        @objid ("49ebfba2-a972-452b-9603-7e3596508b29")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ab12e6ef-64f4-4603-ab38-6dd6cc62fb99")
        private static Stereotype MDAASSOCDEP;

        @objid ("69b092a5-602c-4055-a999-2801bb874c75")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b395cd2b-bd60-40fc-ad77-f5e17eb13ce8")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "513b1519-9560-4cd7-9dd4-f071d5fe54e8");
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
