
package com.springboot.app.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Upendra
 *
 */
@Entity
@Table(name = "Employee")
public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "empid")
	private Long empId;

	@Column(name = "empname")
	private String empname;

	@Column(name = "esalary")
	private BigDecimal esalary;

	@Column(name = "address")
	private String address;
	
	public Employee() {
		
	}

	public Employee(Long empId, String empname, BigDecimal esalary, String address) {
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
