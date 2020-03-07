package com.springboot.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

import com.springboot.app.service.EmployeeService;
import com.springboot.app.vo.EmployeeVO;

/**
 * @author Upendra
 *
 */
@RestController
@RequestMapping("/emp")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	/**
	 * @param empname
	 * @return
	 * @throws AppException
	 */
	@GetMapping("/getdata/{empname}/{areacode}")
	public ResponseEntity<List<EmployeeVO>> getEmpByName(@PathVariable("empname") String empname,
			@PathVariable("areacode") String areacode) {

		List<EmployeeVO> namelist = employeeService.findByempname(empname);

		return new ResponseEntity<>(namelist, HttpStatus.OK);

	}

	/**
	 * @return
	 */

	@GetMapping(value = "/getAllEmp", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<EmployeeVO>> getAllEmp() {
		List<EmployeeVO> list = employeeService.getAllEmp();
		return new ResponseEntity<>(list, HttpStatus.OK);
	}

	/**
	 * @param EmployeeVO
	 * @return
	 */
	@PutMapping("/update")
	public ResponseEntity<EmployeeVO> updateEmployeeVO(@RequestBody EmployeeVO EmployeeVO) {
		employeeService.updateEmployeeVO(EmployeeVO);

		return new ResponseEntity<>(EmployeeVO, HttpStatus.OK);
	}

	/**
	 * @param EmployeeVO
	 * @return
	 */
	@PostMapping(value = "/add", produces = "text/plain")
	public ResponseEntity<String> addEmployeeVO(@RequestBody EmployeeVO EmployeeVO) {
		employeeService.addEmployeeVO(EmployeeVO);
		return new ResponseEntity<>("Success", HttpStatus.OK);

	}

	/**
	 * @param empid
	 * @return
	 */
	@DeleteMapping(value = "/delete/{empid}", produces = "text/plain")
	public ResponseEntity<String> deleteEmployeeVO(@PathVariable("empid") Long empid) {
		employeeService.deleteEmployeeVO(empid);
		return new ResponseEntity<>("Success", HttpStatus.OK);
	}

}
