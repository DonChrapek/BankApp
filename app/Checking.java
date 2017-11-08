package app;

public class Checking extends Account {
    int debitCardNumber;
    int debitCardPIN;

    public Checking(String name, String sSN, double initDeposit){
        super(name, sSN, initDeposit);

        accountNumber = "1" + accountNumber;
        System.out.println("NEW CHECKING ACCOUNT");
        System.out.println("ACCOUNT NUMBER: " + accountNumber + "\n");
    }

}
