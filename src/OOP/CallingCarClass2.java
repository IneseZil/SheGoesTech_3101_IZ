package oop;

import java.util.Scanner;

public class CallingCarClass2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter car's brand:");
        String brand = scanner.nextLine();
        System.out.println("Please enter car's color:");
        String color = scanner.nextLine();
        System.out.println("Please enter car's maximum speed:");
        int maxSpeed = scanner.nextInt();

        Car secondCar = new Car();
        secondCar.setBrand(brand);
        secondCar.setMaxSpeed(maxSpeed);
        secondCar.setColor(color);

        secondCar.printCarInfo();

        Car thirdCar = new Car();
        thirdCar.setBrand("Nissan");
        thirdCar.setMaxSpeed(230);
        thirdCar.setColor("Black");

        thirdCar.printCarInfo();
    }



}
