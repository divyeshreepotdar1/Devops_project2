package com.swe645.surveyForm.entity;

import java.util.List;

import jakarta.persistence.*;
import java.util.Date;
import lombok.*;

@Entity
@Table(name = "surveys")
@Getter
@Setter
public class Survey {

    public Integer getSurveyId() {
		return surveyId;
	}

	public void setSurveyId(Integer surveyId) {
		this.surveyId = surveyId;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public String getUniversityInterest() {
		return universityInterest;
	}

	public void setUniversityInterest(String universityInterest) {
		this.universityInterest = universityInterest;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getRecommendation() {
		return recommendation;
	}

	public void setRecommendation(String recommendation) {
		this.recommendation = recommendation;
	}

	public List<CampusLike> getCampusLikes() {
		return campusLikes;
	}

	public void setCampusLikes(List<CampusLike> campusLikes) {
		this.campusLikes = campusLikes;
	}

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "surveyId")
    private Integer surveyId;

    @ManyToOne
    @JoinColumn(name = "studentId")
    private Student student;

    @Column(name = "universityInterest")
    private String universityInterest;

    @Column(name = "date")
    private Date date;
    
    @Column(name = "comments")
    private String comments;
    
    @Column(name = "recommendation")
    private String recommendation;
    
    @OneToMany(mappedBy = "survey", cascade = CascadeType.ALL)
    private List<CampusLike> campusLikes;
}