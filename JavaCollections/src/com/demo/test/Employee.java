package com.demo.test;

public class Employee {
	private int eid;
	private String ename;
	private String desg;
	private String dept;
	private int Sal;
	public Employee() {
		super();
		
	}
	public Employee(int eid, String ename, String desg, String dept, int i) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.desg = desg;
		this.dept = dept;
		Sal = i;
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
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getSal() {
		return Sal;
	}
	public void setSal(int sal) {
		Sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", desg=" + desg + ", dept=" + dept + ", Sal=" + Sal + "]";
	}
	
	
	
	

}
