// Rock-Paper-Scissors is a game played between a minimum of two players. Each player can choose either rock, paper, or scissors. Here the game is played between a user and a computer. Based on the rules, either a player or a computer will win. Show the stats of player and computer win in a tabular format across multiple games. Also, show the winning percentage between the player and the computer.
//Hint =>
//The rule is: rock-scissors: rock will win (rock crushes scissors); rock-paper: paper wins (paper covers rock); scissors-paper: scissors win (scissors cuts paper)
//Create a Method to find the Computer Choice using the Math.random
//Create a Method to find the winner between the user and the computer
//Create a Method to find the average and percentage of wins for the user and the computer and return a String 2D array
//Create a Method to display the results of every game and also display the average and percentage wins
//In the main take user input for the number of games and call methods to display results

import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userWins = 0, compWins = 0, draws = 0;

        System.out.print("How many rounds? ");
        int rounds = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 1; i <= rounds; i++) {
            System.out.print("Round " + i + " - Enter rock/paper/scissors: ");
            String user = sc.nextLine().toLowerCase();

            int rand = (int) (Math.random() * 3);
            String comp = (rand == 0) ? "rock" : (rand == 1) ? "paper" : "scissors";

            System.out.println("Computer chose: " + comp);

            if (user.equals(comp)) {
                draws++;
                System.out.println("Result: Draw");
            } else if (
                    (user.equals("rock") && comp.equals("scissors")) ||
                            (user.equals("paper") && comp.equals("rock")) ||
                            (user.equals("scissors") && comp.equals("paper"))
            ) {
                userWins++;
                System.out.println("Result: You win");
            } else {
                compWins++;
                System.out.println("Result: Computer wins");
            }
            System.out.println();
        }

        System.out.println("Final Stats:");
        System.out.println("You: " + userWins);
        System.out.println("Computer: " + compWins);
        System.out.println("Draws: " + draws);
    }
}

