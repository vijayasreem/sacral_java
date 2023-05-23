package com.Sacral.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Sacral.com.repository.SalesforceRepository;

@Service
public class SalesforceService {

    @Autowired
    private SalesforceRepository salesforceRepository;

    public List<Salesforce> findAllByUserStories(){
        return salesforceRepository.findAllByUserStories();
    }

    public void implementFolderStructure(){
        salesforceRepository.implementFolderStructure();
    }

    public void implementMultiComponentSelection(){
        salesforceRepository.implementMultiComponentSelection();
    }

    public void createCustomObjectsWithMetadata(){
        salesforceRepository.createCustomObjectsWithMetadata();
    }

    public void createMultiComponentsInLWC(){
        salesforceRepository.createMultiComponentsInLWC();
    }

    public void connectApexClassesAndLWC(){
        salesforceRepository.connectApexClassesAndLWC();
    }

    public void unitTestImplementation(){
        salesforceRepository.unitTestImplementation();
    }

    public void sandboxIntegration(){
        salesforceRepository.sandboxIntegration();
    }

    public void sequenceUserStoriesExecution(){
        salesforceRepository.sequenceUserStoriesExecution();
    }

    public void mergeNewFunctionalityInExistingComponents(){
        salesforceRepository.mergeNewFunctionalityInExistingComponents();
    }

    public void deployGeneratedCode(){
        salesforceRepository.deployGeneratedCode();
    }

    public void developAWSLambdaToContainerizedLambdaFunction(){
        salesforceRepository.developAWSLambdaToContainerizedLambdaFunction();
    }

    public void provideApplicationAccessForPilotTesting(){
        salesforceRepository.provideApplicationAccessForPilotTesting();
    }

}