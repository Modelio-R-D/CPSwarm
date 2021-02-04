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
package org.modelio.module.cpswarm.utils;

import java.io.File;
import org.modelio.module.cpswarm.impl.CPSwarmModule;

/**
 * This class handles the SysML resources i.e. images, styles, property names, etc.
 * @author ebrosse
 */
public class ResourcesManager {

    private static final String generatedFolderName = "generated";

    private static ResourcesManager instance = null;

    /**
     * Method ResourcesManager
     * @author ebrosse
     */
    private ResourcesManager() {
    }

    /**
     * Method getInstance
     * @author ebrosse
     *
     * @return the SysMLResourcesManager instance
     */
    public static ResourcesManager getInstance() {
        if(instance == null){
            instance =  new ResourcesManager();
        }
        return instance;
    }


    /**
     * Method getImage
     * @author ebrosse
     *
     * @param imageName : the name of the image file
     * @return the complete path of the image file
     */
    public String getImage(String imageName) {
        return CPSwarmModule.getInstance().getModuleContext().getConfiguration().getModuleResourcesPath() + File.separator + "res" + File.separator + "icons" + File.separator + imageName;
    }

    public String getRessource(String resName) {
        return CPSwarmModule.getInstance().getModuleContext().getConfiguration().getModuleResourcesPath() + File.separator + "res" + File.separator + resName;
    }

    public String getPlugin(String pluginName) {
        return CPSwarmModule.getInstance().getModuleContext().getConfiguration().getModuleResourcesPath() + File.separator + "res" + File.separator + "plugin" + File.separator + pluginName;
    }

    public String getGeneratedPath() {
        return CPSwarmModule.getInstance().getModuleContext().getProjectStructure().getPath() + File.separator + generatedFolderName;
    }

//    public Document getXMLDocument(String fileName) {
//        try {
//            SAXBuilder builder = new SAXBuilder();
//            File xmlFile = new File(CPSwarmModule.getInstance().getModuleContext().getConfiguration().getModuleResourcesPath() + File.separator + "res" + File.separator + xmlFolderName + File.separator + fileName);
//            return builder.build(xmlFile);
//
//
//        } catch(JDOMParseException e){
//            CPSwarmModule.logService.error(e);
//        }catch (JDOMException e) {
//            CPSwarmModule.logService.error(e);
//        }catch (IOException e) {
//            CPSwarmModule.logService.error(e);
//        }catch (Exception e) {
//            CPSwarmModule.logService.error(e);
//        }
//        return null;
//    }

}
