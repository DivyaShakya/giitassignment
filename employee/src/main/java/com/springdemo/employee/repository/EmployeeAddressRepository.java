package com.springdemo.employee.repository;

import org.springframework.data.repository.CrudRepository;

import com.springdemo.employee.model.employeeAddress;

public interface EmployeeAddressRepository extends CrudRepository<employeeAddress, Long> {

}
