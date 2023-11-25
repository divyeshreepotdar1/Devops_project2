package com.swe645.surveyForm.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "raffles")
@Getter
@Setter
public class Raffle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "raffleId")
    private Integer raffleId;
    
    @ManyToOne
    @JoinColumn(name = "studentId")
    private Student student;

    @Column(name = "numbersEntered")
    private String numbersEntered;

    public Integer getRaffleId() {
		return raffleId;
	}

	public void setRaffleId(Integer raffleId) {
		this.raffleId = raffleId;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
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

	@Column(name = "won")
    private Boolean won;
}
