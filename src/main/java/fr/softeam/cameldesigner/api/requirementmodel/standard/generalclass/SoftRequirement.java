/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.00

 * This file was generated on 12/10/20 11:37 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.requirementmodel.standard.generalclass;

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
import org.modelio.metamodel.uml.statik.GeneralClass;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link GeneralClass} with << SoftRequirement >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("539e2a12-8c48-42f5-9783-5248ca11085c")
public abstract class SoftRequirement extends Requirement {
    @objid ("ccfb47e6-0a58-4946-bce3-85392181a239")
    public static final String STEREOTYPE_NAME = "SoftRequirement";

    @objid ("19072ce3-eecd-4893-b209-0c66f62e1dcc")
    public static final String PRIORITY_TAGTYPE = "priority";

    @objid ("c67c54ea-8fa1-49f9-b0d4-99ca4a5e3fdb")
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
        SoftRequirement other = (SoftRequirement) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link GeneralClass}. 
     * @return the GeneralClass represented by this proxy, never null.
     */
    @objid ("f7fe193a-235c-48be-999f-73cb257d51a8")
    @Override
    public GeneralClass getElement() {
        return (GeneralClass)super.getElement();
    }

    /**
     * Getter for string property 'priority'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("a1c9d82d-5d4f-4b6d-9896-ae0b010ebb24")
    public String getPriority() {
        return this.elt.getTagValue(SoftRequirement.MdaTypes.PRIORITY_TAGTYPE_ELT);
    }

    @objid ("900babda-78ae-40c8-b06f-16c89c040e20")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'priority'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("19468414-324a-4bcb-98b7-556bbfd47985")
    public void setPriority(final String value) {
        this.elt.putTagValue(SoftRequirement.MdaTypes.PRIORITY_TAGTYPE_ELT, value);
    }

    @objid ("89463c9e-dfc1-46ef-afa1-0480adb398bd")
    protected SoftRequirement(final GeneralClass elt) {
        super(elt);
    }

    @objid ("e11f1b31-a2cb-4b0a-a55c-c134d2473491")
    public static final class MdaTypes {
        @objid ("1a47dd71-42aa-4dba-b7ba-e15b50121263")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("20ba2f24-50cd-434d-bdc0-1d6332a9c813")
        public static TagType PRIORITY_TAGTYPE_ELT;

        @objid ("f4818a64-a926-447d-bf1a-04dd4aeac6be")
        private static Stereotype MDAASSOCDEP;

        @objid ("19767db0-8265-4dab-94d1-1b2770e5d641")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c306971a-bfd9-47eb-9ee9-46a3d0edfef7")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "fc1abdeb-e2fa-4a04-9253-4e15a223bce2");
            PRIORITY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1f38e006-1584-4036-8ddc-f39a5b607306");
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
