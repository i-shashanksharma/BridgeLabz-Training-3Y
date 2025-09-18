public class AirlineReservationSystemMain  {
    public static void main(String[] args) {
        Flight f1 = new Flight("AI101");
        Flight f2 = new Flight("AI102");

        Person p1 = new Passenger("Alice", 25, "123456", new Flight[]{f1, f2});
        Person p2 = new Pilot("Bob", 40, "789012");
        Person p3 = new CabinCrew("Carol", 30, "456789");

        p1.checkIn();
        p2.checkIn();
        p3.checkIn();

        System.out.println(p1.getRole());
        System.out.println(p2.getRole());
        System.out.println(p3.getRole());

        if (p2 instanceof Flyable) {
            ((Flyable) p2).flyPlane();
        }

        Airline airline = new Airline(new Flight[]{f1, f2});
        airline.showFlights();

        Passenger passenger = new Passenger("David", 28, "654321", new Flight[]{f1});
        passenger.showBookings();

        Ticket t1 = new Ticket("T001", passenger);
        t1.showTicket();
    }
}
