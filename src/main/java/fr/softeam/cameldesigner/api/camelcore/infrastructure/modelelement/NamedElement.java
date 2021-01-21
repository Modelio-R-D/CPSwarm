/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.00

 * This file was generated on 12/10/20 11:37 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.metadatamodel.infrastructure.modelelement.MmsObject;
import fr.softeam.cameldesigner.api.metadatamodel.standard.attribute.MmsProperty;
import fr.softeam.cameldesigner.api.metadatamodel.standard.attributelink.MmsPropertyInstance;
import fr.softeam.cameldesigner.api.metadatamodel.standard.class_.MmsConcept;
import fr.softeam.cameldesigner.api.metadatamodel.standard.instance.MmsConceptInstance;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;

/**
 * Proxy class to handle a {@link ModelElement} with << NamedElement >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("f252b432-5dfa-429d-a585-2ea4461bf1ad")
public abstract class NamedElement extends CamelElement {
    @objid ("f234ed69-3008-4d2a-8d7f-aebb233db476")
    public static final String STEREOTYPE_NAME = "NamedElement";

    @objid ("70a60249-5b73-4ae0-992c-9c47e49c93e6")
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
        NamedElement other = (NamedElement) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}.
     * 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("d74df81b-15eb-4afe-bbfb-003a496669bf")
    @Override
    public ModelElement getElement() {
        return (ModelElement)super.getElement();
    }

    @objid ("d51c8b02-8ff4-4371-814b-6b81d92dc5de")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Get the values of the 'annotations' role.<p>
     * Role description:
     * null
     */
    @objid ("292f27c9-6361-4f56-8975-304b63081276")
    public List<MmsObject> getAnnotations() {
        List<MmsObject> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
            if ((d.isStereotyped(NamedElement.MdaTypes.MDAASSOCDEP)
                    && Objects.equals(d.getTagValue(NamedElement.MdaTypes.MDAASSOCDEP_ROLE), "annotations")
                    && d.getDependsOn().isStereotyped(MmsObject.MdaTypes.STEREOTYPE_ELT))) {
        
                ModelElement mObj = d.getDependsOn();
                if (MmsConceptInstance.canInstantiate(mObj))
                    results.add((MmsConceptInstance)CamelDesignerProxyFactory.instantiate(mObj, MmsConceptInstance.STEREOTYPE_NAME));
        
                if (MmsConcept.canInstantiate(mObj))
                    results.add((MmsConcept)CamelDesignerProxyFactory.instantiate(mObj, MmsConcept.STEREOTYPE_NAME));
        
                if (MmsProperty.canInstantiate(mObj))
                    results.add((MmsProperty)CamelDesignerProxyFactory.instantiate(mObj, MmsProperty.STEREOTYPE_NAME));
        
                if (MmsPropertyInstance.canInstantiate(mObj))
                    results.add((MmsPropertyInstance)CamelDesignerProxyFactory.instantiate(mObj, MmsPropertyInstance.STEREOTYPE_NAME));
        
            }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("a532fe42-8d33-4175-ad14-836b13bf3484")
    protected NamedElement(final ModelElement elt) {
        super(elt);
    }

    /**
     * Add a value to the 'annotations' role.<p>
     * Role description:
     * null
     */
    @objid ("12205ea5-2855-4122-96ae-48effc5fd76f")
    public void addAnnotations(final MmsObject obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), NamedElement.MdaTypes.MDAASSOCDEP);
            d.setName("annotations");
            d.putTagValue(NamedElement.MdaTypes.MDAASSOCDEP_ROLE, "annotations");
        }
    }

    /**
     * Remove a value from the 'annotations' role.<p>
     * Role description:
     * null
     */
    @objid ("4009961b-6702-40c0-941e-56e36f356607")
    public boolean removeAnnotations(final MmsObject obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(NamedElement.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(NamedElement.MdaTypes.MDAASSOCDEP_ROLE), ""))
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    @objid ("cb71b83e-c94e-44b8-b058-a4c207482cb0")
    public static final class MdaTypes {
        @objid ("863bd651-847a-45d2-b343-67ad4ec40e20")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("96a4c3d3-7a7e-4d9f-993a-d9c75fd09458")
        private static Stereotype MDAASSOCDEP;

        @objid ("9484b3df-3e57-4d76-8ff5-91add8662dc9")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("25c474e8-9459-4cf2-97be-34d557518ea4")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "f81fdaa1-17e1-49a4-bf1f-60c18563c100");
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
