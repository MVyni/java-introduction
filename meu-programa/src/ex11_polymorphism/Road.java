package ex11_polymorphism;

public class Road {
    public static void main(String[] args) {
        Vehicle vehicle = null;

        String vehicleChoose = "bike";

        if(vehicleChoose.equals("car")) {
            vehicle = new Car();
        }

        if(vehicleChoose.equals("bike")) {
            vehicle = new Bike();
        }

        vehicle.move();
        vehicle.stop();
    }
}
