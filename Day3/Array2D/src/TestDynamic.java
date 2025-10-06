import java.util.Scanner;

public class TestDynamic {

	public static void main(String[] args) {
		int[][] arr=new int[3][];
		
		ServiceDynamic.accept(arr);
		ServiceDynamic.display(arr);
		Scanner sc=new Scanner(System.in);
		int choice=0;
		do {
		System.out.println("1. find max of all data\n2. find max rowwise");
		System.out.println("3. find max column wise\n4. find addition rowwise");
        System.out.println("5. find addition columnwise\n6.exit\n choice:");
        choice=sc.nextInt();
        switch(choice) {
        case 1 : int max = ServiceDynamic.findMaxAll(arr);
        		
        System.out.println("max number is :" +max);
        		break;
        
        case 2 : int[] rowmax = ServiceDynamic.findRowMax(arr);
        		for(int i=0;i<rowmax.length;i++) {
        			System.out.println("max number is :" +rowmax[i]);
        }
		 		break;
		 	
        case 3 : int[] colmax = ServiceDynamic.findColMax(arr);
 		for(int i=0;i<colmax.length;i++) {
 			System.out.println("max number is :" +colmax[i]);
 		 	}
 		break;
        case 4 : int[] rowadd = ServiceDynamic.findRowAdd(arr);
        for(int i=0;i<rowadd.length;i++) {
        		 System.out.println("The Addition of Row wise is :"+rowadd[i]);
        	}
        break;
        
		 case 5 : int[] coladd = ServiceDynamic.ColAdd(arr);
	        for(int j=0;j<coladd.length;j++) {
	        		 System.out.println("The Addition of col wise is :"+coladd[j]);
	        	}
	        break;
		case 6 : 
			System.out.println("Thanks for visiting ....");
			break;
		default:
			System.out.println("Invalid Choice ");
	        }
        	}while(choice!=6);
		}

	}


