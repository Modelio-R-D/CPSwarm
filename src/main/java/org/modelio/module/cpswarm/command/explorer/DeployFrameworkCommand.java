package org.modelio.module.cpswarm.command.explorer;

import java.nio.file.Path;
import java.security.InvalidParameterException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.modelio.api.modelio.IModelioServices;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.modelio.pattern.IPatternService.PatternException;
import org.modelio.api.modelio.pattern.IPatternService;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.mda.Project;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.module.cpswarm.impl.CPSwarmModule;
import org.modelio.vcore.smkernel.mapi.MObject;

public class DeployFrameworkCommand extends DefaultModuleCommandHandler {
    @Override
    public void actionPerformed(List<MObject> selectedElements, IModule module) {
        String lang = module.getModuleContext().getModelioContext().getLanguage();
        if (!lang.equals("fr")) {
            lang = "en";
        }
        
        String patternName = getParameter("patternPath");
        patternName = patternName.replace(".umlt", "_" + lang + ".umlt");
        Path patternPath = module.getModuleContext().getConfiguration().getModuleResourcesPath().resolve(patternName);
        
        IModelingSession modelingSession = module.getModuleContext().getModelingSession();
        try (ITransaction tr = modelingSession.createTransaction("Deploy framework")) {
            for (MObject selectedElement : selectedElements) {
                Project selectedProject;
                Package selectedPackage = null;
                if (selectedElement instanceof Project) {
                    selectedProject = ((Project) selectedElement);
                    for (Package root : selectedProject.getModel()) {
                        selectedPackage = root;
                    }
                    if (selectedPackage == null) {
                        selectedPackage = modelingSession.getModel().createPackage();
                        selectedPackage.setName(selectedProject.getName());
                        selectedPackage.setRepresented(selectedProject);
                    }
                } else {
                    selectedPackage = (Package) selectedElement;
                    selectedProject = selectedPackage.getRepresented();
                }
                deployFramework(selectedPackage, module, patternPath);
            }
            tr.commit();
        }
    }

    @Override
    public boolean accept(List<MObject> selectedElements, IModule module) {
        if (super.accept(selectedElements, module) == false) {
            return false;
        }
        
        for (MObject selectedElement : selectedElements) {
            // Keep only root packages
            if (selectedElement instanceof Package) {
                if (((Package) selectedElement).getRepresented() == null) {
                    return false;
                }
            }
        }
        return true;
    }

    private void deployFramework(ModelTree root, IModule module, Path patternPath) {
        IModuleContext context = module.getModuleContext();
        
        Map<String, Object> parameters = new HashMap<>();
        String patternFileName = patternPath.getFileName().toString();
        String rootParamName = patternFileName.substring(0, patternFileName.length() - 5);
        parameters.put(rootParamName, root);
        
        try {
        
            IModelioServices modelioServices = context.getModelioServices();
            IPatternService svc = modelioServices.getPatternService();
            svc.applyPattern(patternPath, parameters);
        
            for (AbstractDiagram diagram : context.getModelingSession().findByClass(AbstractDiagram.class)) {
                modelioServices.getEditionService().openEditor(diagram);
            }
        
        } catch (InvalidParameterException e) {
            CPSwarmModule.logService.error(e);
        } catch (PatternException e) {
            CPSwarmModule.logService.error(e);
        }
    }

}
