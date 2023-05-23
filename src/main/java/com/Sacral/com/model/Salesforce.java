package com.Sacral.com.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Salesforce {

    @Id
    private Long id;
    
    private String userStories;
    
    private String folderStructure;
    
    private String multiComponentSelection;
    
    private String customObjectsWithMetadata;
    
    private String multiComponentsInLWC;
    
    private String apexClassesAndLWC;
    
    private String unitTestImplementation;
    
    private String sandboxIntegration;
    
    private String userStoriesExecution;
    
    private String existingComponents;
    
    private String generatedCode;
    
    private String awsLambda;
    
    private String pilotTesting;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserStories() {
        return userStories;
    }

    public void setUserStories(String userStories) {
        this.userStories = userStories;
    }

    public String getFolderStructure() {
        return folderStructure;
    }

    public void setFolderStructure(String folderStructure) {
        this.folderStructure = folderStructure;
    }

    public String getMultiComponentSelection() {
        return multiComponentSelection;
    }

    public void setMultiComponentSelection(String multiComponentSelection) {
        this.multiComponentSelection = multiComponentSelection;
    }

    public String getCustomObjectsWithMetadata() {
        return customObjectsWithMetadata;
    }

    public void setCustomObjectsWithMetadata(String customObjectsWithMetadata) {
        this.customObjectsWithMetadata = customObjectsWithMetadata;
    }

    public String getMultiComponentsInLWC() {
        return multiComponentsInLWC;
    }

    public void setMultiComponentsInLWC(String multiComponentsInLWC) {
        this.multiComponentsInLWC = multiComponentsInLWC;
    }

    public String getApexClassesAndLWC() {
        return apexClassesAndLWC;
    }

    public void setApexClassesAndLWC(String apexClassesAndLWC) {
        this.apexClassesAndLWC = apexClassesAndLWC;
    }

    public String getUnitTestImplementation() {
        return unitTestImplementation;
    }

    public void setUnitTestImplementation(String unitTestImplementation) {
        this.unitTestImplementation = unitTestImplementation;
    }

    public String getSandboxIntegration() {
        return sandboxIntegration;
    }

    public void setSandboxIntegration(String sandboxIntegration) {
        this.sandboxIntegration = sandboxIntegration;
    }

    public String getUserStoriesExecution() {
        return userStoriesExecution;
    }

    public void setUserStoriesExecution(String userStoriesExecution) {
        this.userStoriesExecution = userStoriesExecution;
    }

    public String getExistingComponents() {
        return existingComponents;
    }

    public void setExistingComponents(String existingComponents) {
        this.existingComponents = existingComponents;
    }

    public String getGeneratedCode() {
        return generatedCode;
    }

    public void setGeneratedCode(String generatedCode) {
        this.generatedCode = generatedCode;
    }

    public String getAwsLambda() {
        return awsLambda;
    }

    public void setAwsLambda(String awsLambda) {
        this.awsLambda = awsLambda;
    }

    public String getPilotTesting() {
        return pilotTesting;
    }

    public void setPilotTesting(String pilotTesting) {
        this.pilotTesting = pilotTesting;
    }


}