package com.mph.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import java.sql.*;


@Entity(name = "ASalary")
public class Salary {
	
	@Id
	private int sid;
	
	
	private int month;
	private int year;
	private double basic;
	private double da;
	private double hra;
	private double ta;
	private double pa;
	private double gross;
	private double inTax;
	private double pf;
	private double ls;
	private double net;
	
	
	public Salary() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Salary(int sid, int month, int year, double basic, double da, double hra, double ta, double pa, double gross,
			double inTax, double pf, double ls, double net) {
		super();
		this.sid = sid;
		this.month = month;
		this.year = year;
		this.basic = basic;
		this.da = da;
		this.hra = hra;
		this.ta = ta;
		this.pa = pa;
		this.gross = gross;
		this.inTax = inTax;
		this.pf = pf;
		this.ls = ls;
		this.net = net;
	}


	public int getSid() {
		return sid;
	}


	public void setSid(int sid) {
		this.sid = sid;
	}


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


	public double getLs() {
		return ls;
	}


	public void setLs(double ls) {
		this.ls = ls;
	}


	public double getNet() {
		return net;
	}


	public void setNet(double net) {
		this.net = net;
	}


	@Override
	public String toString() {
		return "Salary [sid=" + sid + ", month=" + month + ", year=" + year + ", basic=" + basic + ", da=" + da
				+ ", hra=" + hra + ", ta=" + ta + ", pa=" + pa + ", gross=" + gross + ", inTax=" + inTax + ", pf=" + pf
				+ ", ls=" + ls + ", net=" + net + "]";
	}
	
	
}
