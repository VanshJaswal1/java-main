 class company {
    String Idcard;
    int salary;
    
    char grade;
 
    void Companytdetail() {
            System.err.println(" this is the company id cards");
        }
 }

public class oops2 {
     public static void main(String[] args) {
        System.out.println("classes with methods");

        company com = new company();
        com.Companytdetail();
        com.Idcard = " Mr Vansh jaswal";
        com.salary = 700000;
        com.grade = 'A';

        System.out.println(com.grade);
        System.out.println(com.salary);
        System.out.println(com.Idcard);
    
      
    }
}
