package ex01_sintax_semantic;

public class Account {
    double balance = 10.0;

    public void withdrawMoney(Double value) {
        double newBalance = balance - value;
    }

    public void printBalance() {
        System.out.println(balance);
    }
}
