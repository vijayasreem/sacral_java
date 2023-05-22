package com.Sacral.com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Sacral.com.repository.EnhancementsRepository;

@Service
public class EnhancementsService {
    @Autowired
    private EnhancementsRepository enhancementsRepository;

    public Enhancements findByVisuallyAppealing(boolean visuallyAppealing) {
        return enhancementsRepository.findByVisuallyAppealing(visuallyAppealing);
    }

    public Enhancements findByDesignLanguage(boolean designLanguage) {
        return enhancementsRepository.findByDesignLanguage(designLanguage);
    }

    public Enhancements findByClearFeedback(boolean clearFeedback) {
        return enhancementsRepository.findByClearFeedback(clearFeedback);
    }

    public Enhancements findBySacralAILogo(boolean sacralAILogo) {
        return enhancementsRepository.findBySacralAILogo(sacralAILogo);
    }

    public Enhancements findByLoginPage(boolean loginPage) {
        return enhancementsRepository.findByLoginPage(loginPage);
    }

    public Enhancements findByHomepage(boolean homepage) {
        return enhancementsRepository.findByHomepage(homepage);
    }

    public Enhancements findByPromptsPage(boolean promptsPage) {
        return enhancementsRepository.findByPromptsPage(promptsPage);
    }

    public Enhancements findByHistoryPage(boolean historyPage) {
        return enhancementsRepository.findByHistoryPage(historyPage);
    }
}