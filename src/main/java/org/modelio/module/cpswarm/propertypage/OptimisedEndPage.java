/**
 * Java Class : OptimisedParameterPropertyPage.java
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
 * @category   PropertyDefinition page
 * @package    org.modelio.module.CPSwarm.propertypage
 * @author     Modelio
 * @license    http://www.apache.org/licenses/LICENSE-2.0
 **/
package org.modelio.module.cpswarm.propertypage;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.AggregationKind;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.cpswarm.api.CPSwarmTagTypes;
import org.modelio.module.cpswarm.api.ICPSwarmPeerModule;
import org.modelio.module.cpswarm.utils.ModelUtils;

/**
 * This class handles the properties related to Optimised Parameter
 * @author ebrosse
 */
public class OptimisedEndPage implements IPropertyContent {
    /**
     * Constructor OptimisedParameterPage
     * @author ebrosse
     */
    public OptimisedEndPage() {
    }

    @Override
    public void update(ModelElement element, IModulePropertyTable table) {
        ModelElement elt = element;
        if (elt instanceof AssociationEnd) {
        
            AssociationEnd end = (AssociationEnd) element;
        
            if (end.getAggregation().equals(AggregationKind.KINDISAGGREGATION)) {
                elt = end.getOpposite();
        
            }
        }
        
        String value = ModelUtils.getTaggedValue(CPSwarmTagTypes.OPTIMISED_MIN, elt);
        table.addProperty("Minimal Value", value);
        
        value = ModelUtils.getTaggedValue(CPSwarmTagTypes.OPTIMISED_MAX, elt);
        table.addProperty("Maximal Value", value);
        
        value = ModelUtils.getTaggedValue(CPSwarmTagTypes.OPTIMISED_SCALE, elt);
        table.addProperty("Scale", value);
    }

    @Override
    public int changeProperty(ModelElement element, int row, String value) {
        if(row == 1){
            ModelUtils.addValue(ICPSwarmPeerModule.MODULE_NAME, CPSwarmTagTypes.OPTIMISED_MIN, value, element);
        }else if(row == 2){
            ModelUtils.addValue(ICPSwarmPeerModule.MODULE_NAME, CPSwarmTagTypes.OPTIMISED_MAX, value, element);
        }else if(row == 3){
            ModelUtils.addValue(ICPSwarmPeerModule.MODULE_NAME, CPSwarmTagTypes.OPTIMISED_SCALE, value, element);
        }
        return 3;
    }

}
