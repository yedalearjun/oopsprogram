
// BankAccount class with encapsulation
class BankAccount {
    private double balance;
    private int accountNumber;

    // Constructor
    public BankAccount(int accountNumber) {
        this.balance = 0.0;
        this.accountNumber = accountNumber;
    }

    // Getter methods
    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit of $" + amount + " successful. New balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount. Amount must be greater than 0.");
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful. New balance: $" + balance);
        } else {
            System.out.println("Invalid withdrawal amount. Amount must be greater than 0 and less than or equal to the balance.");
        }
    }
}

 class BankAccountTest {
    public static void main(String[] args) {
        // Creating an object of BankAccount class
        BankAccount account1 = new BankAccount(1001);

        // Deposit and withdraw operations
        account1.deposit(1000.0);
        account1.withdraw(500.0);
        account1.withdraw(700.0); // Attempting to withdraw more than the balance

        // Printing account information
        System.out.println("Account Number: " + account1.getAccountNumber());
        System.out.println("Current Balance: $" + account1.getBalance());
    }
}