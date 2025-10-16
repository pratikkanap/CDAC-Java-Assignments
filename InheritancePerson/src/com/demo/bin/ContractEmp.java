package com.demo.bin;

import java.util.Date;

public   class ContractEmp extends Employee{
	private double hrs;
	private double hrscharge;
	//Default-Constructor
	public ContractEmp() {
		super();
	}
	
	//Parameterized-Constructor
	public ContractEmp(String pname, int pid, Date bdate,String dgn, String dpt,double hrs, double hrscharge) {
		super(pname,pid,bdate,dgn,dpt);
		this.hrs = hrs;
		this.hrscharge = hrscharge;
	}

	//Getter-Setter
	public double getHrs() {
		return hrs;
	}

	public void setHrs(double hrs) {
		this.hrs = hrs;
	}

	public double getHrscharge() {
		return hrscharge;
	}

	public void setHrscharge(double hrscharge) {
		this.hrscharge = hrscharge;
	}

	//To-string Method
	@Override
	public String toString() {
		return "ContractEmp [hrs=" + hrs + ", hrscharge=" + hrscharge + "]";
	}


	public double calculatehrs() {
		return hrs*hrscharge;

	}
	@Override
	public double calculateSal(){
		return hrs*hrscharge;
		
	}


	
}
