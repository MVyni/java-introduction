package ex01_sintax_semantic;

public class AppAccount {
    public static void main (String[] args) {
        Account account = new Account();

        account.withdrawMoney(7.0);
        account.printBalance();
    }
}
