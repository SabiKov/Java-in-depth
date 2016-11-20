package lambda.liststatistics;

import java.util.Arrays;
import java.util.List;
import java.util.IntSummaryStatistics;

public class ListStatistics {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(8, 7, 4, 3, 5, 6, 14, 16);
		
		System.out.println("Non-Lambda Approach");
		
		Integer max = null;
		Integer min = null;
		int sum = 0;
		
		for (Integer i : nums) {
			if(max == null) {
				max = i;
				min = i;
			
			} else if(max < i) {
				max = i;
				
			} else if(min > i) {
				min = i;
			}
			
			sum += i;
		}
		float average = (float)sum / nums.size();
		System.out.println(" Max: " + max + "\n Min: " + min + "\n Sum: " + sum + "\n Average: " + average );
		
		System.out.println("Lambda Approach");
		
		IntSummaryStatistics stats = nums.stream().mapToInt(x -> x).summaryStatistics();
		System.out.println(" Max: " + stats.getMax() + "\n Min: " + stats.getMin() + "\n Sum: " + stats.getSum() + "\n Average: " + stats.getAverage() );

	}

}
