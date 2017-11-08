package app;

public abstract class Account implements IBaseRate {
    String name;
    String sSN;
    double balance;

    static int index = 10000;
    String accountNumber; // 1 or 2 (Saving/Checking) + last 2 digits of SSN + unique 5 digits + random 3 digits
    double rate;


    public Account(String name, String sSN, double initDeposit) {
        this.name = name;
        this.sSN = sSN;
        balance = initDeposit;

        // Set account number
        index++;
        this.accountNumber = setAccountNumber();
    }

    // Set account number without 1st digit
    private String setAccountNumber() {
        String lastTwoOfSSN = sSN.substring(sSN.length()-2, sSN.length());
        int uniqueID = index;
        int randomNumber = (int) (Math.random()*1000);

        return lastTwoOfSSN + uniqueID + randomNumber;
    }

    public void showInfo() {
        System.out.println(
                        "NAME: " + this.name +
                        "\nACCOUNT NUMBER: " + this.accountNumber +
                        "\nBALANCE: $" + this.balance
        );
    }

}
