package com.mph.dao;

import java.util.List;

import com.mph.entity.Employee;

public interface EmployeeDao 
{
	
	public void createEmployee(Employee employee);
	public List<Employee> getEmployeeList();
	public List<Employee> updateEmployee(Employee employee);
	public List<Employee> deleteEmployee(int eid);
	public Employee getEmployeeById(int eid);
	
	//public Employee getEmployee(Employee employee);
	//public Employee search(String name);
	//public Employee aEmployee(int eid);
}