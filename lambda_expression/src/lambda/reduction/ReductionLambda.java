package lambda.reduction;

import java.util.ArrayList;
import java.util.List;

public class ReductionLambda {

	public static void main(String[] args) {
		
		List<Integer> nums = new ArrayList<Integer>();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(5);
		nums.add(6);
		nums.add(7);
		nums.add(8);
		nums.add(9);
		nums.add(10);
		nums.add(11);
		nums.add(12);
		
		//before Java 8
		int total = 0;
		for(int i : nums) {
			
			total += i;
		}
		
		System.out.println("Total before Java 8: " + total);
		
		int total2 = nums.stream().reduce(0, (a, b) -> a + b);
		
		System.out.println("Totla with lambda : " + total2);
	}
	
}
