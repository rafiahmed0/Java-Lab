
public class BankAccount {

    private String accountHolder;
    private String accountNumber;
    private double balance;

    public void setAccountDetails(String accountHolder, String accountNumber, double initialBalance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = (initialBalance >= 0) ? initialBalance : 0.0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully Withdrew: $" + amount);
        } else {
            System.out.println("Transaction Failed: Insufficient funds.");
        }
    }

    public void showAccountInfo() {
        System.out.println("--- Account Info ---");
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + maskAccountNumber(accountNumber));
        System.out.println("Current Balance: $" + balance);
    }

    private String maskAccountNumber(String accNum) {
        return (accNum.length() > 4) ? "****" + accNum.substring(accNum.length() - 4) : accNum;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.setAccountDetails("Rafi Ahmed", "253066", 5000.00);
        account.showAccountInfo();

        System.out.println("\n--- Processing Transactions ---");
        account.deposit(1500.50);
        account.withdraw(2000.00);

        System.out.println();
        account.showAccountInfo();
    }
}