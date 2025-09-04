public class SavingsAccount extends BankAccount {
    double interestRate;

    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    public void displayDetails() {
        System.out.println("Account No: " + accountNumber + ", Holder: " + accountHolder + ", Balance: " + getBalance() + ", Interest: " + interestRate + "%");
    }
}
