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
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.AttributeContext;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.Function;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.Metric;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricContext;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricTemplate;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.ObjectContext;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.Schedule;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.Window;
import fr.softeam.cameldesigner.api.metricmodel.standard.component.Sensor;
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
 * Proxy class to handle a {@link Package} with << MetricTypeModel >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("30ab5720-bd4b-4612-8c18-791b8446b14d")
public class MetricTypeModel extends MetricModel {
    @objid ("d4897ef3-689e-48ad-9e9a-756f62117e19")
    public static final String STEREOTYPE_NAME = "MetricTypeModel";

    /**
     * Tells whether a {@link MetricTypeModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << MetricTypeModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("378269c3-25df-45da-b6c3-c00afaf82449")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MetricTypeModel.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Package} stereotyped << MetricTypeModel >> then instantiate a {@link MetricTypeModel} proxy.
     * 
     * @return a {@link MetricTypeModel} proxy on the created {@link Package}.
     */
    @objid ("8526d0aa-dd4c-4af9-93a2-2c1290d46f61")
    public static MetricTypeModel create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Package");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, MetricTypeModel.STEREOTYPE_NAME);
        return MetricTypeModel.instantiate((Package)e);
    }

    /**
     * Tries to instantiate a {@link MetricTypeModel} proxy from a {@link Package} stereotyped << MetricTypeModel >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Package
     * @return a {@link MetricTypeModel} proxy or <i>null</i>.
     */
    @objid ("c4c3125e-a65a-4e6d-a660-1c635808deda")
    public static MetricTypeModel instantiate(final Package obj) {
        return MetricTypeModel.canInstantiate(obj) ? new MetricTypeModel(obj) : null;
    }

    /**
     * Tries to instantiate a {@link MetricTypeModel} proxy from a {@link Package} stereotyped << MetricTypeModel >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Package}
     * @return a {@link MetricTypeModel} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("4ca23846-71ae-452c-92ab-a173d52d83e9")
    public static MetricTypeModel safeInstantiate(final Package obj) throws IllegalArgumentException {
        if (MetricTypeModel.canInstantiate(obj))
        	return new MetricTypeModel(obj);
        else
        	throw new IllegalArgumentException("MetricTypeModel: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'attributContexts' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("948dcec2-c678-4ee1-bba6-f3ea2d380876")
    public void addAttributContexts(final AttributeContext obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), MetricTypeModel.MdaTypes.MDAASSOCDEP);
            d.setName("attributContexts");
            d.putTagValue(MetricTypeModel.MdaTypes.MDAASSOCDEP_ROLE, "attributContexts");
        }
    }

    /**
     * Add a value to the 'functions' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("06ab9027-f5cd-4529-86c7-5f94bbcd3ca4")
    public void addFunctions(final Function obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), MetricTypeModel.MdaTypes.MDAASSOCDEP);
            d.setName("functions");
            d.putTagValue(MetricTypeModel.MdaTypes.MDAASSOCDEP_ROLE, "functions");
        }
    }

    /**
     * Add a value to the 'metricContexts' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("bf00dcda-e881-4629-b018-cfd7b554f280")
    public void addMetricContexts(final MetricContext obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), MetricTypeModel.MdaTypes.MDAASSOCDEP);
            d.setName("metricContexts");
            d.putTagValue(MetricTypeModel.MdaTypes.MDAASSOCDEP_ROLE, "metricContexts");
        }
    }

    /**
     * Add a value to the 'metrics' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("44968065-c8a0-4ba3-9bac-d038329e600e")
    public void addMetrics(final Metric obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), MetricTypeModel.MdaTypes.MDAASSOCDEP);
            d.setName("metrics");
            d.putTagValue(MetricTypeModel.MdaTypes.MDAASSOCDEP_ROLE, "metrics");
        }
    }

    /**
     * Add a value to the 'objectContexts' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("c3fcc01c-4ecf-44f2-acae-42d61336e4b2")
    public void addObjectContexts(final ObjectContext obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), MetricTypeModel.MdaTypes.MDAASSOCDEP);
            d.setName("objectContexts");
            d.putTagValue(MetricTypeModel.MdaTypes.MDAASSOCDEP_ROLE, "objectContexts");
        }
    }

    /**
     * Add a value to the 'schedules' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("cff71e6b-cd11-4233-8ba9-8e5bccf3dcfd")
    public void addSchedules(final Schedule obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), MetricTypeModel.MdaTypes.MDAASSOCDEP);
            d.setName("schedules");
            d.putTagValue(MetricTypeModel.MdaTypes.MDAASSOCDEP_ROLE, "schedules");
        }
    }

    /**
     * Add a value to the 'sensors' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("9802668b-e0a1-4ba5-862a-e982cbfc4521")
    public void addSensors(final Sensor obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), MetricTypeModel.MdaTypes.MDAASSOCDEP);
            d.setName("sensors");
            d.putTagValue(MetricTypeModel.MdaTypes.MDAASSOCDEP_ROLE, "sensors");
        }
    }

    /**
     * Add a value to the 'templates' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("b5d470ec-c621-40a1-b191-d87d69ab83c8")
    public void addTemplates(final MetricTemplate obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), MetricTypeModel.MdaTypes.MDAASSOCDEP);
            d.setName("templates");
            d.putTagValue(MetricTypeModel.MdaTypes.MDAASSOCDEP_ROLE, "templates");
        }
    }

    /**
     * Add a value to the 'windows' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("f4ca95f7-060f-4574-a543-da8bb0418ad4")
    public void addWindows(final Window obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), MetricTypeModel.MdaTypes.MDAASSOCDEP);
            d.setName("windows");
            d.putTagValue(MetricTypeModel.MdaTypes.MDAASSOCDEP_ROLE, "windows");
        }
    }

    @objid ("54e113da-cd69-4dfd-9485-70ddb61c9a5e")
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
        MetricTypeModel other = (MetricTypeModel) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the values of the 'attributContexts' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("c907c388-85e5-4450-92c1-04031c54f542")
    public List<AttributeContext> getAttributContexts() {
        List<AttributeContext> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(MetricTypeModel.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(MetricTypeModel.MdaTypes.MDAASSOCDEP_ROLE), "attributContexts")
              && AttributeContext.canInstantiate(d.getDependsOn()))
                results.add((AttributeContext)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), AttributeContext.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the underlying {@link Package}. 
     * @return the Package represented by this proxy, never null.
     */
    @objid ("1808d155-704d-492e-aaaa-e1039e7c8c31")
    @Override
    public Package getElement() {
        return (Package)super.getElement();
    }

    /**
     * Get the values of the 'functions' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("7fed8fe7-9fa6-440d-b850-25c06a8ea6de")
    public List<Function> getFunctions() {
        List<Function> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(MetricTypeModel.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(MetricTypeModel.MdaTypes.MDAASSOCDEP_ROLE), "functions")
              && Function.canInstantiate(d.getDependsOn()))
                results.add((Function)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Function.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'metricContexts' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("3cca1889-f970-4701-96b5-64f8cee68fec")
    public List<MetricContext> getMetricContexts() {
        List<MetricContext> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(MetricTypeModel.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(MetricTypeModel.MdaTypes.MDAASSOCDEP_ROLE), "metricContexts")
              && MetricContext.canInstantiate(d.getDependsOn()))
                results.add((MetricContext)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MetricContext.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'metrics' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("1e5974c5-501b-4eeb-8cb5-652a20343e86")
    public List<Metric> getMetrics() {
        List<Metric> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(MetricTypeModel.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(MetricTypeModel.MdaTypes.MDAASSOCDEP_ROLE), "metrics")
              && Metric.canInstantiate(d.getDependsOn()))
                results.add((Metric)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Metric.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'objectContexts' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("b599fde4-3ec4-4f97-bac6-c09babc65556")
    public List<ObjectContext> getObjectContexts() {
        List<ObjectContext> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(MetricTypeModel.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(MetricTypeModel.MdaTypes.MDAASSOCDEP_ROLE), "objectContexts")
              && ObjectContext.canInstantiate(d.getDependsOn()))
                results.add((ObjectContext)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), ObjectContext.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'schedules' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("522cd27b-50f5-454a-a05a-9c2f99e47b3a")
    public List<Schedule> getSchedules() {
        List<Schedule> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(MetricTypeModel.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(MetricTypeModel.MdaTypes.MDAASSOCDEP_ROLE), "schedules")
              && Schedule.canInstantiate(d.getDependsOn()))
                results.add((Schedule)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Schedule.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'sensors' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("0499812e-b82c-46b5-932b-eda081f62817")
    public List<Sensor> getSensors() {
        List<Sensor> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(MetricTypeModel.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(MetricTypeModel.MdaTypes.MDAASSOCDEP_ROLE), "sensors")
              && Sensor.canInstantiate(d.getDependsOn()))
                results.add((Sensor)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Sensor.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'templates' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("045dca88-b286-441d-87f7-6134610a763d")
    public List<MetricTemplate> getTemplates() {
        List<MetricTemplate> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(MetricTypeModel.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(MetricTypeModel.MdaTypes.MDAASSOCDEP_ROLE), "templates")
              && MetricTemplate.canInstantiate(d.getDependsOn()))
                results.add((MetricTemplate)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MetricTemplate.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'windows' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("b330c96e-1f17-483e-b2a7-9def4de5495f")
    public List<Window> getWindows() {
        List<Window> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(MetricTypeModel.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(MetricTypeModel.MdaTypes.MDAASSOCDEP_ROLE), "windows")
              && Window.canInstantiate(d.getDependsOn()))
                results.add((Window)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Window.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("1364b722-cb0d-4032-8a6e-6b4f54b98177")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'attributContexts' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("7723460d-89b0-4298-b5c3-58550dae88cd")
    public boolean removeAttributContexts(final AttributeContext obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(MetricTypeModel.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(MetricTypeModel.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    /**
     * Remove a value from the 'functions' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("1f8984ec-a82b-49ff-b20f-b70169d0f51c")
    public boolean removeFunctions(final Function obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(MetricTypeModel.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(MetricTypeModel.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    /**
     * Remove a value from the 'metricContexts' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("53dc88b0-0eb2-4e45-a223-e4fd73460066")
    public boolean removeMetricContexts(final MetricContext obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(MetricTypeModel.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(MetricTypeModel.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    /**
     * Remove a value from the 'metrics' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("13a4708a-3a2b-4149-bc33-0d5ac2c0f4d1")
    public boolean removeMetrics(final Metric obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(MetricTypeModel.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(MetricTypeModel.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    /**
     * Remove a value from the 'objectContexts' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("9ed0f2f2-9284-4313-b462-7549d740b824")
    public boolean removeObjectContexts(final ObjectContext obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(MetricTypeModel.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(MetricTypeModel.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    /**
     * Remove a value from the 'schedules' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("814f10a1-8022-40e1-a202-6be1180fac0d")
    public boolean removeSchedules(final Schedule obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(MetricTypeModel.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(MetricTypeModel.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    /**
     * Remove a value from the 'sensors' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("5c241253-db13-4cbc-ae29-f399928e0e5e")
    public boolean removeSensors(final Sensor obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(MetricTypeModel.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(MetricTypeModel.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    /**
     * Remove a value from the 'templates' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("5a623597-57f2-4085-a716-4bfe17ea5e26")
    public boolean removeTemplates(final MetricTemplate obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(MetricTypeModel.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(MetricTypeModel.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    /**
     * Remove a value from the 'windows' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("e1c1add8-46d3-4756-97a5-296e6e4eec33")
    public boolean removeWindows(final Window obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(MetricTypeModel.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(MetricTypeModel.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    @objid ("34202412-40fe-4b01-9457-15258383167b")
    protected MetricTypeModel(final Package elt) {
        super(elt);
    }

    @objid ("b2e0d996-4162-4a1b-ad97-a59aa22661b6")
    public static final class MdaTypes {
        @objid ("45afda4e-7360-4110-9d47-18e6ddda5c9e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("5559d837-c71a-4241-8b65-a1256c839f41")
        private static Stereotype MDAASSOCDEP;

        @objid ("14cd49ce-1db3-4f58-ba3c-1b033bcf8a09")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("fa8d4511-9bbd-448d-8ba0-b93752e9cb1d")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "76545176-b1ff-442f-8629-bc2c4845dbdb");
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
