import java.util.Random;
import java.util.Scanner;
public class random2 {
    public static void main(String[] args) {
        Random num = new Random();
        Scanner sc = new Scanner(System.in);
        int a = num.nextInt(100);
        int b = sc.nextInt();
        if (a > b){
            System.out.println("the number you had guessed is large ");
        }
         else if( b>a) {
            System.out.println("the number i enterd is large ");
        }
        else {
            System.out.println(" both number sare equal");
        }
        System.out.println(" enter the number = " + b );
        System.out.println(" the number computer choose =" + a );
        System.out.println(" nice tryyyy");
    }
}
