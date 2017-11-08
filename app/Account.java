package app;

public abstract class Account implements IBaseRate {
    private String name;
    private String sSN;
    private double balance;

    private static int index = 10000;
    protected String accountNumber; // Following pattern: 1 or 2 (Saving/Checking) + last 2 digits of SSN + unique 5 digits + random 3 digits
    protected double rate;


    public Account(String name, String sSN, double initDeposit) {
        this.name = name;
        this.sSN = sSN;
        balance = initDeposit;

        // Set account number
        index++;
        this.accountNumber = setAccountNumber();

        setRate();
    }

    // Interest rate after one year
    public void compound() {
        double accruedInterest = balance * (rate/100);
        balance += accruedInterest;
        System.out.println("Accrued Interest: $" + accruedInterest);
        printBalance();
    }

    // Common methods - transactions
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Depositing $" + amount);
        printBalance();
    }

    public void transfer(String receiverAccountNumber, String title, double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Transfering $" + amount + " to: " + receiverAccountNumber + ". Title: " + title);
            printBalance();
        } else {
            System.out.println("ERROR: You don't have enough amount on your Account. Your balance is $" + balance);
        }
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawing $" + amount);
            printBalance();
        } else {
            System.out.println("ERROR: You don't have enough amount on your Account. Your balance is $" + balance);
        }
    }


    public void printBalance() {
        System.out.println("Your balance: $" + balance);
    }

    public abstract void setRate();

    public void showInfo() {
        System.out.println("NAME: " + this.name + "\nACCOUNT NUMBER: " + this.accountNumber +
                "\nBALANCE: $" + this.balance + "\nRATE: " + rate + "%"
        );
    }

    // Set account number without 1st digit
    private String setAccountNumber() {
        String lastTwoOfSSN = sSN.substring(sSN.length()-2, sSN.length());
        int uniqueID = index;
        int randomNumber = (int) (Math.random()*1000);

        return lastTwoOfSSN + uniqueID + randomNumber;
    }

    // Getters
    public String getName() { return name; }
    public String getsSN() { return sSN; }
    public double getBalance() { return balance; }
    public String getAccountNumber() { return accountNumber; }

}
