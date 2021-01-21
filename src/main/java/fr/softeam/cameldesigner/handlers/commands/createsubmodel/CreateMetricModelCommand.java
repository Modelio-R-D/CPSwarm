package fr.softeam.cameldesigner.handlers.commands.createsubmodel;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.MetricModelDiagram;
import fr.softeam.cameldesigner.api.metricmodel.standard.package_.MetricTypeModel;
import fr.softeam.cameldesigner.handlers.commands.CreateCamelSubModelCommand;

@objid ("8f45b977-3944-4b19-816e-fadb31a5b415")
public class CreateMetricModelCommand extends CreateCamelSubModelCommand {
    @objid ("1014a748-6fac-45b5-abfb-3e29a1d34cb6")
    public CreateMetricModelCommand() {
        super("Metric Model", MetricTypeModel.STEREOTYPE_NAME, "Metric Type Model Diagram", MetricModelDiagram.STEREOTYPE_NAME);
    }

}
