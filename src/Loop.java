import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println("Hello, World"+(i+10));
        }
        //While
        int i = 0;
        while (i < 10){
            System.out.println("Hello, World"+(i+21));
            i++;
        }
    Scanner scanner = new Scanner (System.in);
        System.out.println("Please enter any number");
        int input = scanner.nextInt();

        while (input != 0){
            System.out.println("+100");
            System.out.println("Please enter any number");
            input = scanner.nextInt();
        }
        //Do while loop
        int j = 9;
        while (j < 10){
            System.out.println("This is While loop");
            j++;
        }
        do{
            System.out.println("This is Do While loop");
        }while (j < 10);
        }
    }
