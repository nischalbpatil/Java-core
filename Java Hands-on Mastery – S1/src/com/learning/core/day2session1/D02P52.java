package com.learning.core.day2session1;

import java.util.Scanner;

public class D02P52 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputString = scanner.nextLine();

        int n = scanner.nextInt();

        String lastNVowels = getLastNVowels(inputString, n);

        if (lastNVowels.equals("Mismatch in Vowel Count")) {
            System.out.println(lastNVowels);
        } else {
            System.out.println(lastNVowels);
        }

        scanner.close();
    }

    public static String getLastNVowels(String str, int n) {
        int count = 0;
        StringBuilder lastNVowels = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            if (isVowel(ch)) {
                lastNVowels.insert(0, ch);
                count++;
            }
            if (count == n) {
                return lastNVowels.toString();
            }
        }

        if (count < n) {
            return "Mismatch in Vowel Count";
        }

        return lastNVowels.toString();
    }

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
