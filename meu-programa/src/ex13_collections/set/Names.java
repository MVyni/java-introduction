package ex13_collections.set;

import java.util.HashSet;
import java.util.Set;

public class Names {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();

        names.add("Ana");
        names.add("Carlos");
        names.add("Ana");
        names.add("Bruno");
        names.add("Carlos");

        System.out.println(names);
        System.out.println(names.size());
        System.out.println(names.contains("Bruno"));
    }
}
