public class ECommercePlatformMain {
    public static void main(String[] args) {
        Marketplace mp = new Marketplace();
        
        Customer c1 = new Customer("Alice", 1);
        Seller s1 = new Seller("Bob", 101);
        Admin a1 = new Admin("Charlie", 999);

        mp.addCustomer(c1);
        mp.addSeller(s1);

        Order o1 = new Order(1001, 5000.0);
        c1.placeOrder(o1);

        o1.getInvoice().showInvoice();

        PaymentGateway payment = new CreditCardPayment();
        payment.pay(o1.getAmount());

        PaymentGateway wallet = new WalletPayment();
        wallet.refund(200.0);

        mp.termsAndConditions();

        DiscountStrategy discount = new DiscountStrategy() {
            @Override
            public double applyDiscount(double amount) {
                System.out.println("One-time discount applied.");
                return amount * 0.9;
            }
        };

        double finalAmount = discount.applyDiscount(o1.getAmount());
        System.out.println("Final amount after discount: " + finalAmount);
    }
}

interface DiscountStrategy {
    double applyDiscount(double amount);
}
