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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mph.dao.EmployeeDao;
import com.mph.entity.Employee;
import com.mph.service.EmployeeService;

@RestController
@CrossOrigin(origins = "http://localhost:4200",allowCredentials = "false",methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE}, allowedHeaders = "*")
public class EmployeeRestController 
{
	
	@Autowired
	EmployeeService employeeService;
	
	@Autowired
	EmployeeDao employeeDao;
	Employee emp;
	
	@GetMapping("/allemp")
	public  ResponseEntity<List<Employee>> allEmployee()
	{
		
		List<Employee> li = employeeService.getEmployeeList();
		System.out.println("Empl List : " + li);
		
		if(li.isEmpty())
		{
			return new ResponseEntity<List<Employee>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Employee>>(li,HttpStatus.OK);
		
	}
	
	
	@PostMapping("/create")
	public Employee createEmployee(@RequestBody Employee employee)
	{
		employeeService.createEmployee(employee);
		return employee;
	}
	
	@PutMapping("/update")
	public  ResponseEntity<List<Employee>> updateEmployee(@RequestBody Employee emp) 
	{
		
		List<Employee> li = employeeService.updateEmployee(emp);
		System.out.println("Empl List : " + li);
		
		if(li.isEmpty())
		{
			return new ResponseEntity<List<Employee>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Employee>>(li,HttpStatus.OK);
		
	}
	
	
	@DeleteMapping("/delete/{id}")
	public  ResponseEntity<List<Employee>> deleteEmployee(@PathVariable("id") int emid) 
	{
		
		List<Employee> li = employeeService.deleteEmployee(emid);
		System.out.println("Empl List : " + li);
		
		if(li.isEmpty())
		{
			return new ResponseEntity<List<Employee>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Employee>>(li,HttpStatus.OK);
		
	}
	
	
	@GetMapping("/getEmp/{id}")
	public  ResponseEntity<Employee> getEmployee(@PathVariable("id") int eid) 
	{
		
		emp = employeeService. getEmployeeById(eid);
		if (emp==null) 
		{
			return new ResponseEntity<Employee>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<Employee>(emp,HttpStatus.OK);
		
	}

}
