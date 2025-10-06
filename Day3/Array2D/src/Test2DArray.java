import java.util.Scanner;

public class Test2DArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size : ");
		int size = sc.nextInt();
		int[][] arr = new int[size][size];
		int[][] arr1 = new int[size][size];

		System.out.println("Enter the 1 array values :");
		for(int i=0;i<size;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j] = sc.nextInt();
			} 	
		}
		
		System.out.println("Enter the 2 array values :");
		for(int i=0;i<size;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				arr1[i][j] = sc.nextInt();
			} 	
		}
		ServiceArray2D.displayData(arr);
		ServiceArray2D.displayData1(arr1);
		int ch = 0;
		do {
			System.out.println("1.Add All Elements in Matrix \n 2.AddArray \n 3.TransposeOfMatrix \n 4.MultiplicationOfArray \n 5.IdentityMatrix \n 6.Exit");
			System.out.println("Enter the choice : ");
			ch = sc.nextInt();
			switch(ch) {
			case 1 : 
				int Add = ServiceArray2D.AddAll(arr);
						System.out.println(Add);
						break;
			case 2 : 
						int[][] AddTwo = ServiceArray2D.AddTwo(arr,arr1) ; 
						System.out.println(AddTwo);
						break;
						
			case 3 : System.out.println();
						int[][] Transpose = ServiceArray2D.TransposeMatrix(arr);
						System.out.println(Transpose);
						break;
			case 4 : System.out.println();
						break;
			case 5 : System.out.println();
						break;
			case 6 : System.out.println("Thanking you for visit...");
					 break;
			default:
				 	 System.out.println("Exit");
			}
		}
		while(ch!=6);
		
		
	}
}
