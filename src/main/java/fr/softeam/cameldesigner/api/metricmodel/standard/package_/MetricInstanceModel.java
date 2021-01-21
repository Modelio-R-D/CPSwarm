/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.00

 * This file was generated on 12/10/20 11:37 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.metricmodel.standard.package_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricObjectBinding;
import fr.softeam.cameldesigner.api.metricmodel.standard.instance.MetricInstance;
import fr.softeam.cameldesigner.api.metricmodel.standard.package_.MetricTypeModel;
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
 * Proxy class to handle a {@link Package} with << MetricInstanceModel >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("fc62e562-4151-4b10-80da-5289e792c7a8")
public class MetricInstanceModel extends MetricModel {
    @objid ("b9cb38cd-54f3-481e-a7f1-396d0fd2e901")
    public static final String STEREOTYPE_NAME = "MetricInstanceModel";

    /**
     * Tells whether a {@link MetricInstanceModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << MetricInstanceModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("1011ba39-f573-433e-92da-da5494f47951")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MetricInstanceModel.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Package} stereotyped << MetricInstanceModel >> then instantiate a {@link MetricInstanceModel} proxy.
     * 
     * @return a {@link MetricInstanceModel} proxy on the created {@link Package}.
     */
    @objid ("d225ab78-49d9-4ff5-88c4-689810d349ba")
    public static MetricInstanceModel create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Package");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, MetricInstanceModel.STEREOTYPE_NAME);
        return MetricInstanceModel.instantiate((Package)e);
    }

    /**
     * Tries to instantiate a {@link MetricInstanceModel} proxy from a {@link Package} stereotyped << MetricInstanceModel >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Package
     * @return a {@link MetricInstanceModel} proxy or <i>null</i>.
     */
    @objid ("eaebc898-2db7-48fb-895d-378de5c5fd57")
    public static MetricInstanceModel instantiate(final Package obj) {
        return MetricInstanceModel.canInstantiate(obj) ? new MetricInstanceModel(obj) : null;
    }

    /**
     * Tries to instantiate a {@link MetricInstanceModel} proxy from a {@link Package} stereotyped << MetricInstanceModel >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Package}
     * @return a {@link MetricInstanceModel} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("daa48b92-8717-4a9c-bab3-5f99fced5218")
    public static MetricInstanceModel safeInstantiate(final Package obj) throws IllegalArgumentException {
        if (MetricInstanceModel.canInstantiate(obj))
        	return new MetricInstanceModel(obj);
        else
        	throw new IllegalArgumentException("MetricInstanceModel: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'bindings' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("ef48f164-49b1-43c8-956d-a39803b21696")
    public void addBindings(final MetricObjectBinding obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), MetricInstanceModel.MdaTypes.MDAASSOCDEP);
            d.setName("bindings");
            d.putTagValue(MetricInstanceModel.MdaTypes.MDAASSOCDEP_ROLE, "bindings");
        }
    }

    /**
     * Add a value to the 'metricInstances' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("e0b67a27-eb1e-4048-8c27-0e921d80d601")
    public void addMetricInstances(final MetricInstance obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), MetricInstanceModel.MdaTypes.MDAASSOCDEP);
            d.setName("metricInstances");
            d.putTagValue(MetricInstanceModel.MdaTypes.MDAASSOCDEP_ROLE, "metricInstances");
        }
    }

    @objid ("55fedd50-f65f-456e-ae48-6e081f1bc5e0")
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
        MetricInstanceModel other = (MetricInstanceModel) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the values of the 'bindings' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("31774d16-9b3f-4068-9d15-6f07426cf08f")
    public List<MetricObjectBinding> getBindings() {
        List<MetricObjectBinding> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(MetricInstanceModel.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(MetricInstanceModel.MdaTypes.MDAASSOCDEP_ROLE), "bindings")
              && MetricObjectBinding.canInstantiate(d.getDependsOn()))
                results.add((MetricObjectBinding)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MetricObjectBinding.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the underlying {@link Package}. 
     * @return the Package represented by this proxy, never null.
     */
    @objid ("2748e007-e680-41c6-bd21-0b6edcaa8195")
    @Override
    public Package getElement() {
        return (Package)super.getElement();
    }

    /**
     * Get the values of the 'metricInstances' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("df67361f-726d-495f-8c15-3e30da495a24")
    public List<MetricInstance> getMetricInstances() {
        List<MetricInstance> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(MetricInstanceModel.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(MetricInstanceModel.MdaTypes.MDAASSOCDEP_ROLE), "metricInstances")
              && MetricInstance.canInstantiate(d.getDependsOn()))
                results.add((MetricInstance)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MetricInstance.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the value of the 'type' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("4a2471cf-5faf-451b-a98b-6038be9e6c8a")
    public MetricTypeModel getType() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(MetricInstanceModel.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(MetricInstanceModel.MdaTypes.MDAASSOCDEP_ROLE), "type")
                  && MetricTypeModel.canInstantiate(d.getDependsOn())) {
                     return (MetricTypeModel)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MetricTypeModel.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    @objid ("b1cff4a7-6e37-4a1c-b6c2-f81154b5df03")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'bindings' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("87b9d701-7b53-45dd-b361-6831cf8f2666")
    public boolean removeBindings(final MetricObjectBinding obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(MetricInstanceModel.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(MetricInstanceModel.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    /**
     * Remove a value from the 'metricInstances' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("d56f6238-acba-4f3b-a93d-f06c6b234b63")
    public boolean removeMetricInstances(final MetricInstance obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(MetricInstanceModel.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(MetricInstanceModel.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    /**
     * Set the value of the 'type' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("ffe345e2-2bd6-490a-b368-a13a2893794c")
    public void setType(final MetricTypeModel obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(MetricInstanceModel.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(MetricInstanceModel.MdaTypes.MDAASSOCDEP_ROLE), "type")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), MetricInstanceModel.MdaTypes.MDAASSOCDEP);
              dep.setName("type");      dep.putTagValue(MetricInstanceModel.MdaTypes.MDAASSOCDEP_ROLE, "type");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    @objid ("4e1fcc25-3347-4f88-9323-3441a925dc51")
    protected MetricInstanceModel(final Package elt) {
        super(elt);
    }

    @objid ("f50c0e56-9674-4958-8a3c-cef476fee649")
    public static final class MdaTypes {
        @objid ("9dc7141b-f81b-44ae-9dd8-9e0624bbc5c1")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("67800d8d-1f5e-436a-8718-806072efb35f")
        private static Stereotype MDAASSOCDEP;

        @objid ("33a5747d-c685-4543-9fc2-168741eca7f8")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2eff5aab-4fde-4fb2-b45f-a97ba3781cad")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "42ce7273-a709-4cf7-bc51-ac7ee48b9f13");
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
