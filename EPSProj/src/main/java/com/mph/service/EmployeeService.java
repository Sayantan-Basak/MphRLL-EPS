package com.mph.service;

import java.util.List;

import com.mph.entity.Employee;

/**
* This is the employee service interface
* @author Lavanya
* @version 1.0
*/
public interface EmployeeService {
	
	
	/**
	* This is the create employee method
	* @param Employee object
	* @return void
	*/
	public void createEmployee(Employee employee);
	
	
	/**
	* This is the get employee list method
	* @param none
	* @return list of employees
	*/
	public List<Employee> getEmployeeList();
	
	
	/**
	* This is the delete employee method
	* @param employee Id
	* @return list of employees
	*/
	public List<Employee> deleteEmployee(int eid);
	
	
	/**
	* This is the update employee method
	* @param Employee object
	* @return list of employees
	*/
	public List<Employee> updateEmployee(Employee employee);
	
	
	/**
	* This is the get employee by Id method
	* @param employee Id
	* @return Employee object
	*/
	public Employee getEmployeeById(int eid);
}
