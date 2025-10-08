import java.util.*;
class Max{

	public static int Max(int a,int b){
		if(a>b){
			System.out.printf("The First is Max  %d : ",a);
		}
		else{
			System.out.printf("The Second is Max %d :",b);
		}
		return 1;
	
}
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("The first number is : ");
	int a = sc.nextInt();

	System.out.println("The Second number is : ");
	int b = sc.nextInt();
	
	Max(a,b);
	}
}