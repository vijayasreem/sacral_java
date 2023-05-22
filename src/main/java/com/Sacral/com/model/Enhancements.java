package com.Sacral.com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Enhancements {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private boolean visuallyAppealing;
    private boolean designLanguage;
    private boolean clearFeedback;
    private boolean sacralAILogo;
    private boolean loginPage;
    private boolean homepage;
    private boolean promptsPage;
    private boolean historyPage;

    public Enhancements() {
    }

    public Enhancements(boolean visuallyAppealing, boolean designLanguage, boolean clearFeedback, boolean sacralAILogo, boolean loginPage, boolean homepage, boolean promptsPage, boolean historyPage) {
        this.visuallyAppealing = visuallyAppealing;
        this.designLanguage = designLanguage;
        this.clearFeedback = clearFeedback;
        this.sacralAILogo = sacralAILogo;
        this.loginPage = loginPage;
        this.homepage = homepage;
        this.promptsPage = promptsPage;
        this.historyPage = historyPage;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isVisuallyAppealing() {
        return visuallyAppealing;
    }

    public void setVisuallyAppealing(boolean visuallyAppealing) {
        this.visuallyAppealing = visuallyAppealing;
    }

    public boolean isDesignLanguage() {
        return designLanguage;
    }

    public void setDesignLanguage(boolean designLanguage) {
        this.designLanguage = designLanguage;
    }

    public boolean isClearFeedback() {
        return clearFeedback;
    }

    public void setClearFeedback(boolean clearFeedback) {
        this.clearFeedback = clearFeedback;
    }

    public boolean isSacralAILogo() {
        return sacralAILogo;
    }

    public void setSacralAILogo(boolean sacralAILogo) {
        this.sacralAILogo = sacralAILogo;
    }

    public boolean isLoginPage() {
        return loginPage;
    }

    public void setLoginPage(boolean loginPage) {
        this.loginPage = loginPage;
    }

    public boolean isHomepage() {
        return homepage;
    }

    public void setHomepage(boolean homepage) {
        this.homepage = homepage;
    }

    public boolean isPromptsPage() {
        return promptsPage;
    }

    public void setPromptsPage(boolean promptsPage) {
        this.promptsPage = promptsPage;
    }

    public boolean isHistoryPage() {
        return historyPage;
    }

    public void setHistoryPage(boolean historyPage) {
        this.historyPage = historyPage;
    }
}