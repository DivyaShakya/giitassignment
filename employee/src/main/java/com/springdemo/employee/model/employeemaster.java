package com.springdemo.employee.model;




import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class employeemaster implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="employeeid")
	private Long id;

	@Column(
			name="employeename",
			length = 10,
			nullable = false,
			unique = true)
	private String employeename;

	@Column(
			name="employeecode",
			length = 60,
			nullable = false,
			unique = true)
	private String employeecode;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="address_id")
	private employeeAddress employeeaddress;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmployeename() {
		return employeename;
	}

	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}

	public String getEmployeecode() {
		return employeecode;
	}

	public void setEmployeecode(String employeecode) {
		this.employeecode = employeecode;
	}

	public employeeAddress getEmployeeaddress() {
		return employeeaddress;
	}

	public void setEmployeeaddress(employeeAddress employeeaddress) {
		this.employeeaddress = employeeaddress;
	}

	@Override
	public String toString() {
		return "employeemaster [id=" + id + ", employeename=" + employeename + ", employeecode=" + employeecode
				+ ", employeeaddress=" + employeeaddress + "]";
	}

		
}

