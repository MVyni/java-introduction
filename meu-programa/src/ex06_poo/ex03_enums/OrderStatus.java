package ex06_poo.ex03_enums;

public enum OrderStatus {
    PENDING("Pending"),
    PAID("Paid"),
    CANCELED("Canceled");

    String description;

    private OrderStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
