package lambda.mapping;

import java.util.ArrayList;
import java.util.List;

public class MappingLambda {

	public static void main(String[] args) {
		
		List<Person> persons = new ArrayList<Person>();
	
		persons.add(new Person("Sidney", "Crosby", 34));
		persons.add(new Person("Evgeni", "Malkin", 23));
		persons.add(new Person("Kris", "Letang", 24));
		persons.add(new Person("Martin", "St-Louis", 41));
		persons.add(new Person("Anze", "Kopitar", 18));
		persons.add(new Person("Drew", "Doughty", 36));
		persons.add(new Person("Booby", "Ryan", 52));
		
		System.out.println("Non-lambda ");
		
		for(Person p : persons) {
			System.out.println("Person age is " + p.getAge());
		}
		
		//Using mapping function
		System.out.println("Lambda Expression");
		persons.stream()
			.map(x -> x.getAge())
			.forEach(x -> System.out.println("# " + x));
		
	}
}
