package com.Sacral.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Sacral.com.service.EnhancementsService;

@RestController
@RequestMapping("/enhancements")
public class EnhancementsController {

    @Autowired
    private EnhancementsService enhancementsService;

    @GetMapping("/visuallyAppealing")
    public Enhancements getEnhancementsByVisuallyAppealing(boolean visuallyAppealing) {
        return enhancementsService.findByVisuallyAppealing(visuallyAppealing);
    }

    @GetMapping("/designLanguage")
    public Enhancements getEnhancementsByDesignLanguage(boolean designLanguage) {
        return enhancementsService.findByDesignLanguage(designLanguage);
    }

    @GetMapping("/clearFeedback")
    public Enhancements getEnhancementsByClearFeedback(boolean clearFeedback) {
        return enhancementsService.findByClearFeedback(clearFeedback);
    }

    @GetMapping("/sacralAILogo")
    public Enhancements getEnhancementsBySacralAILogo(boolean sacralAILogo) {
        return enhancementsService.findBySacralAILogo(sacralAILogo);
    }

    @GetMapping("/loginPage")
    public Enhancements getEnhancementsByLoginPage(boolean loginPage) {
        return enhancementsService.findByLoginPage(loginPage);
    }

    @GetMapping("/homepage")
    public Enhancements getEnhancementsByHomepage(boolean homepage) {
        return enhancementsService.findByHomepage(homepage);
    }

    @GetMapping("/promptsPage")
    public Enhancements getEnhancementsByPromptsPage(boolean promptsPage) {
        return enhancementsService.findByPromptsPage(promptsPage);
    }

    @GetMapping("/historyPage")
    public Enhancements getEnhancementsByHistoryPage(boolean historyPage) {
        return enhancementsService.findByHistoryPage(historyPage);
    }

}