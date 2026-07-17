class Student {

    // Public Variable
    public String name = "Vansh";

    // Private Variable
    private int marks = 95;

    // Protected Variable
    protected int age = 19;

    // Default Variable
    int roll = 21;

    // Public Method
    public void publicMethod() {
        System.out.println("Public Method");
    }

    // Private Method
    private void privateMethod() {
        System.out.println("Private Method");
    }

    // Protected Method
    protected void protectedMethod() {
        System.out.println("Protected Method");
    }

    // Default Method
    void defaultMethod() {
        System.out.println("Default Method");
    }

    // This method is inside the class
    // so it can access everything
    public void showAll() {

        System.out.println(name);

        System.out.println(marks);

        System.out.println(age);

        System.out.println(roll);

        publicMethod();

        privateMethod();

        protectedMethod();

        defaultMethod();

    }

}

public class oops5 {

    public static void main(String[] args) {

        Student obj = new Student();

        System.out.println(obj.name);

        // System.out.println(obj.marks);   // ERROR

        System.out.println(obj.age);

        System.out.println(obj.roll);

        obj.publicMethod();

        // obj.privateMethod();             // ERROR

        obj.protectedMethod();

        obj.defaultMethod();

        System.out.println();

        obj.showAll();

    }

}