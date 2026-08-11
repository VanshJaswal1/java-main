 
  interface  school {
    void members(int a);

 }
interface fees {
    void moneyget(int b);
}

   
 class teacher implements school {
     public void members(int a){
         System.out.println("the number of teachers are " + " " + a );
    };
 }
 class student implements school {
     public void members(int a){
         System.out.println("the number of student are " + " " + a );
    };
 }

public class Interface1 {
     public static void main(String[] args) {
        
     }
}
