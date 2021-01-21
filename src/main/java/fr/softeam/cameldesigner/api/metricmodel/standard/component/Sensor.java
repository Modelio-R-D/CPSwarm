/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.00

 * This file was generated on 12/10/20 11:37 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.metricmodel.standard.component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.SoftwareComponent;
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
import org.modelio.metamodel.uml.statik.Component;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Component} with << Sensor >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("a0dafd4c-3a94-4343-86b0-316952020ebd")
public class Sensor extends SoftwareComponent {
    @objid ("8b811dc6-093e-4b12-8f38-dd6469e4f79d")
    public static final String STEREOTYPE_NAME = "Sensor";

    @objid ("1a7eda2f-98d4-4610-be4e-c29cd22b45b9")
    public static final String CONFIGURATION_TAGTYPE = "configuration";

    @objid ("6d7485f6-1118-4ff5-86ca-1c4d0eedf3f6")
    public static final String ISPUSH_TAGTYPE = "isPush";

    /**
     * Tells whether a {@link Sensor proxy} can be instantiated from a {@link MObject} checking it is a {@link Component} stereotyped << Sensor >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("09ccc845-c4c8-4e25-b2aa-ed34bdd5ca0e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Component) && ((Component) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Sensor.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Component} stereotyped << Sensor >> then instantiate a {@link Sensor} proxy.
     * 
     * @return a {@link Sensor} proxy on the created {@link Component}.
     */
    @objid ("9faeac77-765f-45a3-abae-ad5bdfb0b491")
    public static Sensor create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Component");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, Sensor.STEREOTYPE_NAME);
        return Sensor.instantiate((Component)e);
    }

    /**
     * Tries to instantiate a {@link Sensor} proxy from a {@link Component} stereotyped << Sensor >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Component
     * @return a {@link Sensor} proxy or <i>null</i>.
     */
    @objid ("36d68de8-1664-4dd6-9ee1-fffaf3d3db80")
    public static Sensor instantiate(final Component obj) {
        return Sensor.canInstantiate(obj) ? new Sensor(obj) : null;
    }

    /**
     * Tries to instantiate a {@link Sensor} proxy from a {@link Component} stereotyped << Sensor >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Component}
     * @return a {@link Sensor} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("b2b1ccb9-a223-42ed-8a6b-a47a4a072a12")
    public static Sensor safeInstantiate(final Component obj) throws IllegalArgumentException {
        if (Sensor.canInstantiate(obj))
        	return new Sensor(obj);
        else
        	throw new IllegalArgumentException("Sensor: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("24d02ee0-769b-4f7c-92b7-f963048df4a2")
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
        Sensor other = (Sensor) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for string property 'configuration'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("2040a151-f85b-4e57-ac37-cb831017d2db")
    public String getConfiguration() {
        return this.elt.getTagValue(Sensor.MdaTypes.CONFIGURATION_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Component}. 
     * @return the Component represented by this proxy, never null.
     */
    @objid ("c0a4c669-2465-42dc-aaeb-6600b1b5224b")
    @Override
    public Component getElement() {
        return (Component)super.getElement();
    }

    /**
     * Getter for string property 'isPush'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("f90e8534-3106-482c-8fa6-2f6fa0d1f457")
    public String getIsPush() {
        return this.elt.getTagValue(Sensor.MdaTypes.ISPUSH_TAGTYPE_ELT);
    }

    @objid ("f6bb0ee4-4196-47d7-8ac6-bf58700aded0")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'configuration'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("1c504ab4-5190-4b59-99d1-e2a555d15a28")
    public void setConfiguration(final String value) {
        this.elt.putTagValue(Sensor.MdaTypes.CONFIGURATION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'isPush'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("d08b6c09-025e-42d9-9154-1ec373051ecf")
    public void setIsPush(final String value) {
        this.elt.putTagValue(Sensor.MdaTypes.ISPUSH_TAGTYPE_ELT, value);
    }

    @objid ("2d554055-96b7-4e5e-a0fd-4268ccb61b82")
    protected Sensor(final Component elt) {
        super(elt);
    }

    @objid ("ab2c122d-31c1-421d-919a-92957fbd08bd")
    public static final class MdaTypes {
        @objid ("046f32e0-bd22-471c-b255-0fdc08bdd82e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("cda5e26c-f6fb-4467-84f6-93e68f5e73c7")
        public static TagType CONFIGURATION_TAGTYPE_ELT;

        @objid ("3cb4e247-7620-40e6-8641-01788a308773")
        public static TagType ISPUSH_TAGTYPE_ELT;

        @objid ("e6b61511-0467-44d2-93b6-aa80786e5294")
        private static Stereotype MDAASSOCDEP;

        @objid ("b6eacdb3-ef40-4a9b-b444-e94319a681cf")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("976d8364-3744-438d-ad67-223695c9eb6a")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "d130006b-ebe5-4a5f-818a-abc63742cf56");
            CONFIGURATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "326b1fa3-0a38-48be-aace-c126d5979004");
            ISPUSH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "13acdee9-96c7-4ae3-82b9-99cd12effc27");
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
