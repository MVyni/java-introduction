package ex10_abstraction;

public class Car extends Vehicle{
    public void move() {
        System.out.println("Car moving...");
    }

    public void stop() {
        System.out.println("Car stopping...");
    }
}
