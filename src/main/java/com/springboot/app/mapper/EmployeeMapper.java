
package com.springboot.app.mapper;

import java.util.ArrayList;
import java.util.List;

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

		Employee emp = new Employee();

		emp.setAddress(employeeVO.getAddress());
		emp.setEmpId(employeeVO.getEmpId());
		emp.setEsalary(employeeVO.getEsalary());
		emp.setEmpname(employeeVO.getEmpname());
		return emp;

	}

	/**
	 * Gets the bo.
	 *
	 * @param employee the employee
	 * @return the bo
	 */

	public EmployeeVO getBO(Employee employee) {
		EmployeeVO empVO = new EmployeeVO();

		empVO.setAddress(employee.getAddress());
		empVO.setEmpId(employee.getEmpId());
		empVO.setEsalary(employee.getEsalary());
		empVO.setEmpname(employee.getEmpname());
		return empVO;

	}

	public List<EmployeeVO> getBOList(List<Employee> employees) {
		List<EmployeeVO> listEmpVO = new ArrayList<>();
		employees.forEach(emp -> {
			listEmpVO.add(getBO(emp));

		});

		return listEmpVO;
	}

}
