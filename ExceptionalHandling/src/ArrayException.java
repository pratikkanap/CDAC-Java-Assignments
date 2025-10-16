
public class ArrayException {

	public static void main(String[] args) {
		try {
			int[] arr = {10,20,30,40};
			int result = arr[7];
			System.out.println("The value in Array is : "+result);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getStackTrace());
			System.out.println(e.getMessage());
		} finally {
		      System.out.println("The Excution is finished.");
	    }
	}

}
