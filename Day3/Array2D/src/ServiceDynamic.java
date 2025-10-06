import java.util.Scanner;

public class ServiceDynamic {
	public static void accept(int[][] arr) {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter number of columns : "+i);
			int col=sc.nextInt();
			arr[i]=new int [col];

			for(int j=0;j<arr[i].length;j++) {
				System.out.println("enter value : "+i+","+j);
				arr[i][j]=sc.nextInt();
				
			}
		}
		
	}

	public static void display(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
	}
	public static int findMaxAll(int[][] arr) {
		int max= arr[0][0];
		for(int i=0;i<arr.length;i++) {
			for(int j=0 ; j<arr[i].length; j++) {
				if(max<arr[i][j]) {
					max=arr[i][j];
				}
			}
		}
		return max;
	}
	public static int[] findRowMax(int[][] arr) {
		int[] temp =new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			temp[i] = arr[i][0];
			for(int j=0;j<arr[i].length;j++) {
				if(temp[i] < arr[i][j]) {
					temp[i] = arr[i][j];
				}
			}
		}
		
		return temp;
	}

	public static int[] findColMax(int[][] arr) {
		int maxlength=arr[0].length;
		for(int i=1;i<arr.length;i++) {
			if(maxlength<arr[i].length) {
	         	maxlength=arr[i].length;
			}
		}
		int[] temp=new int[maxlength];
		for(int i=0;i<arr.length;i++) { 
			for(int j=0;j<arr[i].length;j++) { 
				if(temp[j]<arr[i][j]) {
					temp[j]=arr[i][j];
				}
				
			}
		}
		return temp;
	}

	public static int[] findRowAdd(int[][] arr) {
		int[] temp =new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			temp[i] = arr[0][0];
			for(int j=0;j<arr[i].length;j++) {
				if(temp[i] < arr[i][j]) {
					temp[i] = temp[i] + arr[i][j];
				}
			}
		}
		
		return temp;
	}
	public static int[] ColAdd(int[][] arr) {
		int maxlength=arr[0].length;
		for(int i=1;i<arr.length;i++) {
			if(maxlength<arr[i].length) {
	         	maxlength=arr[i].length;
			}
		}
		int[] temp=new int[maxlength];
		for(int i=0;i<arr.length;i++) { 
			for(int j=0;j<arr[i].length;j++) { 
					temp[j]+=arr[i][j];
				
			}
		}
		return temp;
	}
		
	}

