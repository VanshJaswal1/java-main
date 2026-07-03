 import java.util.Scanner;
public class method1 {
     // types to craete a method
    //  static char grade(char a) {
    //     Scanner sc = new Scanner(System.in);
    //       char a = sc.next().charAt(0);
    
    //   return a;    }

      public int marks(int b) {
    //  Scanner sc = new Scanner(System.in);
    //  int B = sc.nextInt(); 
    return b;
      }
    public static void main(String[] args) {
        // System.out.println(" static method to make a method");
        //  grade('A');
    
    System.out.println("instance method");  
    method1 obj = new method1();
    obj.marks(77);
    System.out.println(obj);
    }
}
