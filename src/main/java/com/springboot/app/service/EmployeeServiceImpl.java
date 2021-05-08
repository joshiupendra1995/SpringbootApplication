
package com.springboot.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.app.mapper.EmployeeMapper;
import com.springboot.app.repository.EmployeeDao;
import com.springboot.app.vo.EmployeeVO;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	@Autowired
	private EmployeeMapper employeeMapper;

	public void addEmployee(EmployeeVO employeeVO) {
		employeeDao.save(employeeMapper.getModel(employeeVO));
	}

	@Override
	public List<EmployeeVO> getEmployees() {
		return employeeMapper.getBOList(employeeDao.findAll());

	}

	@Override
	public EmployeeVO getEmployeeById(Long id) {
		return employeeMapper.getBO(employeeDao.findEmployeeByEmpId(id));
	}
}
