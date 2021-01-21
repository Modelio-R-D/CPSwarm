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
 * Proxy class to handle a {@link Class} with << SingleEvent >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("b740d58f-0acd-4aba-bdc8-6394a8467e6c")
public abstract class SingleEvent extends Event {
    @objid ("a6ab46a9-48a5-4b64-ae70-9e56f97d8c20")
    public static final String STEREOTYPE_NAME = "SingleEvent";

    @objid ("202ac560-4839-4587-8de9-91462b4a2103")
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
        SingleEvent other = (SingleEvent) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("cc055fc8-836d-4f70-991a-4122da3dedfd")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("ba53e88d-6eb5-44bb-86fc-7141ae9c551a")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("6db68abb-62c5-42d0-a021-f32a787c64cf")
    protected SingleEvent(final Class elt) {
        super(elt);
    }

    @objid ("4e5c23d4-7cb6-45fd-804e-c2745676a29b")
    public static final class MdaTypes {
        @objid ("02af692d-d86c-40c0-87e9-db85937c697b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("3f8b0120-4bea-42b2-bf70-2d6aae63dc81")
        private static Stereotype MDAASSOCDEP;

        @objid ("b223186c-a734-4c96-bac0-fe1fdf7d5ea7")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("237b0bc7-ca21-4a58-a241-c664d2398b46")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "40acd9bb-daad-41f6-96cd-d9267430eabf");
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
