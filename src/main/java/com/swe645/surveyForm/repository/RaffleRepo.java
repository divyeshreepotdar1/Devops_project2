package com.swe645.surveyForm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.swe645.surveyForm.entity.Raffle;

public interface RaffleRepo extends JpaRepository<Raffle, Integer> {

}
