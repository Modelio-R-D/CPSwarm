package org.modelio.module.cpswarm.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.IUmlModel;
import org.modelio.metamodel.uml.behavior.stateMachineModel.InitialPseudoState;
import org.modelio.metamodel.uml.behavior.stateMachineModel.State;
import org.modelio.metamodel.uml.behavior.stateMachineModel.StateMachine;
import org.modelio.metamodel.uml.behavior.stateMachineModel.StateVertex;
import org.modelio.metamodel.uml.behavior.stateMachineModel.Transition;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.infrastructure.TagParameter;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.TaggedValue;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.Interface;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.module.cpswarm.api.ICPSwarmPeerModule;
import org.modelio.module.cpswarm.api.cpswarm_concept.infrastructure.dependency.DepCommModel;
import org.modelio.module.cpswarm.api.cpswarm_concept.infrastructure.dependency.DepMsg;
import org.modelio.module.cpswarm.api.cpswarm_concept.infrastructure.dependency.DepTopic;
import org.modelio.module.cpswarm.api.cpswarm_concept.standard.attribute.GOAL;
import org.modelio.module.cpswarm.api.cpswarm_concept.standard.attribute.RESULT;
import org.modelio.module.cpswarm.api.cpswarm_concept.standard.package_.ROSPackage;
import org.modelio.module.cpswarm.impl.CPSwarmModule;
import org.modelio.module.cpswarm.impl.CPSwarmPeerModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * This class handle a set of utility methods for Modelio model manipulation
 * @author ebrosse
 */
public class ModelUtils {
    private static String pathSeparator = "/";

    /**
     * return the ModelElement target of the FIRST dependency stereotyped stereotypeName  owned by source element
     * 
     * @param source : the ModelElement which is the source of the dependency
     * @param stereotypeName : the stereotype name applicable on Dependency Metaclass
     * @return the ModelElement target of the first dependency
     */
    public static ModelElement getTarget(ModelElement source, String stereotypeName) {
        for(Dependency dp: source.getDependsOnDependency()){
            if(dp.isStereotyped(ICPSwarmPeerModule.MODULE_NAME,  stereotypeName)){
                ModelElement element = dp.getDependsOn();
                if(element != null){
                    return element;
                }
            }
        }
        return null;
    }

    /**
     * This method returns the list of Classifier associated (sharing an Association) to the given Association
     * 
     * @param center : the central association
     * @return the list of associated Association
     */
    public static List<Classifier> getAssociatedClassifier(final Classifier center) {
        List<Classifier> result = new ArrayList<>();
        
        for (AssociationEnd feature : center.getOwnedEnd()){
            AssociationEnd opposite = feature.getOpposite();
            Classifier owner = opposite.getOwner();
            if (!result.contains(owner))
                result.add(owner);
        }
        return result;
    }

    /**
     * This method test if the Analyst module is already deployed
     * 
     * @return true if the Analyst module is deployed
     */
    public static boolean isRequirementDeployed() {
        return true;
    }

    /**
     * Allows the tagged value getting
     * 
     * @param tagtypeName : tagged value name
     * @param element : owner element
     * @return the tagged value values in a string form
     */
    public static String getTaggedValue(final String tagtypeName, final ModelElement element) {
        for (TaggedValue tag : element.getTag()) {
            TagType type = tag.getDefinition();
            String tagname = type.getName();
            if (tagname.equals(tagtypeName)) {
                if (!tag.getActual().isEmpty()) {
                    String result = "";
                    for (TagParameter tp: tag.getActual()) {
                        if (tag.getDefinition().getParamNumber().equals("1")) {
        
                            result = tp.getValue();
                        }
                        else {
                            result = result + tp.getValue() + " ";
                        }
                    }
                    return result;
                }
            }
        }
        return "";
    }

