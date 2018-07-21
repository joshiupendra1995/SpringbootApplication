package com.springboot.app.service;

import java.util.List;

import com.springboot.app.model.Employee;

public interface EmployeeService {

	public void addEmployee(Employee employee);

	public void updateEmployee(Employee employee);

	List<Employee> findByempname(String empname);
	
	List<Employee> getAllEmp();

	public void deleteEmployee(Long empid);

	

}
