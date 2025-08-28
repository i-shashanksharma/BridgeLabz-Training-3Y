import java.util.Scanner;
public class OnlineShoppingCart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Online Shopping Cart!");
        System.out.println("Enter the number of customers:");
        int customer=sc.nextInt();
        System.out.println("Enter the number of items:");
        int n = sc.nextInt();
        Menu(n,customer);

    }    
    public static void Menu(int n,int customer) {
        Scanner sc = new Scanner(System.in);
        int total=0;
        int price=0;
        for(int i=0;i<customer;i++) {
            for(int j=0;j<n;j++) {
                System.out.println("Menu:  1. Laptop - $1000, 2. Smartphone - $700, 3. Headphones - $150");
                    String item=sc.next();
                
                    switch(item) {
                        case "1":
                            price+=1000;
                            System.out.println("Laptop added to the cart and price is "+price);
                            
                            break;
                        case "2":
                            price += 700;
                            System.out.println("Smartphone added to the cart and price is "+price);
                            
                            break;
                        case "3":
                            price += 150;
                            System.out.println("Headphones added to the cart and price is "+price);
                            
                            break;
                        default:
                            System.out.println("Item not recognized. Please add a valid item.");
                            break;


                }
            
            }
            total+=price;
            System.out.println("Total price so far: $" + total);
            discountOffer(total);
            System.out.println("Customer completed shopping.");
        }
        
    }
   
    public static void discountOffer(int total) {
        if (total >= 5000) {
            System.out.println("You are eligible for a 10% discount!");
            double discount = total * 0.90;
            System.out.println("amount after discount: $" + discount);
        } else {
            System.out.println("No discount available for this amount.");
        }
    }
}