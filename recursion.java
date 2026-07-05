public class recursion {
         // using method 

         static void loop ( int n ) {
            
            if ( n > 10)
            {
                return;
            }
      System.out.println(n);
      loop(n+1);

         }
     public static void main(String[] args) {
        loop(1);
     }
        }
