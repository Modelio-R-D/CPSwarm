/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.00

 * This file was generated on 12/10/20 11:37 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.metadatamodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.metadatamodel.infrastructure.modelelement.MmsObject;
import fr.softeam.cameldesigner.api.metadatamodel.standard.attribute.MmsProperty;
import fr.softeam.cameldesigner.api.metadatamodel.standard.instance.MmsConceptInstance;
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
 * Proxy class to handle a {@link Class} with << MmsConcept >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("87827b52-a413-4f8b-ac16-cf56568d032b")
public class MmsConcept extends MmsObject {
    @objid ("45f68df7-7280-4bae-b51d-a6a340d38460")
    public static final String STEREOTYPE_NAME = "MmsConcept";

    /**
     * Tells whether a {@link MmsConcept proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << MmsConcept >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("39397aae-ff7f-42b5-be3c-7e3b53f71002")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MmsConcept.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << MmsConcept >> then instantiate a {@link MmsConcept} proxy.
     * 
     * @return a {@link MmsConcept} proxy on the created {@link Class}.
     */
    @objid ("cb156ba9-5406-4539-9596-852ce3555331")
    public static MmsConcept create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, MmsConcept.STEREOTYPE_NAME);
        return MmsConcept.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link MmsConcept} proxy from a {@link Class} stereotyped << MmsConcept >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link MmsConcept} proxy or <i>null</i>.
     */
    @objid ("5833172e-924c-4b05-a2dd-8db146161560")
    public static MmsConcept instantiate(final Class obj) {
        return MmsConcept.canInstantiate(obj) ? new MmsConcept(obj) : null;
    }

    /**
     * Tries to instantiate a {@link MmsConcept} proxy from a {@link Class} stereotyped << MmsConcept >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link MmsConcept} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("2e2b4697-59bd-47f9-88f3-a238e475ce95")
    public static MmsConcept safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (MmsConcept.canInstantiate(obj))
        	return new MmsConcept(obj);
        else
        	throw new IllegalArgumentException("MmsConcept: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value of the 'concept' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("ed66928d-3b6e-4b85-af4f-058beadcbb9c")
    public void addConcept(final MmsConcept obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(obj.getElement(), this.elt, MmsConcept.MdaTypes.MDAASSOCDEP);
            d.setName("parent");
            d.putTagValue(MmsConcept.MdaTypes.MDAASSOCDEP_ROLE, "parent");
        }
    }

    /**
     * Add a value to the 'instance' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("1dc103be-176a-4263-9054-87fc63009c0a")
    public void addInstance(final MmsConceptInstance obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), MmsConcept.MdaTypes.MDAASSOCDEP);
            d.setName("instance");
            d.putTagValue(MmsConcept.MdaTypes.MDAASSOCDEP_ROLE, "instance");
        }
    }

    /**
     * Add a value to the 'property' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("a429a04e-8b45-49f9-9663-e011e0ddc03b")
    public void addProperty(final MmsProperty obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), MmsConcept.MdaTypes.MDAASSOCDEP);
            d.setName("property");
            d.putTagValue(MmsConcept.MdaTypes.MDAASSOCDEP_ROLE, "property");
        }
    }

    @objid ("f2de351b-a578-44c2-bb8e-c9ced50ec0db")
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
        MmsConcept other = (MmsConcept) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the values of the 'concept' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("e5352bdb-3605-4e08-9ffe-6f1482481474")
    public List<MmsConcept> getConcept() {
        List<MmsConcept> results = new ArrayList<>();
        for (Dependency d : this.elt.getImpactedDependency()) {
          if (d.isStereotyped(MmsConcept.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(MmsConcept.MdaTypes.MDAASSOCDEP_ROLE), "parent")
              && MmsConcept.canInstantiate(d.getImpacted())) {
                 results.add((MmsConcept)CamelDesignerProxyFactory.instantiate(d.getImpacted(), MmsConcept.STEREOTYPE_NAME));
          }
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("1107889a-d1e0-4759-a5eb-16e648680a06")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Get the values of the 'instance' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("03335e96-695b-4ff1-90b4-e4484955ae10")
    public List<MmsConceptInstance> getInstance() {
        List<MmsConceptInstance> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(MmsConcept.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(MmsConcept.MdaTypes.MDAASSOCDEP_ROLE), "instance")
              && MmsConceptInstance.canInstantiate(d.getDependsOn()))
                results.add((MmsConceptInstance)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MmsConceptInstance.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the value of the 'parent' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("29500438-5f68-4fb3-9df3-cd840531dbf8")
    public MmsConcept getParent() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(MmsConcept.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(MmsConcept.MdaTypes.MDAASSOCDEP_ROLE), "parent")
                  && MmsConcept.canInstantiate(d.getDependsOn())) {
                     return (MmsConcept)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MmsConcept.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the values of the 'property' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("aef29872-723f-43fe-a486-dbfb98d6b4ab")
    public List<MmsProperty> getProperty() {
        List<MmsProperty> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(MmsConcept.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(MmsConcept.MdaTypes.MDAASSOCDEP_ROLE), "property")
              && MmsProperty.canInstantiate(d.getDependsOn()))
                results.add((MmsProperty)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MmsProperty.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("3fd0e88a-6af3-44ab-8df3-1b614f9ed155")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from 'concept' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("e377f749-85e9-46cc-8c84-89f44644b6af")
    public boolean removeConcept(final MmsConcept obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getImpactedDependency())) {
            if (d.isStereotyped(MmsConcept.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(MmsConcept.MdaTypes.MDAASSOCDEP_ROLE), "parent"))
              if (Objects.equals(d.getImpacted(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    /**
     * Remove a value from the 'instance' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("d96e74f4-cc3f-4cc8-ac2b-7caa8366ac9e")
    public boolean removeInstance(final MmsConceptInstance obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(MmsConcept.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(MmsConcept.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    /**
     * Remove a value from the 'property' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("abdbc1a7-70a0-4491-924d-b3eb17cda957")
    public boolean removeProperty(final MmsProperty obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(MmsConcept.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(MmsConcept.MdaTypes.MDAASSOCDEP_ROLE), "domain")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    /**
     * Set the value of the 'parent' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("4078864a-67db-42c4-b29c-11cb54657d9b")
    public void setParent(final MmsConcept obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(MmsConcept.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(MmsConcept.MdaTypes.MDAASSOCDEP_ROLE), "parent")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), MmsConcept.MdaTypes.MDAASSOCDEP);
              dep.setName("parent");      dep.putTagValue(MmsConcept.MdaTypes.MDAASSOCDEP_ROLE, "parent");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    @objid ("27af47aa-a554-4033-beba-ffae01bd75b3")
    protected MmsConcept(final Class elt) {
        super(elt);
    }

    @objid ("acc006aa-96cd-4009-abc5-630b360acd1a")
    public static final class MdaTypes {
        @objid ("7e1b0ac5-4fba-4363-984f-c86c8e3b03a8")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("96bc8243-7ed0-4750-b562-6ed027833a08")
        private static Stereotype MDAASSOCDEP;

        @objid ("e2608ee0-a7a5-4a80-9881-6ffb524cb374")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f5897548-f32a-4f16-8a7d-25a0b17a3761")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "6f3091ee-3a3b-4157-8b89-872f99b970f9");
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
