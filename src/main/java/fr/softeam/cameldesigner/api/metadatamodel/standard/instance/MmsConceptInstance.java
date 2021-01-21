/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.00

 * This file was generated on 12/10/20 11:37 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.metadatamodel.standard.instance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.metadatamodel.infrastructure.modelelement.MmsObject;
import fr.softeam.cameldesigner.api.metadatamodel.standard.attributelink.MmsPropertyInstance;
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
 * Proxy class to handle a {@link Instance} with << MmsConceptInstance >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("28cc79c1-8e23-4dd7-b100-83242c265aac")
public class MmsConceptInstance extends MmsObject {
    @objid ("57adad03-8836-4308-a094-e2199d7d5565")
    public static final String STEREOTYPE_NAME = "MmsConceptInstance";

    /**
     * Tells whether a {@link MmsConceptInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << MmsConceptInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("c9cb1c4d-8fd2-4e1e-a0da-8e854f6461a7")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MmsConceptInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << MmsConceptInstance >> then instantiate a {@link MmsConceptInstance} proxy.
     * 
     * @return a {@link MmsConceptInstance} proxy on the created {@link Instance}.
     */
    @objid ("95cf16bd-0e40-405e-a114-1c61eccf0339")
    public static MmsConceptInstance create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Instance");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, MmsConceptInstance.STEREOTYPE_NAME);
        return MmsConceptInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link MmsConceptInstance} proxy from a {@link Instance} stereotyped << MmsConceptInstance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link MmsConceptInstance} proxy or <i>null</i>.
     */
    @objid ("bbc60bb7-f9fe-4e77-8608-9fb861c8e6e1")
    public static MmsConceptInstance instantiate(final Instance obj) {
        return MmsConceptInstance.canInstantiate(obj) ? new MmsConceptInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link MmsConceptInstance} proxy from a {@link Instance} stereotyped << MmsConceptInstance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link MmsConceptInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("64b180bc-7f64-4059-b56b-be82c40ba31a")
    public static MmsConceptInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (MmsConceptInstance.canInstantiate(obj))
        	return new MmsConceptInstance(obj);
        else
        	throw new IllegalArgumentException("MmsConceptInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'propertyInstance' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("06df8cc2-e1c7-4d59-8b6c-51728e2d0210")
    public void addPropertyInstance(final MmsPropertyInstance obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), MmsConceptInstance.MdaTypes.MDAASSOCDEP);
            d.setName("propertyInstance");
            d.putTagValue(MmsConceptInstance.MdaTypes.MDAASSOCDEP_ROLE, "propertyInstance");
        }
    }

    @objid ("c0ec42da-9ca2-4432-8e43-7f915e5fd0c5")
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
        MmsConceptInstance other = (MmsConceptInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("e0756d07-8554-47e4-be22-a460ffcf5531")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Get the values of the 'propertyInstance' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("70a27fb8-4ebf-43b8-b54c-f1026e49d3db")
    public List<MmsPropertyInstance> getPropertyInstance() {
        List<MmsPropertyInstance> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(MmsConceptInstance.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(MmsConceptInstance.MdaTypes.MDAASSOCDEP_ROLE), "propertyInstance")
              && MmsPropertyInstance.canInstantiate(d.getDependsOn()))
                results.add((MmsPropertyInstance)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MmsPropertyInstance.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("bc84a3a0-d706-4583-9585-0b9abf1abf6d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'propertyInstance' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("66ce39ec-8a3d-4998-8e96-8e860efe0b06")
    public boolean removePropertyInstance(final MmsPropertyInstance obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(MmsConceptInstance.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(MmsConceptInstance.MdaTypes.MDAASSOCDEP_ROLE), "conceptInstance")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    @objid ("1a606f86-1e45-4ce3-b698-2d230acb6106")
    protected MmsConceptInstance(final Instance elt) {
        super(elt);
    }

    @objid ("862d75e0-5992-4012-8c83-7a0ec8b66ab5")
    public static final class MdaTypes {
        @objid ("7f5425ab-be0f-46d9-ae7f-a05a1b26ef53")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("08cde349-3cae-44fb-b038-e47a19225f0d")
        private static Stereotype MDAASSOCDEP;

        @objid ("7e3d84ff-3ba0-4fd7-89df-9b9db6362a33")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("8a544485-a7d8-48e4-8900-8ac630fa5374")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "81bc1a2f-1255-41fb-b517-5ca503ccc73e");
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
