package com.learning.core.day1session1;

import java.util.Scanner;

public class D01P31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 12; i++) {
            int monthNumber = scanner.nextInt();
            if (monthNumber >= 1 && monthNumber <= 12) {
                String monthName;
                switch (monthNumber) {
                    case 1:  monthName = "January"; break;
                    case 2:  monthName = "February"; break;
                    case 3:  monthName = "March"; break;
                    case 4:  monthName = "April"; break;
                    case 5:  monthName = "May"; break;
                    case 6:  monthName = "June"; break;
                    case 7:  monthName = "July"; break;
                    case 8:  monthName = "August"; break;
                    case 9:  monthName = "September"; break;
                    case 10: monthName = "October"; break;
                    case 11: monthName = "November"; break;
                    case 12: monthName = "December"; break;
                    default: monthName = "Invalid Input";
                }
                System.out.println(monthName);
            } else {
                System.out.println("Invalid Input");
            }
        }
        scanner.close();
    }
}