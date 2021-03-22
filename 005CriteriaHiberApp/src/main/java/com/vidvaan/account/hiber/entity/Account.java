package com.vidvaan.account.hiber.entity;

public class Account {
	
	private int acNo;
	private String acName;
	private double acBalance;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(int acNo, String acName, double acBalance) {
		super();
		this.acNo = acNo;
		this.acName = acName;
		this.acBalance = acBalance;
	}

	public int getAcNo() {
		return acNo;
	}

	public void setAcNo(int acNo) {
		this.acNo = acNo;
	}

	public String getAcName() {
		return acName;
	}

	public void setAcName(String acName) {
		this.acName = acName;
	}

	public double getAcBalance() {
		return acBalance;
	}

	public void setAcBalance(double acBalance) {
		this.acBalance = acBalance;
	}

	@Override
	public String toString() {
		return "Account [acNo=" + acNo + ", acName=" + acName + ", acBalance=" + acBalance + "]";
	}
	
	

}
