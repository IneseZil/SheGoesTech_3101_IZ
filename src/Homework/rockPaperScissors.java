package homework;

import java.util.Scanner;

public class rockPaperScissors {
    public static void main(String[] args) {

        String runAgain;
        do {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Player1: choose Rock, Paper or Scissors?");
            String userInput1 = scanner.nextLine().trim().toLowerCase();

            System.out.println("Player 2: now you choose Rock, Paper or Scissors?");
            String userInput2 = scanner.nextLine().trim().toLowerCase();

            System.out.println(checkWinner(userInput1, userInput2));

            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Do you want to play again? y/n \n");
            runAgain = scanner1.nextLine().trim();
        } while (runAgain.equals("y"));
    }

    static String checkWinner(String userInput1, String userInput2) {

        String winner = "";
        if (userInput1.equals("rock") && userInput2.equals("paper")) {
            winner = "Paper covers Rock: Player 2 wins!";
        }
        if (userInput1.equals("paper") && userInput2.equals("rock")) {
            winner = "Paper covers Rock: Player 1 wins!";
        }
        if (userInput1.equals("paper") && userInput2.equals("scissors")) {
            winner = "Scissors cut paper: Player 2 wins!";
        }
        if (userInput1.equals("scissors") && userInput2.equals("paper")) {
            winner = "Scissors cut paper: Player 1 wins!";
        }
        if (userInput1.equals("rock") && userInput2.equals("scissors")) {
            winner = "Rock crushes scissors: Player 1 wins!";
        }
        if (userInput1.equals("scissors") && userInput2.equals("rock")) {
            winner = "Rock crushes scissors: Player 2 wins!";
        }

        if (userInput1.equals(userInput2)) {
            winner = "Tie! Try again :)";
        }

        return winner;
        }
}


