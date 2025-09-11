public class Online_Order {
    public static void main(String[] args) {
        Order o1 = new Order("O1001", "2025-09-01");
        ShippedOrder o2 = new ShippedOrder("O1002", "2025-09-05", "TRK12345");
        DeliveredOrder o3 = new DeliveredOrder("O1003", "2025-09-07", "TRK67890", "2025-09-10");

        System.out.println(o1.getOrderStatus());
        System.out.println(o2.getOrderStatus());
        System.out.println(o3.getOrderStatus());
    }
}

class Order {
    String orderId;
    String orderDate;

    public Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return "Order ID: " + orderId + " placed on " + orderDate + " -> Status: Placed";
    }
}

class ShippedOrder extends Order {
    String trackingNumber;

    public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public String getOrderStatus() {
        return "Order ID: " + orderId + " placed on " + orderDate + " -> Status: Shipped (Tracking: " + trackingNumber + ")";
    }
}

class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    public DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String getOrderStatus() {
        return "Order ID: " + orderId + " placed on " + orderDate + " -> Status: Delivered on " + deliveryDate + " (Tracking: " + trackingNumber + ")";
    }
}
