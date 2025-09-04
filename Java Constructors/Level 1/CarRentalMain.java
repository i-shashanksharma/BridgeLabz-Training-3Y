public class CarRentalMain {
    public static void main(String[] args) {
        CarRental cr1 = new CarRental();
        CarRental cr2 = new CarRental("Bob", "SUV", 5);

        System.out.println(cr1.customerName + " - " + cr1.carModel + " - " + cr1.rentalDays + " days - Total: " + cr1.calculateTotalCost());
        System.out.println(cr2.customerName + " - " + cr2.carModel + " - " + cr2.rentalDays + " days - Total: " + cr2.calculateTotalCost());
    }
}
