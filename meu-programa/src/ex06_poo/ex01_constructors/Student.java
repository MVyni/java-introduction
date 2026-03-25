package ex06_poo.ex01_constructors;

public class Student {
    String name;
    int age;
    String course;

    public Student (String name) {
        this.name = name;
    }

    public Student (String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public static void main(String[] args) {
        Student student1 = new Student("Vynicius");
        student1.age = 26;
        student1.course = "Java";

        Student student2 = new Student("Carol", 24, "React");
    }
}
