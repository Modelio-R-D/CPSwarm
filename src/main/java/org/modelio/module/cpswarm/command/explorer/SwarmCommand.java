package org.modelio.module.cpswarm.command.explorer;

import java.util.List;
import org.eclipse.draw2d.geometry.Rectangle;
import org.modelio.api.modelio.IModelioServices;
import org.modelio.api.modelio.diagram.IDiagramGraphic;
import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.modelio.diagram.IDiagramNode;
import org.modelio.api.modelio.diagram.IDiagramService;
import org.modelio.api.modelio.diagram.dg.IDiagramDG;
import org.modelio.api.modelio.diagram.style.IStyleHandle;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.diagrams.StaticDiagram;
import org.modelio.metamodel.uml.infrastructure.Profile;
import org.modelio.module.cpswarm.impl.CPSwarmModule;
import org.modelio.module.cpswarm.utils.CPSwarmFactory;
import org.modelio.vcore.smkernel.mapi.MObject;

public class SwarmCommand extends DefaultModuleCommandHandler {
    @Override
    public void actionPerformed(List<MObject> selectedElements, IModule module) {
        IModuleContext moduleContext = CPSwarmModule.getInstance().getModuleContext();
        IModelingSession modelingSession = moduleContext.getModelingSession();
        
        try (ITransaction tr = modelingSession.createTransaction("Swarm Diagram");){
        
            org.modelio.metamodel.uml.statik.Package owner = (org.modelio.metamodel.uml.statik.Package) selectedElements.get(0);       
            StaticDiagram diagram = CPSwarmFactory.createSwarmDefinitionDiagram(owner, "Swarm");
        
            if (diagram != null) {      
        
                IModelioServices modelioServices = moduleContext.getModelioServices();
                IDiagramService ds = modelioServices.getDiagramService();
                try(IDiagramHandle dh = ds.getDiagramHandle(diagram);){
        
                    IDiagramDG dg = dh.getDiagramNode();
                    for (IStyleHandle style : ds.listStyles()){
                        if (style.getName().equals("CPSwarm"))
                            dg.setStyle(style);
                    }
        
                    org.modelio.metamodel.uml.statik.Class swarm = CPSwarmFactory.createSwarm(owner);
                    List<IDiagramGraphic> dgs = dh.unmask(swarm, 0, 0);
                    for (IDiagramGraphic dg2 : dgs) {
                        if (dg2 instanceof IDiagramNode)
                            ((IDiagramNode) dg2).setBounds(new Rectangle(100, 100, 300, 250));
                    }
        
                    dh.save();
                    dh.close();
                }
                modelioServices.getEditionService().openEditor(diagram);
            }
        
            tr.commit();
        }
    }

    /**
     * This methods authorizes a command to be displayed in a defined context.
     * The commands are displayed, by default, depending on the kind of metaclass on which the command has been launched.
     */
    @Override
    public boolean accept(List<MObject> selectedElements, IModule module) {
        if ((selectedElements != null) && (selectedElements.size() == 1 )){
            MObject selected = selectedElements.get(0);
            return  ((selected instanceof org.modelio.metamodel.uml.statik.Package) 
                    && !(selected instanceof Profile));
        
        }
        return false;
    }

    /**
     * This method specifies whether or not a command must be deactivated.
     * If the command has to be displayed (which means that the accept method has returned a positive value, it is sometimes needed to desactivate the command depending on specific constraints that are specific to the module.
     */
    @Override
    public boolean isActiveFor(List<MObject> selectedElements, IModule module) {
        return true;
    }

}
