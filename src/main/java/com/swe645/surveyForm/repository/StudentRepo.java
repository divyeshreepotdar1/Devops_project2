package com.swe645.surveyForm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.swe645.surveyForm.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>{

}
