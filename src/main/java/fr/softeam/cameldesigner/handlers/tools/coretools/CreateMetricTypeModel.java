package fr.softeam.cameldesigner.handlers.tools.coretools;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.MetricModelDiagram;
import fr.softeam.cameldesigner.api.metricmodel.standard.package_.MetricTypeModel;

@objid ("5bd7bf23-4070-4e06-a901-566028ce708d")
public class CreateMetricTypeModel extends CreateSubModelTool {
    @objid ("26bbf5d1-a1ac-4116-84e1-640cfa3d1e61")
    public CreateMetricTypeModel() {
        super("MetricTypeModel", MetricTypeModel.STEREOTYPE_NAME, "MetricTypeModelDiagram", MetricModelDiagram.STEREOTYPE_NAME);
    }

}
