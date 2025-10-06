import java.util.Scanner;

public class TestArrayMin {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of an Array : ");
		//Enter the size of array
		int size =  sc.nextInt();
		//enter the value of an array
		int[] arr = new int[size];
		
		
		//it is for the input the elements 
		System.out.println("Enter the Elements : ");
		for(int i = 0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("The min value in an array is : "+ServiceArrayMin.findMin(arr, size));
		ServiceArrayMin.findOddInArray(arr);
	}

}
