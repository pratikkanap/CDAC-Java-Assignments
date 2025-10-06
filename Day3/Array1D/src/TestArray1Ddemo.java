import java.util.Scanner;

public class TestArray1Ddemo {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("The number of elements : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the numbers of array :");
		for(int i=0; i<size ;i++) {
			arr[i]=sc.nextInt();
		
		}
		ServiceArray1Ddemo SA = new ServiceArray1Ddemo();
		
		SA.factorial(arr, size);
		sc.close();
	}

}
