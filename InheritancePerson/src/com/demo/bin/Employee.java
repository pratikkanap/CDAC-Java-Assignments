package com.demo.bin;

import java.util.Date;

public abstract class Employee extends Person {
		//private int empid;
		private String dgn;
		private String dpt;
		
		//constructor with super class 
		public Employee() {
			super();
		}		
		//para-constructor

		public Employee(String pname, int pid, Date bdate,String dgn, String dpt) {
			super(pname,pid,bdate);
			this.dgn = dgn;
			this.dpt = dpt;
		}

		//getter and setter
		public String getDgn() {
			return dgn;
		}

		public void setDgn(String dgn) {
			this.dgn = dgn;
		}

		public String getDpt() {
			return dpt;
		}

		public void setDpt(String dpt) {
			this.dpt = dpt;
		}
		
		//to string method
		@Override
		public String toString() {
			return super.toString()+"Employee [dgn=" + dgn + ", dpt=" + dpt + "]";
		}
		abstract public double calculateSal() ;

		abstract public double calculatehrs() ;
		
		
		
		

		

		
		
}
