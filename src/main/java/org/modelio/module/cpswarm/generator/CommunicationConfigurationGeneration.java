package org.modelio.module.cpswarm.generator;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.AttributeLink;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.metamodel.uml.statik.Port;
import org.modelio.metamodel.uml.statik.PortOrientation;
import org.modelio.module.cpswarm.utils.FileUtils;
import org.modelio.module.cpswarm.utils.ModelUtils;

public class CommunicationConfigurationGeneration extends Generator implements IGenerator {
    private org.modelio.metamodel.uml.statik.Class swarmMember = null;

    private List<ModelElement> telemetry = new ArrayList<>();

    private List<Port> outgoing = new ArrayList<>();

    private List<Port> ingoing = new ArrayList<>();

    private BindableInstance communication = null;

    public CommunicationConfigurationGeneration(final org.modelio.metamodel.uml.statik.Class swarmMember) {
        this.swarmMember = swarmMember;
    }

    public CommunicationConfigurationGeneration(final org.modelio.metamodel.uml.statik.Class swarmMember, final File destFile) {
        this.swarmMember = swarmMember;
        this.file = destFile;
    }

    @Override
    public void generate() {
        initField();
        
        header();
        telemetry();
        outgoing();
        ingoing();
        
        footer();
        //Write the file
        if (this.file != null) {
            FileUtils.write(this.file, this.content);
        }
    }

    private void initField() {
        for (BindableInstance bi : this.swarmMember.getInternalStructure()) {
            if (bi instanceof Port) {
                Port port = (Port) bi;
                if (port.getDirection().equals(PortOrientation.IN)) {
                    this.ingoing.add(port);
                }else if (port.getDirection().equals(PortOrientation.OUT)) {
                    this.outgoing.add(port);
                }
            }else if (bi.getBase().getName().equals("zyre")) {
                this.communication = bi;
            }
        }
    }

    private void footer() {
        decreaseIndent();
        addLine("}");
    }

    private void header() {
        String ifname = "eth0";
        String port = "34000";
        if (this.communication != null) {
            for(AttributeLink slot : this.communication.getSlot()) {
                if (slot.getBase().getName().equals("ifname")){
                    ifname = slot.getValue();
                }
        
                if (slot.getBase().getName().equals("port")){
                    port = slot.getValue();
                }
            }
        }
        
        increaseIndent();
        addLine("#");
        addLine("# Configure endpoint");
        addLine("#");
        addEmptyLine();
        addLine("endpoint = {");
        addLine("name = \"" +  this.swarmMember.getName() + "\"        # Possibly non-unique name for the local node");
        addLine("deviceClass = \"" +  this.swarmMember.getName() + "\"   # Discoverable device class");
        addLine("type = \"zyre\"           # Endpoint type");
        addLine("parameters = {          # Endpoint parameters, which for Zyre endpoints can be:");
        increaseIndent();
        addLine(" # ifname = \"" + ifname + "\"       # Network interface to bind to");
        addLine(" # port = " + port + "# Port to use for UDP beacons");
        decreaseIndent();
        addLine(" }");
        addLine(" }");
        addEmptyLine();
        addLine("#");
        addLine("# Configure bridged services");
        addLine("#");
        addLine("services = {");
        increaseIndent();
    }

    private void outgoing() {
        addEmptyLine();
        addLine("outgoingEvents = (");
        increaseIndent();
        if (!(this.outgoing.isEmpty())) {
        int i = 0;
        while (i < this.outgoing.size() - 1) {
            addLine("{");
            increaseIndent();
            Port elt = this.outgoing.get(i);
            addLine("message = " + ModelUtils.getROSMsg(elt.getBase()));
            addLine("source = " + ModelUtils.getROSTopic(elt.getBase()));
        
            addLine("},");
            i++;
        }
        
        
        addLine("{");
        Port elt = this.outgoing.get(i);
        addLine("message = " + ModelUtils.getROSMsg(elt.getBase()));
        addLine("source = " + ModelUtils.getROSTopic(elt.getBase()));
        addLine("}");
        }
        decreaseIndent();
        addLine(")");
        
        addEmptyLine();
    }

    private void telemetry() {
        addEmptyLine();
        addLine(" telemetryTopics = (");
        increaseIndent();
        
        if (!(this.telemetry.isEmpty())) {
            int i = 0;
            while (i < this.telemetry.size() - 1) {
                addLine("{");
                ModelElement elt = this.telemetry.get(i);
                addLine(elt.getName());
                addLine("},");
                i++;
            }
        
        
            addLine("{");
            ModelElement elt = this.telemetry.get(i);
            addLine(elt.getName());
            addLine("}");
        }
        
        decreaseIndent();
        addLine(")");
        addEmptyLine();
    }

    private void ingoing() {
        addEmptyLine();
        addLine("ingoingEvents = (");
        increaseIndent();
        if (!(this.ingoing.isEmpty())) {
        int i = 0;
        while (i < this.ingoing.size() - 1) {
            addLine("{");
            increaseIndent();
            Port elt = this.ingoing.get(i);
            addLine("suffix = " + elt.getName());
            addLine("message = " + ModelUtils.getROSMsg(elt.getBase()));
            addLine("source = " + elt.getBase().getName());
        
            addLine("},");
            i++;
        }
        
        
        addLine("{");
        Port elt = this.ingoing.get(i);
        addLine("suffix = " + elt.getName());
        addLine("message = " + ModelUtils.getROSMsg(elt.getBase()));
        addLine("source = " + elt.getBase().getName());
        addLine("}");
        
        }
        decreaseIndent();
        addLine(")");
        addEmptyLine();
    }

}
