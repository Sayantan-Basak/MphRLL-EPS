package com.mph.service;

import java.util.List;

import com.mph.entity.Employee;
import com.mph.entity.Salary;

/**
* This is the salary service interface
* @author Lavanya
* @version 1.0
*/
public interface SalaryService {

	
	/**
	* This is the create salary method
	* @param salary object
 	* @return void
	*/
	public void createSalary(Salary salary);
	
	
	/**
	* This is the update salary method
	* @param salary object
	* @return void
	*/
	public void updateSalary(Salary salary);
	
	
	/**
	* This is the get salary by Id method
	* @param salary Id
	* @return salary object
	*/
	public Salary getSalaryById(int sid);
	
}
