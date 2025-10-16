package com.demo.beans;

import java.time.LocalDate;

public class Student {
	private int studid;
	private String studname;
	private LocalDate bdate;
	private int m1, m2, m3;
	private double avgmrks;
	
	//default constructor
	public Student() {
		super();
		
	}
	
	//parameterized constructor
	public Student(int studid, String studname, LocalDate bdate, int m1, int m2, int m3, double avgmrks) {
		super();
		this.studid = studid;
		this.studname = studname;
		this.bdate = bdate;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
		this.avgmrks = avgmrks;
	}
	public int getStudid() {
		return studid;
	}
	public void setStudid(int studid) {
		this.studid = studid;
	}
	public String getStudname() {
		return studname;
	}
	public void setStudname(String studname) {
		this.studname = studname;
	}
	public LocalDate getBdate() {
		return bdate;
	}
	public void setBdate(LocalDate bdate) {
		this.bdate = bdate;
	}
	public int getM1() {
		return m1;
	}
	public void setM1(int m1) {
		this.m1 = m1;
	}
	public int getM2() {
		return m2;
	}
	public void setM2(int m2) {
		this.m2 = m2;
	}
	public int getM3() {
		return m3;
	}
	public void setM3(int m3) {
		this.m3 = m3;
	}
	public double getAvgmrks() {
		return avgmrks;
	}
	public void setAvgmrks(double avgmrks) {
		this.avgmrks = avgmrks;
	}
	@Override
	public String toString() {
		return "Student [studid=" + studid + ", studname=" + studname + ", bdate=" + bdate + ", m1=" + m1 + ", m2=" + m2
				+ ", m3=" + m3 + ", avgmrks=" + avgmrks + "]";
	}
	
	
}
