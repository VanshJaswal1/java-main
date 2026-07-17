// copy constructor
 
class company {
    String name;
    int salary;

    company() {
        name = "vansh";
       salary = 60000;
    } 
    company(company obj) {
         name = obj.name;
          salary = obj.salary;
    }
}

public class oops7 {
    public static void main(String[] args) {
        System.out.println("copy constructor");
        company s1 = new company(); 
        company s2 = new company(s1);
       s2.name = "rahul";
        System.out.println(s2.name);
    
    } 
}
