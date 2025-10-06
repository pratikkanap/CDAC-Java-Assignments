import java.util.Scanner;

public class ServiceArray2D {
	//accept the data
	public static void acceptData(int[][] arr) {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
			System.out.println("enter data for row "+i+" column: "+j);
			arr[i][j]=sc.nextInt();
			}
		}
	}
	//display 1 array the data
	public static void displayData(int[][] arr) {
		System.out.println("The Display values are : ");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
	}
	//display 1 array the data
		public static void displayData1(int[][] arr1) {
			System.out.println("The Display values are : ");
			for(int i=0;i<arr1.length;i++) {
				for(int j=0;j<arr1[i].length;j++) {
					System.out.print(arr1[i][j]+"\t");
				}
				System.out.println();
			}
			
		}
	//Add all the elements
	public static int AddAll(int[][] arr) {
		int sum = 0;
		for(int i =0;i<arr.length;i++) {
			for(int j =0;j<arr[i].length;j++) {
				sum = sum + arr[i][j];
			}
		}
		return sum;
	}
	public static int[][] AddTwo(int[][] arr,int[][]arr1) {
		int[][] temp = new int[arr.length][arr[0].length];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				  temp[i][j] = arr[i][j]+arr1[i][j];
			}
		}
		return temp;
	}
	public static int[][] TransposeMatrix(int[][] arr) {
		System.out.println("The Traspose of Matrix is : ");
		int[][] temp = new int[arr.length][arr[0].length];
		for(int i = 0;i<arr.length;i++) {
			for(int j =0;j<arr[i].length;j++){
					temp[i][j] = arr[j][i];
			}
		}
		return temp;
	}
}
	
		
		
		



