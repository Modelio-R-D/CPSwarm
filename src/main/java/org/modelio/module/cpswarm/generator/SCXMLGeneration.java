package org.modelio.module.cpswarm.generator;

import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Event;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Signal;
import org.modelio.metamodel.uml.behavior.stateMachineModel.FinalState;
import org.modelio.metamodel.uml.behavior.stateMachineModel.ForkPseudoState;
import org.modelio.metamodel.uml.behavior.stateMachineModel.InternalTransition;
import org.modelio.metamodel.uml.behavior.stateMachineModel.JoinPseudoState;
import org.modelio.metamodel.uml.behavior.stateMachineModel.State;
import org.modelio.metamodel.uml.behavior.stateMachineModel.StateMachine;
import org.modelio.metamodel.uml.behavior.stateMachineModel.StateVertex;
import org.modelio.metamodel.uml.behavior.stateMachineModel.Transition;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.Interface;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.module.cpswarm.api.cpswarm_concept.standard.internaltransition.Mapped;
import org.modelio.module.cpswarm.impl.CPSwarmPeerModule;
import org.modelio.module.cpswarm.utils.FileUtils;
import org.modelio.module.cpswarm.utils.ModelUtils;

public class SCXMLGeneration extends Generator implements IGenerator {
    private StateMachine _sm = null;

    private Set<StateVertex> _generatedState = new LinkedHashSet<>();

    private StateVertex _initial = null;

    @Override
    public void generate() {
        //Update the string Buffer
        headerSCXML();
        generateStateVertex(this._initial);
        footerSCXML();
        
        //Write the file
        if (this.file != null) {
            FileUtils.write(this.file, this.content);
        }
    }

    private void generateDefaultState(State state) {
        String stateName = state.getName();
        if (ModelUtils.isParallel(state)) {
            stateName += "Behavior";
        }
        addLine("<state id= \"" + stateName + "\">");
        increaseIndent();
        
        if ((state.getInternal().size() > 0) && (state.getInternal().get(0).getProcessed() != null)){
            InternalTransition transition = state.getInternal().get(0);
            Operation op = transition.getProcessed();
            generateAction(op, transition);
        }else if (state.getSubMachine() != null){
            generateSubState(state);
        }
        
        // generate Transition
        List<StateVertex> togenerate = new ArrayList<>();
        for(Transition trans : state.getOutGoing()){
            StateVertex target = trans.getTarget();
            if ((target instanceof State)
                    && ((trans.getTrigger() == null) || (trans.getTrigger().getModel() == null))) {
                generateTransition(trans);
        
                if (!(this._generatedState.contains(target))) {
                    togenerate.add(target);
                }
            }
        }
        
        decreaseIndent();
        addLine("</state>");
        
        for (StateVertex target : togenerate) {
            generateStateVertex(target);
        }
    }

    private void generateActionDataModel(Operation op, InternalTransition trans) {
        addLine("<datamodel>");
        increaseIndent();
        addLine("<data id=\"invoke\">");
        increaseIndent();
        addLine("<rosaction>");
        increaseIndent();
        generateAction(op, trans);
        decreaseIndent();
        addLine("</rosaction>");
        decreaseIndent();
        addLine("</data>");
        decreaseIndent();
        addLine("</datamodel>");
        addLine("<invoke type=\"ROS_ACTION\" />");
    }

    private void generateMonitorDataModel(String topic, String msg) {
        addLine("<datamodel>");
        increaseIndent();
        addLine("<data id=\"invoke\">");
        increaseIndent();
        addLine("<rosmonitor>");
        increaseIndent();
        addLine("<topic>" + topic + "</topic>");
        addLine("<msg>" + msg + "</msg>");
        decreaseIndent();
        addLine("</rosmonitor>");
        decreaseIndent();
        addLine("</data>");
        decreaseIndent();
        addLine("</datamodel>");
        addLine("<invoke type=\"ROS_MONITOR\" />");
    }

    private void generateService(Operation state) {
        String service = "";
        
        addLine("<datamodel>");
        increaseIndent();
        addLine("<data id=\"invoke\">");
        increaseIndent();
        addLine("<rosservice>");
        increaseIndent();
        addLine(service);
        decreaseIndent();
        addLine("</rosservice>");
        decreaseIndent();
        addLine("</data>");
        decreaseIndent();
        addLine("</datamodel>");
        addLine("<invoke type=\"ROS_SERVICE\" />");
    }

    private void generateTransition(Transition trans) {
        StateVertex target = trans.getTarget();
        
        if  ((target != null ) && (!(target instanceof FinalState))) {
        
            String eventName = "";
            Event trigger = trans.getTrigger();
            if (trigger == null) {
                eventName = trans.getEffect();
            }else {
                eventName = trigger.getName().toLowerCase();
            }
        
            if (eventName.equals("")) {
                eventName = "succeeded";
            }
        
            String targetName = getStateName(target);
        
            addLine(" <transition event=\"" + eventName + "\" target=\"" + targetName +"\"/>");
        }
    }

