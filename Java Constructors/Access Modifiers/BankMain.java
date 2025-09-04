public class BankMain {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("ACC123", "John", 10000, 5.0);
        sa.displayDetails();
        sa.deposit(2000);
        sa.withdraw(3000);
        System.out.println("Updated Balance: " + sa.getBalance());
    }
}
