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
 * Proxy class to handle a {@link ClassDiagram} with << AbstractCamelDiagram >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("6bdaebda-7701-4743-a8e3-51e9d10ac891")
public abstract class AbstractCamelDiagram {
    @objid ("59efecba-3a03-42b6-a6cc-8b74a018f51b")
    public static final String STEREOTYPE_NAME = "AbstractCamelDiagram";

    /**
     * The underlying {@link ClassDiagram} represented by this proxy, never null.
     */
    @objid ("08227f07-0d8f-47f4-a7c5-88f6ca2bdb56")
    protected final ClassDiagram elt;

    @objid ("8958480a-accb-407e-ae38-b49e400e0cd8")
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
        AbstractCamelDiagram other = (AbstractCamelDiagram) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ClassDiagram}. 
     * @return the ClassDiagram represented by this proxy, never null.
     */
    @objid ("ca88dcdd-9f2c-481c-8463-bc5ce3b272c5")
    public ClassDiagram getElement() {
        return this.elt;
    }

    @objid ("71f0ac83-0391-4d0c-b719-bbf3a7efb726")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("5d81ec19-b250-4085-a4e1-115947bbc19b")
    protected AbstractCamelDiagram(final ClassDiagram elt) {
        this.elt = elt;
    }

    @objid ("96cdd4aa-6ccf-4f23-a3d7-5aaaba7243d3")
    public static final class MdaTypes {
        @objid ("baa9c38e-9a9e-402c-8874-19ee1302ca78")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("89ecedb2-5240-4e28-892b-4237425ccae7")
        private static Stereotype MDAASSOCDEP;

        @objid ("c1d6c6c4-454d-42c1-b652-5a43c8d847a5")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("01f872e7-1706-43ff-a16d-f7e0e4118c83")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "c147d6d3-8bd0-4b94-a9d6-164a947fa0b4");
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
