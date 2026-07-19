class student {
    String name ;
    int age ;
    char grade;
    student( String a , int b , char c) {
       name = a ;
    age = b;
    grade = c;
    }
}
  
class vansh extends student {
    vansh() {
          super( "vansh" , 21 , 'A');
        //   System.out.println(" the name is = " + name + " " + " the age is = " + " " + age + "and the grade is = " + " " + grade);

    }
}


public class inheritance4 {
     public static void main(String[] args) {
        vansh v = new vansh();
         System.out.println(v.name);
         System.out.println(v.age);
         System.out.println(v.grade);
     }
}
