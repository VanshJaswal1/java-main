 
  interface  school {
    void members(int a);

 }
interface fees {
    void moneytake(int b);
}
 interface salary {
    void moneyget(int c);
 }
   
 class teacher implements school, salary {
     public void members(int a){
         System.out.println("the number of teachers are " + " " + a );
    };
    public  void moneyget(int c) {
        System.out.println(" the monet the get is  " + " " + c );
    }
 }
 class student implements school , fees{
     public void members(int a){
         System.out.println("the number of student are " + " " + a );
    };
    public void moneytake (int b ) {
        System.out.println(" the fees studernt pays to the  school is " + " " + b);
    }
 }

public class Interface1 {
     public static void main(String[] args) {
         System.out.println(" an example of interface ");
         student s = new student();
         teacher t = new teacher();
         s.members(20);
         s.moneytake(2000);
         t.members(40);
         t.moneyget(50000);
     }
}
