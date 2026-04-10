package ex13_collections.set;

import java.util.HashSet;
import java.util.Set;

public class Numbers {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();

        numbers.add(2);
        numbers.add(5);
        numbers.add(7);
        numbers.add(6);
        numbers.add(5);
        numbers.add(4);
        numbers.add(2);
        numbers.add(3);
        numbers.add(3);
        numbers.add(9);

        System.out.println(numbers);
        System.out.println(numbers.size());
        System.out.println(numbers.remove(5));
        System.out.println(numbers.contains(8));
    }
}
