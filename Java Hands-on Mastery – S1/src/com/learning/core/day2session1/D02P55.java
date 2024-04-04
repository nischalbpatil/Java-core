package com.learning.core.day2session1;

import java.util.Scanner;

public class D02P55 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of strings:");
        int n = scanner.nextInt();
        scanner.nextLine(); 
        String[] strings = new String[n];
        System.out.println("Enter the strings separated by space:");
        String input = scanner.nextLine();
        strings = input.split(" ");

        
        if (canFormCircle(strings)) {
            System.out.println("Yes");
            printCircleOrder(strings);
        } else {
            System.out.println("No");
        }

        scanner.close();
    }

    public static boolean canFormCircle(String[] strings) {
        int[] inDegree = new int[26]; 

        for (String str : strings) {
            inDegree[str.charAt(0) - 'a']++;
            inDegree[str.charAt(str.length() - 1) - 'a']--;
        }

        for (int degree : inDegree) {
            if (degree != 0) {
                return false;
            }
        }

        return true;
    }

    public static void printCircleOrder(String[] strings) {
        int[] outDegree = new int[26];
        for (String str : strings) {
            outDegree[str.charAt(0) - 'a']++;
        }

        char start = 0;
        for (int i = 0; i < 26; i++) {
            if (outDegree[i] == 1) {
                start = (char) ('a' + i);
                break;
            }
        }

        StringBuilder sb = new StringBuilder();
        char lastChar = start;
        for (int i = 0; i < strings.length; i++) {
            for (String str : strings) {
                if (str.charAt(0) == lastChar) {
                    sb.append(str).append(" ");
                    lastChar = str.charAt(str.length() - 1);
                    break;
                }
            }
        }

        System.out.println(sb.toString().trim());
    }
}
