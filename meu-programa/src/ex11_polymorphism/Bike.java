package ex11_polymorphism;

public class Bike extends Vehicle{
    public void move () {
        System.out.println("Bike moving...");
    }

    public void stop() {
        System.out.println("Bike stopping...");
    }
}
