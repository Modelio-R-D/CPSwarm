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
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.module.cpswarm.utils.ModelUtils;

/**
 * This class handles the properties related to Operation
 * @author ebrosse
 */
public class OperationPropertyPage implements IPropertyContent {
    /**
     * Constructor OperationPropertyPage
     * @author ebrosse
     */
    public OperationPropertyPage() {
    }

    @Override
    public void update(ModelElement element, IModulePropertyTable table) {
        String value = "";
        if (element instanceof Operation) {
            value = ModelUtils.getCommunicationModelName((Operation) element);
        }
        table.addProperty("Communication Model", value);
    }

    @Override
    public int changeProperty(ModelElement element, int row, String value) {
        return 1;
    }

}
