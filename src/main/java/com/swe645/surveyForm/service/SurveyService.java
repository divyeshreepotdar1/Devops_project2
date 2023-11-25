package com.swe645.surveyForm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.swe645.surveyForm.repository.SurveyRepo;

public class SurveyService {
	
	@Autowired
	private SurveyRepo surveyRepo;
	
	public List<?> getSurveyData() {
		return surveyRepo.getSurveyData();
	}
}
 