package oop.abstracts;

public class Fish extends PetAbstraction {
    private int waterChangeInAWeek;
    public void printPetInfo(){
        System.out.println("Color: "+color);
        System.out.println("Eat: "+eat);
        System.out.println("Place: "+place);
        System.out.println("Age: "+age);
        System.out.println("Water change a week: "+ waterChangeInAWeek);
    }

    public Fish(String color, String place, String eat, int age,int waterChangeInAWeek){
        super(color,place,eat,age);
        this.waterChangeInAWeek = waterChangeInAWeek;

    }
}

