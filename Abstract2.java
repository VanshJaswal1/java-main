abstract class bank {
     abstract void payment (int money);
}

class upi extends bank {
    void payment( int money) {
        System.out.println(" user used the upi method to print the money" + money);
    }

}
class cash extends bank {
    void payment( int money) {
        System.out.println(" user used the cash directly to pay the money" + money);
    }

}

public class Abstract2 {
    public static void main(String[] args) {
          System.out.println( "some basic code on asbtact classs");
            upi u = new upi();
            cash c = new cash();
            u.payment(20000);
         c.payment(30000);
    }
}
