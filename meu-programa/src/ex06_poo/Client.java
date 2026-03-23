package ex06_poo;

public class Client {
    String name;
    double creditLimit;
    int age;

    public Client (String name, int newAge) {  //Constructor
        this.name = name;
        age = newAge;
    }

    public void requestCreditLimit(Double valueRequested) {
        creditLimit = valueRequested;
    }

    public void buy(Double productValue) {
        creditLimit -= productValue;
    }
}
