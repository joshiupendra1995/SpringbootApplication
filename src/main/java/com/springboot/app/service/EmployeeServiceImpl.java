package com.springboot.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springboot.app.model.Employee;
import com.springboot.app.repository.EmployeeDao;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDao employeeDao;

	@Override
	public void addEmployee(Employee employee) {

		// TODO Auto-generated method stub
		employeeDao.save(employee);

	}

	@Override
	public void updateEmployee(Employee employee) {
		employeeDao.saveAndFlush(employee);
	}

	@Override
	public void deleteEmployee(Long empid) {
		employeeDao.deleteById(empid);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.springboot.app.service.EmployeeService#getAllEmp()
	 */
	@Override
	public List<Employee> getAllEmp() {
		return employeeDao.findAll();
	}

	@Override
	public List<Employee> findByempname(String empname) {
		return employeeDao.findByempname(empname);

	}

}
