import java.util.*;
class AddNNum{
	public static void main(String args[]){
		//user input for how many number you have to enter 
		Scanner first = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = first.nextInt();
		//The for loop is for number for iteration
		int sum = 0;
		for(int index = 0;index <= num;index++){
			sum = sum + index;
		}
		System.out.println("The sum of N number is : "+sum);
	}
}	
		