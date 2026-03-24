package ex07_essential_class;

import java.text.NumberFormat;
import java.util.Locale;

public class NumbersFormats {
    public static void main(String[] args) {

        //ÚTIL PARA MOEDAS, PORCENTAGENS E NÚMEROS EXIBIDOS AO USER

        double value = 1234.56;

        NumberFormat br = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);

        System.out.println(br.format(value));
        System.out.println(us.format(value));
    }
}
