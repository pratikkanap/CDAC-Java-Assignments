package com.demo.Testbeans;

import com.demo.beans.I1;
import com.demo.beans.I2;
import com.demo.beans.MyClass;

public class TestInterface {

	public static void main(String[] args) {
		MyClass ob = new MyClass();
		ob.m2(10);
		
	//	I2 ob3 = new I2();
		I1 ob2 = new MyClass();
		ob2.m1();
	    ((MyClass) ob2).m3();
	    
	    //type cast
	//    I2 ob3=new MyClass();
	  //  ((MyClass)ob3).m1();
	    
	    I2 obj = new MyClass();
	    ((MyClass)obj).m2(20);
	}

}
