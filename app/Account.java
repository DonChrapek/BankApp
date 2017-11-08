package app;

public abstract class Account implements IBaseRate {
    String name;
    String sSN;
    double balance;

    static int index = 10000;
    String accountNumber;
    double rate;


    public Account(String name, String sSN, double initDeposit) {
        this.name = name;
        this.sSN = sSN;
        balance = initDeposit;

        System.out.println("NAME: " + name + "\nSSN: " + sSN + "\nBALANCE: " + balance);

        // Set account number
        index++;
        this.accountNumber = setAccountNumber();
    }

    private String setAccountNumber() {
        String lastTwoOfSSN = sSN.substring(sSN.length()-2, sSN.length());
        int uniqueID = index;
        int randomNumber = (int) (Math.random()*1000);

        return lastTwoOfSSN + uniqueID + randomNumber;
    }

}
