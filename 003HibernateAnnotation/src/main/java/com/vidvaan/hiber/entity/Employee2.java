package com.vidvaan.hiber.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employee2")
public class Employee2 {
	
	@Id
	private int eid;
	private String ename;
	private double esal;
	
	public Employee2() {
		// TODO Auto-generated constructor stub
	}

	public Employee2(int eid, String ename, double esal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
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

	public double getEsal() {
		return esal;
	}

	public void setEsal(double esal) {
		this.esal = esal;
	}

	@Override
	public String toString() {
		return "Employee2 [eid=" + eid + ", ename=" + ename + ", esal=" + esal + "]";
	}
	
	

}
