package com.mph.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mph.dao.SalaryDao;
import com.mph.entity.Employee;
import com.mph.entity.Salary;


/**
* This is the salary service implementation class
* @author Lavanya
* @version 1.0
*/

@Service
@Transactional
public class SalaryServiceImpl implements SalaryService{

	@Autowired
	SalaryDao salaryDao;
	

	@Override
	public void createSalary(Salary salary) {
		salaryDao.createSalary(salary);
		
	}
	
	
	@Override
	public void updateSalary(Salary salary) {
		salaryDao.updateSalary(salary);
		
	}
	
	
	@Override
	public Salary getSalaryById(int sid) {
		return salaryDao.getSalaryById(sid);
	
	}
}