public class CartItem {
    private String itemName;
    private double price;
    private int quantity;

    private static CartItem[] cart = new CartItem[50]; // max 50 items
    private static int count = 0;

    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public double getTotalPrice() {
        return price * quantity;
    }

    public void display() {
        System.out.println(itemName + " - " + quantity + " x " + price + " = " + getTotalPrice());
    }

    public static void addItem(CartItem item) {
        if (count < cart.length) {
            cart[count++] = item;
            System.out.println(item.getItemName() + " added to cart.");
        } else {
            System.out.println("Cart is full!");
        }
    }

    public static void removeItem(String name) {
        boolean removed = false;
        for (int i = 0; i < count; i++) {
            if (cart[i].getItemName().equalsIgnoreCase(name)) {
                for (int j = i; j < count - 1; j++) {
                    cart[j] = cart[j + 1];
                }
                cart[--count] = null;
                System.out.println(name + " removed from cart.");
                removed = true;
                break;
            }
        }
        if (!removed) {
            System.out.println("Item not found in cart.");
        }
    }

    public static void displayTotal() {
        double total = 0;
        if (count == 0) {
            System.out.println("Cart is empty.");
            return;
        }
        System.out.println("\n--- Cart Items ---");
        for (int i = 0; i < count; i++) {
            cart[i].display();
            total += cart[i].getTotalPrice();
        }
        System.out.println("Total Cost: " + total);
    }
}
