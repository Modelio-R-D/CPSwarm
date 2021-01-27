package org.modelio.module.cpswarm.impl;

import java.util.Set;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.event.IModelChangeEvent;
import org.modelio.api.modelio.model.event.IModelChangeHandler;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * @author ebrosse
 */
public class CPSwarmHandler implements IModelChangeHandler {
    @Override
    public void handleModelChange(IModelingSession session, IModelChangeEvent event) {
        //created elements
        Set<MObject> createdElements =  event.getCreationEvents();
           
               
        //updated elements
        Set<MObject> updatedElements =  event.getUpdateEvents();
    }

}
