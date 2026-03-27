package ex08_encapsulation;

public class AccountBank {
    private double balance;

    public void depositMoney(double value) {
        if(value <= 0) {
            System.err.println("The deposit needs to be more than 0.");
            return;
        }
        balance += value;
    }

    public double getBalance() {
        return balance;
    }
}
