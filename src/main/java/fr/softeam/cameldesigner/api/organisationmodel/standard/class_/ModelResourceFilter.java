/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.00

 * This file was generated on 12/10/20 11:37 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.organisationmodel.standard.class_;

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
 * Proxy class to handle a {@link Class} with << ModelResourceFilter >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("e21f0be0-3d22-47e8-a054-ec23ac4f1d3f")
public class ModelResourceFilter extends ResourceFilter {
    @objid ("1936d08b-9222-4a41-bb9d-e281c22a1585")
    public static final String STEREOTYPE_NAME = "ModelResourceFilter";

    @objid ("2299add9-f25b-4dc8-b093-b4fdd14b1e81")
    public static final String EVERYINFORMATIONRESOURCE_TAGTYPE = "everyInformationResource";

    @objid ("5e42b407-6d73-4aab-b227-dca25fbcacde")
    public static final String INFORMATIONRESOURCEPATH_TAGTYPE = "informationResourcePath";

    /**
     * Tells whether a {@link ModelResourceFilter proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << ModelResourceFilter >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("270261fc-2741-4b2e-83b7-621dca1d2f6b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ModelResourceFilter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << ModelResourceFilter >> then instantiate a {@link ModelResourceFilter} proxy.
     * 
     * @return a {@link ModelResourceFilter} proxy on the created {@link Class}.
     */
    @objid ("43c3052a-ccb4-437d-8615-e88f0afd3fde")
    public static ModelResourceFilter create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, ModelResourceFilter.STEREOTYPE_NAME);
        return ModelResourceFilter.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link ModelResourceFilter} proxy from a {@link Class} stereotyped << ModelResourceFilter >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link ModelResourceFilter} proxy or <i>null</i>.
     */
    @objid ("d134dd10-6564-4f75-8707-7d6e1222738d")
    public static ModelResourceFilter instantiate(final Class obj) {
        return ModelResourceFilter.canInstantiate(obj) ? new ModelResourceFilter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ModelResourceFilter} proxy from a {@link Class} stereotyped << ModelResourceFilter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link ModelResourceFilter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("5fd03c9f-6a94-4916-8f79-2aa2be853318")
    public static ModelResourceFilter safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (ModelResourceFilter.canInstantiate(obj))
        	return new ModelResourceFilter(obj);
        else
        	throw new IllegalArgumentException("ModelResourceFilter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("631de44d-097b-4acf-81d2-fb7f8e4a3c08")
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
        ModelResourceFilter other = (ModelResourceFilter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("89031c9c-30f3-4965-9c6b-3dc335b2b243")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'everyInformationResource'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("4fad1b53-baa6-44c6-a1af-f5f9c286cf26")
    public String getEveryInformationResource() {
        return this.elt.getTagValue(ModelResourceFilter.MdaTypes.EVERYINFORMATIONRESOURCE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'informationResourcePath'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("10ca1965-b7eb-4922-9db9-3e122b2a83b3")
    public String getInformationResourcePath() {
        return this.elt.getTagValue(ModelResourceFilter.MdaTypes.INFORMATIONRESOURCEPATH_TAGTYPE_ELT);
    }

    @objid ("8ae33066-eb0e-4801-9fbc-c30e9a603ddb")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'everyInformationResource'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("c43bf657-b6d0-4c2a-a2b0-020b1f4e3386")
    public void setEveryInformationResource(final String value) {
        this.elt.putTagValue(ModelResourceFilter.MdaTypes.EVERYINFORMATIONRESOURCE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'informationResourcePath'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("a3757dcc-a6a9-4396-8c4f-7c2c8858538d")
    public void setInformationResourcePath(final String value) {
        this.elt.putTagValue(ModelResourceFilter.MdaTypes.INFORMATIONRESOURCEPATH_TAGTYPE_ELT, value);
    }

    @objid ("cd321662-a0fc-49dd-9082-88d79372717f")
    protected ModelResourceFilter(final Class elt) {
        super(elt);
    }

    @objid ("bdba83c4-ef71-4797-8568-cbac9a6170f8")
    public static final class MdaTypes {
        @objid ("abeb730e-c23b-4854-afd2-c6ca8a5e3a5e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("5d6cc967-c0e3-49c8-b77d-411fbf4d0a67")
        public static TagType INFORMATIONRESOURCEPATH_TAGTYPE_ELT;

        @objid ("842755c4-5a19-4471-a1d7-16e634d7258f")
        public static TagType EVERYINFORMATIONRESOURCE_TAGTYPE_ELT;

        @objid ("ee5fcb81-1526-427e-a448-82d65480db5e")
        private static Stereotype MDAASSOCDEP;

        @objid ("9ad94bdf-a9bc-401f-a975-a252fb73d376")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("912623f1-7f5c-4927-b2c8-062baf48aaa7")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "b2deaba4-8571-4400-b47d-f0a5b91b3149");
            INFORMATIONRESOURCEPATH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cbea7d8d-42de-41a1-808c-4a3c6505d00f");
            EVERYINFORMATIONRESOURCE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "bffb0548-bcf3-4966-9260-825f28edb4db");
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
