// Spring Boot Controller Class

package com.Sacral.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Sacral.com.model.SurveyQuestionChoices;
import com.Sacral.com.model.SurveyQuestions;
import com.Sacral.com.model.SurveyResponse;
import com.Sacral.com.service.SurveyService;

@RestController
public class SurveyController {

  @Autowired
  private SurveyService surveyService;

  // Controller method to get the survey questions related to a specific survey
  @GetMapping("/survey/questions")
  public List<SurveyQuestions> getQuestionsBySurveyId(@RequestParam Long surveyId) {
    return surveyService.getQuestionsBySurveyId(surveyId);
  }

  // Controller method to get the question type based on the question from Survey Question object
  @GetMapping("/survey/questions/type")
  public String getQuestionTypeByQuestionId(@RequestParam Long questionId) {
    return surveyService.getQuestionTypeByQuestionId(questionId);
  }

  // Controller method to get the answers based on the question choices from Survey Question Choices object
  @GetMapping("/survey/questions/answers")
  public List<SurveyQuestionChoices> getAnswersByQuestionId(@RequestParam Long questionId) {
    return surveyService.getAnswersByQuestionId(questionId);
  }

  // Controller method to save the survey response to the Survey Response object
  @PostMapping("/survey/response")
  public void saveSurveyResponse(@RequestBody SurveyResponse surveyResponse) {
    surveyService.saveSurveyResponse(surveyResponse);
  }

}