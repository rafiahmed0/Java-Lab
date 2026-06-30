public class BankAcc {
    int accountNumber;
    String name;
    double balance;

    static String bankName = "Sonali Bank";

    BankAcc(int a, String n, double b) {
        accountNumber = a;
        name = n;
        balance = b;
    }

    void show() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }

    static void showBank() {
        System.out.println("Bank Name: " + bankName);
    }

    public static void main(String[] args) {
        BankAcc obj1 = new BankAcc(12345, "Rafi", 50000);
        BankAcc obj2 = new BankAcc(12346, "Kafi", 80000);

        BankAcc.showBank();
        System.out.println();

        obj1.show();
        System.out.println();
        obj2.show();
    }
}