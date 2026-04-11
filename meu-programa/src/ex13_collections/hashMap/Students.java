package ex13_collections.hashMap;

import java.util.HashMap;
import java.util.Map;

public class Students {
    public static void main(String[] args) {
        HashMap<String, Double> students = new HashMap<>();

        students.put("Vynicius", 9.0);
        students.put("Carol", 7.5);
        students.put("Lucas", 6.0);
        students.put("Alice", 10.0);

        System.out.println(students.get("Vynicius"));
        System.out.println(students.put("Lucas", 8.5));

        for(Map.Entry<String, Double> entry : students.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
