package com.demo.bin;

import java.util.Date;

public abstract class Person {
	private String pname;
	private int pid;
	private Date bdate;
	
	//constructor
	public Person() {
		super();
	}
	//Para-constructor

	public Person(String pname, int pid, Date bdate) {
		super();
		this.pname = pname;
		this.pid = pid;
		this.bdate = bdate;
	}

	//getter and setter
	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public Date getBdate() {
		return bdate;
	}

	public void setBdate(Date bdate) {
		this.bdate = bdate;
	}
	//to-string Methods

	
	abstract public double calculateSal() ;

	@Override
	public String toString() {
		return "Person [pname=" + pname + ", pid=" + pid + ", bdate=" + bdate + "]";
	}

	
}
