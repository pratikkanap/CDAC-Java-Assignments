package com.demo.beans;

public class Employee {
	private int eid;
	private String ename;
	private double sal;
	
	//Default constructor with super 
	public Employee() {
		super();
	}
	
	//parameter Constructor 
	public Employee(int eid, String ename, double sal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.sal = sal;
	}

	//getter and setter
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

	public double isSal() {
		return sal;
	}

	public void setSal(double i) {
		this.sal = i;
	}

	//to string method
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", sal=" + sal + "]";
	}
	
	
	
}
