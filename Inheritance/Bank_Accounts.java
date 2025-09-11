public class Bank_Accounts {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount("SA1001", 15000, 4.5);
        CheckingAccount c = new CheckingAccount("CA2001", 8000, 5000);
        FixedDepositAccount f = new FixedDepositAccount("FD3001", 50000, 12);

        s.displayAccountType();
        c.displayAccountType();
        f.displayAccountType();
    }
}

class BankAccount {
    String accountNumber;
    double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void displayDetails() {
        System.out.println("Account No: " + accountNumber + ", Balance: " + balance);
    }

    public void displayAccountType() {
        System.out.println("Bank Account -> Account No: " + accountNumber + ", Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void displayAccountType() {
        System.out.println("Savings Account -> Account No: " + accountNumber + ", Balance: " + balance + ", Interest Rate: " + interestRate + "%");
    }
}

class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    public void displayAccountType() {
        System.out.println("Checking Account -> Account No: " + accountNumber + ", Balance: " + balance + ", Withdrawal Limit: " + withdrawalLimit);
    }
}

class FixedDepositAccount extends BankAccount {
    int depositTerm;

    public FixedDepositAccount(String accountNumber, double balance, int depositTerm) {
        super(accountNumber, balance);
        this.depositTerm = depositTerm;
    }

    @Override
    public void displayAccountType() {
        System.out.println("Fixed Deposit Account -> Account No: " + accountNumber + ", Balance: " + balance + ", Deposit Term: " + depositTerm + " months");
    }
}
