
  class animal{
       void  eat () {
        System.out.println(" animal is eating ");
       }
      }
       class dog extends animal {
               void barks(){
     System.out.println("dog barkss");
}      
 }
  

public class inheritance {
   public static void main(String[] args) {
            dog a = new dog();
                a.eat();
                a.barks();
   }   
}
