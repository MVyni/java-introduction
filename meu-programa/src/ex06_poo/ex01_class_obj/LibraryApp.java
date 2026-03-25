package ex06_poo.ex01_class_obj;

public class LibraryApp {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();

        System.out.println("The Clean Code book was written by Robert C. Martin");

        System.out.println(book1.isOlder(2001));
        book2.showSummary();
        System.out.println(book3.isOlder(2014));
    }
}
