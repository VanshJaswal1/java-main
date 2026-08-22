import java.util.Scanner;

// interface
interface Payable {
    void makePayment(double amount);
}

// abstract parent class
abstract class Person {

    private String name;
    protected int age;

    // constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // getter
    public String getName() {
        return name;
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }

    abstract void showRole();

    void displayBasicInfo() {
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }
}

// student inherits person
class Student extends Person implements Payable {

    private int[] marks;

    static String college = "ABC University";

    // student constructor
    Student(String name, int age, int[] marks) {
        super(name, age);
        this.marks = marks;
    }

    // method overloading
    int calculateTotal() {
        return calculateTotal(marks);
    }

    int calculateTotal(int[] values) {

        int total = 0;

        for (int mark : values) {
            total += mark;
        }

        return total;
    }

    double calculateAverage() {
        return (double) calculateTotal() / marks.length;
    }

    // overriding parent method
    @Override
    void showRole() {
        System.out.println("Role : Student");
    }

    // interface method
    @Override
    public void makePayment(double amount) {
        System.out.println("Payment of ₹" + amount + " completed.");
    }

    void displayResult() {

        System.out.println("\n--- Student Result ---");

        displayBasicInfo();

        System.out.println("College : " + college);

        System.out.print("Marks   : ");

        for (int mark : marks) {
            System.out.print(mark + " ");
        }

        System.out.println();

        System.out.println("Total   : " + calculateTotal());
        System.out.println("Average : " + calculateAverage());
    }
}

public class JavaRevision1 {

    // checking pass or fail
    static void checkResult(double average) {

        if (average >= 40) {
            System.out.println("Result  : PASS");
        } else {
            System.out.println("Result  : FAIL");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        int[] marks = new int[3];

        System.out.println("Enter marks of 3 subjects:");

        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
        }

        // creating student object
        Student student = new Student(name, age, marks);

        student.displayResult();

        checkResult(student.calculateAverage());

        // changing private data using setter
        System.out.println("\nName before change: " + student.getName());

        student.setName("Vansh");

        System.out.println("Name after change : " + student.getName());

        // interface reference
        Payable payment = student;

        payment.makePayment(500);

        // dynamic method dispatch
        Person person = student;

        person.showRole();

        sc.close();
    }
}