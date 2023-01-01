package com.patricien.springbootproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.patricien.springbootproject.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
