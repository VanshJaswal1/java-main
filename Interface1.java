 
  interface  school {
    void members(int a);

 }
interface fees {
    void moneyget(int b);
}
 interface salary {
    void moneytake(int c);
 }
   
 class teacher implements school, salary {
     public void members(int a){
         System.out.println("the number of teachers are " + " " + a );
    };
    public  void moneytake(int c) {
        System.out.println(" the monet the get is  " + " " + c );
    }
 }
 class student implements school {
     public void members(int a){
         System.out.println("the number of student are " + " " + a );
    };
    public void fees (int b ) {
        System.out.println(" the fees studernt pays to the  school is " + " " + b);
    }
 }

public class Interface1 {
     public static void main(String[] args) {
         System.out.println(" an example of interface ");
     }
}
