public class BankAccountSystem {
    public static void main(String[] args) {
        String bankName = "State bank of India";
        final String accountNumber1 = "ACC12345";
        String accountHolderName1 = "Lynda Princy";
        double balance1 = 1000.00;
        final String accountNumber2 = "ACC67890";
        String accountHolderName2 = "Prince Danish";
        double balance2 = 500.00;
        int totalAccounts = 2;
        if (accountHolderName1 instanceof String) {  
            System.out.println("Account 1 Details:");
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder: " + accountHolderName1);
            System.out.println("Account Number: " + accountNumber1);
            System.out.println("Balance: $" + balance1);
        }

        if (accountHolderName2 instanceof String) { 
            System.out.println("\nAccount 2 Details:");
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder: " + accountHolderName2);
            System.out.println("Account Number: " + accountNumber2);
            System.out.println("Balance: $" + balance2);
        }

        System.out.println("\nTotal number of accounts: " + totalAccounts);
        System.out.println("\nPerforming transactions on Account 1:");
        double depositAmount = 200;

        if (depositAmount > 0) {
            balance1 += depositAmount;
            System.out.println("Deposited: $" + depositAmount);
        }
        
        double withdrawAmount = 150;
        if (withdrawAmount > 0 && withdrawAmount <= balance1) {
            balance1 -= withdrawAmount;
            System.out.println("Withdrawn: $" + withdrawAmount);
        }

        System.out.println("\nUpdated Account 1 Details:");
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Holder: " + accountHolderName1);
        System.out.println("Account Number: " + accountNumber1);
        System.out.println("Balance: $" + balance1);
        System.out.println("\nPerforming transactions on Account 2:");

        depositAmount = 100;
        if (depositAmount > 0) {
            balance2 += depositAmount;
            System.out.println("Deposited: $" + depositAmount);
        }
        withdrawAmount = 800;
        if (withdrawAmount > 0 && withdrawAmount <= balance2) {
            balance2 -= withdrawAmount;
            System.out.println("Withdrawn: $" + withdrawAmount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }

        System.out.println("\nUpdated Account 2 Details:");
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Holder: " + accountHolderName2);
        System.out.println("Account Number: " + accountNumber2);
        System.out.println("Balance: $" + balance2);
    }
}
