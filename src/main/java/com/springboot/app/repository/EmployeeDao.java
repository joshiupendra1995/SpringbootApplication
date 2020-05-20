/*
 * package com.springboot.app.repository;
 * 
 * import java.util.List;
 * 
 * import org.springframework.data.jpa.repository.JpaRepository; import
 * org.springframework.stereotype.Repository; import
 * com.springboot.app.model.Employee;
 * 
 * @Repository public interface EmployeeDao extends JpaRepository<Employee,
 * Long> {
 * 
 *//**
	 * @param empname
	 * @return
	 */
/*
 * List<Employee> findByEmpname(String empname);
 * 
 *//**
	 * Find by empname and areacode.
	 *
	 * @param empName  the emp name
	 * @param areaCode the area code
	 * @return the list
	 *//*
		 * List<Employee> findByEmpnameAndAreacode(String empName, String areaCode);
		 * 
		 * }
		 */