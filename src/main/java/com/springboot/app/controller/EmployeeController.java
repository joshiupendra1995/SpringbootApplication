package com.springboot.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.app.service.EmployeeService;
import com.springboot.app.vo.EmployeeVO;

/**
 * @author Upendra
 *
 */
@RestController
@RequestMapping("/emp")
@CrossOrigin("*")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	/**
	 * Adds the employee VO.
	 *
	 * @param EmployeeVO the employee VO
	 * @return the response entity
	 */
	@PostMapping(value = "/add", produces = "text/plain")
	public ResponseEntity<String> addEmployeeVO(@RequestBody EmployeeVO employeeVO) {
		employeeService.addEmployee(employeeVO);
		return new ResponseEntity<>("Success", HttpStatus.OK);

	}

	@GetMapping(value = "/getAllEmployees")
	public ResponseEntity<List<EmployeeVO>> getEmployees() {
		List<EmployeeVO> employees = employeeService.getEmployees();
		return new ResponseEntity<>(employees, HttpStatus.OK);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<EmployeeVO> getEmployeeById(@PathVariable Long id) {
		EmployeeVO employeeVO = employeeService.getEmployeeById(id);
		return new ResponseEntity<>(employeeVO, HttpStatus.OK);
	}

}
