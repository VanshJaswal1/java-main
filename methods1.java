import java.util.Scanner;
public class methods1 {
    
     int sum () {
            int a ;
            int b;
            Scanner sc = new Scanner(System.in);
            a = sc.nextInt();
         b = sc.nextInt();
          int c ;
          c = a + b ;
         return c ;

    }
    
 public static void main(String[] args) {
     System.out.println( " very weird code");
       methods1 obj  = new methods1();
        int result =  obj.sum ();
      System.err.println(result);
 }
}
