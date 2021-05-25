package com.mph.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mph.dao.EmployeeDao;
import com.mph.dao.SalaryDao;
import com.mph.entity.Employee;
import com.mph.entity.Salary;
import com.mph.service.EmployeeService;
import com.mph.service.SalaryService;

import org.springframework.web.bind.annotation.RequestMethod;



/**
* This is the salary rest controller class
* @author Venkata Subba Reddy
* @version 1.0
*/
@RestController
@CrossOrigin(origins = "http://localhost:4200",allowCredentials = "false",methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE}, allowedHeaders = "*")
public class SalaryRestController {

	@Autowired
	SalaryService salaryService;
	
	@Autowired
	SalaryDao salaryDao;
	Salary sal;
	
	/**
	* This is the create salary method
	* @param request body salary object
	* @return salary object
	*/
	@PostMapping("/createsal")
	public Salary createSalary(@RequestBody Salary salary)
	{
		salaryService.createSalary(salary);
		return salary;
	}
	
	
	/**
	* This is the update salary method
	* @param request body salary object
	* @return void
	*/
	@PutMapping("/updatesal")
	public /* ResponseEntity<List<Employee>>*/ void updateEmployee(@RequestBody Salary sal) 
	{
		
		salaryService.updateSalary(sal);
		//List<Employee> li = salaryService.updateSalary(sal);
		/*
		System.out.println("Empl List : " + li);
		if(li.isEmpty())
		{
			return new ResponseEntity<List<Employee>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Employee>>(li,HttpStatus.OK);
		*/
	}
	
	
	/**
	* This is the get salary by Id method
	* @param path variable id
	* @return salary object
	*/
	@GetMapping("/getSal/{id}")
	public  ResponseEntity<Salary> getSalary(@PathVariable("id") int sid) 
	{
		
		sal = salaryService. getSalaryById(sid);
		if (sal==null) 
		{
			return new ResponseEntity<Salary>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<Salary>(sal,HttpStatus.OK);
		
	}

	
	
}
