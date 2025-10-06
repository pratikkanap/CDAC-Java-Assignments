
public class ServiceArrayMin {
	//function to find min value
	public static int findMin(int[] arr,int min) {
		min = arr[0];
		for(int i = 0;i<arr.length;i++) {
			if(min>arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}	
	//function to find odd number
	 public static void findOddInArray(int[] arr){
        System.out.println("The odd numbers are :");
		 for(int i=0; i<arr.length; i++){
             if(arr[i]%2!=0){
                System.out.println(arr[i]);
             }  
         } 
        	
	 }
     }

