/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.00

 * This file was generated on 12/10/20 11:37 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.camelcore.standard.package_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.NamedElement;
import fr.softeam.cameldesigner.api.datamodel.standard.package_.DataInstanceModel;
import fr.softeam.cameldesigner.api.datamodel.standard.package_.DataModel;
import fr.softeam.cameldesigner.api.datamodel.standard.package_.DataTypeModel;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.package_.DeploymentModel;
import fr.softeam.cameldesigner.api.executionmodel.standard.package_.ExecutionModel;
import fr.softeam.cameldesigner.api.locationmodel.standard.package_.LocationModel;
import fr.softeam.cameldesigner.api.metadatamodel.standard.package_.MetaDataModel;
import fr.softeam.cameldesigner.api.metricmodel.standard.package_.MetricInstanceModel;
import fr.softeam.cameldesigner.api.metricmodel.standard.package_.MetricModel;
import fr.softeam.cameldesigner.api.metricmodel.standard.package_.MetricTypeModel;
import fr.softeam.cameldesigner.api.organisationmodel.standard.package_.OrganisationModel;
import fr.softeam.cameldesigner.api.requirementmodel.standard.package_.RequirementModel;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.package_.ScalabilityModel;
import fr.softeam.cameldesigner.api.securitymodel.standard.package_.SecurityModel;
import fr.softeam.cameldesigner.api.typemodel.standard.package_.TypeModel;
import fr.softeam.cameldesigner.api.unitmodel.standard.package_.UnitModel;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Package} with << CamelModel >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("67058037-b681-4ff5-91f4-e5aa09469cd2")
public class CamelModel extends NamedElement {
    @objid ("30774641-f981-4c63-9635-7d8338bfc5da")
    public static final String STEREOTYPE_NAME = "CamelModel";

    @objid ("b803a6f2-b7b8-45a1-b0c6-a567cb651a75")
    public static final String APPLICATIONNAME_TAGTYPE = "applicationName";

    @objid ("4ecd1e54-d90c-4cff-850f-88e062e68b23")
    public static final String APPLICATIONVERSION_TAGTYPE = "applicationVersion";

