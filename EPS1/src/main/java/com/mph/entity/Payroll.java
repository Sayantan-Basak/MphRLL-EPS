package com.mph.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


@Entity(name = "APayroll")
public class Payroll {
	
	
	@Id
	private int pid;
	
	private String postHeld;
	private String payScale;
	private int leaveBalance;
	public Payroll() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Payroll(int pid, String postHeld, String payScale, int leaveBalance) {
		super();
		this.pid = pid;
		this.postHeld = postHeld;
		this.payScale = payScale;
		this.leaveBalance = leaveBalance;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPostHeld() {
		return postHeld;
	}
	public void setPostHeld(String postHeld) {
		this.postHeld = postHeld;
	}
	public String getPayScale() {
		return payScale;
	}
	public void setPayScale(String payScale) {
		this.payScale = payScale;
	}
	public int getLeaveBalance() {
		return leaveBalance;
	}
	public void setLeaveBalance(int leaveBalance) {
		this.leaveBalance = leaveBalance;
	}
	@Override
	public String toString() {
		return "Payroll [pid=" + pid + ", postHeld=" + postHeld + ", payScale=" + payScale + ", leaveBalance="
				+ leaveBalance + "]";
	}
	
	
}
