/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.00

 * This file was generated on 12/10/20 11:37 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.camelcore.standard.port;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.standard.instance.FeatureInstance;
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
import org.modelio.metamodel.uml.statik.Port;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Port} with << Feature_Port >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("df72df64-fde5-4c17-ad49-37e1bb0285a0")
public class FeaturePort extends FeatureInstance {
    @objid ("aa2a9179-408d-48c6-b1e8-e6fb3186b56a")
    public static final String STEREOTYPE_NAME = "Feature_Port";

    /**
     * Tells whether a {@link FeaturePort proxy} can be instantiated from a {@link MObject} checking it is a {@link Port} stereotyped << Feature_Port >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("a174221b-2b90-4345-b161-08af99522adb")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Port) && ((Port) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, FeaturePort.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Port} stereotyped << Feature_Port >> then instantiate a {@link FeaturePort} proxy.
     * 
     * @return a {@link FeaturePort} proxy on the created {@link Port}.
     */
    @objid ("a157874f-3699-4b11-88d4-01d568401cb8")
    public static FeaturePort create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Port");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, FeaturePort.STEREOTYPE_NAME);
        return FeaturePort.instantiate((Port)e);
    }

    /**
     * Tries to instantiate a {@link FeaturePort} proxy from a {@link Port} stereotyped << Feature_Port >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Port
     * @return a {@link FeaturePort} proxy or <i>null</i>.
     */
    @objid ("6271b627-e045-4c28-84d8-3681481569a4")
    public static FeaturePort instantiate(final Port obj) {
        return FeaturePort.canInstantiate(obj) ? new FeaturePort(obj) : null;
    }

    /**
     * Tries to instantiate a {@link FeaturePort} proxy from a {@link Port} stereotyped << Feature_Port >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Port}
     * @return a {@link FeaturePort} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("d047857b-96c8-4018-93de-87f1a0f7a291")
    public static FeaturePort safeInstantiate(final Port obj) throws IllegalArgumentException {
        if (FeaturePort.canInstantiate(obj))
        	return new FeaturePort(obj);
        else
        	throw new IllegalArgumentException("FeaturePort: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("c70a52d7-117b-4cda-afcd-6a680d84705d")
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
        FeaturePort other = (FeaturePort) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Port}. 
     * @return the Port represented by this proxy, never null.
     */
    @objid ("64640930-41dc-4107-a6b4-9a8ee5f50b6e")
    @Override
    public Port getElement() {
        return (Port)super.getElement();
    }

    @objid ("310713cc-de72-441d-a807-20c66460f146")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("0966affc-34da-4d4f-8e81-9ab30e42d033")
    protected FeaturePort(final Port elt) {
        super(elt);
    }

    @objid ("a8d9e562-ebce-4b04-a8f8-b81512ba3fd4")
    public static final class MdaTypes {
        @objid ("8549baa7-edc1-4298-b42e-77802c1c4b56")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("9ef869ad-1224-4a32-ad07-a76068fc30b5")
        private static Stereotype MDAASSOCDEP;

        @objid ("eaa41e9b-b8a3-4b89-9d5b-18c51401c616")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("fbb002f1-44cd-430a-9f54-4e843e452540")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "18d0504c-73e0-4c7c-8341-53038298af2c");
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
