package com.springboot.app.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.app.model.Employee;
import com.springboot.app.service.EmployeeService;

/**
 * @author Upendra
 *
 */
@RestController
@RequestMapping("/emp")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	/**
	 * @param empname
	 * @return
	 * @throws AppException
	 */
	@GetMapping("/getdata/{empname}/{areacode}")
	public ResponseEntity<List<Employee>> getEmpByName(@PathVariable("empname") String empname,
			@PathVariable("areacode") String areacode) {

		List<Employee> namelist = (List<Employee>) employeeService.findByempname(empname);
		
		return new ResponseEntity<List<Employee>>(namelist, HttpStatus.OK);

	}

	/**
	 * @return
	 */

	@RequestMapping(value = "/index", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Employee>> getAllEmp() {
		List<Employee> list = employeeService.getAllEmp();
		return new ResponseEntity<List<Employee>>(list, HttpStatus.OK);
	}

	/**
	 * @param employee
	 * @return
	 */
	@PutMapping("/update")
	public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee) {
		employeeService.updateEmployee(employee);
		return new ResponseEntity<Employee>(employee, HttpStatus.OK);
	}

	/**
	 * @param employee
	 * @return
	 */
	@RequestMapping(value = "/add", method = RequestMethod.POST, produces = "text/plain")
	public ResponseEntity<String> addEmployee(@RequestBody Employee employee) {
		employeeService.addEmployee(employee);
		return new ResponseEntity<String>("Success", HttpStatus.OK);

	}

	/**
	 * @param empid
	 * @return
	 */
	@RequestMapping(value = "/delete/{empid}", method = RequestMethod.POST, produces = "text/plain")
	public ResponseEntity<String> deleteEmployee(@PathVariable("empid") Long empid) {
		employeeService.deleteEmployee(empid);
		return new ResponseEntity<String>("Success", HttpStatus.OK);
	}

	/**
	 * @param postalcode
	 * @param obsolete
	 * @return
	 *//*
		 * @RequestMapping(value = "/getEmpdata/{postalcode}/{obsolete}", method
		 * = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
		 * public ResponseEntity<Employee>
		 * getEmpdata(@PathVariable("postalcode") String postalcode,
		 * 
		 * @PathVariable("obsolete") Integer obsolete) { Employee list =
		 * employeeService.getEmpdata(postalcode, obsolete); return new
		 * ResponseEntity<Employee>(list, HttpStatus.OK); }
		 */

}
