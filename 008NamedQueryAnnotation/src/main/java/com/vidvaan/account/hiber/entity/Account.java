package com.vidvaan.account.hiber.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@NamedQueries({
@NamedQuery(name="Account.find.all", query="from Account"),
@NamedQuery(name="Account.find.byId", query="from Account a where a.acNo=:acNumber"),
@NamedQuery(name="Account.find.byName", query="from Account a where a.acName=:name"),
@NamedQuery(name="Account.find.byBalance", query="from Account a where a.acBalance=:balance"),
@NamedQuery(name="Account.delete.byNo", query="delete from Account a where a.acNo=:acNumber")
})

@Entity
@Table(name="Account")
public class Account {
	
	@Id
	@GenericGenerator(name="myGen",strategy="increment")
	@GeneratedValue(strategy=GenerationType.AUTO,generator="myGen")
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
