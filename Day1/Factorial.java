import java.util.Scanner;

class Factorial{
	int fact=1;
//function
	public int factorialNum(int n){	
		for(int i=1;i<=n;i++){
			fact=fact*i;
		}
		return fact;
	}
//the main function
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number : ");
	int n = sc.nextInt();
	Factorial f = new Factorial();
	int res = f.factorialNum(n);
	System.out.print("Factorial is:"+res);
	}
}
		

		