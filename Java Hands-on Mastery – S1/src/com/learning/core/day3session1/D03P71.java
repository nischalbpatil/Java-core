package com.learning.core.day3session1;

import java.util.ArrayList;
import java.util.Scanner;

public class D03P71{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> studentList = new ArrayList<>();

        System.out.println("Enter list of student names (separated by space): ");
        String studentNames = scanner.nextLine();
        String[] names = studentNames.split(" ");
        for (String name : names) {
            studentList.add(name);
        }

        System.out.println("Enter the name to find: ");
        String searchName = scanner.nextLine();

        boolean found = studentList.contains(searchName);

        if (found) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }

        scanner.close();
    }
}

