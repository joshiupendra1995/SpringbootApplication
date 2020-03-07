package com.springboot.app.service;

import java.util.List;

import com.springboot.app.model.Employee;
import com.springboot.app.vo.EmployeeVO;

public interface EmployeeService {

	public void addEmployee(EmployeeVO employeeVO);

	public void updateEmployee(EmployeeVO employeeVO);

	List<EmployeeVO> findByempname(String empname);

	List<EmployeeVO> getAllEmp();

	public void deleteEmployee(Long empid);

}
