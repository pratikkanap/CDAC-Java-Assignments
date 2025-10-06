
public class ServiceArray1Ddemo {
	public void factorial(int[] arr ,int n) {
		int fact=1;
		System.out.println("The fact values are : ");
		for(int i=0;i<arr.length;i++) {
				for(arr[i]=arr[0]; arr[i]<=arr.length;arr[i]++) {
					if(arr[i]<7) {
					fact = fact * arr[i];
					System.out.println(+fact);
				}
			}
		}
		
	}
	

}
