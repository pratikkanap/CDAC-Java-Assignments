package com.demo.beans;

import java.time.LocalDate;
import java.util.Objects;

public class Employee {
		private int empid;
		private String ename;
		private LocalDate djt;
		private double sal;
		//constructor
		public Employee() {
			super();
		}
		
		//Parameter constructor
		public Employee(int empid, String ename, LocalDate djt, double sal) {
			super();
			this.empid = empid;
			this.ename = ename;
			this.djt = djt;
			this.sal = sal;
		}
		
		
		@Override
		public int hashCode() {
			return Objects.hash(empid);
		}

		@Override
		public boolean equals(Object obj) {
			return this.empid == ((Employee)obj).empid;
		}

		//getter and setter
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
		public LocalDate getDjt() {
			return djt;
		}
		public void setDjt(LocalDate djt) {
			this.djt = djt;
		}
		public double getSal() {
			return sal;
		}
		public void setSal(double sal) {
			this.sal = sal;
		}
		//toString Method
		@Override
		public String toString() {
			return "Employee [empid=" + empid + ", ename=" + ename + ", djt=" + djt + ", sal=" + sal + "]";
		}
		
		public double compareTo(Employee o) {
			return this.sal - o.sal;
		}
		
		
		
}
