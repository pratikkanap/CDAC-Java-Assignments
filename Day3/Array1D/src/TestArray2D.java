import java.util.Scanner;

public class TestArray2D {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the size of an Array : ");
		int size = sc.nextInt();
		
		int[][] arr = new int[size][size];
		
		for(int i=0 ;i<arr.length ; i++){
			for(int j=0; j<arr[i].length; j++){
				 arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("display Elements in array :");
		for(int i=0 ;i<arr.length ; i++){
			for(int j=0; j<arr[i].length; j++){
				System.out.println(+arr[i][j]);
			}
		}
	}
}
	
