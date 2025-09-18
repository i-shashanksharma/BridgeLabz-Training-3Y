abstract class Person {
    protected String name;
    protected int age;
    protected String contact;

    public Person(String name, int age, String contact) {
        this.name = name;
        this.age = age;
        this.contact = contact;
    }

    public abstract String getRole();

    public void checkIn() {
        System.out.println(name + " checked in.");
    }
}

class Passenger extends Person {
    private Flight[] bookedFlights;

    public Passenger(String name, int age, String contact, Flight[] bookedFlights) {
        super(name, age, contact);
        this.bookedFlights = bookedFlights;
    }

    @Override
    public String getRole() {
        return "Passenger";
    }

    @Override
    public void checkIn() {
        System.out.println(name + " (Passenger) checked in at counter.");
    }

    public void showBookings() {
        for (Flight f : bookedFlights) {
            System.out.println(name + " booked flight " + f.getFlightNumber());
        }
    }
}

class Staff extends Person {
    public Staff(String name, int age, String contact) {
        super(name, age, contact);
    }

    @Override
    public String getRole() {
        return "Staff";
    }

    @Override
    public void checkIn() {
        System.out.println(name + " (Staff) checked in via crew gate.");
    }
}

interface Flyable {
    void flyPlane();
}

class Pilot extends Staff implements Flyable {
    public Pilot(String name, int age, String contact) {
        super(name, age, contact);
    }

    @Override
    public String getRole() {
        return "Pilot";
    }

    @Override
    public void flyPlane() {
        System.out.println(name + " is flying the plane.");
    }
}

class CabinCrew extends Staff {
    public CabinCrew(String name, int age, String contact) {
        super(name, age, contact);
    }

    @Override
    public String getRole() {
        return "Cabin Crew";
    }
}

class Flight {
    private String flightNumber;
    private Cockpit cockpit;

    public Flight(String flightNumber) {
        this.flightNumber = flightNumber;
        this.cockpit = new Cockpit();
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    class Cockpit {
        public void cockpitInfo() {
            System.out.println("Cockpit ready for flight " + flightNumber);
        }
    }
}

class Airline {
    public static String airlineName = "SkyHigh Airlines";
    private Flight[] flights;

    public Airline(Flight[] flights) {
        this.flights = flights;
    }

    public void showFlights() {
        for (Flight f : flights) {
            System.out.println("Airline " + airlineName + " has flight " + f.getFlightNumber());
        }
    }
}

final class Ticket {
    private String ticketNumber;
    private Passenger passenger;

    public Ticket(String ticketNumber, Passenger passenger) {
        this.ticketNumber = ticketNumber;
        this.passenger = passenger;
    }

    public void showTicket() {
        System.out.println("Ticket " + ticketNumber + " booked for " + passenger.name);
    }
}
