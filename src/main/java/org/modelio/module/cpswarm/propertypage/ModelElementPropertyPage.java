package org.modelio.module.cpswarm.propertypage;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.AggregationKind;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.AssociationEnd;

public class ModelElementPropertyPage implements IPropertyContent {
    @Override
    public void update(ModelElement element, IModulePropertyTable table) {
        if ((element instanceof Association)|| (element instanceof AssociationEnd)) {
            AssociationEnd end = getEnd(element);
            table.addProperty("Role", end.getName());
        }else {
            table.addProperty("Name", element.getName());
        }
        
        //        table.addProperty("Description", element.getNoteContent(arg0, arg1));
    }

    @Override
    public int changeProperty(ModelElement element, int row, String value) {
        switch (row) {
        case 1:
            if ((element instanceof Association)|| (element instanceof AssociationEnd)) {
                AssociationEnd end = getEnd(element);
                end.setName(value);
            }else {
                element.setName(value);
            }
            break;
        default:
            break;
        }
        return 1;
    }

    private AssociationEnd getEnd(ModelElement element) {
        AssociationEnd end = null;
        
        if (element instanceof Association) {
            end = ((Association) element).getEnd().get(0);
        }else {
            end = (AssociationEnd) element;
        }
        
        if (end.getAggregation().equals(AggregationKind.KINDISAGGREGATION)) {
            return end.getOpposite();
        }else {
            return end;
        }
    }

}
