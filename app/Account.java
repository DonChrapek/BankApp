package app;

public abstract class Account implements IBaseRate {
    String name;
    String sSN;
    double balance;
    String accountNumber;
    double rate;


    public Account(String name, String sSN, double initDeposit) {
        this.name = name;
        this.sSN = sSN;
        balance = initDeposit;

        System.out.println("NAME: " + name + "\nSSN: " + sSN + "\nBALANCE: " + balance);

    }

}
