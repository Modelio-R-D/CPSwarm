package org.modelio.module.cpswarm.generator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.DataType;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.Port;
import org.modelio.metamodel.uml.statik.PortOrientation;
import org.modelio.module.cpswarm.utils.FileUtils;

public class FitnessFunctionGeneration extends Generator implements IGenerator {
    private List<BindableInstance> fcts = null;

    private Set<Classifier> FCT = new HashSet<>();

    private List<Port> inputs = null;

    private List<Port> outputs = null;

    private List<BindableInstance> constants = null;

    private Class ff = null;

    public FitnessFunctionGeneration(Class ff) {
        this.ff = ff;
    }

    @Override
    public void generate() {
        initField();
        
        header();
        constant();
        main();
        footer();
        
        //Write the file
        if (this.file != null) {
            FileUtils.write(this.file, this.content);
        }
    }

    private void initField() {
        List<BindableInstance> internals = this.ff.getInternalStructure();
        
        List<Port> ports = new ArrayList<>();
        List<BindableInstance> resultfct = new ArrayList<>();
        for (BindableInstance internal : internals) {
            if (internal instanceof Port) {
                ports.add((Port) internal);
            }else {
                resultfct.add(internal);
            }
        }
        
        this.inputs = new ArrayList<>();
        this.outputs = new ArrayList<>();
        
        for (Port port : ports) {
            if (port.getDirection().equals(PortOrientation.IN)) {
                this.inputs.add(port);
            }else  if (port.getDirection().equals(PortOrientation.OUT)) {
                this.outputs.add(port);
            }
        }
        
        this.fcts = new ArrayList<>();
        this.constants = new ArrayList<>();
        
        for (BindableInstance fct : resultfct) {
            if (fct.getBase() instanceof DataType)
                this.constants.add(fct);
            else
                this.fcts.add(fct);
        }
    }

    private void header() {
        //fitness.py and bagfile.bag
        int nbEntry = 2;
        nbEntry += this.constants.size();
        
        addLine("import rosbag, sys");
        addEmptyLine();
        
        addLine(" if (len(sys.argv) != " + nbEntry + "):");
        increaseIndent();
        addLine("print \" ");
        addLine("print \"Usage:\"");
        addLine("print \"fitness.py [bagfile.bag] [maximum simulation time] [box count]\"");
        addLine("  sys.exit(1)\"");
        decreaseIndent();
        addEmptyLine();
        
        //Default
        addLine("bag = rosbag.Bag(sys.argv[1])");
        addLine("max_time = float(sys.argv[2])");
        
        //Entry
        addLine("box_count = float(sys.argv[3])");
        
        //Constants
        addLine("start_time = float(bag.get_start_time())");
    }

    private void constant() {
    }

    private void main() {
        for (BindableInstance bi : this.fcts) {
            getBody(bi);
        }
    }

    private void footer() {
        for (BindableInstance output: this.outputs) {
            String outputName = output.getName();
            addLine("print \"" + outputName + "=\"+str(" + outputName +")");
        }
    }

    private void getBody(BindableInstance bi) {
        addEmptyLine();
        NameSpace base = bi.getBase();
        if (base != null) {
            String body = base.getConstraintDefinition().get(0).getBody();
            for(BindableInstance portInstance : bi.getPart()) {
                String portInstanceName = portInstance.getName();
                String portClassName = portInstance.getRepresentedFeature().getName();
                body = body.replace(portClassName, portInstanceName) ;
        
            }
            addLine(body);
        }
        addEmptyLine();
    }

}
