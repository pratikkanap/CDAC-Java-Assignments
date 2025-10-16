package InterfaceAndImplementation;

public class ImplementatedClass implements Interface1,Interface2 {
		@Override
		public void Add(int a,int b) {
			int sum = a + b;
			System.out.println("The Addition of Two Number is : "+sum);
			System.out.println("");
			
		}

		@Override
		public void sub(int x, int y) {
			int subtract = y - x;
			System.out.println("The Subtraction of  two value is : "+subtract);
			System.out.println("");

		}

		@Override
		public void mul(int n1, int n2) {
			int mul = n1*n2;
			System.out.println("The multiplication value is : "+mul);
			System.out.println("");

		}

		@Override
		public void div(int d1, int d2) {
			int div = d1/d2;
			System.out.println("The division value is : "+div);
		}
}
