import java.util.*;
abstract class User {
    protected String name;
    protected int id;

    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public abstract String getRole();
}

class Customer extends User {
    private List<Order> orders = new ArrayList<>();

    public Customer(String name, int id) {
        super(name, id);
    }

    @Override
    public String getRole() {
        return "Customer";
    }

    public void placeOrder(Order order) {
        orders.add(order);
        System.out.println(name + " placed an order " + order.getOrderId());
    }

    public List<Order> getOrders() {
        return orders;
    }
}

class Seller extends User {
    public Seller(String name, int id) {
        super(name, id);
    }

    @Override
    public String getRole() {
        return "Seller";
    }

    public void placeOrder(Order order) {
        System.out.println(name + " cannot place orders. Sellers only fulfill them.");
    }
}

class Admin extends User {
    public Admin(String name, int id) {
        super(name, id);
    }

    @Override
    public String getRole() {
        return "Admin";
    }
}

interface PaymentGateway {
    void pay(double amount);
    void refund(double amount);
}

class UPIPayment implements PaymentGateway {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " via UPI.");
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refunded " + amount + " via UPI.");
    }
}

class CreditCardPayment implements PaymentGateway {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " via Credit Card.");
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refunded " + amount + " via Credit Card.");
    }
}

class WalletPayment implements PaymentGateway {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " via Wallet.");
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refunded " + amount + " via Wallet.");
    }
}

class Order {
    private int orderId;
    private double amount;
    private Invoice invoice;

    public Order(int orderId, double amount) {
        this.orderId = orderId;
        this.amount = amount;
        this.invoice = new Invoice(orderId, amount);
    }

    public int getOrderId() {
        return orderId;
    }

    public double getAmount() {
        return amount;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    class Invoice {
        private int invoiceId;
        private double amount;

        public Invoice(int orderId, double amount) {
            this.invoiceId = orderId;
            this.amount = amount;
        }

        public void showInvoice() {
            System.out.println("Invoice #" + invoiceId + " for amount " + amount);
        }
    }
}

class Marketplace {
    private List<Seller> sellers = new ArrayList<>();
    private List<Customer> customers = new ArrayList<>();
    private static String config;

    static {
        config = "Marketplace Configurations Loaded";
        System.out.println(config);
    }

    public void addSeller(Seller s) {
        sellers.add(s);
    }

    public void addCustomer(Customer c) {
        customers.add(c);
    }

    public final void termsAndConditions() {
        System.out.println("Marketplace terms and conditions apply.");
    }
}
