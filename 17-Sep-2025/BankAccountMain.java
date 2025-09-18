public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456789", 5000, 1234);

        account.displayAccountInfo();
        account.deposit(2000);
        account.withdraw(1000, 1234);
        account.withdraw(7000, 1234);
        account.withdraw(500, 1111);
    }
}
