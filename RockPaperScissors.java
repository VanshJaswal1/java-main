import java.util.Scanner;

public class RockPaperScissors
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int computer = 2; // fixed choice (Paper)

        System.out.println("===== ROCK PAPER SCISSORS =====");
        System.out.println("1. Rock");
        System.out.println("2. Paper");
        System.out.println("3. Scissors");

        System.out.print("Enter your choice: ");
        int user = sc.nextInt();

        System.out.println("Computer chose: " + computer);

        if(user == computer)
        {
            System.out.println("Match Draw");
        }

        else if(user == 1 && computer == 3)
        {
            System.out.println("You Win");
        }

        else if(user == 2 && computer == 1)
        {
            System.out.println("You Win");
        }

        else if(user == 3 && computer == 2)
        {
            System.out.println("You Win");
        }

        else if(user >= 1 && user <= 3)
        {
            System.out.println("Computer Wins");
        }

        else
        {
            System.out.println("Invalid choice");
        }

        sc.close();
    }
}