package Basics.ClassWork;

import java.util.Scanner;

public class nestedIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter score");
        float score = scanner.nextFloat();

        if (score < 40.0f){
        System.out.println("score <40%");
    } else if (score >40.0f && score <= 80.0f) {
            System.out.println("40% < score <=80%");
            if (score <= 70.0f) {
                System.out.println("<=70%");
            }
        } else {
            System.out.println("80% < score <= 100%");
        }
        System.out.println((int)score);
        if(score %2 == 0) {
            System.out.println("Score is even");
        } else {
            System.out.println("Score is odd");
        }
        }
    }
