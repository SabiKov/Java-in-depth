package lambda.functions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;


import lambda.mapping.Person;


/**
 * 
 * @author Sabi
 * 
 * Function interface allow us to pass argument and it returns a declared type
 *
 */
public class FunctionsLambda {

	public static void main(String[] args) {
		
		List<Person> persons = new ArrayList<Person>();
		
		persons.add(new Person("Sidney", "Crosby", 34));
		persons.add(new Person("Evgeni", "Malkin", 23));
		persons.add(new Person("Kris", "Letang", 24));
		persons.add(new Person("Martin", "St-Louis", 41));
		persons.add(new Person("Anze", "Kopitar", 18));
		persons.add(new Person("Drew", "Doughty", 36));
		persons.add(new Person("Booby", "Ryan", 52));
		
		
		Predicate<Person> startsWithA = person -> person.getFirstName().startsWith("A");
		
		//function exmaple
		Function<String, Predicate<Person>> startWithLetter 
			= letter -> person -> person.getFirstName()
			.startsWith(letter);
		
		persons.stream()
			.filter(startWithLetter.apply("B"))
			.forEach(x -> System.out.println(x.getFirstName() + " " + x.getLastName()));
		
		Function<Person, Integer> mapIt = person -> person.getAge();
			
		persons.stream().map(x -> mapIt.apply(x)).forEach(x -> System.out.println(x));
		
		
		
	}

}
