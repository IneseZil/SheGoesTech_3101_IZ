import java.util.Scanner;

public class HW1_1507 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name");
        String Name = scanner.nextLine();

        System.out.println("Please enter your year of birth");
        int Age = scanner.nextInt();
        int CurYear = 2022;

        System.out.print("Your name is " + Name);
        System.out.println(" and you are " +(CurYear-Age) + " years old, kid! ");

    }
}
