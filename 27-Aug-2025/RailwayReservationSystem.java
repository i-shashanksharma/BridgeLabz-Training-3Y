import java.util.Scanner;
public class RailwayReservationSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose a train:");
        System.out.println("1. Express - Rs500");
        System.out.println("2. Superfast - Rs800");
        System.out.println("3. Luxury - Rs1200");

        int choice = sc.nextInt();
        int fare = 0;
        switch (choice) {
            case 1:
                fare = 500;
                System.out.println("You selected Express.");
                break;
            case 2:
                fare = 800;
                System.out.println("You selected Superfast.");
                break;
            case 3:
                fare = 1200;
                System.out.println("You selected Luxury.");
                break;
            default:
                System.out.println("Invalid choice. Defaulting to Express.");
                fare = 500;
        }
        int totalSeats = 5;
        int bookedSeats = 0;
        int waitingList = 0;

        do {
            System.out.println("\nEnter number of passengers to book:");
            int passengers = sc.nextInt();
            for (int i = 1; i <= passengers; i++) {
                if (bookedSeats < totalSeats) {
                    bookedSeats++;
                    System.out.println("Passenger " + i + ": Seat booked.");
                } else {
                    waitingList++;
                    System.out.println("Passenger " + i + ": Added to waiting list.");
                }
            }

            System.out.println("Do you want to continue booking? (yes/no)");
        } while ( sc.next().equalsIgnoreCase("yes"));

        System.out.println("\nBooking Summary:");
        System.out.println("Total Seats: " + totalSeats);
        System.out.println("Booked Seats: " + bookedSeats);
        System.out.println("Waiting List: " + waitingList);
        System.out.println("Fare per passenger: Rs" + fare);
    }
}