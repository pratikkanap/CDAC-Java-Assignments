package MainMethod;

import InterfaceAndImplementation.ImplementatedClass;
import InterfaceAndImplementation.Interface1;
import InterfaceAndImplementation.Interface2;

public class MyMainClass  {

	public static void main(String[] args) {
			Interface1 op = new ImplementatedClass();
			op.Add(10, 20);
			op.sub(900, 1100);
			
			Interface2 op2 = new ImplementatedClass();
			op2.mul(5, 10);
			op2.div(10, 2);
	}

}
