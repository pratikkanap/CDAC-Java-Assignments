package com.demo.bin;

import java.util.Date;

public abstract class Vendor extends Employee{
	private int noofemp;
	private double salperemp;
	
	//default constructor with super class
	public Vendor() {
		super();
	}

	//parameterized-constructor
	public Vendor(String pname, int pid, Date bdate,String dgn, String dpt,int noofemp, double salperemp) {
		super(pname,pid,bdate,dgn,dpt);
		this.noofemp = noofemp;
		this.salperemp = salperemp;
	}

	//Getter and setter
	public int getNoofemp() {
		return noofemp;
	}

	public void setNoofemp(int noofemp) {
		this.noofemp = noofemp;
	}

	public double getSalperemp() {
		return salperemp;
	}

	public void setSalperemp(double salperemp) {
		this.salperemp = salperemp;
	}

	//to-string Method
	@Override
	public String toString() {
		return "Vendor [noofemp=" + noofemp + ", salperemp=" + salperemp + "]";
	}
	
	abstract public double calculateSal() ;
	abstract public double calculatehrs() ;

	
	
	

}
