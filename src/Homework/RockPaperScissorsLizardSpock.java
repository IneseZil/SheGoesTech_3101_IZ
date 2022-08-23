package homework;

import java.util.Scanner;

public class RockPaperScissorsLizardSpock {
    public static void main(String[] args) {
        String runAgain;

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Player1: choose Rock, Paper, Scissors, Lizard, Spock?");
            String userInput1 = scanner.nextLine().trim().toLowerCase();

            System.out.println("Player 2: now you choose Rock, Scissors, Lizard, Spock");
            String userInput2 = scanner.nextLine().trim().toLowerCase();

           /* switch (userInput2) {
                case "rock" -> {
                    int userGuess = 0;
                }
                case "paper" -> {
                    int userGuess = 1;
                }
                case "scissors" -> {
                    int userGuess = 2;
                }
                case "lizard" -> {
                    int userGuess = 3;
                }
                case "spock" -> {
                    int userGuess = 4;
                }
            }

            switch (userInput1) {
                case "rock" -> {
                    int userGuess2 = 0;
                }
                case "paper" -> {
                    int userGuess2 = 1;
                }
                case "scissors" -> {
                    int userGuess2 = 2;
                }
                case "lizard" -> {
                    int userGuess2 = 3;
                }
                case "spock" -> {
                    int userGuess2 = 4;
                }
            }*/

            System.out.println(checkWinner1(userInput1, userInput2));

            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Do you want to play again? y/n \n");
            runAgain = scanner1.nextLine().trim();
        } while (runAgain.equals("y"));
    }


    static String checkWinner1(String userInput1, String userInput2) {
        String winner = " ";
        if (userInput1.equals("rock")) {
            switch (userInput2) {
                case "rock" -> winner = "Tie! Try again :)";
                case "paper" -> winner = "Paper covers Rock: Player 2 wins!";
                case "scissors" -> winner = "Rock crushes Scissors: Player 1 wins!";
                case "lizard" -> winner = "Rock crushes Lizard: Player 1 wins!";
                case "spock" -> winner = "Spock vaporizes Rock: Player 2 wins!";
            }
        }
        if (userInput1.equals("paper")) {
            winner = switch (userInput2) {
                case "rock" -> "Paper covers Rock: Player 1 wins!";
                case "paper" -> "Tie! Try again :)";
                case "scissors" -> "Scissors cut paper: Player 2 wins!";
                case "lizard" -> "Lizard eats Paper: Player 2 wins!";
                case "spock" -> "Paper disproves Spock: Player 1 wins!";
                default -> winner;
            };
        }
        if (userInput1.equals("scissors")) {
            winner = switch (userInput2) {
                case "rock" -> "Rock crushes Scissors: Player 2 wins!";
                case "paper" -> "Scissors cut Paper: Player 1 wins!";
                case "scissors" -> "Tie! Try again :)";
                case "lizard" -> "Scissors decapitates Lizard: Player 1 wins!";
                case "spock" -> "Spock smashes Scissors: Player 2 wins!";
                default -> winner;
            };
        }
        if (userInput1.equals("lizard")) {
            winner = switch (userInput2) {
                case "rock" -> "Rock crushes Lizard: Player 2 wins!";
                case "paper" -> "Lizard eats Paper: Player 1 wins!";
                case "scissors" -> "Scissors decapitates Lizard: Player 2 wins!";
                case "lizard" -> "Tie! Try again :)";
                case "spock" -> "Lizard poisons Spock: Player 1 wins!";
                default -> winner;
            };
        }
        if (userInput1.equals("spock")) {
            winner = switch (userInput2) {
                case "rock" -> "Spock vaporizes Rock: Player 1 wins!";
                case "paper" -> "Paper disproves Spock: Player 2 wins!";
                case "scissors" -> "Spock smashes Scissors: Player 1 wins!";
                case "lizard" -> "Lizard poisons Spock: Player 2 wins!";
                case "spock" -> "Tie! Try again :)";
                default -> winner;
            };
        }
        return winner;

    }
}
