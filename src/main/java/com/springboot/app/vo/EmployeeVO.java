package com.springboot.app.vo;

/**
 * CreatedBy Upendra
 */
public class EmployeeVO {

	/** The empid. */
	private Long empid;

	/** The empname. */
	private String empname;

	/** The esalary. */
	private String esalary;

	/** The address. */
	private String address;

	/** The postalcode. */
	private String postalcode;

	/** The areacode. */
	private String areacode;

	public EmployeeVO() {

	}

	/**
	 * Instantiates a new employee VO.
	 *
	 * @param empid
	 *            the empid
	 * @param empname
	 *            the empname
	 * @param esalary
	 *            the esalary
	 * @param address
	 *            the address
	 * @param postalcode
	 *            the postalcode
	 * @param areacode
	 *            the areacode
	 */
	public EmployeeVO(Long empid, String empname, String esalary, String address, String postalcode, String areacode) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.esalary = esalary;
		this.address = address;
		this.postalcode = postalcode;
		this.areacode = areacode;
	}

	/**
	 * Gets the empid.
	 *
	 * @return the empid
	 */
	public Long getEmpid() {
		return empid;
	}

	/**
	 * Sets the empid.
	 *
	 * @param empid
	 *            the new empid
	 */
	public void setEmpid(Long empid) {
		this.empid = empid;
	}

	/**
	 * Gets the empname.
	 *
	 * @return the empname
	 */
	public String getEmpname() {
		return empname;
	}

	/**
	 * Sets the empname.
	 *
	 * @param empname
	 *            the new empname
	 */
	public void setEmpname(String empname) {
		this.empname = empname;
	}

	/**
	 * Gets the esalary.
	 *
	 * @return the esalary
	 */
	public String getEsalary() {
		return esalary;
	}

	/**
	 * Sets the esalary.
	 *
	 * @param esalary
	 *            the new esalary
	 */
	public void setEsalary(String esalary) {
		this.esalary = esalary;
	}

	/**
	 * Gets the address.
	 *
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * Sets the address.
	 *
	 * @param address
	 *            the new address
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * Gets the postalcode.
	 *
	 * @return the postalcode
	 */
	public String getPostalcode() {
		return postalcode;
	}

	/**
	 * Sets the postalcode.
	 *
	 * @param postalcode
	 *            the new postalcode
	 */
	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
	}

	/**
	 * Gets the areacode.
	 *
	 * @return the areacode
	 */
	public String getAreacode() {
		return areacode;
	}

	/**
	 * Sets the areacode.
	 *
	 * @param areacode
	 *            the new areacode
	 */
	public void setAreacode(String areacode) {
		this.areacode = areacode;
	}

}
