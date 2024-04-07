package com.learning.core.day3session1;
import java.util.TreeSet;	 
public class D03P75 {
	    public static void main(String[] args) {
	        Person person1 = new Person(1, "Alice", 30, 50000);
	        Person person2 = new Person(2, "Bob", 28, 55000);
	        Person person3 = new Person(3, "Charlie", 25, 60000);
	        Person person4 = new Person(4, "David", 35, 70000);
	        Person person5 = new Person(5, "Eva", 20, 45000);
	        Person person6 = new Person(6, "Frank", 40, 80000);
	 
	        TreeSet<Person> personSet = new TreeSet<>();
	        personSet.add(person1);
	        personSet.add(person2);
	        personSet.add(person3);
	        personSet.add(person4);
	        personSet.add(person5);
	        personSet.add(person6);
	 
	        System.out.println("Persons with age greater than 25:");
	        for (Person person : personSet) {
	            if (person.getAge() > 25) {
	                System.out.println(person);
	            }
	        }
	    }
	}

	