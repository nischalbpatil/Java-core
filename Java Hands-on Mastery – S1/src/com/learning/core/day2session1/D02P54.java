package com.learning.core.day2session1;

import java.util.Scanner;

public class D02P54 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine(); 
        System.out.println(Palindrome(input));
        scanner.close();
    }

    public static int Palindrome(String str) {
        int n = str.length();
        int[][] dp = new int[n][n];

        for (int l = 2; l <= n; l++) {
            for (int i = 0; i < n - l + 1; i++) {
                int j = i + l - 1;
                if (str.charAt(i) == str.charAt(j)) {
                    dp[i][j] = dp[i + 1][j - 1];
                } else {
                    dp[i][j] = 1 + Math.min(dp[i][j - 1], dp[i + 1][j]);
                }
            }
        }

        return dp[0][n - 1];
    }
}

