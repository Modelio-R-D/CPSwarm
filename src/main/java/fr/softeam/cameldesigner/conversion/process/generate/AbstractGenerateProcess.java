package fr.softeam.cameldesigner.conversion.process.generate;

import java.util.Map;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.conversion.process.IElementProcess;
import org.eclipse.emf.cdo.CDOObject;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("9d3c43e8-d77f-4de9-89be-8e5ed21b089a")
public abstract class AbstractGenerateProcess implements IElementProcess {
//private CamelModelService camelModelService = new CamelModelService ();
    @objid ("4ec5fbef-5953-4306-b5ba-a23b2b8953d8")
    private CDOObject camelElementParent;

    @objid ("e22a2812-63d1-4d37-a8d3-fdf745a38240")
    protected Map<ModelElement, CDOObject> processedUmlElements;

    @objid ("cdf8cf56-51a4-4ae9-a194-1fa866a4bbfc")
    public AbstractGenerateProcess(CDOObject camelElementParent, Map<ModelElement, CDOObject> processedUmlElements) {
        this.camelElementParent = camelElementParent;
        this.processedUmlElements = processedUmlElements;
    }

    @objid ("a94a6675-9c20-42e9-9c47-ad24f1719e24")
    @Override
    public Object process(Object element) {
        return process((ModelElement) element);
    }

    @objid ("be18a51b-552b-43d8-9e4a-73be50508abd")
    public CDOObject getCamelElementParent() {
        return this.camelElementParent;
    }

    @objid ("9cc5713c-6868-4f77-9d4d-3a98942c3ab1")
    public void setCamelElementParent(CDOObject camelElementParent) {
        this.camelElementParent = camelElementParent;
    }

    @objid ("acdfeea9-c456-44ec-840e-6139ebe63d49")
    public CDOObject process(ModelElement element) {
        CDOObject processedElement = null;
        
        if(this.processedUmlElements.containsKey(element)) {
            processedElement = this.processedUmlElements.get(element);
            if(this.getCamelElementParent() != null) {
                this.updateParent(processedElement);
            }
        } else {
            processedElement = switchGenerate (element);
            if(processedElement != null) {
                this.processedUmlElements.put(element, processedElement);
            }
        }
        return processedElement;
    }

//    @objid ("f0be351a-4827-487a-8d8b-e4b8a9e106e0")
//    private Object generateCamelModel(Package packageElement) {
//        //CamelModel camelModel = CoreFactory.eINSTANCE.createCamelModel();
//        //camelModel.setName(packageElement.getName());
//        return this.camelElementParent;
//    }
    @objid ("5da7e840-a9e2-4a03-8e59-2aafc9a38c12")
    public Map<ModelElement, CDOObject> getProcessedUmlElements() {
        return this.processedUmlElements;
    }

    @objid ("7d411501-7672-41d8-b24a-8654344cd1bb")
    public void setProcessedUmlElements(Map<ModelElement, CDOObject> processedUmlElements) {
        this.processedUmlElements = processedUmlElements;
    }

    @objid ("0c508a4c-cf80-4309-8754-958351fdb46e")
    protected abstract void updateParent(CDOObject processedElement);

    /**
     * Generate Camel Element and update its container (parent).
     * @param ModelElement element from Modelio Model Tree
     * 
     * @return generated Camel Element
     */
    @objid ("ff67385b-127c-4009-b878-ccfbd6709cd5")
    protected abstract CDOObject switchGenerate(ModelElement element);


//@objid ("cf7d67ce-cb76-459e-9c2e-b8858cd186b2")
//protected abstract void updateParent(CDOObject processedElement);
}
