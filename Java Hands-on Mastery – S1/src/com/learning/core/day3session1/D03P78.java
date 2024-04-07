package com.learning.core.day3session1;
import java.util.HashSet;
import java.util.TreeSet;
public class D03P78 {
	    public static void main(String[] args) {
	        TreeSet<Person> personTreeSet = new TreeSet<>();
	 
	        personTreeSet.add(new Person(1,"Alice", 30, 50000));
	        personTreeSet.add(new Person(2,"Bob", 35, 60000));
	        personTreeSet.add(new Person(3,"Charlie", 25, 45000));
	        personTreeSet.add(new Person(4,"David", 40, 70000));
	        personTreeSet.add(new Person(5,"Eve", 28, 55000));
	        personTreeSet.add(new Person(6,"Frank", 32, 58000));
	 
	        double sum = 0;
	        for (Person person : personTreeSet) {
	            sum += person.getSalary();
	        }
	        System.out.println("Sum of all salaries: " + sum);
	    }
}