package MainClass;

import ImplementAndInterface.I1Class;
import ImplementAndInterface.I2Class;
import ImplementAndInterface.MyClassDemo;

public class TestClass {
		public static void main(String[] args) {
			MyClassDemo ob = new MyClassDemo();
			ob.m1();
			
			I1Class ob2 = new MyClassDemo();
			ob2.m2(10);
			
			I2Class ob3 = new MyClassDemo();
			ob3.m3();
			
		}
}
