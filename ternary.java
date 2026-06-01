public class ternary {
     public static void main(String [] args ){


        System.out.println("Teranry operators ");
        System.out.println("Teranry operators are the type of perators which act as a shortcut method for if-else statement ");
        
        int a= 5 , b = 6 , c = 6;
        System.out.println( "an example no 1" + " = "+( (a>b) ?a:b));
        System.out.println("example no 2 a bit complex" + " = " + ( (a!=5)? (b!=6):(a + b)));
         System.out.println("example no 3 a bit complex" + " = " + ((a > b) ? (a > c) ? a : c : (b > c) ? b : c));

     }
}
//  (a>b)?
// │
// ├── TRUE → (a>c)?
// │             ├── TRUE → a
// │             └── FALSE → c
// │
// └── FALSE → (b>c)?
//                ├── TRUE → b
//                └── FALSE → c