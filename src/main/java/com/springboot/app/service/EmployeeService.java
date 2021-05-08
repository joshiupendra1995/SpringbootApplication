package com.springboot.app.service;

import java.util.List;

import com.springboot.app.vo.EmployeeVO;

public interface EmployeeService {

	public void addEmployee(EmployeeVO employeeVO);

	public List<EmployeeVO> getEmployees();

	public EmployeeVO getEmployeeById(Long id);


}
