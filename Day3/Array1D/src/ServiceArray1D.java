
public class ServiceArray1D {
		public static int findMax(int[] arr,int max) {
			
			//for loop for iteration
			max = arr[0];
			for(int i= 0;i<arr.length;i++) {
					if(max < arr[i]) {
						max = arr[i];
					}
				
			}
			return max;
		}
}


