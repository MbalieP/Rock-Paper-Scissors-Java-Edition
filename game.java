import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        String[] choices = {"Rock", "Paper", "Scissors"};
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter your choice: type 0 for Rock, 1 for Paper, 2 for Scissors:");
        int userChoice = scanner.nextInt();

        if (userChoice < 0 || userChoice >= 3) {
            // Checking if the user's input is valid
            System.out.println("You've entered an invalid number, you lose!");
        } else {
            int computerChoice = random.nextInt(3); // Generating the computer's choice

            System.out.println("You chose: " + choices[userChoice]);
            System.out.println("The computer chose: " + choices[computerChoice]);

            if (computerChoice == userChoice) {
                System.out.println("It's a draw!");
            } else if (computerChoice == 0 && userChoice == 2 || 
                       computerChoice == 1 && userChoice == 0 || 
                       computerChoice == 2 && userChoice == 1) {
                System.out.println("Computer wins, you lose!");
            } else {
                System.out.println("You win, computer loses!");
            }
        }

        scanner.close();
    }
}
