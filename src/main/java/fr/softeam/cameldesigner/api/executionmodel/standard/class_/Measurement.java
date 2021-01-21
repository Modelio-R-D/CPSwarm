/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.00

 * This file was generated on 12/10/20 11:37 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.executionmodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.Feature;
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
 * Proxy class to handle a {@link Class} with << Measurement >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("fd364a84-8a23-4f50-a661-f2ea77419f95")
public abstract class Measurement extends Feature {
    @objid ("fd3ef1e9-b370-44c3-89ca-a98067d597cb")
    public static final String STEREOTYPE_NAME = "Measurement";

    @objid ("8c25f7a8-f183-4206-b401-fcb2f066c697")
    public static final String MEASUREMENTTIME_TAGTYPE = "measurementTime";

    @objid ("1753ad7d-db70-4634-8730-3b104e6f987c")
    public static final String VALUE_TAGTYPE = "value";

    @objid ("a2c1a1a9-df4f-4f46-8ff6-b7dbef3a3f9d")
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
        Measurement other = (Measurement) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("611b2e97-f73a-4f27-9e46-af46e2c9c21e")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'measurementTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("355c434a-4398-464b-858b-6345a4a86834")
    public String getMeasurementTime() {
        return this.elt.getTagValue(Measurement.MdaTypes.MEASUREMENTTIME_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'value'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("4ad97780-0f6e-4daf-9297-bfcc0a3ce853")
    public String getValue() {
        return this.elt.getTagValue(Measurement.MdaTypes.VALUE_TAGTYPE_ELT);
    }

    @objid ("eeb9bdd1-91a9-4253-bf73-35db9a9726c8")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'measurementTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("86b9942a-2671-491e-ae2f-2cca29dae057")
    public void setMeasurementTime(final String value) {
        this.elt.putTagValue(Measurement.MdaTypes.MEASUREMENTTIME_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'value'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("c226bb9b-3f5e-400d-a68a-528d276cd00e")
    public void setValue(final String value) {
        this.elt.putTagValue(Measurement.MdaTypes.VALUE_TAGTYPE_ELT, value);
    }

    @objid ("7288dd45-d50b-420f-a298-63f5314b7dd0")
    protected Measurement(final Class elt) {
        super(elt);
    }

    @objid ("c5c12d99-af0a-463a-876e-c2847d9efbb0")
    public static final class MdaTypes {
        @objid ("2c64c6d8-1733-41b7-bdba-30186d0705e4")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("85fbf68d-abf8-4998-bf3d-9195a257cbcd")
        public static TagType VALUE_TAGTYPE_ELT;

        @objid ("8bde1673-c7f9-4027-966c-c06ef66cb9e3")
        public static TagType MEASUREMENTTIME_TAGTYPE_ELT;

        @objid ("0a6cc862-7dc1-4735-ab71-75d8614fe8b3")
        private static Stereotype MDAASSOCDEP;

        @objid ("2ad33422-9ae9-4e87-a2d7-8d78de2e58fc")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("8059ecb0-cdf5-4394-a8e0-1ee248c63278")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "481e52bb-d5b3-4dcb-a365-8ca5d75d8ac2");
            VALUE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03f06745-0e69-475c-a468-9f73b761a5d0");
            MEASUREMENTTIME_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "501b05dc-7f34-42e0-9da5-3a581c881e5c");
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
