package Basics.ClassWork;

import java.util.Scanner;

public class MethodLeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a year");
        int year = scanner.nextInt();

        determineLeapYear(year);
        determineLeapYear(2039);
        determineLeapYear(1827);
        determineLeapYear(1973);

        String result = determineLeapYearRet(year);
        System.out.println(result);
    }

    public static void determineLeapYear(int year) {
        if (year % 400 == 0) {
            System.out.println(year + " is a Leap year");
        } else if (year % 4 == 0) {
            System.out.println(year + " is a Leap year");
        } else if (year % 100 == 0) {
            System.out.println(year + " is NOT a Leap year");
        } else {
            System.out.println(year + " is NOT a Leap year");
        }
    }

    public static String determineLeapYearRet(int year) {    //use return multiple times. Return exits a method
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return year+" is a Leap year ^^";
        } else {
            return year+" is NOT a Leap year ^^";
        }
    }
}
