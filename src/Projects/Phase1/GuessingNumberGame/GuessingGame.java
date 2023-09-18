package Projects.Phase1.GuessingNumberGame;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 100;
    private int secretNumber;
    private int numberOfGuessesRemaining;

    public GuessingGame() {
        Random random = new Random();
        this.secretNumber = random.nextInt(MAX_NUMBER - MIN_NUMBER + 1) + MIN_NUMBER;
        this.numberOfGuessesRemaining = 10;
    }

    public void startGame() {
        System.out.println("Welcome to the guessing game!");
        System.out.println("I have generated a random number between 1 and 100.");
        System.out.println("You have 10 guesses to try to guess the number.");
        while (numberOfGuessesRemaining > 0) {
            System.out.print("Enter your guess: ");
            Scanner scanner = new Scanner(System.in);
            int guess = scanner.nextInt();

            if (guess == secretNumber) {
                System.out.println("Congratulations! You guessed the number correctly!");
                break;
            } else if (guess < secretNumber) {
                System.out.println("Your guess is too low.");
            } else {
                System.out.println("Your guess is too high.");
            }

            numberOfGuessesRemaining--;
        }

        if (numberOfGuessesRemaining == 0) {
            System.out.println("Sorry, you ran out of guesses. The secret number was " + secretNumber + ".");
        }
    }
}
