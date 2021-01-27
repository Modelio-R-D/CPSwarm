/**
 * Java Class : ResourcesManager.java
 *
 * Description :
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing,
 *    software distributed under the License is distributed on an
 *    "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *    KIND, either express or implied.  See the License for the
 *    specific language governing permissions and limitations
 *    under the License.
 *
 * @category   Util
 * @package    com.modeliosoft.modelio.sysml.utils
 * @author     Modelio
 * @license    http://www.apache.org/licenses/LICENSE-2.0
 * @version    2.0.08
 **/
package org.modelio.module.cpswarm.type.abstraction;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.GeneralClass;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.metamodel.uml.statik.PassingMode;
import org.modelio.metamodel.uml.statik.Port;
import org.modelio.metamodel.uml.statik.PortOrientation;
import org.modelio.module.cpswarm.api.cpswarm_concept.standard.class_.Actuator;
import org.modelio.module.cpswarm.api.cpswarm_concept.standard.class_.Sensor;
import org.modelio.module.cpswarm.api.cpswarm_concept.standard.class_.Virtual;
import org.modelio.module.cpswarm.impl.CPSwarmModule;
import org.modelio.module.cpswarm.impl.CPSwarmPeerModule;
import org.modelio.module.cpswarm.type.abstraction.SensorsActuator.Category;
import org.modelio.module.cpswarm.utils.ModelUtils;

/**
 * This class handles Abstraction export
 * @author ebrosse
 */
public class AbstractionExporter {
    private Class abstraction = null;

    public void exporting(Class component, File file) {
        try {
            initfield();
        
            Abstraction abs = buildAbstraction(component);
            try{
        
                writeAbstractionDescription(abs, file);
        
        
            } catch (ExtensionNotFoundException e) {
                CPSwarmModule.logService.error(e);
            }
        
        
        } catch (Exception e) {
            CPSwarmModule.logService.error(e);
        }
    }

    private void writeAbstractionDescription(Abstraction abs, File file) {
        ObjectMapper mapper = new ObjectMapper();
        
        //JSON file to Java object
        try {
            mapper.writeValue(file, abs);
        } catch (JsonParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (JsonMappingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * Method AbstractionExporter
     * @author ebrosse
     */
    public AbstractionExporter() {
    }

    private Abstraction buildAbstraction(Class component) {
        Abstraction abs = new Abstraction();
        
        List<SensorsActuator> sas = new ArrayList<>();
        
        SensorsActuator sa = new SensorsActuator();
        sa.setName(component.getName());
        
        if(component.isStereotyped(CPSwarmPeerModule.MODULE_NAME, Sensor.STEREOTYPE_NAME)) {
            sa.setCategory(Category.SENSOR);
        }else if(component.isStereotyped(CPSwarmPeerModule.MODULE_NAME, Virtual.STEREOTYPE_NAME)) {
            sa.setCategory(Category.VIRTUAL);
        }else if(component.isStereotyped(CPSwarmPeerModule.MODULE_NAME, Actuator.STEREOTYPE_NAME)) {
            sa.setCategory(Category.ACTUATOR);
        }
        
        Api api = new Api();
        sa.setApi(api);
        
        List<Port> outputPorts = new ArrayList<>();
        List<Port> inputPorts = new ArrayList<>();
        
        for (BindableInstance part: component.getInternalStructure()) {
            if (part instanceof Port) {
                Port currentPort = (Port) part;
                if (currentPort.getDirection().equals(PortOrientation.IN)) {
                    inputPorts.add(currentPort);
                }else if (currentPort.getDirection().equals(PortOrientation.OUT)) {
                    outputPorts.add(currentPort);
                }
            }
        }
        
        List<Output> outputs = new ArrayList<>();
        api.setOutputs(outputs);
        
        for(Port outPort : outputPorts) {
           outputs.add(createOutput(outPort));
        }
        
        sas.add(sa);
        
        abs.setSensorsActuators(sas);
        
        
        List<Function> fcts = new ArrayList<>();
        abs.setFunctions(fcts);
        
        for(Operation op : component.getOwnedOperation()) {
        
            Function fct = new Function();
            fct.setName(op.getName());
            fct.setCategory(Function.Category.ABSTRACTION_LIB);
        
        
            List<ParamList> params = new ArrayList<>();
            fct.setParamList(params);
        
        
            Api apifct = new Api();
            fct.setApi(apifct);
        
        
            List<Input> inputs = new ArrayList<>();
            apifct.setInputs(inputs);
        
            List<Output> outputsP = new ArrayList<>();
            apifct.setOutputs(outputs);
        
            fcts.add(fct);
        
            addParams(op, params, inputs, outputsP);
        }
        return abs;
    }

    private void initfield() {
        // TODO Auto-generated method stub
    }

    private void addParams(Operation op, List<ParamList> params, List<Input> inputs, List<Output> outputs) {
        for (Parameter opParam : op.getIO()) {
            if (opParam.getParameterPassing().equals(PassingMode.IN)) {
                inputs.add(createInput(opParam));
            }else  if (opParam.getParameterPassing().equals(PassingMode.OUT)) {
                outputs.add(createOutput(opParam));
            }else  if (opParam.getParameterPassing().equals(PassingMode.INOUT)) {
                params.add(createParam(opParam));
            }
        }
    }

    private Output createOutput(Parameter opParam) {
        Output input = new Output();
        input.setTopic(ModelUtils.getROSTopic(opParam));
        
        Msg msg = new Msg();
        input.setMsg(msg);
        GeneralClass type = opParam.getType();
        msg.setClass_(ModelUtils.getROSFullName(type));
        
        List<Field> fields = new ArrayList<>();
        msg.setFields(fields);
        for(Attribute att : type.getOwnedAttribute()) {
            Field field = new Field();
            fields.add(field);
            field.setClass_(att.getType().getName());
            field.setName(att.getName());
        }
        return input;
    }

    private Output createOutput(Port opParam) {
        Output input = new Output();
        input.setTopic(ModelUtils.getROSTopic(opParam));
        
        Msg msg = new Msg();
        input.setMsg(msg);
        GeneralClass type = (GeneralClass) opParam.getBase();
        msg.setClass_(ModelUtils.getROSFullName(type));
        
        List<Field> fields = new ArrayList<>();
        msg.setFields(fields);
        for(Attribute att : type.getOwnedAttribute()) {
            Field field = new Field();
            fields.add(field);
            field.setClass_(att.getType().getName());
            field.setName(att.getName());
        }
        return input;
    }

    private ParamList createParam(Parameter opParam) {
        ParamList paramList = new ParamList();
        paramList.setClass_(opParam.getType().getName());
        paramList.setName(opParam.getName());
        paramList.setValue(Double.valueOf(opParam.getDefaultValue()));
        return paramList;
    }

    private Input createInput(Parameter opParam) {
        Input input = new Input();
        input.setTopic(ModelUtils.getROSTopic(opParam));
        
        Msg msg = new Msg();
        input.setMsg(msg);
        GeneralClass type = opParam.getType();
        msg.setClass_(ModelUtils.getROSFullName(type));
        
        List<Field> fields = new ArrayList<>();
        msg.setFields(fields);
        for(Attribute att : type.getOwnedAttribute()) {
            Field field = new Field();
            fields.add(field);
            field.setClass_(att.getType().getName());
            field.setName(att.getName());
        }
        return input;
    }

}
