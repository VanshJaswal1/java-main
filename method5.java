public class method5 {

    // varr agg or variable arguments 


     static int sum ( int ...arr) {
           int result = 0;
           for ( int i : arr ) {

            result += i;

           
           }
            return result;


        } 
        public static  void main ( String [] args) {
            
            System.out.println( " code of variable arguments"); 
            System.out.println(" sum of 4 , 5,6  " + sum ( 4,5,6));
    }



}
