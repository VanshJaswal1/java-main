class math{
    String question;
    int ans;

    math() {
        question = "addition";
        ans = 20;
    }
    void maths ( int a , int b ) {
          
    }
}
class sum extends math {
    
    void maths(int a , int b   ){
        
 if (  a +  b == ans) {
            System.err.println(" ummm yesssss");
         }
         else {
            System.out.println(" the values you had given is not correct");
         }
    }
}


public class methodoverriding1 {
     public static void main(String[] args) {
        sum s = new sum();
           s.maths(10,10);
     }
}
