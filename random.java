
import java.util.Random;
public class random {
    public static void main(String[] args) {
        System.out.println("our computer makes a random guesss of a number ");
        Random num = new Random();
      int number = num.nextInt(100);   
    System.out.println(number);
 }

}
