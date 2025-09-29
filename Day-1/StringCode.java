import java.util.*;
class StringCode{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string without Space : ");
		
		String	str1 = sc.next();
		//it will ignore the data after the space
		System.out.println("The string without space is : "+str1);
		sc.next();
		String str2 = sc.nextLine();
		//it will Accept the data after the space
		System.out.println("The string with space : "+str2);
		sc.close();
		}
		
}