package oop;

public class Car {
    //Fields
    private String color;
    private String brand;
    private int maxSpeed;

    // Methods
    //Setter method
    public void setColor(String color){
        this.color = color;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setMaxSpeed(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }
    //Getter method
    public String getColor(){
        return color;
    }
    public String getBrand(){
        return brand;
    }
    public int getMaxSpeed(){
        return maxSpeed;
    }

    public void printCarInfo(){
        System.out.println("Car info: ");
        System.out.println("Brand: "+brand);
        System.out.println("Color: "+color);
        System.out.println("Maximum speed: "+maxSpeed);
    }

}
