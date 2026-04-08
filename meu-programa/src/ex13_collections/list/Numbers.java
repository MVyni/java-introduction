package ex13_collections.list;

import java.util.ArrayList;
import java.util.List;

public class Numbers {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);
        numbers.add(30);

        int sum = 0;
        for(Integer num : numbers) {
            System.out.println(num);

            sum+= num;
            System.out.println("Sum " + sum);
        }
    }
}
