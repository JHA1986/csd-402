/* Jonah Aney CSD-402 Module 2: Rock, Paper, Scissors.
Write a program that is like the popular game titled “Rock-Paper-Scissors.” 
The program should randomly generate the number of 1, 2, or 3 with 1 being Rock, 2 being Paper, and 3 being Scissors. 
This will be the computer’s selection in the game. Then, the program should prompt the user to enter a value of 1, 2, or 3. 
This will be the user’s selection in the game. Next, the program should display a clear readable message displaying both the computer’s selection, 
the user’s selection, and the results of the game played. 
*/

// Source material: YouTube. (n.d.). YouTube. https://www.youtube.com/watch?v=DyqMglmrido&t=3s 

package j_aney.csd402.mod_2;
// Import random and scanner utilities
import java.util.Random;
import java.util.Scanner;

public class J_AneyCSD402Mod_2 {
// Main method to run the game.
    public static void main(String[] args) {
        String[] rps = {"1", "2", "3"};
        String computerMove = rps[new Random().nextInt(rps.length)];

        Scanner scanner = new Scanner(System.in);
        String playerMove;
// Start the game, ask the user to enter a number for rock, paper or scissors. Use a while loop to recieve valid input or have user re-enter.
        while (true) {
            System.out.println("Let's play Rock, Paper, Scissors! Please enter your move (1-Rock, 2-Paper, or 3-Scissors)");
            playerMove = scanner.nextLine();
            if (playerMove.equals("1") || playerMove.equals("2") || playerMove.equals("3"))
                break;
            System.out.println(playerMove + " is not a valid move.");
        }

        System.out.println("Computer's move: " + computerMove);
// Determine computer move based user input and display the result of the game. 
        if (playerMove.equals(computerMove)) {
            System.out.println("The game was a tie!");
        } else if (playerMove.equals("1")) {
            if (computerMove.equals("2")) {
                System.out.println("You lose!");
            } else if (computerMove.equals("3")) {
                System.out.println("You win!");
            }
        } else if (playerMove.equals("2")) {
            if (computerMove.equals("1")) {
                System.out.println("You win!");
            } else if (computerMove.equals("3")) {
                System.out.println("You lose!");
            }
        } else if (playerMove.equals("3")) {
            if (computerMove.equals("2")) {
                System.out.println("You win!");
            } else if (computerMove.equals("1")) {
                System.out.println("You lose!");
            }
        }
    }
}