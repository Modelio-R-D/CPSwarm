/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.00

 * This file was generated on 12/10/20 11:37 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.securitymodel.standard.instance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.metricmodel.standard.instance.MetricInstance;
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
 * Proxy class to handle a {@link Instance} with << SecurityMetricInstance >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("db549854-9aae-4283-9b11-2038f1326191")
public class SecurityMetricInstance extends MetricInstance {
    @objid ("2ed70642-5509-46ff-be21-d9676ab24918")
    public static final String STEREOTYPE_NAME = "SecurityMetricInstance";

    /**
     * Tells whether a {@link SecurityMetricInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << SecurityMetricInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("e90c27e7-0505-4002-9fa3-d1292adaf068")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, SecurityMetricInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << SecurityMetricInstance >> then instantiate a {@link SecurityMetricInstance} proxy.
     * 
     * @return a {@link SecurityMetricInstance} proxy on the created {@link Instance}.
     */
    @objid ("a4041b92-95cf-46b7-bd23-5a06b1ad1a99")
    public static SecurityMetricInstance create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Instance");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, SecurityMetricInstance.STEREOTYPE_NAME);
        return SecurityMetricInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link SecurityMetricInstance} proxy from a {@link Instance} stereotyped << SecurityMetricInstance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link SecurityMetricInstance} proxy or <i>null</i>.
     */
    @objid ("fe2c4901-ace6-4353-8467-1984d7bfdc4c")
    public static SecurityMetricInstance instantiate(final Instance obj) {
        return SecurityMetricInstance.canInstantiate(obj) ? new SecurityMetricInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SecurityMetricInstance} proxy from a {@link Instance} stereotyped << SecurityMetricInstance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link SecurityMetricInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("9e3fba54-2a68-40c3-85b2-b3b3ffa7b465")
    public static SecurityMetricInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (SecurityMetricInstance.canInstantiate(obj))
        	return new SecurityMetricInstance(obj);
        else
        	throw new IllegalArgumentException("SecurityMetricInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("77c8bbbf-941f-4462-a582-ffd96ba1e14a")
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
        SecurityMetricInstance other = (SecurityMetricInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("26a4e71c-a522-4149-9a0f-903201df02d4")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    @objid ("0ac08218-9a73-4d6f-823b-7e38985d3d0f")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("627f24ef-2711-4ee2-b7e5-7329b7777d34")
    protected SecurityMetricInstance(final Instance elt) {
        super(elt);
    }

    @objid ("91cf5d57-7dbc-49f4-b2a7-30e61c6807c9")
    public static final class MdaTypes {
        @objid ("f80e88e5-a882-4bb7-859c-851eaf095341")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("248239dd-c090-4365-9bcd-78577b398af4")
        private static Stereotype MDAASSOCDEP;

        @objid ("727344b4-63f1-480c-9438-fea8175b51c2")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("5b829b20-3bf6-44fa-99da-4e2229e3bd9c")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "4cb7cfa4-64dc-42a4-9178-af3560cfcf40");
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
