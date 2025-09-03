import java.util.Scanner;
public class MovieTicketMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Movie Name: ");
        String movie = sc.nextLine();

        MovieTicket ticket = new MovieTicket(movie);

        System.out.print("Enter Seat Number: ");
        String seat = sc.nextLine();

        System.out.print("Enter Ticket Price: ");
        double price = sc.nextDouble();

        ticket.bookTicket(seat, price);

        System.out.println("\nTicket Details:");
        ticket.displayTicket();
    }
}
