class Calculator {

    void add() {
        System.out.println("No numbers");
    }

    void add(int a) {
        System.out.println("One number = " + a);
    }

    void add(int a, int b) {
        System.out.println("Sum = " + (a + b));
    }
}

public class overloading {

    public static void main(String[] args) {

        Calculator obj = new Calculator();

        obj.add();
        obj.add(10);
        obj.add(10,20);

    }
}
 
    

