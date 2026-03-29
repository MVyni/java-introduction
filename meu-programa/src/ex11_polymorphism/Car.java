package ex11_polymorphism;

public class Car extends Vehicle {
    public void move() { System.out.println("Car moving..."); }
    public void stop() {
        System.out.println("Car stopping...");
    }
}
