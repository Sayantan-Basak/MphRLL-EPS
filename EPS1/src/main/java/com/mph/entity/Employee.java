package com.mph.entity;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Entity;

import java.sql.*;
import java.util.List;


@Entity
@Table(name = "AEmployee")
//@Entity(name = "AEmployee")
public class Employee 
{
	
	@Id
	private int eid;
	
	private String ename;
	
	private Date dob;
	
	private long phone;
	
	private String email;
	
	private Date doj;
	
	private String gender;
	
	private String postHeld;
	
	private String address;
	
	private String password;
	
	private String deptName;
	
	private int deptId;
	
	
	@OneToOne
	@JoinColumn(name = "sid")
	private Salary sal;
	
	@OneToOne
	@JoinColumn(name = "pid")
	private Payroll pr;
	
	@OneToOne
	@JoinColumn(name="empId")
	private Leaves le;
	
	//private List<Employee> empList;

	public Employee() 
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int eid, String ename, Date dob, long phone, String email, Date doj, String gender, String postHeld,
			String address, String password, String deptName, int deptId, Salary sal, Payroll pr, Leaves le) 
	{
		super();
		this.eid = eid;
		this.ename = ename;
		this.dob = dob;
		this.phone = phone;
		this.email = email;
		this.doj = doj;
		this.gender = gender;
		this.postHeld = postHeld;
		this.address = address;
		this.password = password;
		this.deptName = deptName;
		this.deptId = deptId;
		this.sal = sal;
		this.pr = pr;
		this.le = le;
	}

	public int getEid() 
	{
		return eid;
	}

	public void setEid(int eid) 
	{
		this.eid = eid;
	}

	public String getEname()
	{
		return ename;
	}

	public void setEname(String ename) 
	{
		this.ename = ename;
	}

	public Date getDob() 
	{
		return dob;
	}

	public void setDob(Date dob) 
	{
		this.dob = dob;
	}

	public long getPhone() 
	{
		return phone;
	}

	public void setPhone(long phone) 
	{
		this.phone = phone;
	}

	public String getEmail() 
	{
		return email;
	}

	public void setEmail(String email) 
	{
		this.email = email;
	}

	public Date getDoj()
	{
		return doj;
	}

	public void setDoj(Date doj) 
	{
		this.doj = doj;
	}

	public String getGender() 
	{
		return gender;
	}

	public void setGender(String gender) 
	{
		this.gender = gender;
	}

	public String getPostHeld()
	{
		return postHeld;
	}

	public void setPostHeld(String postHeld)
	{
		this.postHeld = postHeld;
	}

	public String getAddress() 
	{
		return address;
	}

	public void setAddress(String address) 
	{
		this.address = address;
	}

	public String getPassword() 
	{
		return password;
	}

	public void setPassword(String password) 
	{
		this.password = password;
	}

	public String getDeptName()
	{
		return deptName;
	}

	public void setDeptName(String deptName) 
	{
		this.deptName = deptName;
	}

	public int getDeptId() 
	{
		return deptId;
	}

	public void setDeptId(int deptId) 
	{
		this.deptId = deptId;
	}

	public Salary getSal() 
	{
		return sal;
	}

	public void setSal(Salary sal) 
	{
		this.sal = sal;
	}

	public Payroll getPr()
	{
		return pr;
	}

	public void setPr(Payroll pr) 
	{
		this.pr = pr;
	}

	public Leaves getLe() 
	{
		return le;
	}

	public void setLe(Leaves le) 
	{
		this.le = le;
	}

	@Override
	public String toString() 
	{
		return "Employee [eid=" + eid + ", ename=" + ename + ", dob=" + dob + ", phone=" + phone + ", email=" + email
				+ ", doj=" + doj + ", gender=" + gender + ", postHeld=" + postHeld + ", address=" + address
				+ ", password=" + password + ", deptName=" + deptName + ", deptId=" + deptId + ", sal=" + sal + ", pr="
				+ pr + ", le=" + le + "]";
	}

}