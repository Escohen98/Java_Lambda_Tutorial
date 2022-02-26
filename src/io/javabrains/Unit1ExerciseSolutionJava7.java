package io.javabrains;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

public class Unit1ExerciseSolutionJava7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 60),
				new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 51),
				new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39)
				);
		//myImplementation(people);
		//System.out.println("***");
		thisDudesWay(people);
		
	}
	
	private static void myImplementation(List<Person> people) {
		//Step 1: Sort list by last name
				Collections.sort(people, new Comparator<Person>() {

					@Override
					public int compare(Person o1, Person o2) {
						// TODO Auto-generated method stub
						return o1.getLastName().compareTo(o2.getLastName());
					}
					
				});
			    
				
		//Step 2: Create a method that prints all elements in the list
		
		ListIterator<Person> namesIterator = people.listIterator();
		while (namesIterator.hasNext()) {
			System.out.println(namesIterator.next());
		}
		//Step3: Create a method that prints all people that have last name beginning with C
		System.out.println("---");
		namesIterator = people.listIterator();
		while (namesIterator.hasNext()) {
			Person nextPerson = namesIterator.next();
			if (nextPerson.getLastName().charAt(0) == 'C')
				System.out.println(nextPerson);
		}
	}

	//Everything below here is thisDude's way
	private static void thisDudesWay(List<Person> people) {
		//Step 1: Sort list by last name
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				return o1.getLastName().compareTo(o2.getLastName());
			}
			
		});
	    
		
		//Step 2: Create a method that prints all elements in the list
		System.out.println("Printing all persons");
		printAll(people);
		//Step3: Create a method that prints all people that have last name beginning with C
		System.out.println("---");
		//printLastNameBeginningC(people);
		
		System.out.println("Printing all persons with lastName of C");
		printConditionally(people, new Condition() {
		
			@Override 
			public boolean test(Person p) {
				return p.getLastName().startsWith("C");
			}
		});
		
		System.out.println("Printing all persons with firstName of C");
		printConditionally(people, new Condition() {
					
					@Override 
					public boolean test(Person p) {
						return p.getFirstName().startsWith("C");
					}
				});
	}

	private static void printAll(List<Person> people) {
		for (Person p : people) {
			System.out.println(p);
		}
	}
	
	private static void printLastNameBeginningC(List<Person> people) {
		for (Person p: people)
			if (p.getLastName().startsWith("C"))
				System.out.println(p);
	}
	
	private static void printConditionally(List<Person> people, Condition condition) {
		for (Person p : people) 
			if(condition.test(p))
				System.out.println(p);
	}
}

interface Condition {
	boolean test(Person p);
}