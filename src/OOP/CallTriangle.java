package oop;

import java.util.Scanner;

public class CallTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side 1:");
        double side1 = scanner.nextDouble();
        System.out.println("Enter side 2:");
        double side2 = scanner.nextDouble();
        System.out.println("Enter side 3:");
        double side3 = scanner.nextDouble();

        Triangle Triangle1 = new Triangle();

        Triangle1.setSide1(side1);
        Triangle1.setSide2(side2);
        Triangle1.setSide3(side3);

        System.out.println(Triangle1.areaTriangle());
        System.out.printf("Your triangle area is %.2f",Triangle1.areaTriangle1());



    }
}
