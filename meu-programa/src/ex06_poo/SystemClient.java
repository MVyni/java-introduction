package ex06_poo;

public class SystemClient {
    public static void main(String[] args) {
        Client vyni = new Client("Vynicius", 26);
        System.out.println(vyni.name);
        vyni.requestCreditLimit(5.000);
        System.out.println(vyni.creditLimit);
    }
}
