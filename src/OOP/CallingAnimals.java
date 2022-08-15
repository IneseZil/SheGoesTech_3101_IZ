package OOP;public class CallingAnimals {
    public static void main(String[] args) {

        Animals cat1 = new Animals("Cat", "Brittish", 7.3f, 16);
        Animals dog1 = new Animals("Dog", "Taxa", 8.3f, 15);
        cat1.printAnimalInfo();

        dog1.printAnimalInfo();

        Animals bird1 = new Animals("Bird", "Down", 1.2f);
        bird1.printAnimalInfo();
        bird1.setAveAge(5);
        bird1.printAnimalInfo();

        Animals turtle1 = new Animals();
        turtle1.printAnimalInfo();




    }

}
