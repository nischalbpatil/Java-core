package com.learning.core.day1session1;

import java.util.Scanner;

public class D01P32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 7; i++) {
            int dayNumber = scanner.nextInt();
            if (dayNumber >= 1 && dayNumber <= 7) {
                String dayName;
                switch (dayNumber) {
                    case 1:  dayName = "Sunday"; break;
                    case 2:  dayName = "Monday"; break;
                    case 3:  dayName = "Tuesday"; break;
                    case 4:  dayName = "Wednesday"; break;
                    case 5:  dayName = "Thursday"; break;
                    case 6:  dayName = "Friday"; break;
                    case 7:  dayName = "Saturday"; break;
                    default: dayName = "Invalid Input";
                }
                System.out.println(dayName);
            } else {
                System.out.println("Invalid Input");
            }
        }
        scanner.close();
    }
}