package com.learning.core.day1session1;

import java.util.*;

public class D01P44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] strArray = scanner.nextLine().split(" ");
        int[] nums = new int[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            nums[i] = Integer.parseInt(strArray[i]);
        }
        
        int k = scanner.nextInt();
        
        List<List<Integer>> result = new ArrayList<>();
        generateCombinations(nums, k, 0, new ArrayList<Integer>(), result);
        
        for (List<Integer> combination : result) {
            StringBuilder sb = new StringBuilder();
            for (int num : combination) {
                sb.append(num);
            }
            System.out.print(sb.toString() + " ");
        }
        
        scanner.close();
    }
    
    private static void generateCombinations(int[] nums, int k, int start, List<Integer> current, List<List<Integer>> result) {
        if (current.size() == k) {
            result.add(new ArrayList<>(current));
            return;
        }
        
        for (int i = start; i < nums.length; i++) {
            current.add(nums[i]);
            generateCombinations(nums, k, i + 1, current, result);
            current.remove(current.size() - 1);
        }
    }
}

