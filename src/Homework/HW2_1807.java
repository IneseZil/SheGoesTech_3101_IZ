package Homework;

import java.util.Scanner;

public class HW2_1807 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a year");
        int year = scanner.nextInt();

        if (year % 400 == 0) {
            System.out.println(year + " is a Leap year");
        } else if (year % 4 == 0) {
            System.out.println(year + " is a Leap year");
        } else if (year % 100 == 0) {
            System.out.println(year + " is NOT a Leap year");
        } else {System.out.println(year + " is NOT a Leap year");
        }
    }
}
