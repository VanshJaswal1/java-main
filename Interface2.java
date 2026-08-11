interface Camera {

    void takePhoto();
}


interface GPS {

    void getLocation();
}


interface MusicPlayer {

    void playMusic();
}


// Parent class
class Device {

    String brand;

    Device(String brand) {
        this.brand = brand;
    }

    void showBrand() {
        System.out.println("Brand: " + brand);
    }
}


// Smartphone
class Smartphone extends Device implements Camera, GPS, MusicPlayer {

    Smartphone(String brand) {
        super(brand);
    }

    @Override
    public void takePhoto() {
        System.out.println("Smartphone is taking a photo");
    }

    @Override
    public void getLocation() {
        System.out.println("Smartphone GPS is active");
    }

    @Override
    public void playMusic() {
        System.out.println("Smartphone is playing music");
    }
}


// SmartWatch
class SmartWatch extends Device implements GPS, MusicPlayer {

    SmartWatch(String brand) {
        super(brand);
    }

    @Override
    public void getLocation() {
        System.out.println("SmartWatch GPS is active");
    }

    @Override
    public void playMusic() {
        System.out.println("SmartWatch is playing music");
    }
}


public class Interface2 {

    public static void main(String[] args) {

        Smartphone phone = new Smartphone("Samsung");

        phone.showBrand();
        phone.takePhoto();
        phone.getLocation();
        phone.playMusic();

        System.out.println();

        SmartWatch watch = new SmartWatch("Apple");

        watch.showBrand();
        watch.getLocation();
        watch.playMusic();
    }
}