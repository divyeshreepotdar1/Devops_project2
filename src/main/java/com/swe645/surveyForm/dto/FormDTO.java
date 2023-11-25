package com.swe645.surveyForm.dto;

import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class FormDTO {

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getStreetAddress() {
		return streetAddress;
	}
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getTelephoneNumber() {
		return telephoneNumber;
	}
	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getSurveyDate() {
		return surveyDate;
	}
	public void setSurveyDate(Date surveyDate) {
		this.surveyDate = surveyDate;
	}
	public String getUniversityInterest() {
		return universityInterest;
	}
	public void setUniversityInterest(String universityInterest) {
		this.universityInterest = universityInterest;
	}
	public String getRecommendation() {
		return recommendation;
	}
	public void setRecommendation(String recommendation) {
		this.recommendation = recommendation;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public List<String> getLikes() {
		return Likes;
	}
	public void setLikes(List<String> likes) {
		Likes = likes;
	}
	public Boolean getOptionStudent() {
		return optionStudent;
	}
	public void setOptionStudent(Boolean optionStudent) {
		this.optionStudent = optionStudent;
	}
	public Boolean getOptionLocation() {
		return optionLocation;
	}
	public void setOptionLocation(Boolean optionLocation) {
		this.optionLocation = optionLocation;
	}
	public Boolean getOptionCampus() {
		return optionCampus;
	}
	public void setOptionCampus(Boolean optionCampus) {
		this.optionCampus = optionCampus;
	}
	public Boolean getOptionAtmosphere() {
		return optionAtmosphere;
	}
	public void setOptionAtmosphere(Boolean optionAtmosphere) {
		this.optionAtmosphere = optionAtmosphere;
	}
	public Boolean getOptionDormRooms() {
		return optionDormRooms;
	}
	public void setOptionDormRooms(Boolean optionDormRooms) {
		this.optionDormRooms = optionDormRooms;
	}
	public Boolean getOptionSports() {
		return optionSports;
	}
	public void setOptionSports(Boolean optionSports) {
		this.optionSports = optionSports;
	}
	public String getNumbersEntered() {
		return numbersEntered;
	}
	public void setNumbersEntered(String numbersEntered) {
		this.numbersEntered = numbersEntered;
	}
	public Boolean getWon() {
		return won;
	}
	public void setWon(Boolean won) {
		this.won = won;
	}
		// fields from Student class
		private String firstName;
	    private String lastName;
	    private String streetAddress;
	    private String city;
	    private String state;
	    private String zip;
	    private String telephoneNumber;
	    private String email;
	    
	    // fields from Survey class
	    private Date surveyDate;
	    private String universityInterest;
	    private String recommendation;
	    
	    private String comments;

	    
	    // fields from CampusLike class
	    private List<String> Likes;
	    private Boolean optionStudent;
	    private Boolean optionLocation;
	    private Boolean optionCampus;
	    private Boolean optionAtmosphere;
	    private Boolean optionDormRooms;
	    private Boolean optionSports;
	    
	    // fields from Raffle class
	    private String numbersEntered;
	    private Boolean won;
}
