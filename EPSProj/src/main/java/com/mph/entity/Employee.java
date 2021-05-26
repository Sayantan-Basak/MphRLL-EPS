package com.mph.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
* This is the employee entity class
* @author Sukhesh
* @version 1.0
*/

@Entity
@Table(name = "AAAEmployee")
public class Employee {

	@Id
	private int eid;
	
	private String ename;
	
	private String dob;
	
	private long phone;
	
	private String email;
	
	private String doj;
	
	private String gender;
	
	private String postHeld;
	
	private String address;
	
	private String password;
	
	@OneToOne
	@JoinColumn(name = "sid")
	private Salary sal;

	
	/**
	* This is employee constructor with superclass
	* @param void
	* @return none
	*/
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	* This is employee constructor with fields
	* @param all employee details
	* @return none
	*/
	public Employee(int eid, String ename, String dob, long phone, String email, String doj, String gender, String postHeld,
			String address, String password,Salary sal) {
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
		this.sal=sal;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDoj() {
		return doj;
	}

	public void setDoj(String doj) {
		this.doj = doj;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPostHeld() {
		return postHeld;
	}

	public void setPostHeld(String postHeld) {
		this.postHeld = postHeld;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

	public Salary getSal() {
		return sal;
	}

	public void setSal(Salary sal) {
		this.sal = sal;
	}
	
	/**
	* This is toString method
	* @param none
	* @return prints the fields
	*/
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", dob=" + dob + ", phone=" + phone + ", email=" + email
				+ ", doj=" + doj + ", gender=" + gender + ", postHeld=" + postHeld + ", address=" + address
				+ ", password=" + password + ", sal=" + sal + "]";
	}

	
	
	
	/*
	public Employee(int eid, String ename, long phone, String email, String gender, String postHeld, String address,
			String password) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.phone = phone;
		this.email = email;
		this.gender = gender;
		this.postHeld = postHeld;
		this.address = address;
		this.password = password;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPostHeld() {
		return postHeld;
	}

	public void setPostHeld(String postHeld) {
		this.postHeld = postHeld;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", phone=" + phone + ", email=" + email + ", gender="
				+ gender + ", postHeld=" + postHeld + ", address=" + address + ", password=" + password + "]";
	}
	*/
	
}
