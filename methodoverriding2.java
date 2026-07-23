class Payment {

    String customerName;
    double amount;

    Payment(String customerName, double amount) {
        this.customerName = customerName;
        this.amount = amount;
    }

    void pay() {
        System.out.println("Processing generic payment...");
    }
}

// Credit Card Payment
class CreditCard extends Payment {

    CreditCard(String customerName, double amount) {
        super(customerName, amount);
    }

    @Override
    void pay() {
      
        System.out.println("Payment Method : Credit Card");
        System.out.println("Customer       : " + customerName);
        System.out.println("Amount         : ₹" + amount);
        System.out.println("Status         : Payment Successful");
    }
}

// UPI Payment
class UPI extends Payment {

    UPI(String customerName, double amount) {
        super(customerName, amount);
    }

    @Override
    void pay() {
   
        System.out.println("Payment Method : UPI");
        System.out.println("Customer       : " + customerName);
        System.out.println("Amount         : ₹" + amount);
        System.out.println("Status         : Payment Successful");
    }
}

// Net Banking Payment
class NetBanking extends Payment {

    NetBanking(String customerName, double amount) {
        super(customerName, amount);
    }

    @Override
    void pay() {
        
        System.out.println("Payment Method : Net Banking");
        System.out.println("Customer       : " + customerName);
        System.out.println("Amount         : ₹" + amount);
        System.out.println("Status         : Payment Successful");
    }
}

public class methodoverriding2 {

    public static void main(String[] args) {

        Payment p1 = new CreditCard("Vansh", 2500);
        Payment p2 = new UPI("devansh", 2500);
        Payment p3 = new NetBanking("Ayush", 5000);

        p1.pay();
        p2.pay();
        p3.pay();
    }
}