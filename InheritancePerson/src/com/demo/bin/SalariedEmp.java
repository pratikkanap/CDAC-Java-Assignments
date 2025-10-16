package com.demo.bin;

import java.util.Date;

public class SalariedEmp extends Employee{
		private double sal; 
		private double bonus;
	
		//constuctor with suoer class
		public SalariedEmp() {
			super();
		}

		//para-constructor
		public SalariedEmp(String pname, int pid, Date bdate,String dgn, String dpt,double sal, double bonus) {
			super(pname, pid,bdate, dgn, dpt);
			this.sal = sal;
			this.bonus = bonus;
		}

		//getter and setter 
		public double getSal() {
			return sal;
		}

		public void setSal(double sal) {
			this.sal = sal;
		}

		public double getBonus() {
			return bonus;
		}

		public void setBonus(double bonus) {
			this.bonus = bonus;
		}
		
		//to-string method
		@Override
		public String toString() {
			return super.toString()+"SalariedEmp [sal=" + sal + ", bonus=" + bonus + "]";
		}
		@Override
		public double calculateSal() {
		return bonus+sal+0.10*sal+0.15*sal-0.08*sal;
		}

		@Override
		public double calculatehrs() {
			// TODO Auto-generated method stub
			return 0;
		}

		
}
