package com.learning.core.day1session1;

import java.util.Scanner;

public class D01P33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int marks = scanner.nextInt();
        double percentage = (double) marks / 100 * 100;

        char grade;
        if (percentage >= 60) {
            grade = 'A';
        } else if (percentage >= 45) {
            grade = 'B';
        } else if (percentage >= 35) {
            grade = 'C';
        } else {
            grade = 'F'; 
        }

        System.out.println(grade + " Grade" );

        scanner.close();
    }
}