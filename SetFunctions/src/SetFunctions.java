import java.util.HashSet;
import java.util.Set;

public class SetFunctions {

	public static void main(String[] args) {
		//Creating a set
		Set<Integer> hset = new HashSet<>();
		
		//Adding elements to a set
		hset.add(10);
		hset.add(20);
		hset.add(30);
		hset.add(40);
		hset.add(50);
		System.out.println("The value in Set are : "+hset);
		
		//Removing specific element from set
		hset.remove(10);
		System.out.println("The updated value is : "+hset);
		
		//Checking if set contains specific element
		int a= 30;
		hset.contains(a);
		System.out.println(hset.contains(a));
		
		//Removing all elements from set
		hset.removeAll(hset);
		
		//Creating another set
		Set<Integer> s2 = new HashSet<>();
		
		//Adding element to that set
		s2.add(90);
		s2.add(123462);
		
		//Copying element of one set to another set
		hset.addAll(s2);
		System.out.println("Elements in set "+hset);
		
	}

}
