package com.demo.beans;

public class MyClass implements I1,I2{

	
	@Override
	public void m1() {
		System.out.println("in m1 method");
		
	}

	@Override
	public void m2(int x) {
	    System.out.println("in m2 method "+x);
		
	}

	@Override
	public void m2() {
		System.out.println("in m2 method without parameter");
		
	}

	public void m3() {
		System.out.println("in m3 interface");
		
	}

	
}



