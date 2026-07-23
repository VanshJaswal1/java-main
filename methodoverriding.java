class animal {
    void sound() {
        System.out.println("animal can makes sound");
    }
}
class dog extends animal {
    // @Override
    void sound() {
        System.out.println("dog makes sound like barkj");
    }
}

public class methodoverriding { 
    public static void main(String[] args) {
        dog d = new dog();
        d.sound();
    }
}
