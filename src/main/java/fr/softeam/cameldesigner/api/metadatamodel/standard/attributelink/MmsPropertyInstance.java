/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.00

 * This file was generated on 12/10/20 11:37 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.metadatamodel.standard.attributelink;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.metadatamodel.infrastructure.modelelement.MmsObject;
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
import org.modelio.metamodel.uml.statik.AttributeLink;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link AttributeLink} with << MmsPropertyInstance >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("09e9e24f-9c1d-4cfb-b3bb-bf35bf56c7f5")
public class MmsPropertyInstance extends MmsObject {
    @objid ("c96bfcf9-2678-4996-be8a-62ad0ba34b16")
    public static final String STEREOTYPE_NAME = "MmsPropertyInstance";

    @objid ("b2201b3b-89a4-4d23-a499-14dfebb25170")
    public static final String PROPERTYVALUE_TAGTYPE = "propertyValue";

    /**
     * Tells whether a {@link MmsPropertyInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link AttributeLink} stereotyped << MmsPropertyInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("646da150-dd08-4313-8f57-8ad8b1c7fcfb")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AttributeLink) && ((AttributeLink) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MmsPropertyInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AttributeLink} stereotyped << MmsPropertyInstance >> then instantiate a {@link MmsPropertyInstance} proxy.
     * 
     * @return a {@link MmsPropertyInstance} proxy on the created {@link AttributeLink}.
     */
    @objid ("b8d03748-992f-4f88-a2e2-993fb80d3bc3")
    public static MmsPropertyInstance create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.AttributeLink");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, MmsPropertyInstance.STEREOTYPE_NAME);
        return MmsPropertyInstance.instantiate((AttributeLink)e);
    }

    /**
     * Tries to instantiate a {@link MmsPropertyInstance} proxy from a {@link AttributeLink} stereotyped << MmsPropertyInstance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AttributeLink
     * @return a {@link MmsPropertyInstance} proxy or <i>null</i>.
     */
    @objid ("9596afd3-8119-41ca-989c-e1be86deb46a")
    public static MmsPropertyInstance instantiate(final AttributeLink obj) {
        return MmsPropertyInstance.canInstantiate(obj) ? new MmsPropertyInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link MmsPropertyInstance} proxy from a {@link AttributeLink} stereotyped << MmsPropertyInstance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AttributeLink}
     * @return a {@link MmsPropertyInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("ce6f0500-cc9a-40a0-ac17-8f67361c31e6")
    public static MmsPropertyInstance safeInstantiate(final AttributeLink obj) throws IllegalArgumentException {
        if (MmsPropertyInstance.canInstantiate(obj))
        	return new MmsPropertyInstance(obj);
        else
        	throw new IllegalArgumentException("MmsPropertyInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("a425c7db-f8e7-42d5-9ca1-d907b89d90dd")
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
        MmsPropertyInstance other = (MmsPropertyInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the value of the 'conceptInstance' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("93c1190e-3eae-45b1-86f4-1bba50b97722")
    public MmsConceptInstance getConceptInstance() {
        for (Dependency d : this.elt.getImpactedDependency()) {
          if (d.isStereotyped(MmsPropertyInstance.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(MmsPropertyInstance.MdaTypes.MDAASSOCDEP_ROLE), "propertyInstance")
              && MmsConceptInstance.canInstantiate(d.getImpacted())) {
                  return (MmsConceptInstance)CamelDesignerProxyFactory.instantiate(d.getImpacted(), MmsConceptInstance.MdaTypes.STEREOTYPE_ELT.getName());
          }
        }
        return null;
    }

    /**
     * Get the underlying {@link AttributeLink}. 
     * @return the AttributeLink represented by this proxy, never null.
     */
    @objid ("841b17e4-0387-40ce-bd14-6b640446066b")
    @Override
    public AttributeLink getElement() {
        return (AttributeLink)super.getElement();
    }

    /**
     * Getter for string property 'propertyValue'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("35f38907-47f2-4cf2-a2fd-6719c0af1055")
    public String getPropertyValue() {
        return this.elt.getTagValue(MmsPropertyInstance.MdaTypes.PROPERTYVALUE_TAGTYPE_ELT);
    }

    @objid ("53d38a78-7bfd-4c92-9027-95e725200c7c")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'conceptInstance' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("98d0f230-8196-4c10-a312-7538b7f87a41")
    public void setConceptInstance(final MmsConceptInstance obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getImpactedDependency())
          if (d.isStereotyped(MmsPropertyInstance.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(MmsPropertyInstance.MdaTypes.MDAASSOCDEP_ROLE), "propertyInstance")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if (dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(obj.getElement(), this.elt, MmsPropertyInstance.MdaTypes.MDAASSOCDEP);
              dep.setName("propertyInstance");
              dep.putTagValue(MmsPropertyInstance.MdaTypes.MDAASSOCDEP_ROLE, "propertyInstance");
          }
          dep.setImpacted(obj.getElement());
        }
    }

    /**
     * Setter for string property 'propertyValue'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("1b7e1ce8-4fdd-4ef8-b762-32207ad907ff")
    public void setPropertyValue(final String value) {
        this.elt.putTagValue(MmsPropertyInstance.MdaTypes.PROPERTYVALUE_TAGTYPE_ELT, value);
    }

    @objid ("b0f9bf45-a771-44e0-81c7-48efd92aef87")
    protected MmsPropertyInstance(final AttributeLink elt) {
        super(elt);
    }

    @objid ("3974f7b7-9317-4102-aa68-17990b0b6b2f")
    public static final class MdaTypes {
        @objid ("6208852e-f39d-47b5-ace7-5cc9ff744b6f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("8de8c253-c7cf-4b82-ac38-e8bebe500cc0")
        public static TagType PROPERTYVALUE_TAGTYPE_ELT;

        @objid ("1f842de8-a720-4265-aaa4-0fdaf5eb0116")
        private static Stereotype MDAASSOCDEP;

        @objid ("99dc0b0d-497a-483b-8eff-056131b1bb3e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e580c7b1-1bd8-4dd1-b46c-ee44de777616")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "f4953787-31fa-4eed-88df-83d5ad51d82e");
            PROPERTYVALUE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1df65abe-3c98-4cde-9656-91b11230e762");
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
