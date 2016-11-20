package lambda.filtering;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.function.Predicate;

/**
 * @author Sabi
 * 
 * Lambda is an anonymous functions because it has not got identifiers
 * 
 * It has three main parts:
 * 
 * parameters: (param1, param2)
 * arrow token: ->
 * body: expression
 * e.g : (x, y) -> x+y
 * 
 * functions: filter, map, mapToInt, mapToDouble etc.
 *
 */
public class FilteringLambda {
	
	public static void main(String[] args) {
		
		
		List<Integer> nums = new ArrayList<Integer>();
		
		nums.add(5);
		nums.add(9);
		nums.add(2);
		nums.add(10);
		
		//Implementation of filtering before Java 8
		List<Integer> filtered = new ArrayList<Integer>();
		
		for(Integer i : nums) {
			
			if(i%2 == 0) {
				filtered.add(i);
			}
		}
		
		System.out.println("Before Java 8" + filtered);
		
		Predicate<Integer> even = (x -> x % 2 == 0);
		
		/*
		List<Integer> filtered2 = nums
				.stream()
				.filter(x -> x % 2 == 0)
				.collect(Collectors.toList());
		*/
		
		List<Integer> filtered2 = nums
				.stream()
				.filter(even)
				.collect(Collectors.toList());
		System.out.println("Lambda Expression" + filtered2);
		
	}


}
