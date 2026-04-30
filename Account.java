

public class Account {
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    public Account()
    {
        System.out.println( "Default Constructor");
      
    }

    public Account ( int an, String ahn, double b)
    {
        System.out.println( "Para Constractor");
        this.accountNumber = an;
        this.accountHolderName = ahn;
        this.balance = b;

    }

    public void setAccountNumber(int an)
    {
        this.accountNumber = an; 
    }

    public int getAccountNumber()
    {
        return this.accountNumber;
    }

    public void setAccountHolderName( String ahn)
    {
        this.accountHolderName = ahn;
    }

    public String getAccountHolderName()
    {
        return this.accountHolderName;
    }

    public void setBalance(double b)
    {
        this.balance = b;
    }

    public double getBalance ()
    {
        return this.balance;
    }



    public void Show()
    {
        System.out.println( "ShowDetails");
        System.out.println("Account Number;" +getAccountNumber());
        System.out.println("Account Holder Name;" +getAccountHolderName());
        System.out.println("Balance;" +getBalance());


    }
}


























class BankAccount {
    // Private attributes
    private String accountHolderName;
    private double balance;

    // Constructor
    public BankAccount(String accountHolderName, double balance) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Public getter for accountHolderName
    public String getAccountHolderName() {
        return accountHolderName;
    }

    // Public setter for accountHolderName
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    // Public getter for balance
    public double getBalance() {
        return balance;
    }

    // Public setter for balance (only allows positive deposits)
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Public method to withdraw money
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            balance -= amount;
        }
    }
}

class Main {
    public static void main(String[] args) {
        // Creating an object of BankAccount
        var account = new BankAccount("John Doe", 5000);

        // Using getter to access private data
        System.out.println("Account Holder: " + account.getAccountHolderName());
        System.out.println("Balance: " + account.getBalance());

        // Modifying balance using setter method
        account.deposit(1500);
        System.out.println("Updated Balance: " + account.getBalance());

        // Trying to withdraw an amount
        account.withdraw(2000);
        System.out.println("Balance after Withdrawal: " + account.getBalance());
    }
}