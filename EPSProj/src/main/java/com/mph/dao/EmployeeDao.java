package com.mph.dao;

import java.util.List;

import com.mph.entity.Employee;

/**
* This is the Employee Dao interface 
* @author Sayantan Basak
* @version 1.0
*/
public interface EmployeeDao {
	
	/**
	* This is the create employee method
	* @param employee This is the parameter to create employee
	* 
	*/
	public void createEmployee(Employee employee);
	
	/**
	* This is the get employee list method
	*
	* @return List This returns the list of employees
	*/
	public List<Employee> getEmployeeList();
	
	
	/**
	* This is the delete employee method
	* @param eid this is the parameter to deleteEmployee method
	* @return List This returns the list of Employees
	*/
	public List<Employee> deleteEmployee(int eid);
	
	/**
	* This is the update employee method
	* @param employee This is the parameter to updateEmployee method
	* @return List This returns the list of Employees
	*/
	public List<Employee> updateEmployee(Employee employee);
	
	
	/**
	* This is the get employee by Id method
	* @param eid This is the parameter to getEmployeeById method
	* @return Employee This returns the list of Employee
	*/
	public Employee getEmployeeById(int eid);
}
