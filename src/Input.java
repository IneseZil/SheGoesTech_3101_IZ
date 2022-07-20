import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name");
        String Name = scanner.nextLine();
        System.out.println("Your name is "+Name);

        System.out.println("What is your age?");
        int Age = scanner.nextInt();
        System.out.println("You are "+Age+" years old, kid! ");


    }
}
