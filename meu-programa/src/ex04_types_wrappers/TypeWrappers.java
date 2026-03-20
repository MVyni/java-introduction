package ex04_types_wrappers;

import java.util.ArrayList;

import static java.lang.System.*;

public class TypeWrappers {
    public static void main(String[] args) {
        ex01();
        ex02();
        ex03();
        ex04();
        ex05();
    }

    static void ex01 () {
        String a = "150";
        int b = Integer.parseInt(a);
        int sum = b + 50;

        out.println("Ex 01: " + sum);
    }

    static void ex02 () {
        ArrayList<Integer> num = new ArrayList<>();

        num.add(5);
        num.add(10);
        num.add(15);
        num.add(20);
        num.add(25);

        int sum = 0;
        for (int i = 0; i < num.size(); i++) {
            sum += num.get(i);
        }

        out.println("Ex 02: " + sum);
    }

    static void ex03 () {
        Integer a = 25;
        Integer b = 40;

        int result = a.compareTo(b);

        if (result > 0) {
            System.out.println("Ex 03: a is bigger");
        } else if (result < 0) {
            System.out.println("Ex 03: b is bigger");
        } else {
            System.out.println("Ex 03: are equals");
        }
    }

    static void ex04 () {
        String a = "true";
        boolean b = Boolean.parseBoolean(a);

        out.println("Ex 04: " + b);
    }

    static void ex05 () {
        Character letter = 'A';

        if(Character.isUpperCase(letter)) {
            out.println("Ex 05: the letter is upper case");
        } else {
            out.println("Ex 05: the letter is lower case");
        }
    }
}
