package ex12_exceptions;

import java.text.NumberFormat;
import java.text.ParseException;

public class CheckedExample {
    public static void main(String[] args) {
        try {

            NumberFormat format = NumberFormat.getCurrencyInstance();
            Number number = format.parse("A.175");
            System.out.println(number);
        } catch (ParseException e ) {
            System.err.println("Formation error: The string provided isn't a valid number");
        }
    }
}
