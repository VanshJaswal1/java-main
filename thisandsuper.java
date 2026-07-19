class Person {

    String name = "Unknown";

    // Parent Constructor
    Person() {
        System.out.println("Parent Default Constructor");
    }

    Person(String name) {
        this();                      // Calls Person()
        this.name = name;            // this.variable
        System.out.println("Parent Parameterized Constructor");
    }

    void display() {
        System.out.println("Person Name : " + name);
    }
}

class Student extends Person {

    String name = "No Name";
    int age;

    // Child Default Constructor
    Student() {

        super("Vansh");              // Calls Parent Constructor

        System.out.println("Child Default Constructor");
    }

    // Child Parameterized Constructor
    Student(String name, int age) {

        this();                      // Calls Student()

        this.name = name;            // Current class variable
        this.age = age;

        System.out.println("Child Parameterized Constructor");
    }

    void printDetails() {

        this.show();                 // this.method()

        System.out.println();

        System.out.println("Child Name : " + this.name);     // Child variable

        System.out.println("Parent Name : " + super.name);   // Parent variable

        System.out.println("Age : " + age);

        System.out.println();

        System.out.println("Calling Child display()");
        this.display();

        System.out.println();

        System.out.println("Calling Parent display()");
        super.display();
    }

    @Override
    void display() {

        System.out.println("Student Display Method");

    }

    void show() {

        System.out.println("this.method() executed");

    }

}

public class thisandsuper {

    public static void main(String[] args) {

        Student s = new Student("Rahul",20);

        System.out.println();

        s.printDetails();

    }

}