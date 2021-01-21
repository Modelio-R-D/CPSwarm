/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.00

 * This file was generated on 12/10/20 11:37 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.datamodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.FeatureClass;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.SoftwareComponent;
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
 * Proxy class to handle a {@link Class} with << DataSource >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("1f333d16-724c-4e8d-a1b3-e82caab2b1f4")
public class DataSource extends FeatureClass {
    @objid ("03c5989a-8599-4607-a3ff-c0aa5165c0f9")
    public static final String STEREOTYPE_NAME = "DataSource";

    @objid ("03b05525-c80b-4eb7-90f1-941d07f2090a")
    public static final String EXTERNAL_TAGTYPE = "external";

    /**
     * Tells whether a {@link DataSource proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << DataSource >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("5d785cf6-f87d-438d-b434-ed6061f5101f")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DataSource.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << DataSource >> then instantiate a {@link DataSource} proxy.
     * 
     * @return a {@link DataSource} proxy on the created {@link Class}.
     */
    @objid ("72a8f6b8-686a-4103-aadd-598105ccde9b")
    public static DataSource create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, DataSource.STEREOTYPE_NAME);
        return DataSource.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link DataSource} proxy from a {@link Class} stereotyped << DataSource >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link DataSource} proxy or <i>null</i>.
     */
    @objid ("5c428319-9fbd-4ee0-a508-861751bc73cd")
    public static DataSource instantiate(final Class obj) {
        return DataSource.canInstantiate(obj) ? new DataSource(obj) : null;
    }

    /**
     * Tries to instantiate a {@link DataSource} proxy from a {@link Class} stereotyped << DataSource >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link DataSource} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("e453b6be-7239-4328-beef-d1a09318f2c1")
    public static DataSource safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (DataSource.canInstantiate(obj))
        	return new DataSource(obj);
        else
        	throw new IllegalArgumentException("DataSource: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("ad99e31e-72cc-42f8-be7b-498d8526f933")
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
        DataSource other = (DataSource) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("fac296ea-c7e9-4d89-9f0a-a0c7ebec30b9")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'external'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("e83b2d71-beb3-4d39-acdb-87c03de34050")
    public String getExternal() {
        return this.elt.getTagValue(DataSource.MdaTypes.EXTERNAL_TAGTYPE_ELT);
    }

    /**
     * Get the value of the 'SoftwareComponent' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("2c9f01bf-aaf5-4f37-8a51-990ccf413b8c")
    public SoftwareComponent getSoftwareComponent() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(DataSource.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(DataSource.MdaTypes.MDAASSOCDEP_ROLE), "SoftwareComponent")
                  && SoftwareComponent.canInstantiate(d.getDependsOn())) {
                     return (SoftwareComponent)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), SoftwareComponent.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    @objid ("2357e4a7-bfea-48a3-a128-4b56543c8746")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'external'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("5e000c07-2668-40a8-8f62-a2fe358cf4ce")
    public void setExternal(final String value) {
        this.elt.putTagValue(DataSource.MdaTypes.EXTERNAL_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'SoftwareComponent' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("3d8da5a7-8949-4125-a417-fca87c5e8861")
    public void setSoftwareComponent(final SoftwareComponent obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(DataSource.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(DataSource.MdaTypes.MDAASSOCDEP_ROLE), "SoftwareComponent")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), DataSource.MdaTypes.MDAASSOCDEP);
              dep.setName("SoftwareComponent");      dep.putTagValue(DataSource.MdaTypes.MDAASSOCDEP_ROLE, "SoftwareComponent");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    @objid ("137901df-9b8b-453a-9ca0-7fbe92827786")
    protected DataSource(final Class elt) {
        super(elt);
    }

    @objid ("a70d5efb-a707-47d2-9505-b57f05717b88")
    public static final class MdaTypes {
        @objid ("868c5257-9874-4604-86b0-ebc725633318")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("54688ad0-92a9-4d58-b833-86ccb663cabb")
        public static TagType EXTERNAL_TAGTYPE_ELT;

        @objid ("1dbb8602-09b1-46eb-9ec5-3525f636085c")
        private static Stereotype MDAASSOCDEP;

        @objid ("d6a5394a-4d63-4e94-813c-0d39c22c4844")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("22797a41-3355-42cf-9991-7ed2e5801f90")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "074f2086-e176-45fc-80c7-81fd2336ac7f");
            EXTERNAL_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "05736a3c-caa6-4f52-b966-63ac2100cca2");
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
