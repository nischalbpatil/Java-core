package com.learning.core.day2session1;

import java.util.*;

public class D02P58 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        String inputn = scanner.nextLine();
        boolean resultn = canSplitIntoFourDistinctStrings(inputn);
        System.out.println(resultn ? "Yes" : "No");


        String input2 = scanner.nextLine();
        boolean result2 = canSplitIntoFourDistinctStrings(input2);
        System.out.println(result2 ? "Yes" : "No");


        scanner.close();
    }

    public static boolean canSplitIntoFourDistinctStrings(String str) {
        if (str.length() < 4) {
            return false;
        }

        Set<Character> distinctCharacters = new HashSet<>();
        for (char ch : str.toCharArray()) {
            distinctCharacters.add(ch);
        }

        return distinctCharacters.size() >= 4;
    }
}
