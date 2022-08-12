package OOP;

public class CallingCarClass {
    public static void main(String[] args) {
        //create new object from Car class template
        //set field values
        //call printCarInfo method to check fields (attributes) values

        Car firstCar = new Car();
        firstCar.setBrand("Audi");
        firstCar.setMaxSpeed(210);
        firstCar.setColor("Red");

        //firstCar.printCarInfo();
        System.out.println("Brand is " + firstCar.getBrand());
        System.out.println("Max speed is " + firstCar.getMaxSpeed());
        System.out.println("Color is " + firstCar.getColor());
    }

}
