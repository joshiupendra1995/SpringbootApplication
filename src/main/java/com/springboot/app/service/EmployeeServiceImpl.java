package com.springboot.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.app.mapper.EmployeeMapper;
import com.springboot.app.model.Employee;
import com.springboot.app.repository.EmployeeDao;
import com.springboot.app.vo.EmployeeVO;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	@Autowired
	private EmployeeMapper employeeMapper;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.springboot.app.service.EmployeeService#addEmployee(com.springboot.app
	 * .model.Employee)
	 */
	@Override
	public void addEmployee(EmployeeVO employeeVO) {
		employeeDao.save(employeeMapper.getModel(employeeVO));

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.springboot.app.service.EmployeeService#updateEmployee(com.springboot.
	 * app.model.Employee)
	 */
	@Override
	public void updateEmployee(EmployeeVO employeeVO) {
		employeeDao.saveAndFlush(employeeMapper.getModel(employeeVO));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.springboot.app.service.EmployeeService#deleteEmployee(java.lang.Long)
	 */
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
	public List<EmployeeVO> getAllEmp() {
		List<Employee> empList = employeeDao.findAll();
		List<EmployeeVO> empVOList = new ArrayList<>();

		empList.forEach(emp -> {
			empVOList.add(employeeMapper.getBO(emp));
		});

		return empVOList;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.springboot.app.service.EmployeeService#findByempname(java.lang.
	 * String)
	 */
	@Override
	public List<EmployeeVO> findByempname(String empname) {
		List<Employee> empList = employeeDao.findByempname(empname);
		List<EmployeeVO> empVOList = new ArrayList<>();

		empList.forEach(emp -> {
			empVOList.add(employeeMapper.getBO(emp));
		});

		return empVOList;

	}

}
