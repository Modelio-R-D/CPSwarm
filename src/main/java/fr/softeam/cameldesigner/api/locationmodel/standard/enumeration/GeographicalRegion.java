/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.00

 * This file was generated on 12/10/20 11:37 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.locationmodel.standard.enumeration;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
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
import org.modelio.metamodel.uml.statik.Enumeration;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Enumeration} with << GeographicalRegion >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("840d6f54-3cb7-4c64-bc4c-8a2ef6fc0cd4")
public class GeographicalRegion extends Location {
    @objid ("819047d2-162c-479a-a0f8-716fef8b6acf")
    public static final String STEREOTYPE_NAME = "GeographicalRegion";

    /**
     * Tells whether a {@link GeographicalRegion proxy} can be instantiated from a {@link MObject} checking it is a {@link Enumeration} stereotyped << GeographicalRegion >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("22e2536c-e145-4556-81f3-aa7556ac3bed")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Enumeration) && ((Enumeration) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, GeographicalRegion.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Enumeration} stereotyped << GeographicalRegion >> then instantiate a {@link GeographicalRegion} proxy.
     * 
     * @return a {@link GeographicalRegion} proxy on the created {@link Enumeration}.
     */
    @objid ("db2aab6c-ecf0-460b-bc10-76526fb904b3")
    public static GeographicalRegion create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Enumeration");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, GeographicalRegion.STEREOTYPE_NAME);
        return GeographicalRegion.instantiate((Enumeration)e);
    }

    /**
     * Tries to instantiate a {@link GeographicalRegion} proxy from a {@link Enumeration} stereotyped << GeographicalRegion >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Enumeration
     * @return a {@link GeographicalRegion} proxy or <i>null</i>.
     */
    @objid ("8c0e69ec-6280-47ef-9617-6ca60c9fc5d2")
    public static GeographicalRegion instantiate(final Enumeration obj) {
        return GeographicalRegion.canInstantiate(obj) ? new GeographicalRegion(obj) : null;
    }

    /**
     * Tries to instantiate a {@link GeographicalRegion} proxy from a {@link Enumeration} stereotyped << GeographicalRegion >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Enumeration}
     * @return a {@link GeographicalRegion} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("c6b7ce63-a643-4311-9ee8-7d78aafab644")
    public static GeographicalRegion safeInstantiate(final Enumeration obj) throws IllegalArgumentException {
        if (GeographicalRegion.canInstantiate(obj))
        	return new GeographicalRegion(obj);
        else
        	throw new IllegalArgumentException("GeographicalRegion: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value of the 'parents' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("2da9df7c-0996-49f2-bf19-29ab4fcf1951")
    public void addParents(final GeographicalRegion obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(obj.getElement(), this.elt, GeographicalRegion.MdaTypes.MDAASSOCDEP);
            d.setName("enfant");
            d.putTagValue(GeographicalRegion.MdaTypes.MDAASSOCDEP_ROLE, "enfant");
        }
    }

    @objid ("80ffbdde-46b6-488e-bd9d-1c08baaa1389")
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
        GeographicalRegion other = (GeographicalRegion) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Enumeration}. 
     * @return the Enumeration represented by this proxy, never null.
     */
    @objid ("db8ba6ff-ac09-4d54-9c1c-b40d2b271317")
    @Override
    public Enumeration getElement() {
        return (Enumeration)super.getElement();
    }

    /**
     * Get the values of the 'parents' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("34868fe5-f546-47d4-91ef-fbf7dcced2ec")
    public List<GeographicalRegion> getParents() {
        List<GeographicalRegion> results = new ArrayList<>();
        for (Dependency d : this.elt.getImpactedDependency()) {
          if (d.isStereotyped(GeographicalRegion.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(GeographicalRegion.MdaTypes.MDAASSOCDEP_ROLE), "enfant")
              && GeographicalRegion.canInstantiate(d.getImpacted())) {
                 results.add((GeographicalRegion)CamelDesignerProxyFactory.instantiate(d.getImpacted(), GeographicalRegion.STEREOTYPE_NAME));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("910521a2-65a3-4b05-8e0d-2fc7418e7a9b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from 'parents' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("c41da9de-9b38-4c17-b03c-e3939f5a2817")
    public boolean removeParents(final GeographicalRegion obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getImpactedDependency())) {
            if (d.isStereotyped(GeographicalRegion.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(GeographicalRegion.MdaTypes.MDAASSOCDEP_ROLE), "enfant"))
              if (Objects.equals(d.getImpacted(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    @objid ("3632aa96-a034-4863-a9c1-76b0529b6c96")
    protected GeographicalRegion(final Enumeration elt) {
        super(elt);
    }

    @objid ("99a544e5-32ff-4e49-b598-8e15beae3213")
    public static final class MdaTypes {
        @objid ("ffa70069-19e1-4ff2-914f-53a9aa906e3c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("8f54b781-99a9-4b04-be93-ce1314ab94ac")
        private static Stereotype MDAASSOCDEP;

        @objid ("d3484bf4-da73-4338-847c-62e80026b5e7")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d9c89650-0d46-4f7a-8e9c-54261c027f15")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "b9be9f56-5f88-4cfb-8745-3fe2ceda1c86");
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
