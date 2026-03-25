package ex06_poo.ex01_class_obj;

public class Book {
    String title;
    String author;
    int yearPublication;

    void showSummary() {
        System.out.println("Summary!");
    }

    public boolean isOlder(int yearPublication) {
        return (2026 - yearPublication) > 20;
    }
}



