package com.learning.core.day1session2;

import java.util.Scanner;

public class D01P41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sets = 2; 
        String[] results = new String[sets]; 

        for (int set = 0; set < sets; set++) {
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            scanner.nextLine(); 

            int[] array = new int[5];
            for (int i = 0; i < array.length; i++) {
                array[i] = scanner.nextInt();
            }
            scanner.nextLine(); 

            boolean foundNum1 = false;
            boolean foundNum2 = false;

            for (int i = 0; i < array.length; i++) {
                if (num1 == array[i]) {
                    foundNum1 = true;
                }
                if (num2 == array[i]) {
                    foundNum2 = true;
                }
            }

            if (foundNum1 && foundNum2) {
                results[set] = "Its Bingo";
            } else {
                results[set] = "Not Found";
            }
        }

        // Printing results
        for (String result : results) {
            System.out.println(result);
        }

        scanner.close();
    }
}
