class BankAccount {
    protected double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
        System.out.println("Current Balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
        System.out.println("Current Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {

    public SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    public void withdraw(double amount) {
        if ((balance - amount) < 100) {
            System.out.println("Cannot withdraw! Minimum balance of 100 required.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
        System.out.println("Current Balance: " + balance);
    }
}

public class Main1 {
    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount(500);
        account.deposit(200);
        account.withdraw(550);
        account.withdraw(100);
    }
}