    /**
     * Allows the tagged value values parsing to string tab
     * 
     * @param value : the tagged value
     * @return a string tab with many string values
     */
    public static String[] parseValuesToStringTab(final String value) {
        List<String> dynamicList = new ArrayList<>();
        String current = "";
        boolean hasManyElts = false;
        
        for (int i=0; i < value.length(); i++) {
            if (value.charAt(i) != ' ') {
                current = current + value.charAt(i);
        
                if ((i == value.length()-1) && (hasManyElts)) {
                    dynamicList.add(current);
                }
            }
        
            if ((value.charAt(i) == ' ')&&(!current.equals(""))) {
                dynamicList.add(current);
                current = "";
                hasManyElts = true;
            }
            else if (current.length() == value.length()) {
                dynamicList.add(current);
                current = "";
            }
        }
        
        String[] result = dynamicList.toArray(new String[dynamicList.size()]);
        return result;
    }

    /**
     * Allows the tagged value adding.
     * 
     * @param element : owner element
     * @param tagtypeName : tagged value name
     * @param value : value to add
     */
    public static void addStringValue(final ModelElement element, final String tagtypeName, final String value) {
        // DON'T place Transition HERE
        boolean exist = false;
        List<TaggedValue> tagElements = element.getTag();
        TaggedValue tvFound = null;
        TagType type = null;
        
        // existing verification
        if (!tagElements.isEmpty()) {
            for (TaggedValue tag : tagElements) {
        
                type = tag.getDefinition();
                String tagname = type.getName();
        
                if (tagname.equals(tagtypeName)) {
                    exist = true;
                    tvFound = tag;
                }
            }
        }
        
        // if the tagged value doesn't exist yet, we create this
        if (!exist) {
        
            TaggedValue v = CPSwarmModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(type, element);
            if (!v.getDefinition().getParamNumber().equals("0")) {
                setTaggedValue(element, tagtypeName, value);
            }
        
        }
        // if the tagged value already exists
        else {
            if ((tvFound!= null) && (tvFound.getDefinition().getParamNumber().equals("0"))) {
                tvFound.delete();
            }
            else {
                setTaggedValue(element, tagtypeName, value);
            }
        }
    }

    /**
     * Allows the tagged value setting
     * 
     * @param elt : owner element
     * @param tagtypeName : name of the tagtype
     * @param value : taggeValue value
     */
    public static void setTaggedValue(final ModelElement elt, final String tagtypeName, final String value) {
        // if the element has tagged values
        if (!elt.getTag().isEmpty()) {
            // for each tagged values
            for (TaggedValue tag : elt.getTag()) {
                //good tagged value getting
                if (tag.getDefinition().getName().equals(tagtypeName)) {
                    // if the parameter number is one
                    if (tag.getDefinition().getParamNumber().equals("1")) {
                        if(tag.getActual().size() != 0) {
                            tag.getActual().get(0).setValue(value);
                        }
                        else {
                            tag.getActual().add(CPSwarmModule.getInstance().getModuleContext().getModelingSession().getModel().createTagParameter(value, tag));
                        }
                    }
                    //if the parameter number is multiple
                    else if (tag.getDefinition().getParamNumber().equals("*")) {
        
                        // string transformation to string tab
                        String[] tabValues = parseValuesToStringTab(value);
        
                        // array list for the news tag parameters
                        List<TagParameter> listTagParam = new ArrayList<>();
        
                        // old tag parameters deleting
                        for (TagParameter tp:tag.getActual()) {
                            tag.getActual().remove(tp);
                            tp.delete();
                        }
        
                        // new list creating
                        for (String s:tabValues) {
                            listTagParam.add(CPSwarmModule.getInstance().getModuleContext().getModelingSession().getModel().createTagParameter(s+" ", tag));
                        }
        
                        // new tag parameters adding
                        for (TagParameter tpl:listTagParam) {
                            tag.getActual().add(tpl);
                        }
                    }
                    else {
                        // else, the parameter number is another number, 2, 3 4 etc.
                        try {
                            int nbParam = Integer.parseInt(tag.getDefinition().getParamNumber());
        
                            // string transformation to string tab
                            String[] tabValues = parseValuesToStringTab(value);
        
                            /* if (tabValues.length > nbParam) {
                                //JOptionPane.showMessageDialog(null,  "You have too many parameter numbers, only "+tag.getDefinition().getParamNumber()+" has been set.", "Too many parameter numbers", JOptionPane.ERROR_MESSAGE);
                                //MessageDialog.openError(null, "Too many parameter numbers", "You have too many parameter numbers, only "+tag.getDefinition().getParamNumber()+" has been set.");
                                //MARTEFrame.marteShowMessageDialog(null, "Too many parameter numbers", "You have too many parameter numbers, only "+tag.getDefinition().getParamNumber()+" has been set.", JOptionPane.ERROR_MESSAGE);
                                MARTEFrame f = new MARTEFrame("You have to enter integers.");
                                f.show();
        
                            }*/
                            // array list for the news tag parameters
                            List<TagParameter> listTagParam = new ArrayList<>();
        
                            // old tag parameters deleting
                            for (TagParameter tp:tag.getActual()) {
                                tag.getActual().remove(tp);
                                tp.delete();
                            }
        
                            // new list creating
                            for (int i = 0; i <tabValues.length;i++) {
                                if (i<nbParam) {
                                    listTagParam.add(CPSwarmModule.getInstance().getModuleContext().getModelingSession().getModel().createTagParameter(tabValues[i]+" ", tag));
                                }
                            }
        
                            // new tag parameters adding
                            for (TagParameter tpl:listTagParam) {
                                tag.getActual().add(tpl);
                            }
        
                        }
                        catch (Exception e) {
                            JOptionPane.showMessageDialog(null, "Internal ERROR :\nThe parameter number is not a number.", "-- Internal Error --", JOptionPane.ERROR_MESSAGE);
                        }
        
                    }
                }
            }
        }
        else {
        
        }
    }

