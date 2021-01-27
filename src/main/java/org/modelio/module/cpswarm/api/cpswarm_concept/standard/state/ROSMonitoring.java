/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CPSwarm v3.9.03

 * This file was generated on 4/15/20 8:10 AM by Modelio Studio.
 */
package org.modelio.module.cpswarm.api.cpswarm_concept.standard.state;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.stateMachineModel.State;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.module.cpswarm.api.CPSwarmProxyFactory;
import org.modelio.module.cpswarm.api.ICPSwarmPeerModule;
import org.modelio.module.cpswarm.api.cpswarm_concept.standard.datatype.Msg;
import org.modelio.module.cpswarm.api.cpswarm_concept.standard.package_.Topic;
import org.modelio.module.cpswarm.impl.CPSwarmModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link State} with << ROSMonitoring >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
public class ROSMonitoring {
    public static final String STEREOTYPE_NAME = "ROSMonitoring";

    /**
     * The underlying {@link State} represented by this proxy, never null.
     */
    protected final State elt;

    /**
     * Tells whether a {@link ROSMonitoring proxy} can be instantiated from a {@link MObject} checking it is a {@link State} stereotyped << ROSMonitoring >>.
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof State) && ((State) elt).isStereotyped(ICPSwarmPeerModule.MODULE_NAME, ROSMonitoring.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link State} stereotyped << ROSMonitoring >> then instantiate a {@link ROSMonitoring} proxy.
     * 
     * @return a {@link ROSMonitoring} proxy on the created {@link State}.
     */
    public static ROSMonitoring create() {
        ModelElement e = (ModelElement)CPSwarmModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("State");
        e.addStereotype(ICPSwarmPeerModule.MODULE_NAME, ROSMonitoring.STEREOTYPE_NAME);
        return ROSMonitoring.instantiate((State)e);
    }

    /**
     * Tries to instantiate a {@link ROSMonitoring} proxy from a {@link State} stereotyped << ROSMonitoring >>checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a State
     * @return a {@link ROSMonitoring} proxy or <i>null</i>.
     */
    public static ROSMonitoring instantiate(final State obj) {
        return ROSMonitoring.canInstantiate(obj) ? new ROSMonitoring(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ROSMonitoring} proxy from a {@link State} stereotyped << ROSMonitoring >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link State}
     * @return a {@link ROSMonitoring} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static ROSMonitoring safeInstantiate(final State obj) throws IllegalArgumentException {
        if (ROSMonitoring.canInstantiate(obj))
            return new ROSMonitoring(obj);
        else
            throw new IllegalArgumentException("ROSMonitoring: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

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
        ROSMonitoring other = (ROSMonitoring) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link State}.
     * 
     * @return the State represented by this proxy, never null.
     */
    public State getElement() {
        return this.elt;
    }

    /**
     * Get the value of the 'msg' role.<p>
     * Role description:
     * null
     */
    public Msg getMsg() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(ROSMonitoring.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(ROSMonitoring.MdaTypes.MDAASSOCDEP_ROLE), "msg")
                  && Msg.class.isInstance(d.getDependsOn())) {
                      return (Msg)d.getDependsOn();
              }
        }
        return null;
    }

    /**
     * Get the value of the 'topic' role.<p>
     * Role description:
     * null
     */
    public Topic getTopic() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(ROSMonitoring.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(ROSMonitoring.MdaTypes.MDAASSOCDEP_ROLE), "topic")
                  && Topic.class.isInstance(d.getDependsOn())) {
                      return (Topic)d.getDependsOn();
              }
        }
        return null;
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'msg' role.<p>
     * Role description:
     * null
     */
    public void setMsg(final Msg obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(ROSMonitoring.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(ROSMonitoring.MdaTypes.MDAASSOCDEP_ROLE), "msg")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CPSwarmModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), ROSMonitoring.MdaTypes.MDAASSOCDEP);
              dep.putTagValue(ROSMonitoring.MdaTypes.MDAASSOCDEP_ROLE, "msg");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Set the value of the 'topic' role.<p>
     * Role description:
     * null
     */
    public void setTopic(final Topic obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(ROSMonitoring.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(ROSMonitoring.MdaTypes.MDAASSOCDEP_ROLE), "topic")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CPSwarmModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), ROSMonitoring.MdaTypes.MDAASSOCDEP);
              dep.putTagValue(ROSMonitoring.MdaTypes.MDAASSOCDEP_ROLE, "topic");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    protected ROSMonitoring(final State elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "9d48fdd3-fa47-4913-a877-0352effb9438");
            MDAASSOCDEP = ctx.getModelingSession().findElementById(Stereotype.class, "94b7efa5-f94c-4d1d-896f-f103e56a8e2e");
            MDAASSOCDEP_ROLE = ctx.getModelingSession().findElementById(TagType.class, "7637f2fd-b750-43c1-a15c-5d0b084ca1cd");
        }


static {
        if(CPSwarmModule.getInstance() != null) {
            init(CPSwarmModule.getInstance().getModuleContext());
        }
    }
    }

}
