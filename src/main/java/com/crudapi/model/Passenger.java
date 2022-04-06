package com.crudapi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Passenger {

	@Id
	@GeneratedValue
	private Long id;
	private String first_name;
	private String last_name;
	private String middle_name;
	private String email;
	private Long phone;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getMiddle_name() {
		return middle_name;
	}
	public void setMiddle_name(String middle_name) {
		this.middle_name = middle_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getPhone() {
		return phone;
	}
	public void setPhone(Long phone) {
		this.phone = phone;
	}
	public Passenger(Long id, String first_name, String last_name, String middle_name, String email, Long phone) {
		super();
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.middle_name = middle_name;
		this.email = email;
		this.phone = phone;
	}
	public Passenger() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Passenger [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", middle_name="
				+ middle_name + ", email=" + email + ", phone=" + phone + "]";
	}
	
	
	

}
