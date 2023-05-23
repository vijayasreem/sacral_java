package com.Sacral.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SalesforceRepository extends JpaRepository<Salesforce, Long>{

    // Method to retrieve all the user stories related code in a single project
    List<Salesforce> findAllByUserStories();

    // Method to implement the folder structure
    void implementFolderStructure();

    // Method to implement multiple component selection
    void implementMultiComponentSelection();

    // Method to create custom objects with metadata
    void createCustomObjectsWithMetadata();

    // Method to create multiple components in LWC and connect them
    void createMultiComponentsInLWC();

    // Method to connect Apex classes and LWC components
    void connectApexClassesAndLWC();

    // Method to unit test implementation
    void unitTestImplementation();

    // Method to sandbox integration
    void sandboxIntegration();

    // Method to sequence user stories execution
    void sequenceUserStoriesExecution();

    // Method to merge new functionality in existing components
    void mergeNewFunctionalityInExistingComponents();

    // Method to deploy generated code
    void deployGeneratedCode();

    // Method to develop AWS Lambda to containerized lambda function 
    void developAWSLambdaToContainerizedLambdaFunction();

    // Method to provide application access for pilot testing
    void provideApplicationAccessForPilotTesting();

}