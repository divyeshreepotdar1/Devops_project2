package com.swe645.surveyForm.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "campus_likes")
public class CampusLike {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "campusLikesId")
    private Integer campusLikesId;

    @ManyToOne
    @JoinColumn(name = "surveyId")
    private Survey survey;

    @Column(name = "optionStudent")
    private Boolean optionStudent = false;

    public Integer getCampusLikesId() {
		return campusLikesId;
	}

	public void setCampusLikesId(Integer campusLikesId) {
		this.campusLikesId = campusLikesId;
	}

	public Survey getSurvey() {
		return survey;
	}

	public void setSurvey(Survey survey) {
		this.survey = survey;
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

	@Column(name = "optionLocation")
    private Boolean optionLocation = false;

    @Column(name = "optionCampus")
    private Boolean optionCampus = false;

    @Column(name = "optionAtmosphere")
    private Boolean optionAtmosphere = false;

    @Column(name = "optionDormRooms")
    private Boolean optionDormRooms = false;

    @Column(name = "optionSports")
    private Boolean optionSports = false;

}
