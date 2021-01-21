/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.00

 * This file was generated on 12/10/20 11:37 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram;

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
import org.modelio.metamodel.diagrams.ClassDiagram;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link ClassDiagram} with << MetricModelDiagram >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("81ac3cd7-8152-40ff-a197-efdeebea3e78")
public class MetricModelDiagram extends AbstractCamelDiagram {
    @objid ("acb663e3-15a1-41a1-a679-47a27e96e386")
    public static final String STEREOTYPE_NAME = "MetricModelDiagram";

    /**
     * Tells whether a {@link MetricModelDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link ClassDiagram} stereotyped << MetricModelDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("adc89867-553a-4d77-af5b-dc20deb1ec41")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ClassDiagram) && ((ClassDiagram) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MetricModelDiagram.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ClassDiagram} stereotyped << MetricModelDiagram >> then instantiate a {@link MetricModelDiagram} proxy.
     * 
     * @return a {@link MetricModelDiagram} proxy on the created {@link ClassDiagram}.
     */
    @objid ("57bec1d8-db90-4141-9d38-e8cfdee62fcf")
    public static MetricModelDiagram create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.ClassDiagram");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, MetricModelDiagram.STEREOTYPE_NAME);
        return MetricModelDiagram.instantiate((ClassDiagram)e);
    }

    /**
     * Tries to instantiate a {@link MetricModelDiagram} proxy from a {@link ClassDiagram} stereotyped << MetricModelDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ClassDiagram
     * @return a {@link MetricModelDiagram} proxy or <i>null</i>.
     */
    @objid ("ea8623a9-5ef1-45f5-bd6b-f038b87c4626")
    public static MetricModelDiagram instantiate(final ClassDiagram obj) {
        return MetricModelDiagram.canInstantiate(obj) ? new MetricModelDiagram(obj) : null;
    }

    /**
     * Tries to instantiate a {@link MetricModelDiagram} proxy from a {@link ClassDiagram} stereotyped << MetricModelDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ClassDiagram}
     * @return a {@link MetricModelDiagram} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("2b711b29-e33e-4198-a957-29bc0a2cee0e")
    public static MetricModelDiagram safeInstantiate(final ClassDiagram obj) throws IllegalArgumentException {
        if (MetricModelDiagram.canInstantiate(obj))
        	return new MetricModelDiagram(obj);
        else
        	throw new IllegalArgumentException("MetricModelDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("6ee3e168-ce4f-490d-a961-2177bdbc81d4")
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
        MetricModelDiagram other = (MetricModelDiagram) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ClassDiagram}. 
     * @return the ClassDiagram represented by this proxy, never null.
     */
    @objid ("1666be51-4063-4fab-a44b-d5617e7823c8")
    @Override
    public ClassDiagram getElement() {
        return (ClassDiagram)super.getElement();
    }

    @objid ("f66343d3-9942-457e-9826-ec165383a1a0")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("e9ffd0f0-deb0-4322-9962-05a17c950aeb")
    protected MetricModelDiagram(final ClassDiagram elt) {
        super(elt);
    }

    @objid ("6ae7d73a-b368-4659-bddf-37a608de833c")
    public static final class MdaTypes {
        @objid ("210a61e3-c57b-4eef-adb4-55a768c921e1")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("37215af5-56bd-4921-89e1-8d7a66f8696d")
        private static Stereotype MDAASSOCDEP;

        @objid ("c7026dcd-d87c-472d-a360-98336fa0864c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("3b7bd039-b968-41c1-ad45-752e0ce6c824")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "41062298-9e86-4073-b4a8-713719cfcf90");
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
