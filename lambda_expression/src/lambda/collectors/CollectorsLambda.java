package lambda.collectors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
import java.util.stream.Collectors;

public class CollectorsLambda {

	public static void main(String[] args) {
		
		
		List<String> letters = Arrays.asList("a", "b", "c", "d", "e", "f");
		List<String> names = Arrays.asList("Adam", "Brent", "Andrew", "Carl", "Doug", "Alex");

		//Before Java 8
		//Using String builder over string concatenation that provides better performance.
		StringBuilder concat = new StringBuilder();
		
		System.out.println("Before Java 8");
		
		for(String l : letters) {
			concat.append(l);
		}
		
		System.out.println("Old school way: " + concat);
		
		ArrayList<String> namesWithNameA = new ArrayList<String>();
		for(String n : names) {
			if(n.startsWith("A")) {
				namesWithNameA.add(n);
			}
		}
		System.out.println("Before Java 8");
		System.out.println("Print names starts with letter A " + namesWithNameA);
		
		System.out.println("Java 8 ");
		String concat2 = "";
		
		concat2 = letters.stream().collect(Collectors.joining("| "));
		
		System.out.println("New way " + concat2);
		
		System.out.println("Lambda Expression");
		
		List<String> namesWithA2 = names.stream().filter(x -> x.startsWith("A")).collect(Collectors.toList());
		
		System.out.println("Lambda " + namesWithA2);
	}

}
