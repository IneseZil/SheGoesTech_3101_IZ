package oop.inheritance;
public class Vechile {
    //Fields
    protected String brand;

    //Methods
    public void honk(){
        System.out.println("Tuut tuuut");
        System.out.println("My brand is :"+brand);

    }

}

class Bike extends Vechile{

    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.honk();
        bike.brand="BMW";
        bike.honk();
    }
}