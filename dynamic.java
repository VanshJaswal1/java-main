 class teacher {
    void name(){
        System.out.println(" i am your teacher ");
    }
 }
 class student extends teacher {
    void name(){
        System.out.println(" i am student of your class ");
    }
    void Class () {
        System.out.println(" you are in my class");
    }
 }
 
public class dynamic {
     public static void main(String[] args) {
        student obj1 = new student();
         teacher obj2 = new student();
     }
}
