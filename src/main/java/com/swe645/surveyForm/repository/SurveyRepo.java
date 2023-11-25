package com.swe645.surveyForm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.swe645.surveyForm.entity.Survey;

public interface SurveyRepo extends JpaRepository<Survey, Integer>{
	@Query(nativeQuery = true, value = "SELECT stu.first_name AS firstName, stu.last_name AS lastName, raf.won AS won_raffleTickets, sur.date AS surveyDate "
			+ "FROM students stu, raffles raf, surveys sur "
			+ "WHERE stu.student_id = sur.student_id AND stu.student_id = raf.student_id")
	 List<Object[]> getSurveyData();
}
