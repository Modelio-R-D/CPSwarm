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
 * @package    com.modeliosoft.modelio.sysml.utils
 * @author     Modelio
 * @license    http://www.apache.org/licenses/LICENSE-2.0
 * @version    1.2.18
 **/
package org.modelio.module.cpswarm.utils;

import java.io.File;
import org.modelio.module.cpswarm.i18n.I18nMessageService;
import org.modelio.module.cpswarm.impl.CPSwarmModule;

public class CPSwarmResourcesManager {
    private static String getModulePath() {
        return  CPSwarmModule.getInstance().getModuleContext().getConfiguration().getModuleResourcesPath().toString() + File.separator + "res";
    }

    /**
     * Operation getStyleget
     * @author ebrosse
     * 
     * @param style name
     * @return
     */
    public static String getStyle(String style) {
        return getModulePath() + File.separator + "style" + File.separator + style;
    }

    /**
     * Operation getPropertyName
     * @author ebrosse
     * @return
     */
    public static String getPropertyName(String string) {
        return I18nMessageService.getString("Ui.Property." + string + ".Name");
    }

    /**
     * This method return the tooltip of the desired command
     * @author ebrosse
     * 
     * @param string : name of the stereotype
     * @return the associated tooltip
     */
    public static String getTooltip(String string) {
        return I18nMessageService.getString("Ui.Command.Diagram." + string + ".Tooltip" );
    }

    /**
     * This method return the label of the desired command
     * @author ebrosse
     * 
     * @param string : name of the stereotype
     * @return the associated label
     */
    public static String getLabel(String string) {
        return I18nMessageService.getString("Ui.Command.Diagram." + string + ".Label" );
    }

    /**
     * Operation getPattern
     * @author ebrosse
     * 
     * @param pattern name
     * @return
     */
    public static String getPattern(String pattern) {
        return getModulePath() + File.separator + "pattern" + File.separator + pattern;
    }

    public static String getImage(String imageName) {
        return CPSwarmModule.getInstance().getModuleContext().getConfiguration().getModuleResourcesPath() + File.separator + "res" + File.separator + "icons" + File.separator + imageName;
    }

}
