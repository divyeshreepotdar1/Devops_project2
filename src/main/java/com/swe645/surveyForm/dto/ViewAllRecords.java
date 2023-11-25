package com.swe645.surveyForm.dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class ViewAllRecords {
	
	public String firstName;
	public String lastName;
	public Boolean won;
	public LocalDate surveyDate;
    
    public ViewAllRecords(String firstName, String lastName, Boolean won, LocalDate surveyDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.won = won;
        this.surveyDate = surveyDate;
    }
	
}
