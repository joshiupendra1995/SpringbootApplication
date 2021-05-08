package com.springboot.app.vo;

import java.math.BigDecimal;

/**
 * CreatedBy Upendra
 */
public class EmployeeVO {

	/** The empid. */
	private Long empId;

	/** The empname. */
	private String empname;

	/** The esalary. */
	private BigDecimal esalary;

	/** The address. */
	private String address;

	public EmployeeVO() {

	}

	public EmployeeVO(Long empId, String empname, BigDecimal esalary, String address) {
		super();
		this.empId = empId;
		this.empname = empname;
		this.esalary = esalary;
		this.address = address;
	}

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public BigDecimal getEsalary() {
		return esalary;
	}

	public void setEsalary(BigDecimal esalary) {
		this.esalary = esalary;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
