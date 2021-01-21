/**
 * Java Class : IPropertyContent.java
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
 *   @author     Modelio
 * @license    http://www.apache.org/licenses/LICENSE-2.0
 * @version    2.0.08
 **/
package fr.softeam.cameldesigner.handlers.propertypage;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

/**
 * This interface defines the contract of all property pages
 * @author ebrosse
 */
@objid ("f3cd343c-d840-4d72-89c9-c9427b5ca3d7")
public interface IPropertyContent {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("92941362-2a27-411a-8acf-332bb3a80124")
    int changeProperty(int row, String value);

    /**
     * This method handles the construction of the property table of a selected element
     * 
     * @param table : the property table to fulfill
     */
    @objid ("9e164b69-2a3b-4061-bb13-10af1a8178d5")
    void update(IModulePropertyTable table);

}
