package com.springboot.app.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.springboot.app.model.Employee;
import com.springboot.app.vo.EmployeeVO;

/**
 * CreatedBy Upendra Joshi
 */
@Mapper
public interface EmployeeMapper {

	/**
	 * Gets the model.
	 *
	 * @param employeeVO
	 *            the employee VO
	 * @return the model
	 */
	public Employee getModel(EmployeeVO employeeVO);

	/**
	 * Gets the bo.
	 *
	 * @param employee
	 *            the employee
	 * @return the bo
	 */
	public EmployeeVO getBO(Employee employee);

	/**
	 * Gets the model list.
	 *
	 * @param employeeList
	 *            the employee list
	 * @return the model list
	 */
	public List<Employee> getModelList(List<EmployeeVO> employeeList);

	/**
	 * Gets the BO list.
	 *
	 * @param employeeList the employee list
	 * @return the BO list
	 */
	public List<EmployeeVO> getBOList(List<Employee> employeeList);
}
