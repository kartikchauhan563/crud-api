package com.crudapi.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crudapi.model.Passenger;


public interface PassengerRepo extends JpaRepository<Passenger, Long>{

	Passenger findByName(String name);

}