    /**
     * Tells whether a {@link CamelModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << CamelModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("6324dec9-7957-4203-bacf-f084f6761c9b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CamelModel.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Package} stereotyped << CamelModel >> then instantiate a {@link CamelModel} proxy.
     * 
     * @return a {@link CamelModel} proxy on the created {@link Package}.
     */
    @objid ("2f43a050-7a93-4113-97aa-7f08f09cb7f4")
    public static CamelModel create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Package");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, CamelModel.STEREOTYPE_NAME);
        return CamelModel.instantiate((Package)e);
    }

    /**
     * Tries to instantiate a {@link CamelModel} proxy from a {@link Package} stereotyped << CamelModel >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Package
     * @return a {@link CamelModel} proxy or <i>null</i>.
     */
    @objid ("7393db6c-dd58-4c0b-b530-699ba8d02d3c")
    public static CamelModel instantiate(final Package obj) {
        return CamelModel.canInstantiate(obj) ? new CamelModel(obj) : null;
    }

    /**
     * Tries to instantiate a {@link CamelModel} proxy from a {@link Package} stereotyped << CamelModel >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Package}
     * @return a {@link CamelModel} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("6246c42f-89da-45e4-84b6-4de6a5b77f2c")
    public static CamelModel safeInstantiate(final Package obj) throws IllegalArgumentException {
        if (CamelModel.canInstantiate(obj))
            return new CamelModel(obj);
        else
            throw new IllegalArgumentException("CamelModel: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'deploymentModels' role.<p>
     * Role description:
     * null
     */
    @objid ("68cc444e-2d60-4c26-87cb-77d32bdb52fa")
    public void addDeploymentModels(final DeploymentModel obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'executionModels' role.<p>
     * Role description:
     * null
     */
    @objid ("b2b3f77f-2111-4ebb-8afa-70e8bf71480a")
    public void addExecutionModels(final ExecutionModel obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'locationModels' role.<p>
     * Role description:
     * null
     */
    @objid ("b839425a-7e13-405d-88cd-330a8e4407ac")
    public void addLocationModels(final LocationModel obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'metaDataModels' role.<p>
     * Role description:
     * null
     */
    @objid ("97ccdb22-bb6d-4bbb-a0db-4b8f81962a14")
    public void addMetaDataModels(final MetaDataModel obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'organisationModels' role.<p>
     * Role description:
     * null
     */
    @objid ("195490b4-028b-4466-adb5-033a33a99112")
    public void addOrganisationModels(final OrganisationModel obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'requirementModels' role.<p>
     * Role description:
     * null
     */
    @objid ("a38475f5-2c59-4090-9e24-c4d4cd868926")
    public void addRequirementModels(final RequirementModel obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'scalabilityModels' role.<p>
     * Role description:
     * null
     */
    @objid ("755a0c28-eadb-4980-bcda-fb2b3a84b6ec")
    public void addScalabilityModels(final ScalabilityModel obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'securityModels' role.<p>
     * Role description:
     * null
     */
    @objid ("e794b5c4-4ff3-4dc2-90c0-544cab37e6f5")
    public void addSecurityModels(final SecurityModel obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'typeModels' role.<p>
     * Role description:
     * null
     */
    @objid ("a544f435-b751-45f7-acc6-358f1503ae48")
    public void addTypeModels(final TypeModel obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'unitModels' role.<p>
     * Role description:
     * null
     */
    @objid ("d0b708ae-d9db-40e6-b464-df03d799e3c8")
    public void addUnitModels(final UnitModel obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    @objid ("a45c2402-bec5-445c-97bc-fc868df99969")
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
        CamelModel other = (CamelModel) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for string property 'applicationName'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("4351549e-9bbc-4be2-990e-71a97f6c64e5")
    public String getApplicationName() {
        return this.elt.getTagValue(CamelModel.MdaTypes.APPLICATIONNAME_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'applicationVersion'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("ec3cbaee-8495-4ec2-8aa1-703978eafece")
    public String getApplicationVersion() {
        return this.elt.getTagValue(CamelModel.MdaTypes.APPLICATIONVERSION_TAGTYPE_ELT);
    }

    /**
     * Get the values of the 'deploymentModels' role.<p>
     * Role description:
     * null
     */
    @objid ("de400113-7ff1-4bdf-a39f-cc862fe7fb38")
    public List<DeploymentModel> getDeploymentModels() {
        List<DeploymentModel> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement())
            if (DeploymentModel.canInstantiate(mObj))
                    results.add((DeploymentModel)CamelDesignerProxyFactory.instantiate(mObj, DeploymentModel.STEREOTYPE_NAME));
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the underlying {@link Package}.
     * 
     * @return the Package represented by this proxy, never null.
     */
    @objid ("1e54c958-3c1e-4b5f-b17b-9f24c92eaa09")
    @Override
    public Package getElement() {
        return (Package)super.getElement();
    }

    /**
     * Get the values of the 'executionModels' role.<p>
     * Role description:
     * null
     */
    @objid ("b95ded73-2d54-4600-9fa3-a0ee67eee13e")
    public List<ExecutionModel> getExecutionModels() {
        List<ExecutionModel> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement())
            if (ExecutionModel.canInstantiate(mObj))
                    results.add((ExecutionModel)CamelDesignerProxyFactory.instantiate(mObj, ExecutionModel.STEREOTYPE_NAME));
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'locationModels' role.<p>
     * Role description:
     * null
     */
    @objid ("23bdd358-7b6c-49a8-8d7f-42a499bb8a77")
    public List<LocationModel> getLocationModels() {
        List<LocationModel> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement())
            if (LocationModel.canInstantiate(mObj))
                    results.add((LocationModel)CamelDesignerProxyFactory.instantiate(mObj, LocationModel.STEREOTYPE_NAME));
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'metaDataModels' role.<p>
     * Role description:
     * null
     */
    @objid ("038d0eba-95df-46e9-8eab-0e4cd02f4c2e")
    public List<MetaDataModel> getMetaDataModels() {
        List<MetaDataModel> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement())
            if (MetaDataModel.canInstantiate(mObj))
                    results.add((MetaDataModel)CamelDesignerProxyFactory.instantiate(mObj, MetaDataModel.STEREOTYPE_NAME));
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'organisationModels' role.<p>
     * Role description:
     * null
     */
    @objid ("81f89787-966b-4067-991e-6bef43e45923")
    public List<OrganisationModel> getOrganisationModels() {
        List<OrganisationModel> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement())
            if (OrganisationModel.canInstantiate(mObj))
                    results.add((OrganisationModel)CamelDesignerProxyFactory.instantiate(mObj, OrganisationModel.STEREOTYPE_NAME));
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'requirementModels' role.<p>
     * Role description:
     * null
     */
    @objid ("4397803c-43b6-4cd3-89b5-2b4ad58a2024")
    public List<RequirementModel> getRequirementModels() {
        List<RequirementModel> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement())
            if (RequirementModel.canInstantiate(mObj))
                    results.add((RequirementModel)CamelDesignerProxyFactory.instantiate(mObj, RequirementModel.STEREOTYPE_NAME));
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'scalabilityModels' role.<p>
     * Role description:
     * null
     */
    @objid ("2089efad-1c6b-47c5-9cc6-08fdb7fd5881")
    public List<ScalabilityModel> getScalabilityModels() {
        List<ScalabilityModel> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement())
            if (ScalabilityModel.canInstantiate(mObj))
                    results.add((ScalabilityModel)CamelDesignerProxyFactory.instantiate(mObj, ScalabilityModel.STEREOTYPE_NAME));
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'securityModels' role.<p>
     * Role description:
     * null
     */
    @objid ("3ab50600-f903-42d0-9906-9396365012ac")
    public List<SecurityModel> getSecurityModels() {
        List<SecurityModel> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement())
            if (SecurityModel.canInstantiate(mObj))
                    results.add((SecurityModel)CamelDesignerProxyFactory.instantiate(mObj, SecurityModel.STEREOTYPE_NAME));
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'typeModels' role.<p>
     * Role description:
     * null
     */
    @objid ("a730266a-6420-4e5d-83be-402b027b92a1")
    public List<TypeModel> getTypeModels() {
        List<TypeModel> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement())
            if (TypeModel.canInstantiate(mObj))
                    results.add((TypeModel)CamelDesignerProxyFactory.instantiate(mObj, TypeModel.STEREOTYPE_NAME));
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'unitModels' role.<p>
     * Role description:
     * null
     */
    @objid ("5fce8820-5e81-4f54-8d6c-e3aa8dbe63b2")
    public List<UnitModel> getUnitModels() {
        List<UnitModel> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement())
            if (UnitModel.canInstantiate(mObj))
                    results.add((UnitModel)CamelDesignerProxyFactory.instantiate(mObj, UnitModel.STEREOTYPE_NAME));
        return Collections.unmodifiableList(results);
    }

    @objid ("d42587fb-80c5-4a6d-9626-ee6b07ebf93f")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'deploymentModels' role.<p>
     * Role description:
     * null
     */
    @objid ("e832c36a-ed15-4516-a3a2-04f6386c46ff")
    public boolean removeDeploymentModels(final DeploymentModel obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'executionModels' role.<p>
     * Role description:
     * null
     */
    @objid ("34f0e15d-933c-4054-ae87-b45643f923a9")
    public boolean removeExecutionModels(final ExecutionModel obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'locationModels' role.<p>
     * Role description:
     * null
     */
    @objid ("3a7d58b2-69d9-4a8d-a892-8554376c192d")
    public boolean removeLocationModels(final LocationModel obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'metaDataModels' role.<p>
     * Role description:
     * null
     */
    @objid ("2093ac9a-116e-4526-8e11-2ed3d0ee885f")
    public boolean removeMetaDataModels(final MetaDataModel obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'organisationModels' role.<p>
     * Role description:
     * null
     */
    @objid ("650cd5a7-f4d1-4c3e-9981-2a1fd767b7e4")
    public boolean removeOrganisationModels(final OrganisationModel obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'requirementModels' role.<p>
     * Role description:
     * null
     */
    @objid ("5fbdcc3a-7a88-4c0e-aa52-190175f35d3a")
    public boolean removeRequirementModels(final RequirementModel obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'scalabilityModels' role.<p>
     * Role description:
     * null
     */
    @objid ("e32c06fc-2f92-408d-9990-b1547448969e")
    public boolean removeScalabilityModels(final ScalabilityModel obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'securityModels' role.<p>
     * Role description:
     * null
     */
    @objid ("d4d2f86e-c109-48e4-8928-daea59cddedd")
    public boolean removeSecurityModels(final SecurityModel obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'typeModels' role.<p>
     * Role description:
     * null
     */
    @objid ("73153a3e-7050-4d19-be64-954d76f517f9")
    public boolean removeTypeModels(final TypeModel obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'unitModels' role.<p>
     * Role description:
     * null
     */
    @objid ("9c5e5d36-175e-492a-ad98-35301dff01a1")
    public boolean removeUnitModels(final UnitModel obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Setter for string property 'applicationName'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("17c350f4-1adc-4185-99ea-230733242cbb")
    public void setApplicationName(final String value) {
        this.elt.putTagValue(CamelModel.MdaTypes.APPLICATIONNAME_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'applicationVersion'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("3e0a8d1a-1999-4bdd-b588-4b3740a18c9f")
    public void setApplicationVersion(final String value) {
        this.elt.putTagValue(CamelModel.MdaTypes.APPLICATIONVERSION_TAGTYPE_ELT, value);
    }

    /**
     * Get the values of the 'dataModels' role.<p>
     * Role description:
     * null
     */
    @objid ("3dc5fd2a-1c2b-430e-99fc-75aa1a51de98")
    public List<DataModel> getDataModels() {
        List<DataModel> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement()) {
            if (DataInstanceModel.canInstantiate(mObj))
                    results.add((DataInstanceModel)CamelDesignerProxyFactory.instantiate(mObj, DataInstanceModel.STEREOTYPE_NAME));
            if (DataTypeModel.canInstantiate(mObj))
                results.add((DataTypeModel)CamelDesignerProxyFactory.instantiate(mObj, DataTypeModel.STEREOTYPE_NAME));
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'metricModels' role.<p>
     * Role description:
     * null
     */
    @objid ("5d1eaf4e-ef8a-4142-b65f-e7632d802f50")
    public List<MetricModel> getMetricModels() {
        List<MetricModel> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement()) {
            if (MetricTypeModel.canInstantiate(mObj))
                    results.add((MetricTypeModel)CamelDesignerProxyFactory.instantiate(mObj, MetricTypeModel.STEREOTYPE_NAME));
            if (MetricInstanceModel.canInstantiate(mObj))
                results.add((MetricInstanceModel)CamelDesignerProxyFactory.instantiate(mObj, MetricInstanceModel.STEREOTYPE_NAME));
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("bf1df950-a576-42e6-b085-c7ad69dd3348")
    protected CamelModel(final Package elt) {
        super(elt);
    }

    @objid ("18704a21-5db9-4f8d-9058-4c21969dcd9d")
    public static final class MdaTypes {
        @objid ("9c00781c-c3e8-4394-b626-36c3b65e424d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f719eeeb-e23e-4d1a-b2ad-fc3ad1dcfd09")
        public static TagType APPLICATIONNAME_TAGTYPE_ELT;

        @objid ("d6d59438-b163-4f52-af80-d737801c45a2")
        public static TagType APPLICATIONVERSION_TAGTYPE_ELT;

        @objid ("2f660764-7860-4fb3-9b2f-fe6194b15713")
        private static Stereotype MDAASSOCDEP;

        @objid ("76e3907f-0dc9-473f-af1a-6f6efddc0c03")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("93aab400-71ef-45e1-b1ab-347273976dc1")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "e33cb0ef-7003-4579-8739-638c171ab891");
            APPLICATIONNAME_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1e31728e-d8b4-4498-9d67-219b020ee5ff");
            APPLICATIONVERSION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "bd5b684e-453d-4203-a1ac-e24d368f74ad");
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
