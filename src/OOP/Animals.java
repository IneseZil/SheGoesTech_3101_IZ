package oop;

public class Animals {

    //Fields

    private String species;
    private String breed;
    private float weight;
    private int aveAge;

    //Custom constructors

    public Animals (String species, String breed, float weight, int aveAge){
        this.breed = breed;
        this.species = species;
        this.weight = weight;
        this.aveAge = aveAge;
    }

    public Animals (String species, String breed, float weight){
        this.breed = breed;
        this.species = species;
        this.weight = weight;
    }

    public void printAnimalInfo (){
        System.out.println("Species: "+species);
        System.out.println("Breed: "+breed);
        System.out.println("Weight: "+weight+" kg");
        System.out.println("Average lifespan: "+aveAge+" year");
    }

    public void setAveAge(int aveAge) {
        this.aveAge = aveAge;
    }

    public Animals(){

    }

}
