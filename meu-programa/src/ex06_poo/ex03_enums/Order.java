package ex06_poo.ex03_enums;

public class Order {
    int order;
    OrderStatus orderStatus;

    public Order(int order, OrderStatus orderStatus) {
        this.order = order;
        this.orderStatus = orderStatus;
    }

    public static void main(String[] args) {
        Order order1 = new Order(1, OrderStatus.PAID);
        Order order2 = new Order(2, OrderStatus.PENDING);
        Order order3 = new Order(3, OrderStatus.CANCELED);
        System.out.println("Order " + order1.order + ": " + order1.orderStatus);
        System.out.println("Order " + order2.order + ": " + order2.orderStatus);
        System.out.println("Order " + order3.order + ": " + order3.orderStatus);

        for(OrderStatus status : OrderStatus.values()) {
            System.out.println(status + " - " + status.getDescription());
        }

        OrderStatus converted = OrderStatus.valueOf("PAID");
        System.out.println("Converted: " + converted);

        OrderStatus invalid = OrderStatus.valueOf("PAGO");
        // Da erro porque o valueOf() só consegue usar o nome exato da const
    }
}
