import java.util.Scanner;
public class ItemMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Item Code: ");
        String code = sc.nextLine();

        System.out.print("Enter Item Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Item Price: ");
        double price = sc.nextDouble();

        Item item = new Item(code, name, price);

        System.out.println("\nItem Details:");
        item.display();

        System.out.print("\nEnter Quantity: ");
        int qty = sc.nextInt();

        double totalCost = item.calculateTotalCost(qty);
        System.out.println("Total Cost for " + qty + " items = " + totalCost);

    }
}
