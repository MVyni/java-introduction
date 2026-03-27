package ex08_encapsulation;

public class Product {
    private String name;
    private double price;

    public void setPrice(double value) {
        if (value <= 0) {
            System.err.println("The price needs to be more than 0.");
            return;
        }
        price = value;
    }

    public double getPrice() {
        return price;
    }
}
