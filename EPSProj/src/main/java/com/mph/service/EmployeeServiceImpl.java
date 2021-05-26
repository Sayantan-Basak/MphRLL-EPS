package com.mph.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mph.dao.EmployeeDao;
import com.mph.entity.Employee;

/**
* This is the employee service implementation class
* @author Lavanya
* @version 1.0
*/
@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeDao employeeDao;
	
	
	@Override
	public void createEmployee(Employee employee) {
		
		employeeDao.createEmployee(employee);
	}
	
	
	@Override
	public List<Employee> getEmployeeList() {
		return employeeDao.getEmployeeList();
	}
	
	
	@Override
	public List<Employee> deleteEmployee(int eid) {
		return employeeDao.deleteEmployee(eid);
	}
	
	
	@Override
	public List<Employee> updateEmployee(Employee employee) {
		return employeeDao.updateEmployee(employee);
	}
	
	
	@Override
	public Employee getEmployeeById(int eid) {
		// TODO Auto-generated method stub
		return employeeDao.getEmployeeById(eid);
	}

}
