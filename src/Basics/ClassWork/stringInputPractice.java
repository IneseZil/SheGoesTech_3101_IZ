package Basics.ClassWork;

import java.util.Scanner;

public class stringInputPractice {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name and age (John 30)");
        String nameAndAge = scanner.nextLine().trim();
        int Age = Integer.parseInt(nameAndAge.substring(nameAndAge.length()-2));

        if (Age>70) System.out.println("Senior");
        else System.out.println("Adult");

        //read string from user and get of spaces (trim)
        //get substring of last 2 characters in the string
        //convert those to integer
        //if age is over 70 then print "Senior" else "Adult"



    }
}