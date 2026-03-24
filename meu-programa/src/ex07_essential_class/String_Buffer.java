package ex07_essential_class;

public class String_Buffer {
    public static void main(String[] args) {

        // MAIS SEGURANÇA EM MULTIPLOS THREADS

        StringBuffer sb = new StringBuffer("Java");
        sb.append(" and class");
        System.out.println(sb);
    }
}
