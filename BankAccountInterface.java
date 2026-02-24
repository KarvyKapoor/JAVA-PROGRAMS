interface BankAccount {
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();  
}

class SavingAccount implements BankAccount {
    private double balance;
    public SavingAccount(double initialBalance) {
        balance = initialBalance;
    }
    public void deposit(double amount) {
        balance += amount;
    }
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }
    public double getBalance() {
        return balance;
    }
}

public class BankAccountInterface {
    public static void main(String[] args) {
        BankAccount account = new SavingAccount(1000);
        account.deposit(1000);
        account.withdraw(500);
        System.out.println("Current Balance : "+account.getBalance());
    }
}
