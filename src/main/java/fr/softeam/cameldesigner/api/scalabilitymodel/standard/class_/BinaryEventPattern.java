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
 * Proxy class to handle a {@link Class} with << BinaryEventPattern >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("ad7c68b1-eb50-4553-a484-26d3118af425")
public class BinaryEventPattern extends EventPattern {
    @objid ("01c428c1-6a58-4c15-9f71-f6a201abe311")
    public static final String STEREOTYPE_NAME = "BinaryEventPattern";

    @objid ("a613f881-8be0-4489-b0de-dcc26bc6778d")
    public static final String LOWEROCCURRENCEBOUND_TAGTYPE = "lowerOccurrenceBound";

    @objid ("d6f183ea-6ac1-415b-b42d-1f167c0edee3")
    public static final String OPERATOR_TAGTYPE = "operator";

    @objid ("27d76af6-653f-4e7c-bcf8-96c4db72dfb8")
    public static final String UPPEROCCURRENCEBOUND_TAGTYPE = "upperOccurrenceBound";

    /**
     * Tells whether a {@link BinaryEventPattern proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << BinaryEventPattern >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("5c66a8bc-67c6-4d2f-ba43-e8dbe4766375")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, BinaryEventPattern.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << BinaryEventPattern >> then instantiate a {@link BinaryEventPattern} proxy.
     * 
     * @return a {@link BinaryEventPattern} proxy on the created {@link Class}.
     */
    @objid ("7c1cc115-2cf2-426e-9579-42068623698c")
    public static BinaryEventPattern create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, BinaryEventPattern.STEREOTYPE_NAME);
        return BinaryEventPattern.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link BinaryEventPattern} proxy from a {@link Class} stereotyped << BinaryEventPattern >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link BinaryEventPattern} proxy or <i>null</i>.
     */
    @objid ("d8909a31-00e2-48e8-be54-de5f8eabc9f3")
    public static BinaryEventPattern instantiate(final Class obj) {
        return BinaryEventPattern.canInstantiate(obj) ? new BinaryEventPattern(obj) : null;
    }

    /**
     * Tries to instantiate a {@link BinaryEventPattern} proxy from a {@link Class} stereotyped << BinaryEventPattern >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link BinaryEventPattern} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("28ce99d6-78fb-493d-b746-0b9dd6926d2b")
    public static BinaryEventPattern safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (BinaryEventPattern.canInstantiate(obj))
        	return new BinaryEventPattern(obj);
        else
        	throw new IllegalArgumentException("BinaryEventPattern: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("e1654bd4-42c4-4086-9470-9c50c1addc57")
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
        BinaryEventPattern other = (BinaryEventPattern) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("3a1c7474-0435-4208-b603-bbae71a99da5")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'lowerOccurrenceBound'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("8e57a0e7-04d2-41f3-94ae-0235fca6a17d")
    public String getLowerOccurrenceBound() {
        return this.elt.getTagValue(BinaryEventPattern.MdaTypes.LOWEROCCURRENCEBOUND_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'operator'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("fcafadf1-9574-414c-9519-108306004465")
    public String getOperator() {
        return this.elt.getTagValue(BinaryEventPattern.MdaTypes.OPERATOR_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'upperOccurrenceBound'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("69f0b645-7b84-46ae-94eb-93cba4660c40")
    public String getUpperOccurrenceBound() {
        return this.elt.getTagValue(BinaryEventPattern.MdaTypes.UPPEROCCURRENCEBOUND_TAGTYPE_ELT);
    }

    @objid ("db5a0408-c9f5-4cab-a9a0-1939aa21077e")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'lowerOccurrenceBound'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("13f3d760-730f-4126-817b-fab79de4f6bb")
    public void setLowerOccurrenceBound(final String value) {
        this.elt.putTagValue(BinaryEventPattern.MdaTypes.LOWEROCCURRENCEBOUND_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'operator'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("6e014d89-7423-4088-8d04-84aaedda7af4")
    public void setOperator(final String value) {
        this.elt.putTagValue(BinaryEventPattern.MdaTypes.OPERATOR_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'upperOccurrenceBound'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("faa8cf96-2e6d-452c-a6cc-d25fdf094bb4")
    public void setUpperOccurrenceBound(final String value) {
        this.elt.putTagValue(BinaryEventPattern.MdaTypes.UPPEROCCURRENCEBOUND_TAGTYPE_ELT, value);
    }

    @objid ("0c5301ae-99b9-4f0d-b521-ec7aef288cc7")
    protected BinaryEventPattern(final Class elt) {
        super(elt);
    }

    @objid ("557dc2d3-3a32-40be-a1c9-31aad96680de")
    public static final class MdaTypes {
        @objid ("e72cc3dd-4bd7-48d1-9893-273958b1d886")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f48c5221-9fc8-4033-a39d-6bb8f33a73b4")
        public static TagType LOWEROCCURRENCEBOUND_TAGTYPE_ELT;

        @objid ("19757d5b-f21c-4afe-99f1-1b59dbbc9b1b")
        public static TagType UPPEROCCURRENCEBOUND_TAGTYPE_ELT;

        @objid ("c38644f5-6532-45a7-8924-27f8a855ad7b")
        public static TagType OPERATOR_TAGTYPE_ELT;

        @objid ("28fc8961-b5f9-45c9-8b4f-ff144b792716")
        private static Stereotype MDAASSOCDEP;

        @objid ("74fa74eb-d540-4a7c-b102-4ff472732d4a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6d227811-7944-4659-9c94-7c591fb2de58")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "af833114-4bf1-4889-8ad0-621bb63e44c6");
            LOWEROCCURRENCEBOUND_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "93e3f728-14c6-4561-9b94-3abf79c5863c");
            UPPEROCCURRENCEBOUND_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "617103f2-a083-48d1-9655-6e2384b75bd6");
            OPERATOR_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "759de975-2a14-4a02-af62-115d703de355");
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
