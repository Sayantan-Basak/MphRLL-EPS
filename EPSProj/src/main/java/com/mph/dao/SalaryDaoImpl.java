package com.mph.dao;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mph.entity.Employee;
import com.mph.entity.Salary;

/**
* This is the salary Dao implementation class
* @author Sayantan Basak
* @version 1.0
*/
@Repository
public class SalaryDaoImpl implements SalaryDao {

	@Autowired
	private SessionFactory sessionFactory;

	protected Session getSession() 
	{
		return sessionFactory.getCurrentSession();
	}
	
	
	
	@Override
	public void createSalary(Salary salary) {
		getSession().saveOrUpdate(salary);
		System.out.println("Salary Stored in DB Successfully !!!");
		
	}

	
	@Override
	public void updateSalary(Salary salary) {
Query query = getSession().createQuery("update Salary sal set basic=:basic,da=:da,hra=:hra,ta=:ta,pa=:pa,gross=:gross,inTax=:inTax,pf=:pf,net=:net,postHeld=:postHeld,payScale=:payScale,medInsurance=:medInsurance where sid =:sid");
		/*
		query.setParameter("eid",salary.getEid());
		query.setParameter("basic",salary.getBasic());
		query.setParameter("da",0.2*salary.getBasic());
		query.setParameter("hra",0.15*salary.getBasic());
		query.setParameter("ta",0.05*salary.getBasic());
		query.setParameter("pa",0.05*salary.getBasic());
		query.setParameter("gross",(salary.getBasic()+salary.getDa()+salary.getHra()+salary.getTa()+salary.getPa()));
		query.setParameter("inTax",0.07*salary.getGross());
		query.setParameter("pf",0.06*salary.getBasic());
		query.setParameter("net",(salary.getGross()-salary.getInTax()-salary.getPf()));
		query.setParameter("postHeld",salary.getPostHeld());
		query.setParameter("payScale",salary.getPayScale());
		query.setParameter("sid", salary.getSid());
		*/
		query.setParameter("eid",salary.getEid());
		query.setParameter("basic",salary.getBasic());
		query.setParameter("da",salary.getDa());
		query.setParameter("hra",salary.getHra());
		query.setParameter("ta",salary.getTa());
		query.setParameter("pa",salary.getPa());
		query.setParameter("gross",salary.getGross());
		query.setParameter("inTax",salary.getInTax());
		query.setParameter("pf",salary.getPf());
		query.setParameter("net",salary.getNet());
		query.setParameter("postHeld",salary.getPostHeld());
		query.setParameter("payScale",salary.getPayScale());
		query.setParameter("medInsurance",salary.getMedInsurance());
		query.setParameter("sid",salary.getSid());
		
		int noofrows = query.executeUpdate();
		if (noofrows > 0) 
		{
			System.out.println("Updated " + noofrows + "rows. ");
		}
		//return getEmployeeList();
	}
	
	
	
	@Override
	public Salary getSalaryById(int sid) {
		return (Salary)getSession().get(Salary.class, sid);
	}
	
	
}