package com.springboot.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.springboot.app.model.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Long> {

	/**
	 * @param empname
	 * @return
	 */
	List<Employee> findByempname(String empname);

}
