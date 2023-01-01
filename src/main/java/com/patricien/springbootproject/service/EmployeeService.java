package com.patricien.springbootproject.service;

import java.util.List;

import com.patricien.springbootproject.model.Employee;

public interface EmployeeService {
	Employee saveEmployee(Employee employee);
	List<Employee> getAllEmployees();
	Employee getEmployeeById(long rssbNo);
	Employee updateEmployee(Employee employee, long id);
	void deleteEmployee(long id);


}
