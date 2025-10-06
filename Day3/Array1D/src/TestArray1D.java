import java.util.Scanner;

public class TestArray1D {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.print("Enter the number of elements : ");
		//Take the size of an array
		int size =  sc.nextInt();
		//Take the array elements from use 
		int[] arr = new int[size];
			
		System.out.println("Enter the in Array Elements : ");
		for(int i = 0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		//for printing the data for the max value 
		System.out.println("The Max value is : " +ServiceArray1D.findMax(arr, size));
	}

}
