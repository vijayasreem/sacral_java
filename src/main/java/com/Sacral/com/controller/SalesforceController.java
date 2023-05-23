package com.Sacral.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Sacral.com.service.SalesforceService;

@RestController
@RequestMapping("/salesforce")
public class SalesforceController {

    @Autowired
    private SalesforceService salesforceService;

    @GetMapping("/findAllByUserStories")
    public List<Salesforce> findAllByUserStories(){
        return salesforceService.findAllByUserStories();
    }

    @GetMapping("/implementFolderStructure")
    public void implementFolderStructure(){
        salesforceService.implementFolderStructure();
    }

    @GetMapping("/implementMultiComponentSelection")
    public void implementMultiComponentSelection(){
        salesforceService.implementMultiComponentSelection();
    }

    @GetMapping("/createCustomObjectsWithMetadata")
    public void createCustomObjectsWithMetadata(){
        salesforceService.createCustomObjectsWithMetadata();
    }

    @GetMapping("/createMultiComponentsInLWC")
    public void createMultiComponentsInLWC(){
        salesforceService.createMultiComponentsInLWC();
    }

    @GetMapping("/connectApexClassesAndLWC")
    public void connectApexClassesAndLWC(){
        salesforceService.connectApexClassesAndLWC();
    }

    @GetMapping("/unitTestImplementation")
    public void unitTestImplementation(){
        salesforceService.unitTestImplementation();
    }

    @GetMapping("/sandboxIntegration")
    public void sandboxIntegration(){
        salesforceService.sandboxIntegration();
    }

    @GetMapping("/sequenceUserStoriesExecution")
    public void sequenceUserStoriesExecution(){
        salesforceService.sequenceUserStoriesExecution();
    }

    @GetMapping("/mergeNewFunctionalityInExistingComponents")
    public void mergeNewFunctionalityInExistingComponents(){
        salesforceService.mergeNewFunctionalityInExistingComponents();
    }

    @GetMapping("/deployGeneratedCode")
    public void deployGeneratedCode(){
        salesforceService.deployGeneratedCode();
    }

    @GetMapping("/developAWSLambdaToContainerizedLambdaFunction")
    public void developAWSLambdaToContainerizedLambdaFunction(){
        salesforceService.developAWSLambdaToContainerizedLambdaFunction();
    }

    @GetMapping("/provideApplicationAccessForPilotTesting")
    public void provideApplicationAccessForPilotTesting(){
        salesforceService.provideApplicationAccessForPilotTesting();
    }

}