/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.00

 * This file was generated on 12/10/20 11:37 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.metricmodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.Feature;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricTemplate;
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
 * Proxy class to handle a {@link Class} with << Metric >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("b0754957-bc68-473c-a808-aac4f2fd0421")
public abstract class Metric extends Feature {
    @objid ("b29cd73f-310c-46bb-b481-310a86b9dc93")
    public static final String STEREOTYPE_NAME = "Metric";

    @objid ("9d372f2d-92bd-4d8b-b512-bb5673199235")
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
        Metric other = (Metric) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("d20abb71-8611-4a76-9444-16b8c64bfd62")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Get the value of the 'metricTemplate' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("56f02193-f5b8-4a14-89de-790cafa06171")
    public MetricTemplate getMetricTemplate() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(Metric.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(Metric.MdaTypes.MDAASSOCDEP_ROLE), "metricTemplate")
                  && MetricTemplate.canInstantiate(d.getDependsOn())) {
                     return (MetricTemplate)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MetricTemplate.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    @objid ("31eeee35-872d-45e3-8577-214a71eb2db5")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'metricTemplate' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("1c1ceb05-ec75-4f8f-b9cc-62525d0cfba9")
    public void setMetricTemplate(final MetricTemplate obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(Metric.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(Metric.MdaTypes.MDAASSOCDEP_ROLE), "metricTemplate")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), Metric.MdaTypes.MDAASSOCDEP);
              dep.setName("metricTemplate");      dep.putTagValue(Metric.MdaTypes.MDAASSOCDEP_ROLE, "metricTemplate");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    @objid ("89c8d101-a8bb-4792-b2a5-75a81aa6a424")
    protected Metric(final Class elt) {
        super(elt);
    }

    @objid ("7453f2c0-0edc-453a-bbfc-bbc62bf7a06d")
    public static final class MdaTypes {
        @objid ("64d1736a-43b5-4b72-961f-4ef36f3b21fb")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("8aab6072-3f4d-484d-98de-c3f451b8f918")
        private static Stereotype MDAASSOCDEP;

        @objid ("fef5c5b8-a17d-4e72-9a10-defd755ea3c1")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("9ca95b79-9962-47ca-8cae-df57cff34b03")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "1603af9c-7b21-4da2-96b7-6607aa8066cc");
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
