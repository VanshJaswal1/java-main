class sum {
    int a ;
    int b ;

    sum(){
        a = 11;
        b = 12;
    }
     void Sum() {
        System.out.println(  " the sum of the two number is = " + (a + b));
     }

}
 class add extends sum{
    int x;
    int y;

    add() {
        x = a;
        y = a;
    }
     void Add (){
        System.out.println( " the sum of the two numbers is = " + ( x + y));
     }
 }

public class inheritance2 {
   public static void main(String[] args) {
    add A = new add();
    A.Add();
   }   
}
