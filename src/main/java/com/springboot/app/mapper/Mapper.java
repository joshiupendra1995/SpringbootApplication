package com.springboot.app.mapper;

import java.util.ArrayList;
import java.util.List;

import com.springboot.app.model.Employee;
import com.springboot.app.vo.EmployeeVO;

/**
 * CreatedBy Upendra.
 */
public abstract class Mapper {

	public abstract Employee getModel(EmployeeVO employeeVO);

	public abstract EmployeeVO getBO(Employee employee);

	/**
	 * Gets the model list.
	 *
	 * @param empVOList
	 *            the emp VO list
	 * @return the model list
	 */
	public List<Employee> getModelList(List<EmployeeVO> empVOList) {

		List<Employee> listEmp = new ArrayList<>();
		empVOList.forEach(emp -> {
			listEmp.add(new Employee(emp.getEmpid(), emp.getEmpname(), emp.getEsalary(), emp.getAddress(),
					emp.getPostalcode(), emp.getAreacode()));
		});

		return listEmp;
	}

	/**
	 * Gets the BO list.
	 *
	 * @param empList the emp list
	 * @return the BO list
	 */
	public List<EmployeeVO> getBOList(List<Employee> empList) {

		List<EmployeeVO> listEmp = new ArrayList<>();
		empList.forEach(emp -> {
			listEmp.add(new EmployeeVO(emp.getEmpid(), emp.getEmpname(), emp.getEsalary(), emp.getAddress(),
					emp.getPostalcode(), emp.getAreacode()));
		});

		return listEmp;
	}

}
