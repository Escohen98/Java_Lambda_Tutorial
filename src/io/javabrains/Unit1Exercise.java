package io.javabrains;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Unit1Exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 60),
				new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 51),
				new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39)
				);
		
		
		
		//Step 1: Sort list by last name
		
		//Java 8:
		people.sort((P1, P2) -> P1.getLastName().compareTo(P2.getLastName()));
		
		/* Java 7:
		Collections.sort(mylist, new Comparator<ArrayList<String>>(){

	        @Override
	        public int compare(ArrayList<String> arg0, ArrayList<String> arg1) {
	            return arg0.get(0).compareTo(arg1.get(0));
	        }

	    });
	    */
		
		//Step 2: Create a method that prints all elements in the list
		
		
		ListIterator<Person> namesIterator = people.listIterator();
		while (namesIterator.hasNext()) {
			System.out.println(namesIterator.next());
		}
		//Step3: Create a method that prints all people that have last name beginning with C
		while (namesIterator.hasNext()) {
			Person nextPerson = people.listIterator().next();
			if (nextPerson.getLastName().charAt(0) == 'c')
				System.out.println(nextPerson);
		}
	}

}
