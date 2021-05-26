package com.mph.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import java.sql.*;

/**
* This is the salary entity class
* @author Sunnish
* @version 1.0
*/

@Entity(name = "AAASalary")
public class Salary {
	
	@Id
	private int sid;
	
	private int eid;
	//private int month;
	//private int year;
	private double basic;
	private double da;
	private double hra;
	private double ta;
	private double pa;
	private double gross;
	private double inTax;
	private double pf;
	//private double ls;
	private double net;
	private String payScale;
	private String postHeld;
	private double medInsurance;
	
	/**
	* This is the salary class constructor from superclass
	* @param none
	* @return none
	*/
	public Salary() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	* This is the salary class constructor using fields
	* @param all salary details
	* @return none
	*/
	public Salary(int sid,int eid,/* int month, int year,*/ double basic, double da, double hra, double ta, double pa, double gross,
			double inTax, double pf, /*double ls,*/ double net,String payScale, String postHeld,double medInsurance) {
		super();
		this.sid = sid;
		this.eid=eid;
		//this.month = month;
		//this.year = year;
		this.basic = basic;
		this.da = da;
		this.hra = hra;
		this.ta = ta;
		this.pa = pa;
		this.gross = gross;
		this.inTax = inTax;
		this.pf = pf;
		//this.ls = ls;
		this.net = net;
		this.payScale=payScale;
		this.postHeld=postHeld;
		this.medInsurance=medInsurance;
	}


	public int getSid() {
		return sid;
	}


	public void setSid(int sid) {
		this.sid = sid;
	}

	
	
	
/*
	public int getMonth() {
		return month;
	}


	public void setMonth(int month) {
		this.month = month;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}
*/

	public int getEid() {
		return eid;
	}


	public void setEid(int eid) {
		this.eid = eid;
	}


	public double getBasic() {
		return basic;
	}


	public void setBasic(double basic) {
		this.basic = basic;
	}


	public double getDa() {
		return da;
	}


	public void setDa(double da) {
		this.da = da;
	}


	public double getHra() {
		return hra;
	}


	public void setHra(double hra) {
		this.hra = hra;
	}


	public double getTa() {
		return ta;
	}


	public void setTa(double ta) {
		this.ta = ta;
	}


	public double getPa() {
		return pa;
	}


	public void setPa(double pa) {
		this.pa = pa;
	}


	public double getGross() {
		return gross;
	}


	public void setGross(double gross) {
		this.gross = gross;
	}


	public double getInTax() {
		return inTax;
	}


	public void setInTax(double inTax) {
		this.inTax = inTax;
	}


	public double getPf() {
		return pf;
	}


	public void setPf(double pf) {
		this.pf = pf;
	}

	/*
	public double getLs() {
		return ls;
	}


	public void setLs(double ls) {
		this.ls = ls;
	}
*/

	public double getNet() {
		return net;
	}


	public void setNet(double net) {
		this.net = net;
	}
	


	public String getPayScale() {
		return payScale;
	}


	public void setPayScale(String payScale) {
		this.payScale = payScale;
	}


	public String getPostHeld() {
		return postHeld;
	}


	public void setPostHeld(String postHeld) {
		this.postHeld = postHeld;
	}
	


	public double getMedInsurance() {
		return medInsurance;
	}


	public void setMedInsurance(double medInsurance) {
		this.medInsurance = medInsurance;
	}

	/**
	* This is toString method 
	* @param none
	* @return prints the fields
	*/
	@Override
	public String toString() {
		return "Salary [sid=" + sid + ", eid=" + eid + ", basic=" + basic + ", da=" + da + ", hra=" + hra + ", ta=" + ta
				+ ", pa=" + pa + ", gross=" + gross + ", inTax=" + inTax + ", pf=" + pf + ", net=" + net + ", payScale="
				+ payScale + ", postHeld=" + postHeld + ", medInsurance=" + medInsurance + "]";
	}
	
	
}
