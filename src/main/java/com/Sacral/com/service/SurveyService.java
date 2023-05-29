package com.Sacral.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Sacral.com.model.SurveyQuestionChoices;
import com.Sacral.com.model.SurveyQuestions;
import com.Sacral.com.model.SurveyResponse;
import com.Sacral.com.repository.SurveyRepository;

@Service
public class SurveyService {

  @Autowired
  private SurveyRepository surveyRepository;

  // Method to get the survey questions related to a specific survey
  public List<SurveyQuestions> getQuestionsBySurveyId(Long surveyId) {
    return surveyRepository.getQuestionsBySurveyId(surveyId);
  }

  // Method to get the question type based on the question from Survey Question object
  public String getQuestionTypeByQuestionId(Long questionId) {
    return surveyRepository.getQuestionTypeByQuestionId(questionId);
  }

  // Method to get the answers based on the question choices from Survey Question Choices object
  public List<SurveyQuestionChoices> getAnswersByQuestionId(Long questionId) {
    return surveyRepository.getAnswersByQuestionId(questionId);
  }

  // Method to save the survey response to the Survey Response object
  public void saveSurveyResponse(SurveyResponse surveyResponse) {
    surveyRepository.saveSurveyResponse(surveyResponse);
  }

}