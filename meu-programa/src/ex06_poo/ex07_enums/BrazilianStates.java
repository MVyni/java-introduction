package ex06_poo.ex07_enums;

public enum BrazilianStates {
    RIO_JANEIRO ("Rio de Janeiro", "RJ"),
    SAO_PAULO ("São Paulo", "SP"),
    PIAUI ("Piauí", "PI");

    private String name;
    private String sigla;

    private BrazilianStates(String name, String sigla) {
        this.name = name;
        this.sigla = sigla;
    }

    public String getSigla() {
        return sigla;
    }
}
