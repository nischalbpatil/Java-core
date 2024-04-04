package com.learning.core.day2session1;

import java.util.Scanner;

public class D02P59 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        String output = replaceSpaces(input);

        System.out.println("Output:");
        System.out.println(output);

        scanner.close();
    }

    public static String replaceSpaces(String str) {
        StringBuilder sb = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (ch == ' ') {
                sb.append("%20");
            } else {
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}

