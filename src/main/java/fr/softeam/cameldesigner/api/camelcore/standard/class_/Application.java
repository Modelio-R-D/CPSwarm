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
 * Proxy class to handle a {@link Class} with << Application >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("97e6f375-0f57-43fd-9ece-52aadc88d164")
public class Application extends Feature {
    @objid ("5a6c8d5a-4e64-4029-a450-747c0fd0ffd0")
    public static final String STEREOTYPE_NAME = "Application";

    @objid ("93d24799-7eba-410b-a3f9-88e908293e6b")
    public static final String VERSION_TAGTYPE = "version";

    /**
     * Tells whether a {@link Application proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Application >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("a2dc0c7e-b57f-4c9e-a151-f40fde6075f3")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Application.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << Application >> then instantiate a {@link Application} proxy.
     * 
     * @return a {@link Application} proxy on the created {@link Class}.
     */
    @objid ("32f194ac-b84f-4f45-8f44-6316b1b723fd")
    public static Application create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, Application.STEREOTYPE_NAME);
        return Application.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link Application} proxy from a {@link Class} stereotyped << Application >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link Application} proxy or <i>null</i>.
     */
    @objid ("57c60b60-161d-4bf0-a0a3-df7d44c7df4b")
    public static Application instantiate(final Class obj) {
        return Application.canInstantiate(obj) ? new Application(obj) : null;
    }

    /**
     * Tries to instantiate a {@link Application} proxy from a {@link Class} stereotyped << Application >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link Application} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("d8b90e47-1832-4efb-88c9-c6c32df65075")
    public static Application safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (Application.canInstantiate(obj))
        	return new Application(obj);
        else
        	throw new IllegalArgumentException("Application: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("b56cc901-158d-4078-befc-46b3ecd02f35")
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
        Application other = (Application) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("0ccfc654-c2d4-4432-a8ce-0037f772db3f")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'version'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("adcb6670-c022-440c-9cd8-431d2880c049")
    public String getVersion() {
        return this.elt.getTagValue(Application.MdaTypes.VERSION_TAGTYPE_ELT);
    }

    @objid ("90f69c85-d651-44f0-abf4-98a7be7af067")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'version'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("8a0d3330-8320-4e41-9725-a920c861d9d0")
    public void setVersion(final String value) {
        this.elt.putTagValue(Application.MdaTypes.VERSION_TAGTYPE_ELT, value);
    }

    @objid ("351bb060-397a-4f66-86e3-2d590453e020")
    protected Application(final Class elt) {
        super(elt);
    }

    @objid ("492bb2a5-5506-4a52-bc31-f5fb67155b50")
    public static final class MdaTypes {
        @objid ("348dd359-21e0-4d56-bd89-fa4c8c896466")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("8fe8e129-6806-4779-8aed-b87dd15d625a")
        public static TagType VERSION_TAGTYPE_ELT;

        @objid ("91f1577e-90e2-4712-9ede-ffb654a02e41")
        private static Stereotype MDAASSOCDEP;

        @objid ("fbb6e234-35e0-46a2-907f-327db138a2eb")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a6bc55e0-1759-418b-9c65-63be6b3d8256")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "46979e9e-2d44-4099-afdf-62d13a0b1d25");
            VERSION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "a33973d1-0249-418d-b3fd-1ccbbe910d72");
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
