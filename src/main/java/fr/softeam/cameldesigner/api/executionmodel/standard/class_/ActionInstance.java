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
 * Proxy class to handle a {@link Class} with << ActionInstance >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("a76b8220-83aa-410e-a6dc-9369e64f59e2")
public class ActionInstance extends Feature {
    @objid ("b85341a2-5d35-41a6-94f2-d45f4938a400")
    public static final String STEREOTYPE_NAME = "ActionInstance";

    @objid ("9ae6ef01-0daf-4ec2-9d2b-d454aac8d170")
    public static final String ENDTIME_TAGTYPE = "endTime";

    @objid ("00c0db1c-245a-4b08-a4e0-d60be224f7ba")
    public static final String STARTTIME_TAGTYPE = "startTime";

    @objid ("425b7f71-60c1-404d-b31b-befb8318eab1")
    public static final String SUCCESSFUL_TAGTYPE = "successful";

    /**
     * Tells whether a {@link ActionInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << ActionInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("a3fd244d-3e94-46dd-a32f-4cb5af529c4c")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ActionInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << ActionInstance >> then instantiate a {@link ActionInstance} proxy.
     * 
     * @return a {@link ActionInstance} proxy on the created {@link Class}.
     */
    @objid ("7b2d8f5d-d823-48fd-a94f-425f920e5aef")
    public static ActionInstance create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, ActionInstance.STEREOTYPE_NAME);
        return ActionInstance.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link ActionInstance} proxy from a {@link Class} stereotyped << ActionInstance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link ActionInstance} proxy or <i>null</i>.
     */
    @objid ("b7ad7d80-55c8-4853-afa3-081325ced3c0")
    public static ActionInstance instantiate(final Class obj) {
        return ActionInstance.canInstantiate(obj) ? new ActionInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ActionInstance} proxy from a {@link Class} stereotyped << ActionInstance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link ActionInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("32bc5bbf-2dc6-46e3-a428-6b74343431ca")
    public static ActionInstance safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (ActionInstance.canInstantiate(obj))
        	return new ActionInstance(obj);
        else
        	throw new IllegalArgumentException("ActionInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("5e1ef2c0-1e75-458a-9a63-581c3e0aa3d8")
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
        ActionInstance other = (ActionInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("a69fefbd-6dc9-4152-9128-4736b9e09c01")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'endTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("7b0d512d-b99d-4a93-aa07-be64bc95af56")
    public String getEndTime() {
        return this.elt.getTagValue(ActionInstance.MdaTypes.ENDTIME_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'startTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("7dd320a0-ff9f-47fb-960e-745faa1d20a5")
    public String getStartTime() {
        return this.elt.getTagValue(ActionInstance.MdaTypes.STARTTIME_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'successful'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("f5f0db29-b64b-40d5-9d45-a88a11f3ad72")
    public String getSuccessful() {
        return this.elt.getTagValue(ActionInstance.MdaTypes.SUCCESSFUL_TAGTYPE_ELT);
    }

    @objid ("465fb519-30f2-4c73-b0ab-9a56583249ee")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'endTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("f32e1b0a-a221-4fdd-b9d0-fe82c4772593")
    public void setEndTime(final String value) {
        this.elt.putTagValue(ActionInstance.MdaTypes.ENDTIME_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'startTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("3c7e457c-3bce-4ac0-8b21-6aa2f3ea7575")
    public void setStartTime(final String value) {
        this.elt.putTagValue(ActionInstance.MdaTypes.STARTTIME_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'successful'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("c26775c3-6f01-46d3-9108-af02e13c9168")
    public void setSuccessful(final String value) {
        this.elt.putTagValue(ActionInstance.MdaTypes.SUCCESSFUL_TAGTYPE_ELT, value);
    }

    @objid ("a5004d52-7c4e-4775-9749-86d0ba48f594")
    protected ActionInstance(final Class elt) {
        super(elt);
    }

    @objid ("e6124144-40b2-4d8e-9200-f628fda5f4f2")
    public static final class MdaTypes {
        @objid ("e75236d6-a278-473d-aa33-4c9c69b8a13b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f406fc9d-1206-4155-afdb-208156bc5541")
        public static TagType STARTTIME_TAGTYPE_ELT;

        @objid ("bbf3a23d-ce8c-4163-b6b3-0643eed1af10")
        public static TagType ENDTIME_TAGTYPE_ELT;

        @objid ("bf76138b-70b1-4751-a365-006b9f890ff7")
        public static TagType SUCCESSFUL_TAGTYPE_ELT;

        @objid ("c194b199-9a83-45c6-b8fc-1409f2dd6ef2")
        private static Stereotype MDAASSOCDEP;

        @objid ("480e3aa9-245e-4ea8-aefc-3ed897bd8136")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("076ada2b-24a0-49d0-8206-a48028ed9a8e")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "fe6343f1-1474-4d9e-a80f-e88b019c9e46");
            STARTTIME_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b0fbf0b8-55e7-49bd-8638-48285c121023");
            ENDTIME_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b0d29654-1e13-4705-af26-e7bcf590850e");
            SUCCESSFUL_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "652d15c6-5261-493e-a968-b981d7bee54a");
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
