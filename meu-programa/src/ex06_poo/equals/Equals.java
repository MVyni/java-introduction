package ex06_poo.equals;

public class Equals {
    public static void main(String[] args) {
        String name1 = "Java";
        String name2 = "Java";
        String name3 = new String("Java");

        System.out.println("Names: " + (name1 == name2));
        System.out.println("Names: " + (name1 == name3));
        System.out.println("Names: " + name1.equals(name3));

        Integer n1 = 100;
        Integer n2 = 100;
        Integer n3 = 130;
        Integer n4 = 130;

        System.out.println(n1.equals(n2));
        System.out.println(n1 == n2);
        System.out.println(n2 == n3);
        System.out.println(n2.equals(n3));
        System.out.println(n3 == n4);
        System.out.println(n3.equals(n4));
    }
}
