package com.mph.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import java.sql.*;


@Entity(name = "ALeaves")
public class Leaves {
	
	@Id
	private int empId;
	
	private Date leaveFrom;
	private Date leaveTo;
	private int noOfDays;
	private String isGranted;
	
	
	public Leaves() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Leaves(int empId, Date leaveFrom, Date leaveTo, int noOfDays, String isGranted) {
		super();
		this.empId = empId;
		this.leaveFrom = leaveFrom;
		this.leaveTo = leaveTo;
		this.noOfDays = noOfDays;
		this.isGranted = isGranted;
	}


	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public Date getLeaveFrom() {
		return leaveFrom;
	}


	public void setLeaveFrom(Date leaveFrom) {
		this.leaveFrom = leaveFrom;
	}


	public Date getLeaveTo() {
		return leaveTo;
	}


	public void setLeaveTo(Date leaveTo) {
		this.leaveTo = leaveTo;
	}


	public int getNoOfDays() {
		return noOfDays;
	}


	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}


	public String getIsGranted() {
		return isGranted;
	}


	public void setIsGranted(String isGranted) {
		this.isGranted = isGranted;
	}


	@Override
	public String toString() {
		return "Leaves [empId=" + empId + ", leaveFrom=" + leaveFrom + ", leaveTo=" + leaveTo + ", noOfDays=" + noOfDays
				+ ", isGranted=" + isGranted + "]";
	}


}
