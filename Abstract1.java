abstract class vechicle {

    abstract void start();

}
class car extends vechicle {
      void start() {
        System.out.println("Car starts");
}
class bus extends vechicle {
      void start() {
        System.out.println("bus starts");
}

}
public class Abstract1 {

    public static void main(String[] args) {
              System.out.println("just a code ");
            car obj1 = new car();
            // bus obj2 = new bus();
            obj1.start();
            // obj2.start();
    }

}
}
