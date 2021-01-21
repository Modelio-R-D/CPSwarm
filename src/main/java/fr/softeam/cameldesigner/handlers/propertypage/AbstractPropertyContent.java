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
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;

/**
 * This abstract class defines the contract of all property pages
 * @author ebrosse
 */
@objid ("e228a200-a54a-4e3e-95a4-9af42da88a6b")
public abstract class AbstractPropertyContent<T extends CamelElement> {
    @objid ("d8d6eca9-ff86-4c43-8578-bdc064e2f72f")
    protected T elt;

    @objid ("c6062162-1c7c-447b-b7c1-ecd025a1b96c")
    public AbstractPropertyContent(T elt) {
        this.elt = elt;
    }

}
