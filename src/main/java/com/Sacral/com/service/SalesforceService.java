package com.Sacral.com.service;

import com.Sacral.com.repository.SalesforceRepository;
import org.springframework.stereotype.Service;

@Service
public class SalesforceService {

    private SalesforceRepository salesforceRepository;

    public SalesforceService(SalesforceRepository salesforceRepository) {
        this.salesforceRepository = salesforceRepository;
    }

    public void implementFolderStructure() {
        this.salesforceRepository.implementFolderStructure();
    }

    public void implementMultipleComponentSelection() {
        this.salesforceRepository.implementMultipleComponentSelection();
    }

    public void createCustomObjects() {
        this.salesforceRepository.createCustomObjects();
    }

    public void createComponentsInLWC() {
        this.salesforceRepository.createComponentsInLWC();
    }

    public void connectivityBetweenApexClassesAndLWCComponents() {
        this.salesforceRepository.connectivityBetweenApexClassesAndLWCComponents();
    }

    public void implementUnitTests() {
        this.salesforceRepository.implementUnitTests();
    }

    public void integrateSandbox() {
        this.salesforceRepository.integrateSandbox();
    }

    public void executeUserStories() {
        this.salesforceRepository.executeUserStories();
    }

    public void mergeNewFunctionality() {
        this.salesforceRepository.mergeNewFunctionality();
    }

    public void deployGeneratedCode() {
        this.salesforceRepository.deployGeneratedCode();
    }

    public void awsLambdaContainerizedLambdaFunctionDevelopment() {
        this.salesforceRepository.awsLambdaContainerizedLambdaFunctionDevelopment();
    }

    public void applicationAccessForPilotTesting() {
        this.salesforceRepository.applicationAccessForPilotTesting();
    }
}