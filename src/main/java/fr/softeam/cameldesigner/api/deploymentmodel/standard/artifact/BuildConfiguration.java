/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.00

 * This file was generated on 12/10/20 11:37 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact;

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
import org.modelio.metamodel.uml.statik.Artifact;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Artifact} with << BuildConfiguration >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("31fa8681-d65e-4083-b411-1e6026f8e582")
public class BuildConfiguration extends Feature {
    @objid ("82a21a92-657b-4449-b16a-5f7c684dcf8e")
    public static final String STEREOTYPE_NAME = "BuildConfiguration";

    @objid ("d9de478c-2077-4476-92e0-a83b49195f43")
    public static final String ARTIFACTID_TAGTYPE = "artifactId";

    @objid ("6f4865cb-7b22-4584-b966-9b264a6bfef6")
    public static final String BUILDFRAMEWORK_TAGTYPE = "buildFramework";

    @objid ("8207a2d9-c3d5-4b96-b473-5b9f72b1883c")
    public static final String EXCLUDE_TAGTYPE = "exclude";

    @objid ("38f6f555-ab8b-417b-84b0-66d55e714b04")
    public static final String INCLUDE_TAGTYPE = "include";

    @objid ("416bc27f-cd2c-4020-a6a6-7e8d9116f425")
    public static final String SOURCECODEURL_TAGTYPE = "sourceCodeURL";

