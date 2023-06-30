package com.Sacral.com.controller;

import com.Sacral.com.service.SalesforceService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/salesforce")
public class SalesforceController {

    private SalesforceService salesforceService;

    public SalesforceController(SalesforceService salesforceService) {
        this.salesforceService = salesforceService;
    }

    @RequestMapping("/implementFolderStructure")
    public void implementFolderStructure() {
        this.salesforceService.implementFolderStructure();
    }

    @RequestMapping("/implementMultipleComponentSelection")
    public void implementMultipleComponentSelection() {
        this.salesforceService.implementMultipleComponentSelection();
    }

    @RequestMapping("/createCustomObjects")
    public void createCustomObjects() {
        this.salesforceService.createCustomObjects();
    }

    @RequestMapping("/createComponentsInLWC")
    public void createComponentsInLWC() {
        this.salesforceService.createComponentsInLWC();
    }

    @RequestMapping("/connectivityBetweenApexClassesAndLWCComponents")
    public void connectivityBetweenApexClassesAndLWCComponents() {
        this.salesforceService.connectivityBetweenApexClassesAndLWCComponents();
    }

    @RequestMapping("/implementUnitTests")
    public void implementUnitTests() {
        this.salesforceService.implementUnitTests();
    }

    @RequestMapping("/integrateSandbox")
    public void integrateSandbox() {
        this.salesforceService.integrateSandbox();
    }

    @RequestMapping("/executeUserStories")
    public void executeUserStories() {
        this.salesforceService.executeUserStories();
    }

    @RequestMapping("/mergeNewFunctionality")
    public void mergeNewFunctionality() {
        this.salesforceService.mergeNewFunctionality();
    }

    @RequestMapping("/deployGeneratedCode")
    public void deployGeneratedCode() {
        this.salesforceService.deployGeneratedCode();
    }

    @RequestMapping("/awsLambdaContainerizedLambdaFunctionDevelopment")
    public void awsLambdaContainerizedLambdaFunctionDevelopment() {
        this.salesforceService.awsLambdaContainerizedLambdaFunctionDevelopment();
    }

    @RequestMapping("/applicationAccessForPilotTesting")
    public void applicationAccessForPilotTesting() {
        this.salesforceService.applicationAccessForPilotTesting();
    }

}