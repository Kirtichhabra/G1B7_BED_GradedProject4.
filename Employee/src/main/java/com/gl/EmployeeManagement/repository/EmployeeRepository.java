package com.gl.EmployeeManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gl.EmployeeManagement.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
