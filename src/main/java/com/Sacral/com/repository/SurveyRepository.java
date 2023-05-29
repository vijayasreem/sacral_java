package com.Sacral.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Sacral.com.model.SurveyQuestions;
import com.Sacral.com.model.SurveyQuestionChoices;
import com.Sacral.com.model.SurveyResponse;

public interface SurveyRepository extends JpaRepository<SurveyQuestions, Long> {

// Method to get the survey questions related to a specific survey
List<SurveyQuestions> getQuestionsBySurveyId(Long surveyId);

// Method to get the question type based on the question from Survey Question object
String getQuestionTypeByQuestionId(Long questionId);

// Method to get the answers based on the question choices from Survey Question Choices object
List<SurveyQuestionChoices> getAnswersByQuestionId(Long questionId);

// Method to save the survey response to the Survey Response object
void saveSurveyResponse(SurveyResponse surveyResponse);

}