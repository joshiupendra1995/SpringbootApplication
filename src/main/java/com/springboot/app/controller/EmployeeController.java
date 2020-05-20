package com.springboot.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.app.vo.EmployeeVO;

/**
 * @author Upendra
 *
 */
@RestController
@RequestMapping("/emp")
public class EmployeeController {

	/*
	 * @Autowired private EmployeeService employeeService;
	 */
	/**
	 * @param empname
	 * @return
	 * @throws AppException
	 */
	@GetMapping("/getdata/{empname}/{areacode}")
	public ResponseEntity<List<EmployeeVO>> getEmpByName(@PathVariable("empname") String empname,
			@PathVariable("areacode") String areaCode) {

		List<EmployeeVO> namelist = new ArrayList<>();
		// employeeService.findByEmpnameAndAreacode(empname, areaCode);

		return new ResponseEntity<>(namelist, HttpStatus.OK);

	}

	/**
	 * @return
	 */

	@GetMapping(value = "/getAllEmp", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<EmployeeVO>> getAllEmp() {
		List<EmployeeVO> list = new ArrayList<>();
		list.add(new EmployeeVO(1L, "upendra", "5000", "Pune", "4110350", "022"));
		return new ResponseEntity<>(list, HttpStatus.OK);
	}

	/**
	 * @param EmployeeVO
	 * @return
	 */
	@PutMapping("/update")
	public ResponseEntity<EmployeeVO> updateEmployeeVO(@RequestBody EmployeeVO EmployeeVO) {
		//employeeService.updateEmployee(EmployeeVO);

		return new ResponseEntity<>(EmployeeVO, HttpStatus.OK);
	}

	/**
	 * @param EmployeeVO
	 * @return
	 */
	@PostMapping(value = "/add", produces = "text/plain")
	public ResponseEntity<String> addEmployeeVO(@RequestBody EmployeeVO EmployeeVO) {
		//employeeService.addEmployee(EmployeeVO);
		return new ResponseEntity<>("Success", HttpStatus.OK);

	}

	/**
	 * @param empid
	 * @return
	 */
	@DeleteMapping(value = "/delete/{empid}", produces = "text/plain")
	public ResponseEntity<String> deleteEmployeeVO(@PathVariable("empid") Long empid) {
		//employeeService.deleteEmployee(empid);
		return new ResponseEntity<>("Success", HttpStatus.OK);
	}

}
