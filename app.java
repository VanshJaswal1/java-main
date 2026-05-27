// below are some codes for learning and pravtice 

// 1 age checking 

//  public class app {
//     public app(){}
//     public static void main(String[] args) {
//         int age = 20;

//         boolean isAdult = age >= 18;

//         System.out.println(isAdult);
//     }
// }

// 2 even number checking system 

// public class app {
//     public app() {

//     }
//     public static void main(String[] args) {
//         int number = 8;

//         boolean isEven = number % 2 == 0;

//         System.out.println(isEven);
//     }
// }


// 3  voting system machine

//  public class app {
//     public app() {

//     }

// public static void main(String[] args) {
//     System.out.println("voting machine");
//    int age1 = 18;
//     boolean  voterId = false; 

//    if (age1 >= 18 && voterId )
//    { System.out.println(" yes valid");}
//     else { 
//         System.out.println("not valid");
//     }
// }

//  }

// login system very very important ....


// public class app {
//     public app(){

//     }
//     public static void main(String[] args) {
//         System.out.println("login checking system ");

//         String password = "pass123";
//         boolean isCorrect = password.equals("pass123");

//         if(isCorrect) {System.out.println("login hogya mubarka");}

//         else { System.out.println("katt gya bhau login ni hua");}
//     }
// }

import java.util.Scanner;
public class app {
    public app(){

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("your age: ");
        int age = sc.nextInt();

        System.out.print("true/false: ");
        boolean hasVoterID = sc.nextBoolean();

        if (age >= 18 && hasVoterID) {
            System.out.println("karle vote");
        } else {
            System.out.println("gand mara ");
        }
    }
}