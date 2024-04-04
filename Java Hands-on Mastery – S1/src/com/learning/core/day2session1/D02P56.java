package com.learning.core.day2session1;

import java.util.Scanner;

public class D02P56 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input1 = scanner.nextLine();
        System.out.println("Output: " + Prefix(input1));
        System.out.println("Enter a string:");
        String input2 = scanner.nextLine();
        System.out.println("Output: " + Prefix(input2));

        scanner.close();
    }

    public static int Prefix(String str) {
        int n = str.length();
        int length = 0;
        for (int i = 0; i < n / 2; i++) {
            if (str.substring(0, i + 1).equals(str.substring(n - i - 1, n))) {
                length = i + 1;
            }
        }
        return length;
    }
}
