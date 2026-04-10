package ex13_collections.hashMap;

import java.util.HashMap;

public class Fruits {
    public static void main(String[] args) {
        HashMap<String, Integer> fruits = new HashMap<>();

        fruits.put("Apple", 3);
        fruits.put("Orange", 1);
        fruits.put("Banana", 6);
        fruits.put("Grape", 10);
        fruits.put("Watermelon", 2);

        System.out.println(fruits.get("Grape"));
        System.out.println(fruits.remove("Watermelon"));
        System.out.println(fruits.containsKey("Rice"));
        System.out.println(fruits.size());
    }
}
