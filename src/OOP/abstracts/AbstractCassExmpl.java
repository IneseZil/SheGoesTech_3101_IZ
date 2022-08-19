package oop.abstracts;

abstract class Animal{
    protected String name;

    public void sleep(){
        System.out.println("Zzzz");
    }
    public abstract void animalSound();
}

class Pig extends Animal{
    public void animalSound(){
        System.out.println("Oink oink");
    }
}

class Dog extends Animal{
    public void animalSound(){
        System.out.println("Bark bark");
    }
}
public class AbstractCassExmpl {
    public static void main(String[] args) {
        //Animal animal = new Animal();

        Pig pig = new Pig();
        pig.sleep();
        pig.name="Peppa";
        pig.animalSound();

        Dog dog = new Dog();
        dog.animalSound();



    }


}
