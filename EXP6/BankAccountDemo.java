

class LowBalanceException extends Exception {
    public LowBalanceException(String message) {
        super(message);
    }
}

class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

class BankAccount {

    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void balanceEnquiry() {
        System.out.println("Current Balance: " + balance);
    }

    public void deposit(double amount) throws NegativeNumberException {
        if (amount < 0)
            throw new NegativeNumberException("Deposit amount cannot be negative.");
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount)
            throws LowBalanceException, NegativeNumberException {

        if (amount < 0)
            throw new NegativeNumberException("Withdrawal amount cannot be negative.");

        if (amount > balance)
            throw new LowBalanceException("Insufficient balance.");

        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {

        BankAccount acc = new BankAccount(5000);

        try {
            acc.balanceEnquiry();
            acc.deposit(2000);
            acc.withdraw(3000);
            acc.withdraw(10000); 
        }
        catch (LowBalanceException | NegativeNumberException e) {
            System.out.println("Error: " + e.getMessage());
        }

        acc.balanceEnquiry();
    }
}
