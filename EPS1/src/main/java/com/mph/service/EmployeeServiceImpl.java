package com.mph.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.mph.entity.Employee;
import com.mph.dao.EmployeeDao;
public class EmployeeServiceImpl implements EmployeeService
{
		
	@Autowired
	EmployeeDao employeeDao;
	
	@Override
	public void createEmployee(Employee employee) 
	{
		employeeDao.createEmployee(employee);
	}

	@Override
	public List<Employee> getEmployeeList() 
	{
		return employeeDao.getEmployeeList();
	}

	@Override
	public List<Employee> updateEmployee(Employee employee)
	{
		return employeeDao.updateEmployee(employee);
	}

	@Override
	public List<Employee> deleteEmployee(int eid) 
	{
		return employeeDao.deleteEmployee(eid);
	}

	@Override
	public Employee getEmployeeById(int eid) 
	{
		return employeeDao.getEmployeeById(eid);
	}
	
}