    /**
     * Allows a string tab creating. The string tab element has this form : parentName::elementName
     * 
     * @param listElement : the element list
     * @return a string tab
     */
    public static String[] createListString(final List<ModelElement> listElement) {
        List<String> listEltName = new ArrayList<>();
        
        listEltName.add("");
        
        for (ModelElement elt: listElement) {
            listEltName.add(getCPSwarmName(elt));
        }
        
        Collections.sort(listEltName);
        String[] result = listEltName.toArray(new String[listEltName.size()]);
        return result;
    }

    /**
     * Returns the "CPSwarm" name
     * 
     * @param elt : the element
     * @return String : the CPSswarm name of the element.
     */
    public static String getCPSwarmName(final ModelElement elt) {
        String result = elt.getName();
        MObject owner = elt.getCompositionOwner();
        if (owner instanceof ModelElement){
            result = result + " from (" + elt.getName() + ")";
        }
        return result;
    }

    /**
     * This method test if the SysML module is already deployed
     * 
     * @return true if the SysML module is deployed
     */
    public static boolean isSysMLDeployed() {
        return true;
    }

    /**
     * This method test if the MARTE module is already deployed
     * 
     * @return true if the MARTE module is deployed
     */
    public static boolean isMARTEDeployed() {
        return true;
    }

    /**
     * Method setTaggedValue
     * @author ebrosse
     * @return
     */
    public static void setTaggedValue(TaggedValue tvFound, ModelElement elt, String value, ModelElement related, String modulelink, String stereotypeLink) {
        IUmlModel model = CPSwarmModule.getInstance().getModuleContext().getModelingSession().getModel();
        
        for (Dependency existingLinks : new ArrayList<>(elt.getDependsOnDependency())) {
            if (existingLinks.isStereotyped(modulelink,stereotypeLink)) {
                existingLinks.delete();
            }
        }
        
        TagParameter firstElt = null;
        List<TagParameter> actuals = tvFound.getActual();
        if ((actuals != null) && (actuals.size() > 0)) {
            firstElt = actuals.get(0);
        } else {
            firstElt = model.createTagParameter();
            tvFound.getActual().add(firstElt);
        }
        
        if (value.equals("false")) {
            tvFound.delete();
        } else {
            firstElt.setValue(value);
            try {
                model.createDependency(elt, related,modulelink, stereotypeLink);
            } catch (Exception e) {
                CPSwarmModule.logService.error(e);
            }
        }
    }

