package com.springboot.app.vo;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * CreatedBy Upendra
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeVO {

	/** The empid. */
	private Long empId;

	/** The empname. */
	private String empname;

	/** The esalary. */
	private BigDecimal esalary;

	/** The address. */
	private String address;

}
