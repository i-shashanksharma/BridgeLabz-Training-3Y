import java.util.ArrayList;
import java.util.List;
class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class Order {
    private int orderId;
    private List<Product> products;

    public Order(int orderId) {
        this.orderId = orderId;
        this.products = new ArrayList<>();
    }

    public int getOrderId() {
        return orderId;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void showOrderDetails() {
        System.out.println("Order ID: " + orderId);
        double total = 0;
        for (Product p : products) {
            System.out.println("- " + p.getName() + " : $" + p.getPrice());
            total += p.getPrice();
        }
        System.out.println("Total Amount: $" + total);
    }
}

class Customer {
    private String name;
    private List<Order> orders;

    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void placeOrder(Order order) {
        orders.add(order);
        System.out.println(name + " placed Order ID: " + order.getOrderId());
    }

    public void showOrders() {
        System.out.println("\nOrders placed by " + name + ":");
        for (Order o : orders) {
            o.showOrderDetails();
            System.out.println();
        }
    }
}

public class ECommercePlatform {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 75000);
        Product p2 = new Product("Smartphone", 30000);
        Product p3 = new Product("Headphones", 2500);
        Customer customer1 = new Customer("Alice");
        Order order1 = new Order(101);
        order1.addProduct(p1);
        order1.addProduct(p3);
        Order order2 = new Order(102);
        order2.addProduct(p2);
        customer1.placeOrder(order1);
        customer1.placeOrder(order2);
        customer1.showOrders();
    }
}
