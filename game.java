import java.util.Random;
import java.util.Scanner;

class GuessGame {

    int number;
    int guess;
    int attempts;

    Scanner sc = new Scanner(System.in);
    Random random = new Random();

    // Constructor
    GuessGame() {
        number = random.nextInt(100) + 1;
        attempts = 0;
    }

    // Take input from user
    void takeInput() {
        System.out.print("Enter your guess (1-100): ");
        guess = sc.nextInt();
        attempts++;
    }

    // Check the guess
    boolean isCorrect() {

        if (guess < number) {
            System.out.println("Too Low!");
            return false;
        }

        else if (guess > number) {
            System.out.println("Too High!");
            return false;
        }

        else {
            System.out.println("🎉 Congratulations! You guessed the correct number.");
            return true;
        }
    }

    // Display final result
    void displayResult() {
        System.out.println("Total Attempts = " + attempts);
    }
}

public class game {

    public static void main(String[] args) {

        GuessGame game = new GuessGame();

        System.out.println("========== Guess The Number ==========");
        System.out.println("I have chosen a number between 1 and 100.");
        System.out.println("Try to guess it!\n");

        while (true) {

            game.takeInput();

            if (game.isCorrect()) {
                break;
            }
        }

        game.displayResult();
    }
}