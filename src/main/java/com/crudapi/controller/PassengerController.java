package com.crudapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.crudapi.model.Passenger;
import com.crudapi.services.PassengerService;

@RestController
public class PassengerController {

	@Autowired
	private PassengerService pService;
	
	//add product
	@PostMapping("/addPassenger")
	public Passenger addPassenger(@RequestParam Passenger passenger) {
		return pService.savePassenger(passenger);
	}
	
	//save all the passengers
	@PostMapping("/addPassengers")
	public List<Passenger> addAllPassengers(@RequestParam List<Passenger> passenger){
		return pService.savePassenger(passenger);
	}
	
	//get passengers
	@GetMapping("/passengers")
	public List<Passenger> findPassengers(){
		return pService.getPassengers();
	}
	
	//get passengers by id
	@GetMapping("/passenger/{id}")
	public Passenger findPassengerById(@PathVariable Long id) {
		return pService.getPassengerById(id);
	}
	
	//get passengers by name
	@GetMapping("/passenger/{name}")
	public Passenger findPassengerByName(@PathVariable String name) {
		return pService.getPassengerByName(name);
	}
	
	
	//update passengers
	@PutMapping("/update")
	public Passenger updatePassenger(@RequestParam Passenger passenger) {
		return pService.savePassenger(passenger);
	}
	
	//delete passengers
	@DeleteMapping("/delete/{id}")
	public String deleteById(@PathVariable Long id) {
		return pService.deletePassenger(id);
	}
	
	
}
