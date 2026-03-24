package ex07_essential_class;

public class String_Builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        // USE PARA LOOPS OU CONCATENAÇÕES REPETIDAS.

        sb.append("Hello");
        sb.append(" ");
        sb.append("World");

        System.out.println(sb);

        sb.replace(0, 5, "Hi");
        System.out.println(sb);
    }
}
