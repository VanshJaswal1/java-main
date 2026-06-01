//                     MENU OF RESTURANT               //
 import java.util.Scanner;
public class switch2{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
 System.out.println("Dear customer make you choice by entring the number ");
  int choice;
  choice= sc.nextInt();


switch( choice) {

     case 1:

     System.out.println(" pizza selected");
     break;
  case 2:

     System.out.println(" shake selected");
     break;

       case 3:

     System.out.println(" wine selected");
     break;

  default:
    System.out.println(" bhootiye insaan number daal gawar");


}
}
}

// import java.util.Scanner;

// public class Switch2
// {
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("===== RESTAURANT MENU =====");
//         System.out.println("1. Pizza");
//         System.out.println("2. Shake");
//         System.out.println("3. Wine");

//         System.out.print("Dear customer, enter your choice: ");

//         if(sc.hasNextInt())
//         {
//             int choice = sc.nextInt();

//             switch(choice)
//             {
//                 case 1:
//                     System.out.println("Pizza selected");
//                     break;

//                 case 2:
//                     System.out.println("Shake selected");
//                     break;

//                 case 3:
//                     System.out.println("Wine selected");
//                     break;

//                 default:
//                     System.out.println("Invalid choice. Please select between 1 to 3.");
//             }
//         }
//         else
//         {
//             System.out.println("Please enter a valid number.");
//         }

//         sc.close();
//     }
// }






// }



// }