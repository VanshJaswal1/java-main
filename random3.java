import java.util.Random;
import java.util.Scanner;

public class random3 {

    public static void main(String[] args) {

        Random num = new Random();
        Scanner sc = new Scanner(System.in);

        int a = num.nextInt(100) + 1;   // Generates 1 to 100

        System.out.print("Enter your guess: ");
        int b = sc.nextInt();

        // Don't print 'a' in the real game.
        // System.out.println("Computer chose = " + a);

        if (b < a) {
            System.out.println("Too Low!");
        }

        else if (b > a) {
            System.out.println("Too High!");
        }

        else {
            System.out.println("Congratulations! You guessed the correct number.");
        }

        System.out.println("Nice Try!");

        sc.close();
    }
}