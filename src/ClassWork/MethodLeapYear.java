package ClassWork;

import java.util.Scanner;

public class MethodLeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a year");
        int year = scanner.nextInt();

        determineLeapYear(year);
    }
    public static void determineLeapYear(int year){
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
