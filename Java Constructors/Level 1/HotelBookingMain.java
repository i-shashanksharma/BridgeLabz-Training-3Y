public class HotelBookingMain {
    public static void main(String[] args) {
        HotelBooking h1 = new HotelBooking();
        HotelBooking h2 = new HotelBooking("Alice", "Deluxe", 3);
        HotelBooking h3 = new HotelBooking(h2);

        System.out.println(h1.guestName + " - " + h1.roomType + " - " + h1.nights);
        System.out.println(h2.guestName + " - " + h2.roomType + " - " + h2.nights);
        System.out.println(h3.guestName + " - " + h3.roomType + " - " + h3.nights);
    }
}
