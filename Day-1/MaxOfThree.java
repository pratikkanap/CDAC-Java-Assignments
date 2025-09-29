import java.util.*;
class MaxOfThree{
	public static void main(String[] args){
		Scanner sc =  new Scanner(System.in);

		System.out.println("Enter the First Number : ");
		int num1 = sc.nextInt();

		System.out.println("Enter the Second Number : ");
		int num2 = sc.nextInt();
		
		System.out.println("Enter the Third Number : ");
		int num3 = sc.nextInt();
		
		if(num1 == num2 && num2 == num3){
			System.out.println("The All numbers are equal");
		}
		else{
			if(num1>num2 && num1>num3){
				System.out.println("The First number is Max : "+num1);
			}
			else if(num2>num1 && num2>num3){
				System.out.println("The Second number is Max : "+num2);
			}
			else if(num3>num1 && num3>num2){
				System.out.println("The Third number is Max : "+num3);
			}
			else{
				System.out.println("The number is Max ");
			}

		}
		sc.close();
	}
}