package com.springboot.app.service;

import java.util.List;

import com.springboot.app.model.Employee;

public interface EmployeeService {

	public void addEmployee(Employee employee);

	void updateEmployee(Employee employee);

	List<Employee> findByempname(String empname);
	
	List<Employee> getAllEmp();

	void deleteEmployee(Long empid);

	//public Employee getEmpdata(String postalcode, Integer obsolete);

	//public List<Employee> getEmpByAreaCode(String areacode);
	

}
