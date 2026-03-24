package ex07_essential_class;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DatesTimes {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        LocalDateTime agora = LocalDateTime.now();

        System.out.println(hoje);

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println(agora.format(formato));
    }
}
