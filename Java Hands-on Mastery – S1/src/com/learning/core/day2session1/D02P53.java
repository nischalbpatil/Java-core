package com.learning.core.day2session1;

import java.util.Scanner;

public class D02P53 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        System.out.println("Output:");
        printSubsequences(input);
        scanner.close();
    }

    public static void printSubsequences(String str) {
        printSubsequencesHelper(str, 0, "");
    }

    public static void printSubsequencesHelper(String str, int index, String current) {
        if (index == str.length()) {
            if (!current.isEmpty()) {
                System.out.println(current);
            }
            return;
        }

        // Include current character
        printSubsequencesHelper(str, index + 1, current + str.charAt(index));

        // Exclude current character
        printSubsequencesHelper(str, index + 1, current);
    }
}
