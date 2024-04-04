package com.learning.core.day2session1;

import java.util.Scanner;

public class D02P51 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        System.out.println("It is " + (isPalindrome(str1) ? "" : "not ") + "a Palindrome.");
        System.out.println("It is " + (isPalindrome(str2) ? "" : "not ") + "a Palindrome.");

        scanner.close();
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left++) != str.charAt(right--)) {
                return false;
            }
        }

        return true;
    }
}
