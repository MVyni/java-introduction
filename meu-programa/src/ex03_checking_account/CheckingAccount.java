package ex03_checking_account;

/*
Methods

Withdraw an amount OK
Transfer to another account OK
Delete account with a justification OK
Check the bank statement between two dates
Check the current bank statement
*/

import java.time.LocalDate;
import java.util.List;

public class CheckingAccount {
    int accountNumber = 123456;
    int branchNumber = 1234;
    String client = "Marcus Vynicius";
    String dateOfBirth = "27/09/1999";
    double accountBalance = 10000;

    double accountBalance () {
        return accountBalance;
    }

    List checkBankStatement (LocalDate initalDate, LocalDate finalDate) {
        List bankStatement = null;

        return bankStatement;
    }

     double withdrawAmount (double num) {
        if (num > accountBalance) {
            System.out.println("Value exceeded");
        }

        return accountBalance - num;
    }

     double transferMoney (int a, int b, double num) {
        if (a == 0 || b == 0 || num > accountBalance) {
            System.out.println("Something went wrong, check the info and try again");
        }

        return accountBalance - num;
    }

     String deleteAccount (String justification) {
        if (justification.isEmpty()) {
            System.out.println("You need to have a justification for delete account");
        }

        this.accountNumber = 0;
        this.branchNumber = 0;
        return "Account deleted successfully!";
    }

    public static void main (String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount();

        double newBalance = checkingAccount.withdrawAmount(2000);
        System.out.println("New balance: " + newBalance);

        double transferMoney = checkingAccount.transferMoney(123456, 1234, 9000);
        System.out.println("Money transfer successfully! Your current bank statement is " + transferMoney);

        String deleteAccount = checkingAccount.deleteAccount("I'll leave the country");
        System.out.println(deleteAccount);
    }
}
