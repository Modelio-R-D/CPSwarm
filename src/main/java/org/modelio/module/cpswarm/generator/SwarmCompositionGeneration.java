package org.modelio.module.cpswarm.generator;

import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.cpswarm.impl.CPSwarmModule;
import org.modelio.module.cpswarm.type.swarm.Swarm;
import org.modelio.module.cpswarm.type.swarm.SwarmMember;

public class SwarmCompositionGeneration extends Generator implements IGenerator {
    private org.modelio.metamodel.uml.statik.Class swarm = null;

    public SwarmCompositionGeneration(org.modelio.metamodel.uml.statik.Class swarm, File file) {
        this.swarm = swarm;
        this.file = file;
    }

    @Override
    public void generate() {
        Swarm swarm = exportSwarm();
        
        //Serialization
        try {
        
            JAXBContext jaxbContext = JAXBContext.newInstance(Swarm.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        
            // output pretty printed
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        
            if (!this.file.exists()){
                this.file.getParentFile().mkdirs();
                this.file.createNewFile();
            }
        
            jaxbMarshaller.marshal(swarm, this.file);
        
        } catch (JAXBException e) {
            CPSwarmModule.logService.error(e);
        } catch (IOException e) {
            CPSwarmModule.logService.error(e);
        }
    }

    private Swarm exportSwarm() {
        Swarm result = new Swarm();
        result.setName(this.swarm.getName());
        
        for (AssociationEnd ownedEnd : this.swarm.getOwnedEnd()) {
        
            //Create Swarm Member
            SwarmMember member = new SwarmMember();
        
            //Set Name
            member.setName(ownedEnd.getTarget().getName());
        
        
            //Set Number
            member.setNumber(BigInteger.valueOf(Long.valueOf(ownedEnd.getMultiplicityMax())));
        
            //Add Member
            result.getSwarmMember().add(member);
        }
        return result;
    }

}
