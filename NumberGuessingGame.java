import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lowerBound = 1;  // Set the lower bound of the random number range
        int upperBound = 100;  // Set the upper bound of the random number range
        int randomNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a random number between " + lowerBound + " and " + upperBound);
        System.out.println("You have 5 attempts to guess the number.");

        int userGuess;
        int attempts = 0;
        int maxAttempts = 5;

        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            attempts++;

            if (userGuess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                break;
            }
        }

        if (attempts == maxAttempts) {
            System.out.println("Sorry, you've reached the maximum number of attempts. The correct number was: " + randomNumber);
        }

        scanner.close();
    }
}
