/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.00

 * This file was generated on 12/10/20 11:37 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_;

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
 * Proxy class to handle a {@link Class} with << EventInstance >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("73801d4a-bc99-45e4-9e2d-04f8cfc021bf")
public abstract class EventInstance extends Feature {
    @objid ("6b0d3d6b-fc96-48da-8c2e-357571ece8ce")
    public static final String STEREOTYPE_NAME = "EventInstance";

    @objid ("c526e149-8fbf-45bd-8c20-ea0745454308")
    public static final String LAYER_TAGTYPE = "layer";

    @objid ("dea86b77-16f3-438f-bfec-82ef4df76f84")
    public static final String STATUS_TAGTYPE = "status";

    @objid ("4b3184f0-1b94-4350-82ad-a8bafdacaddd")
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
        EventInstance other = (EventInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("bf4f33bd-9fb2-4ccb-927b-e992860de1ab")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'layer'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("03a3e541-42f4-4674-ab93-01356d636873")
    public String getLayer() {
        return this.elt.getTagValue(EventInstance.MdaTypes.LAYER_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'status'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("80daf6f1-a58e-435b-bbb8-46d3ff12bbd0")
    public String getStatus() {
        return this.elt.getTagValue(EventInstance.MdaTypes.STATUS_TAGTYPE_ELT);
    }

    @objid ("ff9a21e9-a706-4340-a814-2e1cc002e040")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'layer'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("18b25824-a38f-40d3-aab1-fe4a2dd18333")
    public void setLayer(final String value) {
        this.elt.putTagValue(EventInstance.MdaTypes.LAYER_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'status'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("89dbf598-cec3-4393-a85e-2c80cc3e06ef")
    public void setStatus(final String value) {
        this.elt.putTagValue(EventInstance.MdaTypes.STATUS_TAGTYPE_ELT, value);
    }

    @objid ("4ad89e01-a4ef-4e33-a594-22fdcb3ba802")
    protected EventInstance(final Class elt) {
        super(elt);
    }

    @objid ("98e63d06-3db8-4a94-99e6-5c82f0f8ac06")
    public static final class MdaTypes {
        @objid ("ea283648-36f1-41c0-9b7e-319eb3fe8697")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("df7464e9-f8a2-4d06-85ee-bb2f83a9853a")
        public static TagType STATUS_TAGTYPE_ELT;

        @objid ("6cf268ce-604c-4d46-8338-9665c9381fb4")
        public static TagType LAYER_TAGTYPE_ELT;

        @objid ("1dbff563-86ba-4e98-ac6d-3d7f49b1fb25")
        private static Stereotype MDAASSOCDEP;

        @objid ("de1f832a-59c6-4be4-827f-81dda7a60a82")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ade2b842-24e8-45fd-9cee-467917d1c9b5")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "7cddc4dd-ed72-4a04-85c5-54fe85e4ef38");
            STATUS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4747fc7f-ba00-4b26-b582-d03b1ba48082");
            LAYER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cb82d86d-41ee-47ee-b272-0c8093a8fadf");
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
