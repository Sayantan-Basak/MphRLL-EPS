package com.mph.dao;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mph.entity.Employee;
/**
* This is the employee Dao implementation class
* @author Sayantan
* @version 1.0
*/
@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private SessionFactory sessionFactory;

	protected Session getSession() 
	{
		return sessionFactory.getCurrentSession();
	}
	
	
	@Override
	public void createEmployee(Employee employee) {
		getSession().saveOrUpdate(employee);
		System.out.println("Employee Stored in DB Successfully !!!");
		
	}
	
	
	@Override
	public List<Employee> getEmployeeList() {
		
		Query query = getSession().createQuery("select me from Employee me");
		List<Employee> empList = query.list();
		return empList;
	}
	
	
	@Override
	public List<Employee> deleteEmployee(int eid) {
		Query query = getSession().createQuery("delete Employee emp where eid =:eid");
		query.setParameter("eid", eid);
		int noofrows = query.executeUpdate();
		if (noofrows > 0) 
		{
			System.out.println("Deleted " + noofrows + "rows. ");
		}
		return getEmployeeList();
	}
	
	
	@Override
	public List<Employee> updateEmployee(Employee employee) {
Query query = getSession().createQuery("update Employee emp set ename=:ename,dob=:dob,phone=:phone,email=:email,doj=:doj,gender=:gender,postHeld=:postHeld,address=:address,password=:password  where eid =:eid");
		
		query.setParameter("ename",employee.getEname());
		query.setParameter("dob",employee.getDob());
		query.setParameter("phone",employee.getPhone());
		query.setParameter("email",employee.getEmail());
		query.setParameter("doj",employee.getDoj());
		query.setParameter("gender",employee.getGender());
		query.setParameter("postHeld",employee.getPostHeld());
		query.setParameter("address",employee.getAddress());
		query.setParameter("password",employee.getPassword());
		query.setParameter("eid", employee.getEid());
		
		int noofrows = query.executeUpdate();
		if (noofrows > 0) 
		{
			System.out.println("Updated " + noofrows + "rows. ");
		}
		return getEmployeeList();
	}
	
	
	@Override
	public Employee getEmployeeById(int eid) {
		// TODO Auto-generated method stub
		return (Employee)getSession().get(Employee.class, eid);
	}

}
