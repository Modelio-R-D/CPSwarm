/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.00

 * This file was generated on 12/10/20 11:37 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.camelcore.standard.class_;

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
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Class} with << MeasurableAttribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("f7605dc5-004d-4e28-b490-e312ea63cee2")
public class MeasurableAttribute extends QualityAttribute {
    @objid ("8b8a9b30-5935-402d-945c-3c1407b4e78f")
    public static final String STEREOTYPE_NAME = "MeasurableAttribute";

    /**
     * Tells whether a {@link MeasurableAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << MeasurableAttribute >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("332e18b7-66c6-4551-8320-72b51de77ff8")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MeasurableAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << MeasurableAttribute >> then instantiate a {@link MeasurableAttribute} proxy.
     * 
     * @return a {@link MeasurableAttribute} proxy on the created {@link Class}.
     */
    @objid ("be325fe7-585f-4d21-9afd-6c1462c4cfb9")
    public static MeasurableAttribute create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, MeasurableAttribute.STEREOTYPE_NAME);
        return MeasurableAttribute.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link MeasurableAttribute} proxy from a {@link Class} stereotyped << MeasurableAttribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link MeasurableAttribute} proxy or <i>null</i>.
     */
    @objid ("8cb0e677-872b-4d22-9741-fb137290e663")
    public static MeasurableAttribute instantiate(final Class obj) {
        return MeasurableAttribute.canInstantiate(obj) ? new MeasurableAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link MeasurableAttribute} proxy from a {@link Class} stereotyped << MeasurableAttribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link MeasurableAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("86c0ab39-9677-4e0d-9208-0261baf88ba5")
    public static MeasurableAttribute safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (MeasurableAttribute.canInstantiate(obj))
        	return new MeasurableAttribute(obj);
        else
        	throw new IllegalArgumentException("MeasurableAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("6dbc310f-61f7-40c2-b28a-5e873d2248a6")
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
        MeasurableAttribute other = (MeasurableAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("1307df8f-a0fa-4805-a494-c2bb26110138")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("2090be30-37af-479b-a354-7dc13bd59a5c")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("48de457a-c1c9-464d-b158-984aaf49c2cc")
    protected MeasurableAttribute(final Class elt) {
        super(elt);
    }

    @objid ("f5778737-9189-4851-90e5-4c429752bc4a")
    public static final class MdaTypes {
        @objid ("5f9d08a8-3bda-45df-b940-70d26abc26d4")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("8a41b7f2-d313-45ca-81f0-3f95b65381c8")
        private static Stereotype MDAASSOCDEP;

        @objid ("c18b7f82-782f-405d-82e8-feac49405ced")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("08b1e02d-800e-433b-b33b-fd26ebee0a34")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "41f442d8-cf5f-4e6c-a842-47675cf36361");
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
