//  ||   CONSTRUCTORS   ||

 
    
 class student {
    String name;
    int age;

          student() {
              name = "vansh";
              age = 22;
          }
 
    void display(){
    System.out.println(" my first basic constructor code ");
 }
 
}
 

public class oops6 {
      public static void main(String[] args) {
         System.out.println(" helo world");

         student s1 = new student();
         s1.display();
         System.out.println(s1.name + s1.age);
      }
}
