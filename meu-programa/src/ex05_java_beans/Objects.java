package ex05_java_beans;

public class Objects {
    public static void main(String[] args) {

        Student student = new Student();

        student.setName("Marcus");
        System.out.println(student.getName());

        student.setAge(26);
        System.out.println(student.getAge());
    }
}
