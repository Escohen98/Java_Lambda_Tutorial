package io.javabrains;

	import java.util.Arrays;
	import java.util.Collections;
	import java.util.Comparator;
	import java.util.List;
	import java.util.ListIterator;

public class Unit1ExerciseSolutionJava8 {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			List<Person> people = Arrays.asList(
					new Person("Charles", "Dickens", 60),
					new Person("Lewis", "Carroll", 42),
					new Person("Thomas", "Carlyle", 51),
					new Person("Charlotte", "Bronte", 45),
					new Person("Matthew", "Arnold", 39)
					);

			thisDudesWay(people);
			
		}

		private static void thisDudesWay(List<Person> people) {
			//Step 1: Sort list by last name
			Collections.sort(people,(P1, P2) -> P1.getLastName().compareTo(P2.getLastName()));
		    
			
			//Step 2: Create a method that prints all elements in the list
			System.out.println("Printing all persons");
			printConditionally(people, p -> true);
			//Step3: Create a method that prints all people that have last name beginning with C
			System.out.println("---");
			//printLastNameBeginningC(people);
			
			System.out.println("Printing all persons with lastName of C");
			printConditionally(people, (p) -> p.getLastName().startsWith("C"));
			
			System.out.println("Printing all persons with firstName of C");
			printConditionally(people, p -> p.getFirstName().startsWith("C"));
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
