package ex12_exceptions;

public class BasicExample {
    public static void main(String[] args) {
        try {

        int value = 100 / 0;
        System.out.println("Result: " + value);
        } catch (ArithmeticException e ) {
            System.err.println("Error: isn't possible to divide 100 by 0");
        } finally {
            // always execute
            System.out.println("Bloco operation done.");
        }
    }
}
