interface ATMService {
    void withdraw();
    void deposit();
    void checkBalance();
}

class DBBL implements ATMService {
    public void withdraw() {
        System.out.println("Money Withdrawn Successfully");
    }

    public void deposit() {
        System.out.println("Money Deposited Successfully");
    }

    public void checkBalance() {
        System.out.println("Current Balance = 70900");
    }
}

public class ATM {
    public static void main(String[] args) {
        DBBL account = new DBBL();
        account.checkBalance();
        account.deposit();
        account.withdraw();
    }
}