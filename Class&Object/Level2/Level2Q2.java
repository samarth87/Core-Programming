public class Level2Q2 {
    static class BankAccount {
        String accountHolder;
        String accountNumber;
        double balance;

        BankAccount(String accountHolder, String accountNumber, double balance) {
            this.accountHolder = accountHolder;
            this.accountNumber = accountNumber;
            this.balance = balance;
        }

        void deposit(double amount) {
            balance += amount;
            System.out.println("Deposited ₹" + amount);
        }

        void withdraw(double amount) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrew ₹" + amount);
            } else {
                System.out.println("Insufficient balance!");
            }
        }

        void displayBalance() {
            System.out.println("Account Holder: " + accountHolder);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Current Balance: ₹" + balance);
        }
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Ravi Kumar", "SB100200", 15000.0);
        acc.displayBalance();
        acc.deposit(3000);
        acc.withdraw(5000);
        acc.displayBalance();
    }
}
