package com.mph.dao;

import java.util.List;

import com.mph.entity.Employee;
import com.mph.entity.Salary;

/**
* This is the salary Dao interface
* @author Sayantan Basak
* @version 1.0
*/
public interface SalaryDao {
	

	/**
	* This is the create employee method
	* @param salary This is the parameter to create salary
	* 
	*/
	public void createSalary(Salary salary);
	//public List<Employee> getEmployeeList();
	//public List<Employee> deleteEmployee(int eid);
	
	/**
	* This is the update employee method
	* @param salary This is the parameter to updateSalary method
	* 
	*/
	public void updateSalary(Salary salary);
	
	
	/**
	* This is the get salary by Id method
	* @param salary Id
	* @return Salary object
	*/
	public Salary getSalaryById(int sid);
}
