package com.learning.core.day1session2;

import java.util.Scanner;

public class D01P42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] A = new int[18];

        for (int i = 0; i < 18; i++) {
            A[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < 15; i++) {
            sum += A[i];
        }
        A[15] = sum;

        double average = (double) sum / 15; // Average of the first 15 elements
        A[16] = (int) average;

        int min = A[0];
        for (int i = 1; i < 15; i++) {
            if (A[i] < min) {
                min = A[i];
            }
        }
        A[17] = min;

        System.out.println("Output:");
        for (int i = 0; i < 18; i++) {
            System.out.print(A[i] + " ");
        }

        scanner.close();
    }
}
