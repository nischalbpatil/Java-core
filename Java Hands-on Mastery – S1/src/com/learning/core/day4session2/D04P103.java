package com.learning.core.day4session2;

import java.util.Scanner;

public class D04P103 {
    public static boolean D04P103(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // First input
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] arr1 = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr1[i] = scanner.nextInt();
        }
        System.out.print("Enter the element to search: ");
        int target1 = scanner.nextInt();
        if (D04P103(arr1, target1)) {
            System.out.println("Element is Present");
        } else {
            System.out.println("Element is not Present");
        }
        
        // Second input
        System.out.println();
        System.out.print("Enter the size of the array: ");
        int m = scanner.nextInt();
        int[] arr2 = new int[m];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < m; i++) {
            arr2[i] = scanner.nextInt();
        }
        System.out.print("Enter the element to search: ");
        int target2 = scanner.nextInt();
        if (D04P103(arr2, target2)) {
            System.out.println("Element is Present");
        } else {
            System.out.println("Element is not Present");
        }
    }
}