    private void footerSCXML() {
        decreaseIndent();
        addLine("</scxml>");
    }

    private void headerSCXML() {
        String initName = this._initial.getName();
        if (ModelUtils.isParallel(this._initial)) {
            initName += "Threads";
        }
        
        addLine("<scxml xmlns=\"http://www.w3.org/2005/07/scxml\" "
                + "xmlns:CPSwarm=\"http://my.custom-actions.domain/CPSwarm/CUSTOM\" "
                + "version=\"1.0\" "
                + "initial=\"" + initName + "\" "
                + "name=\"" + this._sm.getName() + "\">");
        increaseIndent();
    }

    public SCXMLGeneration(StateMachine sm, File file) {
        this._sm = sm;
        this._initial = ModelUtils.getInitialNode(sm);
        this.file = file;
    }

    private void generateStateVertex(StateVertex stateVertex) {
        if (!(this._generatedState.contains(stateVertex))) {
            this._generatedState.add(stateVertex);
            if (stateVertex instanceof FinalState) {
                //Nothing to generate
            }else if (stateVertex instanceof State) {
                State state = (State) stateVertex;
                if (ModelUtils.isParallel(state)) {
                    generateParallelState(state);
                }else {
                    generateDefaultState(state);
                }
            }else  if (stateVertex instanceof ForkPseudoState) {
                generateFork((ForkPseudoState) stateVertex);
            }else  if (stateVertex instanceof JoinPseudoState) {
                generateJoin((JoinPseudoState) stateVertex);
            }
        
        }
    }

    private void generateJoin(JoinPseudoState join) {
    }

    private void generateFork(ForkPseudoState fork) {
    }

    private void generateSubState(State state) {
        //        addLine("<state id=\"" + state.getSubMachine().getName() + "\">");
        increaseIndent();
        generateStateVertex(ModelUtils.getInitialNode(state.getSubMachine()));
        decreaseIndent();
        //        addLine("</state>");
    }

    private void generateAction(Operation op, InternalTransition trans) {
        Interface action = ModelUtils.getCommunicationModel(op);
        
        addLine("<name>" + ModelUtils.getCommunicationModelName(op) + "</name>");
        addLine("<action>" +  ModelUtils.getROSFullName(action) + "</action>");
        
        //GOALS
        List<Attribute> goals = ModelUtils.getGoals(action);
        increaseIndent();
        if (goals.size() == 0) {
            addLine("<goal type=\"empty\"/>");
        }else {
            addLine("<goal type=\"userdata\">");
            increaseIndent();
            for (Attribute goal : goals) {
                addLine("<var>" + goal.getName() + "</var>");
            }
            decreaseIndent();
            addLine("</goal>");
        }
        
        
        //RESULTS
        List<Attribute> results = ModelUtils.getResults(action);
        
        if (results.size() == 0) {
            addLine("<result type=\"empty\"/>");
        }else {
            addLine("<result type=\"userdata\">");
            increaseIndent();
            for (Attribute result : results) {
                addLine("<var>" + result.getName() + "</var>");
            }
            decreaseIndent();
            addLine("</result>");
        }
        
        //MAPPINGS
        if (trans.isStereotyped(CPSwarmPeerModule.MODULE_NAME, Mapped.STEREOTYPE_NAME)) {
            addLine("<mappings>");
            increaseIndent();
            List<String> map = Mapped.instantiate(trans).getMapping();
            for (int i = 0 ; i < map.size() ; i++) {
                addLine("<map>");
                increaseIndent();
                addLine("<x>" + results.get(i).getName() + "</x>");
                addLine("<y>" + map.get(i) + "</y>");
                decreaseIndent();
                addLine("</map>");
            }
            decreaseIndent();
            addLine("</mappings>");
            decreaseIndent();
        }
    }

    private String getStateName(StateVertex target) {
        String targetName = target.getName();
        if (ModelUtils.isParallel(target)) {
            targetName += "Threads";
        }
        return targetName;
    }

    private void generateParallelState(State state) {
        addLine("<parallel id=\"" + state.getName() + "Threads>");
        
        increaseIndent();
        
        generateDefaultState(state);
        
        List<Transition> transitions = ModelUtils.getEventMonitoring(state);
        for (Transition transition : transitions) {
            Signal model = transition.getTrigger().getModel();
        
            addLine("<state id=\"" + state.getName() + "EventMonitoring\">");
            increaseIndent();
            generateMonitorDataModel(ModelUtils.getROSTopic(model), ModelUtils.getROSMsg(model));
            decreaseIndent();
            addLine("</state>");
        }
        
        for (Transition transition : transitions) {
            addLine("<transition event=\"" + transition.getTrigger().getName() + "\" target= \""+ transition.getTarget().getName() + "\" />");
        }
        
        decreaseIndent();
        addLine("</parallel>");
        
        for (Transition trans : transitions) {
            generateStateVertex(trans.getTarget());
        }
    }

}
