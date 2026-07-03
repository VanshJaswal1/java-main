public class method2 {
     // with parameter
   int compare (  int x ,int y ) {
       
         int c;
         if( x>y) {
            c =  x+y;
         }
         else {
            c = x - y;
         }
       return c;
    }
    // static method  
    static char grade ( char z  ) {
        
        if ( z == 'A' ) {
            System.out.println("it worked");
        } 
        else{
            System.out.println("it did not worked");
        }
        return z;
    }
    public static void main(String[] args) {
        System.out.println( " instance method");

        method2 obj1 = new method2();
         int sum = obj1.compare( 4,5);
         System.out.println(sum);
        
         method2.grade('A');
    }
}
