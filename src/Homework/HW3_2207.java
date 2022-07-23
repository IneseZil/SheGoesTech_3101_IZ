package Homework;

import java.util.Scanner;

public class HW3_2207 {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter any number");
            int input = scanner.nextInt();
            if (input >= 0) {
                do {
                    System.out.print(input+" ");
                } while (input-- != 0);
            }else
                do {
                    System.out.print(input+" ");
                } while (input++ != 0);
        }
}

