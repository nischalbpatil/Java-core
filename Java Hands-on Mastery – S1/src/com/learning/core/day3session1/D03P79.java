package com.learning.core.day3session1;
import java.util.TreeSet;	 
	public class D03P79 {
	    public static void main(String[] args) {
 
	     Person person1 = new Person(1, "Jully", 30, 50000.0);
	     Person person2 = new Person(2, "Bob", 28, 55000.0);
	     Person person3 = new Person(3, "Charlie", 25, 60000.0);
	     Person person4 = new Person(4, "Javid", 35, 70000.0);
	     Person person5 = new Person(5, "Eva", 20, 45000.0);
	     Person person6 = new Person(6, "Frank", 40, 80000.0);

	     TreeSet<Person> personSet = new TreeSet<>();
	        personSet.add(person1);
	        personSet.add(person2);
	        personSet.add(person3);
	        personSet.add(person4);
	        personSet.add(person5);
	        personSet.add(person6);
	 
	        Person firstPersonWithJ = null;
	        for (Person person : personSet) {
	            if (person.getName().startsWith("J")) {
	                firstPersonWithJ = person;
	                break;
	            }
	        }
	 
	        if (firstPersonWithJ != null) {
	            System.out.println("Details of the first person whose name starts with 'J':");
	            System.out.println(firstPersonWithJ);
	        } else {
	            System.out.println("No person found whose name starts with 'J'.");
	        }
	    }
}