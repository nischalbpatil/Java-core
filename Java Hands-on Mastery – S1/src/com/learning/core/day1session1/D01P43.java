package com.learning.core.day1session1;
import java.util.*;

public class D01P43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int[] arr = new int[n]; 
        
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        Map<Integer, Integer> map = new HashMap<>(); 
        int index = -1; 
        
        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) { 
                index = i;
                break;
            } else {
                map.put(arr[i], i); 
            }
        }
        
        System.out.println("Output: " + index);
    }
}
