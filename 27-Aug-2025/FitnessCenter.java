import java.util.Scanner;
public class FitnessCenter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean keepRunning = true;
        System.out.println("=== Welcome to Fitness Center Membership System ===");

        do {
            System.out.print("Enter number of members to register today: ");
            int memberCount = sc.nextInt();

            for (int i = 1; i <= memberCount; i++) {
                System.out.println("\nRegistering Member #" + i);

                System.out.println("Select Membership Type: ");
                System.out.println("1. Monthly - 1000 Rs");
                System.out.println("2. Quarterly - 2500 Rs");
                System.out.println("3. Yearly - 9000 Rs");
                System.out.print("Enter choice (1/2/3): ");
                int choice = sc.nextInt();

                double fee = 0;
                switch (choice) {
                    case 1: fee = 1000; break;
                    case 2: fee = 2500; break;
                    case 3: fee = 9000; break;
                    default: 
                        System.out.println("Invalid choice, assigning Monthly by default.");
                        fee = 1000;
                }

                System.out.print("Are you a Student or Senior Citizen? (yes/no): ");
                String discountStatus = sc.next();
                if (discountStatus.equalsIgnoreCase("yes")) {
                    fee = fee * 0.8;
                    System.out.println("Discount applied! 20% off.");
                } else {
                    System.out.println("No discount applied.");
                }

                System.out.println("Final Membership Fee for Member #" + i + " = Rs " + fee);
            }

            System.out.print("\nDo you want to register more members? (yes/no): ");
            String adminChoice = sc.next();
            if (adminChoice.equalsIgnoreCase("no")) {
                keepRunning = false;
            }

        } while (keepRunning);

        System.out.println("\n=== Fitness Center Closed for the Day ===");
        sc.close();
    }
}