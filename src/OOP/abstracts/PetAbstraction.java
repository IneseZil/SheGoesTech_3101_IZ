package oop.abstracts;

public abstract class PetAbstraction {
    protected String color;
    protected String place;
    protected String eat;
    protected int age;

    public abstract void printPetInfo();

    public PetAbstraction(String color, String place, String eat, int age){
        this.color = color;
        this.place = place;
        this.eat = place;
        this.age = age;
    }
    //Default constructor
    //public PetAbstraction(){

    }
