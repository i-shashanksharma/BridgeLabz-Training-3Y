import java.util.ArrayList;
class Account {
    private String accountNumber;
    private double balance;
    private Bank bank;

    public Account(String accountNumber, double initialBalance, Bank bank) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.bank = bank;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public Bank getBank() {
        return bank;
    }
}

class Customer {
    private String name;
    private ArrayList<Account> accounts;

    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void viewBalance() {
        System.out.println("Customer: " + name);
        for (Account acc : accounts) {
            System.out.println("Account " + acc.getAccountNumber() + " at " + acc.getBank().getBankName() + " has balance: ₹" + acc.getBalance());
        }
        System.out.println();
    }

    public String getName() {
        return name;
    }
}

class Bank {
    private String bankName;

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    public Account openAccount(Customer customer, String accountNumber, double initialBalance) {
        Account newAccount = new Account(accountNumber, initialBalance, this);
        customer.addAccount(newAccount);
        return newAccount;
    }

    public String getBankName() {
        return bankName;
    }
}

public class AssociationDemo {
    public static void main(String[] args) {
        Bank sbi = new Bank("State Bank of India");
        Bank hdfc = new Bank("HDFC Bank");
        Customer shashank = new Customer("Shashank");
        sbi.openAccount(shashank, "SBI123", 5000);
        hdfc.openAccount(shashank, "HDFC456", 10000);
        shashank.viewBalance();
    }
}
