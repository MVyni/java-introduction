package ex07_essential_class;

import java.util.Scanner;

public class Systems {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // para escutar a entrada no terminal

        System.out.println("Write your name");
        String name = scan.nextLine();

        System.out.println("Write your age");
        int age = scan.nextInt();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

        if(age < 18) {
            System.err.println("You're underage");
        }

        scan.close();
    }
}
