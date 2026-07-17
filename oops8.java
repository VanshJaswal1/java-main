// copy constructor

class company {

    String name;
    int salary;

    company(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    company(company obj) {
        name = obj.name;
        salary = obj.salary;
    }
}

public class oops8 {

    public static void main(String[] args) {

        System.out.println("copy constructor");

        company s1 = new company("vansh", 60000);

        company s2 = new company(s1);

        s2.name = "rahul";

        System.out.println("s1 Name = " + s1.name);
        System.out.println("s2 Name = " + s2.name);
    }
}