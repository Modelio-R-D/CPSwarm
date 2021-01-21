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
 * Proxy class to handle a {@link Class} with << HistoryInfo >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("32a73516-6547-4f5b-b3b1-4018a2466233")
public class HistoryInfo extends Feature {
    @objid ("4f22bac0-46e5-44ec-b2d3-a20cb1f7ec25")
    public static final String STEREOTYPE_NAME = "HistoryInfo";

    @objid ("6acd9832-1bae-4404-8de1-6155c33b05ce")
    public static final String ENDTIME_TAGTYPE = "endTime";

    @objid ("33a82187-cdbc-4744-a1a3-24963f3bc09a")
    public static final String OBJECT_TAGTYPE = "object";

    @objid ("ab2d85f1-da40-4949-9548-4e3a8fba0324")
    public static final String STARTTIME_TAGTYPE = "startTime";

    /**
     * Tells whether a {@link HistoryInfo proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << HistoryInfo >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("b4fd04d4-6cb2-4e39-8393-1ed8fcc2c27d")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, HistoryInfo.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << HistoryInfo >> then instantiate a {@link HistoryInfo} proxy.
     * 
     * @return a {@link HistoryInfo} proxy on the created {@link Class}.
     */
    @objid ("31b1af94-0a86-47c6-a38b-315bbe446605")
    public static HistoryInfo create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, HistoryInfo.STEREOTYPE_NAME);
        return HistoryInfo.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link HistoryInfo} proxy from a {@link Class} stereotyped << HistoryInfo >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link HistoryInfo} proxy or <i>null</i>.
     */
    @objid ("46ae0247-27d1-4222-a3d1-bb3200829eb1")
    public static HistoryInfo instantiate(final Class obj) {
        return HistoryInfo.canInstantiate(obj) ? new HistoryInfo(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HistoryInfo} proxy from a {@link Class} stereotyped << HistoryInfo >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link HistoryInfo} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("9a28f6cc-ef7a-4806-a54f-9725bff95e89")
    public static HistoryInfo safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (HistoryInfo.canInstantiate(obj))
        	return new HistoryInfo(obj);
        else
        	throw new IllegalArgumentException("HistoryInfo: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("d91b6d94-dfe5-40c6-9d0a-ef9a62ee55a4")
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
        HistoryInfo other = (HistoryInfo) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("62216aad-4ff2-4d67-b1e4-2a720edfed8d")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'endTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("ed6c1471-2890-45e5-ac2f-b51f434733d6")
    public String getEndTime() {
        return this.elt.getTagValue(HistoryInfo.MdaTypes.ENDTIME_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'object'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("acff2026-db6d-4e43-bfaa-67356afad66d")
    public String getObject() {
        return this.elt.getTagValue(HistoryInfo.MdaTypes.OBJECT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'startTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("aa755293-384e-4dd0-8d1b-64b65c4e379b")
    public String getStartTime() {
        return this.elt.getTagValue(HistoryInfo.MdaTypes.STARTTIME_TAGTYPE_ELT);
    }

    @objid ("448c27c7-31e6-4005-b19e-d8d1a7af9f0d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'endTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("4b7a5df2-9d97-406c-91fe-189c39c3f23f")
    public void setEndTime(final String value) {
        this.elt.putTagValue(HistoryInfo.MdaTypes.ENDTIME_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'object'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("e6f6d9e3-e55d-403c-bab5-b756a4a13613")
    public void setObject(final String value) {
        this.elt.putTagValue(HistoryInfo.MdaTypes.OBJECT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'startTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("903ac339-8501-46a1-ab73-c3e20c7aced8")
    public void setStartTime(final String value) {
        this.elt.putTagValue(HistoryInfo.MdaTypes.STARTTIME_TAGTYPE_ELT, value);
    }

    @objid ("626f43e2-5539-4a3c-874f-2608cd26f580")
    protected HistoryInfo(final Class elt) {
        super(elt);
    }

    @objid ("3e1aab74-be0c-48b2-b316-e35870217b33")
    public static final class MdaTypes {
        @objid ("44a1bd5d-c1b2-4dd2-98b2-e70c60c7a817")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d384948f-e8cc-4ea7-9f16-f6392b4e047d")
        public static TagType OBJECT_TAGTYPE_ELT;

        @objid ("7be0512f-4a60-4370-ac89-d5b25c81f67a")
        public static TagType STARTTIME_TAGTYPE_ELT;

        @objid ("1a417e8c-e4ac-4118-be44-e7441558741e")
        public static TagType ENDTIME_TAGTYPE_ELT;

        @objid ("7447c7b9-319b-45d9-b850-739e151c4856")
        private static Stereotype MDAASSOCDEP;

        @objid ("781c4970-0c57-4ed0-9620-91b0eef43dfc")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2a15e546-3c29-4ee8-a738-79007377e186")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "acef265d-7979-416d-8e8d-bc2a20331822");
            OBJECT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b459f0a0-04c3-4f41-ba76-aca6f5dc6dda");
            STARTTIME_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3888f8fe-984d-4fcb-a8f4-ed0071eb91c0");
            ENDTIME_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "e34ce3bc-ef22-4d6d-9c02-81f6bbd2268b");
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
