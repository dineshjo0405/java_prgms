import java.util.Scanner;
import java.util.Random;

public class RockPaperScissorsSwitch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Get user input
        System.out.println("Enter your choice (Rock, Paper, or Scissors): ");
        String userChoice = scanner.nextLine().toLowerCase(); // Convert to lowercase for uniform comparison

        // Generate random computer choice
        int computerChoice = random.nextInt(3);
        String computerChoiceString = "";
        
        switch (computerChoice) {
            case 0:
                computerChoiceString = "rock";
                break;
            case 1:
                computerChoiceString = "paper";
                break;
            case 2:
                computerChoiceString = "scissors";
                break;
        }

        // Display computer's choice
        System.out.println("Computer chose: " + computerChoiceString);

        // Determine game outcome
        switch (userChoice) {
            case "rock":
                if (computerChoiceString.equals("scissors")) {
                    System.out.println("You win!");
                } else if (computerChoiceString.equals("rock")) {
                    System.out.println("It's a draw!");
                } else {
                    System.out.println("You lose!");
                }
                break;
            case "paper":
                if (computerChoiceString.equals("rock")) {
                    System.out.println("You win!");
                } else if (computerChoiceString.equals("paper")) {
                    System.out.println("It's a draw!");
                } else {
                    System.out.println("You lose!");
                }
                break;
            case "scissors":
                if (computerChoiceString.equals("paper")) {
                    System.out.println("You win!");
                } else if (computerChoiceString.equals("scissors")) {
                    System.out.println("It's a draw!");
                } else {
                    System.out.println("You lose!");
                }
                break;
            default:
                System.out.println("Invalid input. Please enter Rock, Paper, or Scissors.");
                break;
        }

        scanner.close();
    }
}
