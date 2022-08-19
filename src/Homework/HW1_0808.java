package homework;

import java.util.Scanner;

public class HW1_0808 {
    public static void main(String[] args) {
        //Palindrome

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a word");
        String userInput = scanner.next().trim().toLowerCase();
        boolean check = true;


        for (int i=0; i <userInput.length(); i++) {
            if(userInput.charAt(i) != (userInput.charAt(userInput.length() - 1 - i))) {
            //if(userInput.substring(i,i+1) != userInput.substring(userInput.length() - 2 - i,userInput.length() - 1 - i)) {
                System.out.printf("%s is not palindrome\n",userInput);
                check = false;
                break;
            }
        }
        if (check != false)
            System.out.printf("%s is palindrome \n", userInput);


    }
}
