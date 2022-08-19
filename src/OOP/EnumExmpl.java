package oop;

enum Level {
    HIGH, LOW, MEDIUM
}
public class EnumExmpl {
    public static void main(String[] args) {
        Level myLevel = Level.HIGH;
        switch (myLevel){
            case LOW:
                System.out.println("Level: LOW");
                break;
            case MEDIUM:
                System.out.println("Level: MEDIUM");
            case HIGH:
                System.out.println("Level: HIGH");
                break;
        }



    }
}
