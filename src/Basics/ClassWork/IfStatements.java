package Basics.ClassWork;

import java.util.Scanner;

public class IfStatements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a grade");
        int grade = scanner.nextInt();
        // Print out "Good job!"if grade is over 6
        if (grade > 6) {
            System.out.println("Good job!");
        }

        // Print out "Good job!"if grade is over 3
        if (grade > 7) {
            System.out.println("Good job!");
        }

        // If else statement
        // print good job of grade is over 6, if not then print "Better luck next time

        if (grade > 6) {
            System.out.println("Good job!");
        } else {
            System.out.println("Better luck next time!");

        }
        // print out "you have a fever!" if temp is over 37.3 and print "You are a cucumber" if not
        float temperature = 37.56f;
        if(temperature > 37.3f){
            System.out.println("You have a fever");
        } else{
            System.out.println("You are a cucumber");
        }

        //ELSE IF
        //print comments about grade 1-3 "very bad" 4-6 "OK" 7 "Nice" 8-9"Cool, kid!"

        if(grade <4) {
            System.out.println("Very bad");
        } else if (grade >= 4 && grade <=6) {
            System.out.println("OK");
        } else if (grade == 7) {
            System.out.println("Nice");
        } else {
            System.out.println("Cool, kid!");
        }





    }
}