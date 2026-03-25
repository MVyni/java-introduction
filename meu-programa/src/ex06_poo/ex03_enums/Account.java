package ex06_poo.ex03_enums;

public class Account {
    String login;
    AcessLevel acessNivel;

    public Account(String login, AcessLevel acessNivel) {
        this.login = login;
        this.acessNivel = acessNivel;
    }

    public static void main(String[] args) {
        Account c1 = new Account("Vynicius", AcessLevel.ADMIN);
        Account c2 = new Account("Carol", AcessLevel.USER);
        Account c3 = new Account("Nabo", AcessLevel.GUEST);

        System.out.println(c1.login + " - " + c1.acessNivel);
        System.out.println(c2.login + " - " + c2.acessNivel);
        System.out.println(c3.login + " - " + c3.acessNivel);
    }
}
