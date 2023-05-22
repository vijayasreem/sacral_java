package com.Sacral.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnhancementsRepository extends JpaRepository<Enhancements, Long> {
    Enhancements findByVisuallyAppealing(boolean visuallyAppealing);
    Enhancements findByDesignLanguage(boolean designLanguage);
    Enhancements findByClearFeedback(boolean clearFeedback);
    Enhancements findBySacralAILogo(boolean sacralAILogo);
    Enhancements findByLoginPage(boolean loginPage);
    Enhancements findByHomepage(boolean homepage);
    Enhancements findByPromptsPage(boolean promptsPage);
    Enhancements findByHistoryPage(boolean historyPage);
}