/* Create a BankAccount class with the following features:
Static:
○       A static variable bankName shared across all accounts.
○       A static method getTotalAccounts() to display the total number of accounts.
This:
○       Use this to resolve ambiguity in the constructor when initializing accountHolderName and accountNumber.
Final:
○       Use a final variable accountNumber to ensure it cannot be changed once assigned.
Instanceof:
○       Check if an account object is an instance of the BankAccount class before displaying its details.
 */
class BankAccount {
     static String bankName = "Central Bank";
     static int totalAccounts = 0;
     final int accountNumber;
     String accountHolderName;
     double balance;

    public BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        totalAccounts++;
    }

    public void displayAccountDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Balance: " + balance);
        } else {
            System.out.println("Invalid Account!");
        }
    }

    public static void getTotalAccounts() {
        System.out.println("Total Bank Accounts: " + totalAccounts);
    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(101, "Diksha", 600000);
        BankAccount acc2 = new BankAccount(102, "Kamal", 700000);
        acc1.displayAccountDetails();
        acc2.displayAccountDetails();
        BankAccount.getTotalAccounts();
    }
}
