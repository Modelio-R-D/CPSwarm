/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.00

 * This file was generated on 12/10/20 11:37 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.datamodel.standard.instance.DataInstance;
import fr.softeam.cameldesigner.api.datamodel.standard.instance.DataSourceInstance;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.port.CommunicationPort;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.port.HostingPort;
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
 * Proxy class to handle a {@link Instance} with << SoftwareComponentInstance >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("a0c4baed-2aff-4ee2-a7f5-c01274a910db")
public class SoftwareComponentInstance extends ComponentInstance {
    @objid ("6262ad54-7a5c-42e6-8e62-8f3ad3c60ef6")
    public static final String STEREOTYPE_NAME = "SoftwareComponentInstance";

    /**
     * Tells whether a {@link SoftwareComponentInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << SoftwareComponentInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("d306465e-ad64-4935-ac4c-8ec32ccad38e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, SoftwareComponentInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << SoftwareComponentInstance >> then instantiate a {@link SoftwareComponentInstance} proxy.
     * 
     * @return a {@link SoftwareComponentInstance} proxy on the created {@link Instance}.
     */
    @objid ("c7d82309-f4b1-44f0-84fa-5f9f132c3620")
    public static SoftwareComponentInstance create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Instance");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, SoftwareComponentInstance.STEREOTYPE_NAME);
        return SoftwareComponentInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link SoftwareComponentInstance} proxy from a {@link Instance} stereotyped << SoftwareComponentInstance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link SoftwareComponentInstance} proxy or <i>null</i>.
     */
    @objid ("88a6e195-5834-46ad-9717-04fdb11f2ee2")
    public static SoftwareComponentInstance instantiate(final Instance obj) {
        return SoftwareComponentInstance.canInstantiate(obj) ? new SoftwareComponentInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SoftwareComponentInstance} proxy from a {@link Instance} stereotyped << SoftwareComponentInstance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link SoftwareComponentInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("ba666fef-622b-45de-a8fb-5be15504b2b6")
    public static SoftwareComponentInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (SoftwareComponentInstance.canInstantiate(obj))
        	return new SoftwareComponentInstance(obj);
        else
        	throw new IllegalArgumentException("SoftwareComponentInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'consumesDataInstances' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("b88a0861-88a1-440d-b774-df9215f719be")
    public void addConsumesDataInstances(final DataInstance obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), SoftwareComponentInstance.MdaTypes.MDAASSOCDEP);
            d.setName("consumesDataInstances");
            d.putTagValue(SoftwareComponentInstance.MdaTypes.MDAASSOCDEP_ROLE, "consumesDataInstances");
        }
    }

    /**
     * Add a value to the 'generatesDataInstance' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("b9f521da-84bb-4aba-ad15-ffd9b3e25c56")
    public void addGeneratesDataInstance(final DataInstance obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), SoftwareComponentInstance.MdaTypes.MDAASSOCDEP);
            d.setName("generatesDataInstance");
            d.putTagValue(SoftwareComponentInstance.MdaTypes.MDAASSOCDEP_ROLE, "generatesDataInstance");
        }
    }

    /**
     * Add a value to the 'managesDataSourceInstance' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("30e27f86-b81f-4a02-ac35-2f29ac5f5e08")
    public void addManagesDataSourceInstance(final DataSourceInstance obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), SoftwareComponentInstance.MdaTypes.MDAASSOCDEP);
            d.setName("managesDataSourceInstance");
            d.putTagValue(SoftwareComponentInstance.MdaTypes.MDAASSOCDEP_ROLE, "managesDataSourceInstance");
        }
    }

    /**
     * Add a value to the 'requiredCommunicationsInstances' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("81a43894-1cc8-4f81-946c-000b86ca192a")
    public void addRequiredCommunicationsInstances(final CommunicationPort obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), SoftwareComponentInstance.MdaTypes.MDAASSOCDEP);
            d.setName("requiredCommunicationsInstances");
            d.putTagValue(SoftwareComponentInstance.MdaTypes.MDAASSOCDEP_ROLE, "requiredCommunicationsInstances");
        }
    }

    @objid ("5d502080-a9fb-40bf-8d7a-f2df8ab6d4f9")
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
        SoftwareComponentInstance other = (SoftwareComponentInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the values of the 'consumesDataInstances' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("848d0c11-e287-4e47-9730-462bc7489da9")
    public List<DataInstance> getConsumesDataInstances() {
        List<DataInstance> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(SoftwareComponentInstance.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(SoftwareComponentInstance.MdaTypes.MDAASSOCDEP_ROLE), "consumesDataInstances")
              && DataInstance.canInstantiate(d.getDependsOn()))
                results.add((DataInstance)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), DataInstance.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("b1a275a4-f1c1-457f-8dd4-9121d7d631e3")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Get the values of the 'generatesDataInstance' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("6a3ab451-4c89-48c5-b32c-02296806e33c")
    public List<DataInstance> getGeneratesDataInstance() {
        List<DataInstance> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(SoftwareComponentInstance.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(SoftwareComponentInstance.MdaTypes.MDAASSOCDEP_ROLE), "generatesDataInstance")
              && DataInstance.canInstantiate(d.getDependsOn()))
                results.add((DataInstance)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), DataInstance.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'managesDataSourceInstance' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("2b6d8415-315b-47b2-b5fb-ae53e0a205e0")
    public List<DataSourceInstance> getManagesDataSourceInstance() {
        List<DataSourceInstance> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(SoftwareComponentInstance.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(SoftwareComponentInstance.MdaTypes.MDAASSOCDEP_ROLE), "managesDataSourceInstance")
              && DataSourceInstance.canInstantiate(d.getDependsOn()))
                results.add((DataSourceInstance)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), DataSourceInstance.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'requiredCommunicationsInstances' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("c6d4af3f-51f8-488f-b4f3-d116c13e5362")
    public List<CommunicationPort> getRequiredCommunicationsInstances() {
        List<CommunicationPort> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(SoftwareComponentInstance.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(SoftwareComponentInstance.MdaTypes.MDAASSOCDEP_ROLE), "requiredCommunicationsInstances")
              && CommunicationPort.canInstantiate(d.getDependsOn()))
                results.add((CommunicationPort)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), CommunicationPort.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the value of the 'requiredHostInstance' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("24fe0df1-8434-4812-b5c3-897237ea5e04")
    public HostingPort getRequiredHostInstance() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(SoftwareComponentInstance.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(SoftwareComponentInstance.MdaTypes.MDAASSOCDEP_ROLE), "requiredHostInstance")
                  && HostingPort.canInstantiate(d.getDependsOn())) {
                     return (HostingPort)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), HostingPort.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    @objid ("f4d217d0-4875-4a5b-835c-ff8e761ad115")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'consumesDataInstances' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("d837911c-5e9a-4e6b-8a71-8375cf224be3")
    public boolean removeConsumesDataInstances(final DataInstance obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(SoftwareComponentInstance.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(SoftwareComponentInstance.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    /**
     * Remove a value from the 'generatesDataInstance' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("4ac55fa0-1234-4c72-a402-f7f81dc96dc6")
    public boolean removeGeneratesDataInstance(final DataInstance obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(SoftwareComponentInstance.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(SoftwareComponentInstance.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    /**
     * Remove a value from the 'managesDataSourceInstance' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("ccfa5e4b-2475-4580-a776-b0e36a479dc6")
    public boolean removeManagesDataSourceInstance(final DataSourceInstance obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(SoftwareComponentInstance.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(SoftwareComponentInstance.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    /**
     * Remove a value from the 'requiredCommunicationsInstances' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("98746c6a-9159-41a7-a01c-0e58a27f34b3")
    public boolean removeRequiredCommunicationsInstances(final CommunicationPort obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(SoftwareComponentInstance.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(SoftwareComponentInstance.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    /**
     * Set the value of the 'requiredHostInstance' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("2d57e942-334d-4beb-a991-90c694b063d9")
    public void setRequiredHostInstance(final HostingPort obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(SoftwareComponentInstance.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(SoftwareComponentInstance.MdaTypes.MDAASSOCDEP_ROLE), "requiredHostInstance")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), SoftwareComponentInstance.MdaTypes.MDAASSOCDEP);
              dep.setName("requiredHostInstance");      dep.putTagValue(SoftwareComponentInstance.MdaTypes.MDAASSOCDEP_ROLE, "requiredHostInstance");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    @objid ("cf8d3327-7ad2-4cd6-bd6b-d08bb15e7961")
    protected SoftwareComponentInstance(final Instance elt) {
        super(elt);
    }

    @objid ("eb836565-9ba9-424d-96b5-05bec355c93e")
    public static final class MdaTypes {
        @objid ("b480b076-4a8b-404d-b27c-d71dbaa766d9")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b44b24d8-f335-4905-a5a2-7c9e9838c1e9")
        private static Stereotype MDAASSOCDEP;

        @objid ("68901e90-53d3-4ae7-82e0-75526db00e12")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2c010eca-1e4f-4bcd-888b-667f1849019e")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "dfb1cf41-de3c-4af9-a3ff-66986b4f35fb");
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
