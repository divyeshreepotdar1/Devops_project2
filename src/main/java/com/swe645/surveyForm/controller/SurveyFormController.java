package com.swe645.surveyForm.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.swe645.surveyForm.dto.FormDTO;
import com.swe645.surveyForm.dto.ViewAllRecords;
import com.swe645.surveyForm.entity.CampusLike;
import com.swe645.surveyForm.entity.Raffle;
import com.swe645.surveyForm.entity.Student;
import com.swe645.surveyForm.entity.Survey;
import com.swe645.surveyForm.repository.CampusLikeRepo;
import com.swe645.surveyForm.repository.RaffleRepo;
import com.swe645.surveyForm.repository.StudentRepo;
import com.swe645.surveyForm.repository.SurveyRepo;

@RestController
public class SurveyFormController {
	@Autowired
	private StudentRepo studentrepo;
	
	@Autowired
	private RaffleRepo rafflerepo;
	
	@Autowired
	private CampusLikeRepo campuslikerepo;
	
	@Autowired
	private SurveyRepo surveyrepo;
	
	
	//GET API Function to fetch all surveys
	@GetMapping(path="form/viewAllRecords", produces = "application/json")
	public ResponseEntity<List<ViewAllRecords>> getSurveyData() {
	    List<ViewAllRecords> records = new ArrayList<>();
	    List<Object[]> data = surveyrepo.getSurveyData();
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.S");
	    
	    for (Object[] row : data) {
	        String firstName = (String) row[0];
	        String lastName = (String) row[1];
	        Boolean won = (Boolean) row[2];
	       
	        String dateString = row[3].toString();
	        LocalDate date = LocalDate.parse(dateString, formatter);
	        
	        ViewAllRecords record = new ViewAllRecords(firstName, lastName, won, date);
	        records.add(record);
	    }
	    HttpHeaders headers = new HttpHeaders();
	    headers.setContentType(MediaType.APPLICATION_JSON);

	    return ResponseEntity.ok()
	            .headers(headers)
	            .body(records);
	}


	//POST API Function to save form data in Database
	@PostMapping("/form/submit")
	public ResponseEntity<?> submitForm(@RequestBody FormDTO formDTO) {
	    // map fields from FormDTO to Student entity
		System.out.println(formDTO);
	    Student student = new Student();
	    student.setFirstName(formDTO.getFirstName());
	    student.setLastName(formDTO.getLastName());
	    student.setAddress(formDTO.getStreetAddress());
	    student.setCity(formDTO.getCity());
	    student.setState(formDTO.getState());
	    student.setZipCode(formDTO.getZip());
	    student.setPhoneNumber(formDTO.getTelephoneNumber());
	    student.setEmail(formDTO.getEmail());
	    studentrepo.save(student);
	    
	    // map fields from FormDTO to Survey entity
	    Survey survey = new Survey();
	    survey.setUniversityInterest(formDTO.getUniversityInterest());
	    survey.setDate(formDTO.getSurveyDate());
	    survey.setRecommendation(formDTO.getRecommendation());
	    survey.setStudent(student);
	    surveyrepo.save(survey);
	    
	    // map fields from FormDTO to CampusLike entity
	    CampusLike campusLike = new CampusLike();
	    for(String opt:formDTO.getLikes())
	    {
	    	switch(opt) {
	    	case "optionStudent":
	    		campusLike.setOptionStudent(true);
	    		break;
	    	case "optionLocation":
	    		campusLike.setOptionLocation(true);
	    		break;
	    	case "optionCampus":
	    		campusLike.setOptionCampus(true);
	    		break;
	    	case "optionAtmosphere":
	    		campusLike.setOptionAtmosphere(true);
	    		break;
	    	case "optionDormRooms":
	    		campusLike.setOptionDormRooms(true);
	    		break;
	    	case "optionSports":
	    		campusLike.setOptionSports(true);
	    		break;
	    	}
	    }
	    campusLike.setSurvey(survey);
	    campuslikerepo.save(campusLike);

	    // map fields from FormDTO to Raffle entity
	    Raffle raffle = new Raffle();
	    raffle.setNumbersEntered(formDTO.getNumbersEntered());
	    raffle.setWon(formDTO.getWon());
	    raffle.setStudent(student);
	    rafflerepo.save(raffle);
	    
	    return ResponseEntity.ok().build();
	}
}
