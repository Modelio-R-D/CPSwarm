/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.00

 * This file was generated on 12/10/20 11:37 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.constraintmodel.standard.constraint;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Constraint;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Constraint} with << MetricConstraint >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("39dc4a56-9d42-4441-8973-22fc28c57bb9")
public class MetricConstraint extends UnaryConstraint {
    @objid ("3d16f0ca-6be4-48de-a346-f933ce580f06")
    public static final String STEREOTYPE_NAME = "MetricConstraint";

    /**
     * Tells whether a {@link MetricConstraint proxy} can be instantiated from a {@link MObject} checking it is a {@link Constraint} stereotyped << MetricConstraint >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("e0166a72-80aa-4e74-aa98-bc75372a0a95")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Constraint) && ((Constraint) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MetricConstraint.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Constraint} stereotyped << MetricConstraint >> then instantiate a {@link MetricConstraint} proxy.
     * 
     * @return a {@link MetricConstraint} proxy on the created {@link Constraint}.
     */
    @objid ("d379a382-085a-4b74-a40a-6c1fe60f383f")
    public static MetricConstraint create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Constraint");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, MetricConstraint.STEREOTYPE_NAME);
        return MetricConstraint.instantiate((Constraint)e);
    }

    /**
     * Tries to instantiate a {@link MetricConstraint} proxy from a {@link Constraint} stereotyped << MetricConstraint >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Constraint
     * @return a {@link MetricConstraint} proxy or <i>null</i>.
     */
    @objid ("79c77512-7697-49d6-a2f4-1d4d7c194e8e")
    public static MetricConstraint instantiate(final Constraint obj) {
        return MetricConstraint.canInstantiate(obj) ? new MetricConstraint(obj) : null;
    }

    /**
     * Tries to instantiate a {@link MetricConstraint} proxy from a {@link Constraint} stereotyped << MetricConstraint >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Constraint}
     * @return a {@link MetricConstraint} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("d3a8981a-f421-4b50-84f5-52ac24d0afbd")
    public static MetricConstraint safeInstantiate(final Constraint obj) throws IllegalArgumentException {
        if (MetricConstraint.canInstantiate(obj))
        	return new MetricConstraint(obj);
        else
        	throw new IllegalArgumentException("MetricConstraint: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("d3f6da23-9b64-4474-8e64-d6fc27af45cb")
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
        MetricConstraint other = (MetricConstraint) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Constraint}. 
     * @return the Constraint represented by this proxy, never null.
     */
    @objid ("f17ff1ea-e85c-4654-8b26-54635e9c4540")
    @Override
    public Constraint getElement() {
        return (Constraint)super.getElement();
    }

    @objid ("185853cd-05e4-4ac3-b4f9-83b024ea0223")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("0415b789-334e-4bd0-b82a-1ee362b89ad6")
    protected MetricConstraint(final Constraint elt) {
        super(elt);
    }

    @objid ("e24cb852-9e38-49f6-aca0-f44360d81f1b")
    public static final class MdaTypes {
        @objid ("10e5fda7-a033-47e1-9e64-582e6d166e96")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("7f5329b7-549f-43f1-bea3-115df05ee3d2")
        private static Stereotype MDAASSOCDEP;

        @objid ("a55bb626-5cd5-4154-984d-3170a9672efa")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("68ac1d0b-1760-4b91-9e8b-37b40e62513c")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "713a32d2-c7ee-4caa-9f5d-94fcb7820b94");
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
