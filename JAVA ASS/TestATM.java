abstract class ATM{
    abstract void withdraw(double amount);
    abstract void checkBalance();
}

class MyAt extends ATM{
    double balance = 1000.0;

    @Override
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    @Override
    void checkBalance() {
        System.out.println("Current balance: " + balance);
    }
}

public class TestATM {
    public static void main(String[] args) {
        MyAt atm = new MyAt();
        atm.checkBalance();
        atm.withdraw(200);
        atm.checkBalance();
        atm.withdraw(1000); // Should show invalid withdrawal
    }
}