    /**
     * Method addValue
     * @author ebrosse
     * @return
     */
    public static void addValue(String modulename, String name, String value, ModelElement element, ModelElement related, String modulelink, String stereotypeLink) {
        boolean exist = false;
        
        TaggedValue tag = null;
        List<TaggedValue> tagElements = element.getTag();
        IUmlModel model = CPSwarmModule.getInstance().getModuleContext().getModelingSession().getModel();
        
        if (!tagElements.isEmpty()) {
            for (TaggedValue currentTag : tagElements) {
                TagType type = currentTag.getDefinition();
                String tagname = type.getName();
        
                if (tagname.equals(name)) {
                    exist = true;
                    tag = currentTag;
                    break;
        
                }
            }
        }
        
        if (!exist) {
            try {
                tag = model.createTaggedValue(modulename, name, element);
        
            } catch (Exception e) {
                CPSwarmModule.logService.error(e);
            }
        
        }
        
        setTaggedValue(tag, element, value, related,modulelink, stereotypeLink);
    }

    public static void addValue(String modulename, String name, String values, ModelElement element) {
        boolean exist = false;
        List<TaggedValue> tagElements = element.getTag();
        TaggedValue tvFound = null;
        
        // existing verification
        if (!tagElements.isEmpty()) {
            for (TaggedValue tag : tagElements) {
        
                TagType type = tag.getDefinition();
                String tagname = type.getName();
        
                if (tagname.equals(name)) {
                    exist = true;
                    // Modelio.out.println("tvFound FOUND");
                    tvFound = tag;
                }
            }
        }
        
        // if the tagged value doesn't exist yet, we create this
        if (!exist) {
            try {
                // Modelio.out.println("tvFound does not exist");
                TaggedValue v = CPSwarmModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(modulename, name, element);
                element.getTag().add(v);
                if (!v.getDefinition().getParamNumber().equals("0")) {
                    setTaggedValue(name, element, values);
                }
            } catch (Exception e) {
                CPSwarmModule.logService.error(e);
            }
        }
        // if the tagged value already exists
        else {
            if ((tvFound != null ) && (tvFound.getDefinition().getParamNumber().equals("0"))) {
                // Modelio.out.println("tvFound.getDefinition().getParamNumber().equals(0), the tv is deleted");
                tvFound.delete();
            } else {
                setTaggedValue(name, element, values);
            }
        }
    }

    public static void setTaggedValue(String name, ModelElement elt, String value) {
        List<TaggedValue> tagElements = elt.getTag();
        IUmlModel model = CPSwarmModule.getInstance().getModuleContext().getModelingSession().getModel();
        
        if (!tagElements.isEmpty()) {
        
            for (TaggedValue tag : tagElements) {
                String tagname = tag.getDefinition().getName();
                if (tagname.equals(name)) {
        
                    TagParameter firstElt = null;
                    List<TagParameter> actuals = tag.getActual();
                    if ((actuals != null) && (actuals.size() > 0)) {
                        firstElt = actuals.get(0);
                    } else {
                        firstElt = model.createTagParameter();
                        tag.getActual().add(firstElt);
                    }
        
                    if (((value.equals("false")) && (tag.getDefinition().getParamNumber().equals("0")))
                            || ((value.equals("")) && (tag.getDefinition().getParamNumber().equals("1")))) {
                        tag.delete();
                    } else {
                        firstElt.setValue(value);
                    }
                }
            }
        }
    }

    public static String getElementAbsolutePath(MObject element) {
        String absolutePath = element.getName();
        MObject owner = element.getCompositionOwner();
        if(owner != null) {
            return getElementAbsolutePath(owner) + pathSeparator + absolutePath;
        } else {
            return absolutePath;
        }
    }

    public static MObject getElementByPath(String absolutePath) {
        String[] pathArray = absolutePath.split(pathSeparator);
        MObject currentElement = null;
        IModelingSession modelingSession = CPSwarmModule.getInstance().getModuleContext().getModelingSession();
        List<? extends MObject> currentChildren = modelingSession.getModel().getModelRoots();
        int pathArrayLength = pathArray.length;
        int i =0;
        boolean foundElementNameInCurrentIteration = false;
        while(i < pathArrayLength) {
            for(MObject element:currentChildren) {
                if(element.getName().equals(pathArray[i])) {
                    currentElement = element;
                    currentChildren = element.getCompositionChildren();
                    foundElementNameInCurrentIteration = true;
                    break;
                }
            }
            if(!foundElementNameInCurrentIteration) {
                break;
            }
            foundElementNameInCurrentIteration =false;
            i++;
        }
        
        if(currentElement != null && i == pathArrayLength) {
            return currentElement;
        }
        return null;
    }

