package lambda.methodreferences;

import java.util.Arrays;
import java.util.List;

public class MethodReferencesLambda {

	public static void main(String[] args) {
		
		//This approach provides the fastest performance
		List<String> letters = Arrays.asList("a", "b", "c", "d", "e", "f");
		
		System.out.println("Slower Lambda Expression ");
		long start = System.currentTimeMillis();
		
		letters.stream().forEach(x -> System.out.println(x));
		
		long end = System.currentTimeMillis();
		
		System.out.println("Lambda Performance: " + (end-start));
		
		System.out.println("Fastes Approach method reference");
		
		start = System.currentTimeMillis();
		// structure: name of the class then :: put the method here
		letters.stream().forEach(System.out::print);
		
		end = System.currentTimeMillis();
		
		System.out.println("\nMethod Reference Performance: " + (end-start));
	}
	
}
