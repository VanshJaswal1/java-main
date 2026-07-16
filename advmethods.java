class Student {

    String name;
    int rollNo;
    int marks;

    void setData(String n, int r, int m) {
        name = n;
        rollNo = r;
        marks = m;
    }

    void display() {
        System.out.println("-------------");
        System.out.println("Name    : " + name);
        System.out.println("Roll No : " + rollNo);
        System.out.println("Marks   : " + marks);
    }

    void checkResult() {

        if (marks >= 40) {
            System.out.println("Result : Pass");
        } else {
            System.out.println("Result : Fail");
        }

    }

    void grade() {

        if (marks >= 90)
            System.out.println("Grade : A+");
        else if (marks >= 80)
            System.out.println("Grade : A");
        else if (marks >= 70)
            System.out.println("Grade : B");
        else if (marks >= 60)
            System.out.println("Grade : C");
        else if (marks >= 40)
            System.out.println("Grade : D");
        else
            System.out.println("Grade : F");

    }

}

public class advmethods {

    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();

        s1.setData("Vansh", 101, 95);
        s2.setData("Rahul", 102, 32);

        s1.display();
        s1.checkResult();
        s1.grade();

        System.out.println();

        s2.display();
        s2.checkResult();
        s2.grade();

    }

}