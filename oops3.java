// classes and methods advanceeeeee

import java.util.Scanner;

class reportcard {
String name;
int rollno;
int marks;
   void data ( String a , int b , int c) {
name = a ;
rollno = b;
marks = c;
   }
  void display() {
   System.out.println("name is " + name );
   System.out.println("rollno" + rollno);
    System.out.println("marks" + marks);  
  }
  void grade (){

    if (marks > 50) {
        System.out.println(" passssssss");
    } else{
        System.out.println(" failllll");
    }
  } 
}
  public class oops3 {
  
    public static void main(String[] args) {
        System.err.println(" using sacnner with classs and methods");

        Scanner sc = new Scanner(System.in);
         System.out.print("Enter Name : ");
        String name = sc.nextLine();

        System.out.print("Enter Roll No : ");
        int rollno = sc.nextInt();

        System.out.print("Enter Marks : ");
        int marks = sc.nextInt(); 

        reportcard rep = new reportcard();
        rep.data(name, rollno, marks);

        rep.display();

        rep.grade();
  }
  }
