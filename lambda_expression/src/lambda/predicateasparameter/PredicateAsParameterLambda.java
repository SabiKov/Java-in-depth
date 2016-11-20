package lambda.predicateasparameter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateAsParameterLambda {

	public static void printFilter(List<Integer> nums, Predicate<Integer> condition) {
		
		for (Integer num : nums) {
			if(condition.test(num)) {
				System.out.println(num);
			}
		}
	}
	
	public static void main(String[] args) {
	
		List<Integer> nums = Arrays.asList(8, 7, 4, 3, 5, 6, 14, 16);
		
		//test1
		System.out.println("Test 1: ");
		printFilter(nums, (x) -> x > 5);
		
		System.out.println("Test 2: ");
		printFilter(nums, (x) -> true);
		
		System.out.println("Test 3: ");
		printFilter(nums, (x) -> false);

	}

}
