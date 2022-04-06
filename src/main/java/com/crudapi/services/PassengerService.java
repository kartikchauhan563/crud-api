package com.crudapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crudapi.model.Passenger;
import com.crudapi.repo.PassengerRepo;

@Service
public class PassengerService {
	
	@Autowired
	private PassengerRepo repo;
	
	//save passenger info
	public Passenger savePassenger(Passenger passenger) {
		return repo.save(passenger);
	}
	
	//save list of passengers info
	public List<Passenger> savePassenger(List<Passenger> passengers){
		return repo.saveAll(passengers);
	}
	
	//get passengers
	public List<Passenger> getPassengers(){
		return repo.findAll();
	}
	
	//get passengers by id
	public Passenger getPassengerById(Long id) {
		return repo.findById(id).orElse(null);
	}
	
	//get passengers by name
	public Passenger getPassengerByName(String name) {
		return repo.findByName(name);
	}
	
	//delete passengers
	public String deletePassenger(Long id) {
		repo.deleteById(id);
		return "passenger removed || "+id;
	}
	
	
	//update passengers
	public Passenger updatePassenger(Passenger passenger) {
		Passenger existingPassenger = repo.findById(passenger.getId()).orElse(null);
		existingPassenger.setFirst_name(passenger.getFirst_name());
		existingPassenger.setLast_name(passenger.getLast_name());
		existingPassenger.setMiddle_name(passenger.getMiddle_name());
		existingPassenger.setEmail(passenger.getEmail());
		existingPassenger.setPhone(passenger.getPhone());
		return repo.save(existingPassenger);
	}
	
	
	
	
}
