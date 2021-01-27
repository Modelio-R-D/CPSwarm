/**
**/
package org.modelio.module.cpswarm.propertypage;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.AggregationKind;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.cpswarm.api.cpswarm_concept.standard.associationend.OptimisedEnd;
import org.modelio.module.cpswarm.impl.CPSwarmPeerModule;

/**
 * This class handles the properties related to Association
 * 
 * @author ebrosse
 */
public class AssociationPropertyPage implements IPropertyContent {
    /**
     * Association Property page
     * @author ebrosse
     */
    public AssociationPropertyPage() {
    }

    @Override
    public void update(ModelElement element, IModulePropertyTable table) {
        AssociationEnd end = (AssociationEnd) element;
        if (end.getAggregation().equals(AggregationKind.KINDISAGGREGATION)) {
            end = end.getOpposite();
        }
        table.addProperty("Cardinality", end.getMultiplicityMax());
        
        table.addProperty("Optimised", end.isStereotyped(CPSwarmPeerModule.MODULE_NAME, OptimisedEnd.STEREOTYPE_NAME));
    }

    @Override
    public int changeProperty(ModelElement element, int row, String value) {
        AssociationEnd end = (AssociationEnd) element;
        if (end.getAggregation().equals(AggregationKind.KINDISAGGREGATION)) {
            end = end.getOpposite();
        }
        
        switch (row) {
        case 1:
            end.setMultiplicityMax(value);
            end.setMultiplicityMin(value);
            break;
        
        case 2:
        
            if (value.equals("true")) {
                end.addStereotype(CPSwarmPeerModule.MODULE_NAME, OptimisedEnd.STEREOTYPE_NAME);
            }else {
                end.removeStereotypes(CPSwarmPeerModule.MODULE_NAME, OptimisedEnd.STEREOTYPE_NAME);
            }
        default:
            break;
        }
        return 2;
    }

}
