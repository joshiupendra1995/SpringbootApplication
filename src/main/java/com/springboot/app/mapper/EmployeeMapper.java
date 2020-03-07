package com.springboot.app.mapper;

import org.springframework.stereotype.Component;

import com.springboot.app.model.Employee;
import com.springboot.app.vo.EmployeeVO;


/**
 * CreatedBy Upendra Joshi
 */
@Component
public class EmployeeMapper {

	/**
	 * Gets the model.
	 *
	 * @param employeeVO the employee VO
	 * @return the model
	 */
	public Employee getModel(EmployeeVO employeeVO) {

		Employee employee = new Employee();
		employee.setAddress(employeeVO.getAddress());
		employee.setAreacode(employeeVO.getAreacode());
		employee.setEmpid(employeeVO.getEmpid());
		employee.setEmpname(employeeVO.getEmpname());
		employee.setEsalary(employeeVO.getEsalary());
		employee.setPostalcode(employeeVO.getPostalcode());
		return employee;
	}

	/**
	 * Gets the bo.
	 *
	 * @param employee the employee
	 * @return the bo
	 */
	public EmployeeVO getBO(Employee employee) {

		EmployeeVO employeeVO = new EmployeeVO();
		employeeVO.setAddress(employee.getAddress());
		employeeVO.setAreacode(employee.getAreacode());
		employeeVO.setEmpid(employee.getEmpid());
		employeeVO.setEmpname(employee.getEmpname());
		employeeVO.setEsalary(employee.getEsalary());
		employeeVO.setPostalcode(employee.getPostalcode());
		return employeeVO;
	}
}
