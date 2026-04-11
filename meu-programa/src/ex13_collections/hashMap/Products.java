package ex13_collections.hashMap;

import java.util.HashMap;

public class Products {
    public static void main(String[] args) {
        HashMap<String, Integer> products = new HashMap<>();

        products.put("Rice", 3);
        products.put("Beans", 1);
        products.put("Noodle", 6);
        products.put("Meat", 10);
        products.put("Tuna", 2);

        System.out.println(products.get("Noodle"));
        System.out.println(products.remove("Tuna"));
        System.out.println(products.containsKey("Rice"));
        System.out.println(products.size());
    }
}
