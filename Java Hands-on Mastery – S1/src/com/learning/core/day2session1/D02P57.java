package com.learning.core.day2session1;

import java.util.*;

public class D02P57 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] dictionary = scanner.nextLine().split(" ");

        String pattern = scanner.nextLine();

        List<String> matchingStrings = findMatchingStrings(dictionary, pattern);

        System.out.println("Output:");
        for (String str : matchingStrings) {
            System.out.print(str + " ");
        }

        scanner.close();
    }

    public static List<String> findMatchingStrings(String[] dictionary, String pattern) {
        List<String> result = new ArrayList<>();

        for (String str : dictionary) {
            if (isPatternMatch(str, pattern)) {
                result.add(str);
            }
        }

        return result;
    }

    public static boolean isPatternMatch(String str, String pattern) {
        if (str.length() != pattern.length()) {
            return false;
        }

        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            char p = pattern.charAt(i);

            if (!map.containsKey(p)) {
                map.put(p, ch);
            } else {
                if (map.get(p) != ch) {
                    return false;
                }
            }
        }

        return true;
    }
}