    /**
     * Tells whether a {@link BuildConfiguration proxy} can be instantiated from a {@link MObject} checking it is a {@link Artifact} stereotyped << BuildConfiguration >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("f9b45b27-fe70-45d5-aa3e-44d2a5b0733d")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Artifact) && ((Artifact) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, BuildConfiguration.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Artifact} stereotyped << BuildConfiguration >> then instantiate a {@link BuildConfiguration} proxy.
     * 
     * @return a {@link BuildConfiguration} proxy on the created {@link Artifact}.
     */
    @objid ("cd51d2f8-b05d-47d1-b029-33de53b41b20")
    public static BuildConfiguration create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Artifact");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, BuildConfiguration.STEREOTYPE_NAME);
        return BuildConfiguration.instantiate((Artifact)e);
    }

    /**
     * Tries to instantiate a {@link BuildConfiguration} proxy from a {@link Artifact} stereotyped << BuildConfiguration >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Artifact
     * @return a {@link BuildConfiguration} proxy or <i>null</i>.
     */
    @objid ("e0aa5b55-a981-42cd-8621-9c2aac9cf780")
    public static BuildConfiguration instantiate(final Artifact obj) {
        return BuildConfiguration.canInstantiate(obj) ? new BuildConfiguration(obj) : null;
    }

    /**
     * Tries to instantiate a {@link BuildConfiguration} proxy from a {@link Artifact} stereotyped << BuildConfiguration >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Artifact}
     * @return a {@link BuildConfiguration} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("c5072fed-bbb0-4049-b4d4-a00cd9b50302")
    public static BuildConfiguration safeInstantiate(final Artifact obj) throws IllegalArgumentException {
        if (BuildConfiguration.canInstantiate(obj))
        	return new BuildConfiguration(obj);
        else
        	throw new IllegalArgumentException("BuildConfiguration: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("64c018ce-f66d-478c-a453-955c06ee7d15")
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
        BuildConfiguration other = (BuildConfiguration) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for string property 'artifactId'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("c5d8763d-6424-4ef6-a0db-38c44f6843b4")
    public String getArtifactId() {
        return this.elt.getTagValue(BuildConfiguration.MdaTypes.ARTIFACTID_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'buildFramework'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("9e798999-6cb2-433f-afbe-9ca8882053a8")
    public String getBuildFramework() {
        return this.elt.getTagValue(BuildConfiguration.MdaTypes.BUILDFRAMEWORK_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Artifact}. 
     * @return the Artifact represented by this proxy, never null.
     */
    @objid ("8338d003-2271-4112-bc70-cee61a8f92cb")
    @Override
    public Artifact getElement() {
        return (Artifact)super.getElement();
    }

    /**
     * Getter for string property 'exclude'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("2ef55966-486f-4b99-8b27-0e196ab9c703")
    public String getExclude() {
        return this.elt.getTagValue(BuildConfiguration.MdaTypes.EXCLUDE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'include'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("d6e8cac9-20a5-4fc6-b389-e9e2496b8777")
    public String getInclude() {
        return this.elt.getTagValue(BuildConfiguration.MdaTypes.INCLUDE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'sourceCodeURL'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("bd6b4d15-16ac-480d-9741-a6289de2df98")
    public String getSourceCodeURL() {
        return this.elt.getTagValue(BuildConfiguration.MdaTypes.SOURCECODEURL_TAGTYPE_ELT);
    }

    @objid ("b79f1f21-eda2-43d6-afb5-bc1584671296")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'artifactId'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("f6e34d56-9aa1-4a1f-8aab-cfb7bfc2d2f0")
    public void setArtifactId(final String value) {
        this.elt.putTagValue(BuildConfiguration.MdaTypes.ARTIFACTID_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'buildFramework'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("aa885d94-5f21-4389-ac13-bc61640ed750")
    public void setBuildFramework(final String value) {
        this.elt.putTagValue(BuildConfiguration.MdaTypes.BUILDFRAMEWORK_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'exclude'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("7c6f7698-1c80-46e2-bf18-c9776ae91181")
    public void setExclude(final String value) {
        this.elt.putTagValue(BuildConfiguration.MdaTypes.EXCLUDE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'include'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("e0eb416b-dc10-4e13-b390-a4cb4f21c8df")
    public void setInclude(final String value) {
        this.elt.putTagValue(BuildConfiguration.MdaTypes.INCLUDE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'sourceCodeURL'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("092e928c-d230-4fd0-b75e-f358b964c3e6")
    public void setSourceCodeURL(final String value) {
        this.elt.putTagValue(BuildConfiguration.MdaTypes.SOURCECODEURL_TAGTYPE_ELT, value);
    }

    @objid ("baea54c7-bad7-4439-b5a5-f34b45ffe906")
    protected BuildConfiguration(final Artifact elt) {
        super(elt);
    }

    @objid ("5c80b392-068d-47de-a15f-f92421a05377")
    public static final class MdaTypes {
        @objid ("b22a8211-649f-49c8-9cbe-1db1d2cf632b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("bb509161-7c51-48a7-b5bb-6f94f0afb3ca")
        public static TagType ARTIFACTID_TAGTYPE_ELT;

        @objid ("5be779c7-2a55-4215-816d-14a0b8ab9ede")
        public static TagType BUILDFRAMEWORK_TAGTYPE_ELT;

        @objid ("36ffaa86-705f-45c1-913c-93db96a84e22")
        public static TagType SOURCECODEURL_TAGTYPE_ELT;

        @objid ("bc22814f-6b29-4cb5-a025-fa69d11a93d0")
        public static TagType INCLUDE_TAGTYPE_ELT;

        @objid ("998a25a4-e061-4e6a-a550-6b286bb6d1e1")
        public static TagType EXCLUDE_TAGTYPE_ELT;

        @objid ("43d9a608-a1ed-4639-83a3-fd6eff59a489")
        private static Stereotype MDAASSOCDEP;

        @objid ("7df34108-18c8-4810-b7ee-c26fc9832865")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("7e44f545-e3db-4848-b543-4e74645ff950")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "72bbf7a5-04d3-40d1-8b20-3489ec93b45a");
            ARTIFACTID_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "95dcdeef-f3a8-4b72-8658-7469cc386bd1");
            BUILDFRAMEWORK_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "a7f87bab-5a8f-4554-a8c7-ce21e172ce96");
            SOURCECODEURL_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "8bf57c83-b62d-4d66-b368-95557d32e7d8");
            INCLUDE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "97e74456-ac43-4bcf-9226-fbd06b5aaf8b");
            EXCLUDE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d3625030-f18b-4e0d-a94f-238b134a7f67");
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