    public static StateVertex getInitialNode(StateMachine sm) {
        for (StateVertex state : sm.getTop().getSub()){
            if (state instanceof InitialPseudoState){
                return state.getOutGoing().get(0).getTarget();
            }
        }
        return null;
    }

    public static boolean isParallel(StateVertex state) {
        for (Transition trans : state.getOutGoing()) {
            if ((trans.getTrigger() != null)  && (trans.getTrigger().getModel() != null)){
                return true;
            }
        }
        return false;
    }

    public static String getROSFullName(ModelTree tree) {
        String result = tree.getName();
        
        while ((tree.getCompositionOwner() instanceof ModelTree)
                && ((ModelTree) tree.getCompositionOwner()).isStereotyped(CPSwarmPeerModule.MODULE_NAME, ROSPackage.STEREOTYPE_NAME)) {
            tree  = (ModelTree) tree.getCompositionOwner();
            result = tree.getName() + pathSeparator + result;
        }
        return result;
    }

    public static Interface getCommunicationModel(Operation op) {
        for(Dependency dep : op.getDependsOnDependency()) {
            if (dep.isStereotyped(CPSwarmPeerModule.MODULE_NAME, DepCommModel.STEREOTYPE_NAME)) {
                ModelElement target = dep.getDependsOn();
                if (target instanceof Interface) {
                    return (Interface) target;
                }
            }
        }
        return null;
    }

    public static List<Attribute> getGoals(Interface action) {
        List<Attribute> goals = new ArrayList<>();
        
        for(Attribute att : action.getOwnedAttribute()) {
            if (att.isStereotyped(CPSwarmPeerModule.MODULE_NAME, GOAL.STEREOTYPE_NAME)) {
               goals.add(att);
            }
        }
        return goals;
    }

    public static List<Attribute> getResults(Interface action) {
        List<Attribute> results = new ArrayList<>();
        
        for(Attribute att : action.getOwnedAttribute()) {
            if (att.isStereotyped(CPSwarmPeerModule.MODULE_NAME, RESULT.STEREOTYPE_NAME)) {
                results.add(att);
            }
        }
        return results;
    }

    public static List<Transition> getEventMonitoring(State state) {
        List<Transition> events = new ArrayList<>();
        
        for (Transition transition : state.getOutGoing()) {
            if ((transition.getTrigger() != null) && (transition.getTrigger().getModel() != null)) {
                events.add(transition);
            }
        }
        return events;
    }

    public static String getTopic(ModelTree elt) {
        for(Dependency dep : elt.getDependsOnDependency()) {
            if (dep.isStereotyped(CPSwarmPeerModule.MODULE_NAME, DepTopic.STEREOTYPE_NAME)) {
                return getCPSwarmName(dep.getDependsOn());
            }
        }
        return "";
    }

    public static String getMsg(ModelTree elt) {
        for(Dependency dep : elt.getDependsOnDependency()) {
            if (dep.isStereotyped(CPSwarmPeerModule.MODULE_NAME, DepMsg.STEREOTYPE_NAME)) {
                return getCPSwarmName(dep.getDependsOn());
            }
        }
        return "";
    }

    public static String getCommunicationModelName(Operation op) {
        for(Dependency dep : op.getDependsOnDependency()) {
            if (dep.isStereotyped(CPSwarmPeerModule.MODULE_NAME, DepCommModel.STEREOTYPE_NAME)) {
               return dep.getName();
            }
        }
        return "";
    }

    public static String getROSTopic(ModelElement elt) {
        for(Dependency dep : elt.getDependsOnDependency()) {
            if (dep.isStereotyped(CPSwarmPeerModule.MODULE_NAME, DepTopic.STEREOTYPE_NAME)) {
                return getROSFullName((ModelTree)dep.getDependsOn());
            }
        }
        return "";
    }

    public static String getROSMsg(ModelElement elt) {
        for(Dependency dep : elt.getDependsOnDependency()) {
            if (dep.isStereotyped(CPSwarmPeerModule.MODULE_NAME, DepMsg.STEREOTYPE_NAME)) {
                return getROSFullName((ModelTree)dep.getDependsOn());
            }
        }
        return "";
    }

}
