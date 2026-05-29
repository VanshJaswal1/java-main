
import java.util.Scanner;

public class excercise1 {

    public static void main(String[] args) {
        System.out.println(" calculating the percentage of the marks of a student");

           System.out.println(" write the marks of the subjects");
 Scanner obj = new Scanner(System.in);
 int a,b,c,d,e;
  a = obj.nextInt();
 b = obj.nextInt();
 c = obj.nextInt();
 d = obj.nextInt();
  e = obj.nextInt();
 int percentage = ((a + b + c + d + e)/ 5 );
         
System.out.println("percentage of the student is : "+percentage);

    }



}
