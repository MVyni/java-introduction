package ex13_collections.list;

import java.util.ArrayList;
import java.util.List;

public class Names {
    public static void main(String[] args) {
        List <String> names = new ArrayList<>();

        names.add("vyni");
        names.add("carol");
        names.add("nabo");
        names.add("cristiane");
        names.add("lucas");

        for(String name : names) {
            System.out.println(name);
        }

        System.out.println("First name: " + names.get(0));
        System.out.println("Last name: " + names.get(names.size() - 1));

        names.remove("lucas");

        System.out.println("The size of list: " + names.size());
    }
}
