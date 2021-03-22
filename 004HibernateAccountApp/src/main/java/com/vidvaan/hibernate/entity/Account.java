package com.vidvaan.hibernate.entity;

import java.util.Date;

public class Account {

	private long accNo;
	private String name;
	private double balance;
	private Date creationDate;

	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(long accNo, String name, double balance, Date creationDate) {
		super();
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
		this.creationDate = creationDate;
	}

	public long getAccNo() {
		return accNo;
	}

	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", name=" + name + ", balance=" + balance + ", creationDate=" + creationDate
				+ "]";
	}

}
