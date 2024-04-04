package com.learning.core.day1session1;

import java.util.Scanner;

public class D01P35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int factorial = 1;

        if (number < 0) {
        } else {
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            System.out.println("Factorial of " + number + " is " + factorial);
        }

        scanner.close();
    }
}
