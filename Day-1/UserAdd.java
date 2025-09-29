//Take User input for perform Addition of two number 
import java.util.Scanner;
class UserAdd{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//Accept the first number
		System.out.print("Enter the first Number : ");
		int num1 = sc.nextInt();

		//Accept the first number
		System.out.print("Enter the second Number : ");
		int num2 = sc.nextInt();
		
		//Addtion of number
		int num3 = num1 + num2;
		System.out.println("The addition of two number is : "+num3);
		}	
}	