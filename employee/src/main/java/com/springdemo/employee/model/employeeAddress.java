package com.springdemo.employee.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="EMPLOYEE_ADDRESS")
public class employeeAddress implements Serializable {

	@Id
	@Column(name="addressid")
	public long addressId;
	
	@Column(name="Street")
	public String street;
	
	@Column(name="city")
	public String city;
	
	@Column(name="state")
	public String state;
	
	@Column(name="pin")
	public String pin;
	
//	@OneToOne(cascade = CascadeType.ALL,mappedBy = "employeeaddress")
//	private employeemaster employee;

	public long getAddressId() {
		return addressId;
	}

	public void setAddressId(long addressId) {
		this.addressId = addressId;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

//	public employeemaster getEmployee() {
//		return employee;
//	}
//
//	public void setEmployee(employeemaster employee) {
//		this.employee = employee;
//	}

	@Override
	public String toString() {
		return "employeeAddress [addressId=" + addressId + ", street=" + street + ", city=" + city + ", state=" + state
				+ ", pin=" + pin + "]";
	}
	
	
	
	
}
