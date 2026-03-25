package ex06_poo.ex04_ref_objects;

public class Person {
    String name;

    private Person(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Person p1 = new Person("Vyni");
        Person p2 = p1;
        Person p3 = new Person("Vyni");

        System.out.println(p1 == p2);
        System.out.println(p1 == p3);

        p2.name = "Marcus";

        System.out.println(p1.name);
        System.out.println(p2.name);
        System.out.println(p3.name);
    }
}
