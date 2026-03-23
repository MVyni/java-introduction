package ex06_poo.ex07_enums;

public class SystemEnums {
    public static void main(String[] args) {
        BrazilianStates bs = BrazilianStates.RIO_JANEIRO;
        System.out.println(bs.getSigla());

        for(BrazilianStates eb : BrazilianStates.values()) {
            // values() retorna um array com todos os valores dentro do obj.
            // valuesOf() retorna o valor passado dentro dos parenteses.

            System.out.println("Brazilian State: " + eb + "," + eb.getSigla());
        }
    }
}
