package com.demo.beans;

import java.time.LocalDate;

public class Employee {
		private int empid;
		private String ename;
		private double sal;
		private LocalDate jdt;
		
		//default constructor
		public Employee() {
			super();
		}

		//parameterized constructor
		public Employee(int empid) {
			super();
			this.empid = empid;
			
		}
		public Employee(String ename){
			super();
			this.ename = ename;
		}
		public Employee(int empid, String ename, double sal, LocalDate jdt) {
			super();
			this.empid = empid;
			this.ename = ename;
			this.sal = sal;
			this.jdt = jdt;
		}

		//getter and setter 

		
		@Override
		public boolean equals(Object obj) {
			System.out.println("in equals method "+this.empid+"----"+((Employee)obj).empid);
			return this.empid==((Employee)obj).empid;
		}
		
		public int getEmpid() {
			return empid;
		}

		public void setEmpid(int empid) {
			this.empid = empid;
		}

		public String getEname() {
			return ename;
		}

		public void setEname(String ename) {
			this.ename = ename;
		}

		public double getSal() {
			return sal;
		}

		public void setSal(double sal) {
			this.sal = sal;
		}

		public LocalDate getJdt() {
			return jdt;
		}

		public void setJdt(LocalDate jdt) {
			this.jdt = jdt;
		}

		//to string 
		@Override
		public String toString() {
			return "Employee [empid=" + empid + ", ename=" + ename + ", sal=" + sal + ", jdt=" + jdt + "]";
		}

		public int compareTo(Employee ob) {
			System.out.println("in compareTo method "+this.empid+"----"+ob.empid);
			System.out.println("Salary---> "+this.sal+"----"+ob.sal);
			/*if(this.sal<ob.sal)
				return -1;
			else if (this.sal==ob.sal)
				 return 0;
			else
				return 1;*/
			
			return (int)(this.sal-ob.sal);
				
		}
		}
		
		

