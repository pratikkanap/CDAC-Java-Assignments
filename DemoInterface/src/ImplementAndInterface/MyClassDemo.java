package ImplementAndInterface;

public class MyClassDemo implements I1Class,I2Class {

	@Override
	public void m1() {
		System.out.println("in M1");
	}

	@Override
	public void m2(int x) {
		System.out.println("in M2 the value is : "+x);
	}

	@Override
	public void m3() {
		System.out.println("In Class M3");
		
	}

	@Override
	public void m1(int x) {
		// TODO Auto-generated method stub
		
	}
	
	  
	  
}
