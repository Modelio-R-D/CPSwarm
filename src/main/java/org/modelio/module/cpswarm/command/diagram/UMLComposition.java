package org.modelio.module.cpswarm.command.diagram;

import java.util.List;
import org.modelio.api.modelio.diagram.IDiagramGraphic;
import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.modelio.diagram.IDiagramLink.LinkRouterKind;
import org.modelio.api.modelio.diagram.IDiagramLink;
import org.modelio.api.modelio.diagram.ILinkPath;
import org.modelio.api.modelio.diagram.InvalidDestinationPointException;
import org.modelio.api.modelio.diagram.InvalidPointsPathException;
import org.modelio.api.modelio.diagram.InvalidSourcePointException;
import org.modelio.api.modelio.diagram.tools.DefaultLinkTool;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.modelio.model.IUmlModel;
import org.modelio.metamodel.uml.statik.AggregationKind;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.module.cpswarm.api.CPSwarmStereotypes;
import org.modelio.module.cpswarm.api.ICPSwarmPeerModule;
import org.modelio.module.cpswarm.i18n.I18nMessageService;
import org.modelio.module.cpswarm.impl.CPSwarmModule;
import org.modelio.vcore.smkernel.mapi.MObject;

public class UMLComposition extends DefaultLinkTool {
    @Override
    public boolean acceptFirstElement(IDiagramHandle arg0, IDiagramGraphic arg1) {
        if ((arg1 != null) && (arg1.getElement() != null)){
            MObject element = arg1.getElement();
            return ((element).getStatus().isModifiable () 
                    && (element instanceof Classifier)
                    && ((Classifier) element).isStereotyped(ICPSwarmPeerModule.MODULE_NAME, CPSwarmStereotypes.SWARM));
        }
        return false;
    }

    @Override
    public boolean acceptSecondElement(IDiagramHandle arg0, IDiagramGraphic arg1, IDiagramGraphic arg2) {
        return ((arg2 != null) 
                && (arg2.getElement() != null) 
                && (arg2.getElement() instanceof Classifier)
                && ((Classifier) arg2.getElement()).isStereotyped(ICPSwarmPeerModule.MODULE_NAME, CPSwarmStereotypes.SWARMMEMBER)
                && !((Classifier) arg2.getElement()).isIsAbstract());
    }

    @Override
    public void actionPerformed(IDiagramHandle representation, IDiagramGraphic source, IDiagramGraphic destination, LinkRouterKind kind, ILinkPath path) {
        IModelingSession session = CPSwarmModule.getInstance().getModuleContext().getModelingSession();
        IUmlModel model = session.getModel();
        
        try( ITransaction transaction = session.createTransaction (I18nMessageService.getString ("Info.Session.Create", "Uml Composition"))){
            Classifier c_source = (Classifier) source.getElement();
            Classifier c_destination = (Classifier) destination.getElement();
        
            Association association = model.createAssociation();
        
            AssociationEnd endSource = model.createAssociationEnd();
            endSource.setMultiplicityMin("1");
            endSource.setMultiplicityMax("1");   
            endSource.setSource(c_destination);
            endSource.setTarget(c_source);
           
            AssociationEnd endTarget = model.createAssociationEnd();
            endTarget.setName(c_destination.getName().toLowerCase());
            endTarget.setAggregation(AggregationKind.KINDISCOMPOSITION); 
            endTarget.setMultiplicityMin("1");
            endTarget.setMultiplicityMax("1");
        
            association.getEnd().add(endTarget);  
            association.getEnd().add(endSource);    
            
            endSource.setOpposite(endTarget);
            endTarget.setOpposite(endSource);  
            
            endSource.setNavigable(false);
            endTarget.setNavigable(true);
            
            List<IDiagramGraphic> graphics = representation.unmask(association, 0 , 0);
            for (IDiagramGraphic graphic : graphics){
                if (graphic instanceof IDiagramLink){
                    IDiagramLink link = (IDiagramLink) graphic;
                    link.setPath(path);
                }
            }
        
            representation.save();
            representation.close();
            transaction.commit ();
        } catch (InvalidSourcePointException e) {
            CPSwarmModule.logService.error(e);
        } catch (InvalidPointsPathException e) {
            CPSwarmModule.logService.error(e);
        } catch (InvalidDestinationPointException e) {
            CPSwarmModule.logService.error(e);
        }
    }

}
