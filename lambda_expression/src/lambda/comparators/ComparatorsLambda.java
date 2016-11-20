package lambda.comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import lambda.mapping.Person;

public class ComparatorsLambda {

	public static void main(String[] args) {

		ArrayList<Person> persons = new ArrayList<Person>();
		
		persons.add(new Person("Sidney", "Crosby", 34));
		persons.add(new Person("Evgeni", "Malkin", 23));
		persons.add(new Person("Kris", "Letang", 24));
		persons.add(new Person("Martin", "St-Louis", 41));
		persons.add(new Person("Anze", "Kopitar", 18));
		persons.add(new Person("Drew", "Doughty", 36));
		persons.add(new Person("Booby", "Ryan", 52));
		
		ArrayList<Person> persons2 = (ArrayList<Person>)persons.clone();
		
		System.out.println("Non-lambda ");
		System.out.println(persons);
		Comparator<Person> c1 = new Comparator<Person>() {
			
			public int compare(Person p1, Person p2) {
				return p1.getLastName().compareTo(p2.getLastName());
			}
			
		};
		Collections.sort(persons, c1);
		System.out.println(persons);
		System.out.println("end old way");
		
		System.out.println("Lambda ");
		System.out.println(persons2);
		Comparator<Person> c2 = (Person p1, Person p2) -> p1.getLastName().compareTo(p2.getLastName());
		
		Collections.sort(persons, c2);
		System.out.println(persons2);
		System.out.println("end lambda way");
		
	}

}
