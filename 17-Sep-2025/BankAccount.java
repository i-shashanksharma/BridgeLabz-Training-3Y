public class BankAccount {
    private String accountNumber;
    private double balance;
    private final int pin;

    public BankAccount(String accountNumber, double initialBalance, int pin) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative.");
        }
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.pin = pin;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
            return;
        }
        balance += amount;
        System.out.println("Deposited: " + amount + ". New Balance: " + balance);
    }

    public void withdraw(double amount, int enteredPin) {
        if (enteredPin != pin) {
            System.out.println("Invalid PIN. Withdrawal denied.");
            return;
        }
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
            return;
        }
        if (amount > balance) {
            System.out.println("Insufficient funds. Withdrawal denied.");
            return;
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount + ". New Balance: " + balance);
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber + ", Balance: " + balance);
    }
}
