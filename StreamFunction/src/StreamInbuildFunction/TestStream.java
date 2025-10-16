package StreamInbuildFunction;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TestStream {

	public static void main(String[] args) {
				List<Integer> lst = List.of(17,23,11,32,31,7,18);
				
				//stream for max number
				Optional<Integer> maxnum = lst.stream().max(Integer::compare);
				System.out.println("The max number : "+maxnum.get());
				
				//stream for min number
				Optional<Integer> minnum = lst.stream().min(Integer::compare);
				System.out.println("The min number : "+minnum.get());
						
				
				//use of filter
				maxnum = lst.stream().filter(e -> e%2!=0).max(Integer::compare);
				System.out.println("The Max odd number is : "+maxnum.get());
	
				//find 1st number > 5
				Optional<Integer> op =  lst.stream().filter(e->e>5).findFirst();	
				if(op.isPresent()) {
					System.out.println("find 1st number > 5 : "+op.get());
				}
				
				//to find list of square of all number
				List<Integer> lst1 = lst.stream().map(e -> e*e).collect(Collectors.toList());
				System.out.println(lst1);
				
				List<String> lstr = List.of("Hello","Welcome","Test","Check");
				Optional<String> op1 = lstr.stream().reduce((acc,s) -> acc.length() > s.length()?acc:s);
				System.out.println(op1.get());
				
				//All match
				boolean status =  lst.stream().allMatch(e -> {
					System.out.println("all the match : "+e);
					return e>15;
				   });
				System.out.println(status);
				
				//none-match
				boolean status1 = lst.stream().noneMatch(e -> {
					System.out.println("The none Match value : "+e);
					return e > 15;
				});
				System.out.println(status);
				
				//any match
				boolean status2 = lst.stream().anyMatch(e ->{
						System.out.println("The Any Match : "+e);
						return e>15;
				});
				System.out.println(status);
				
//---------------------------------------------------------------------------------------------//
			
				
	}

}
