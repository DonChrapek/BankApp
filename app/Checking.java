package app;

public class Checking extends Account {
    int debitCardNumber;
    int debitCardPIN;

    public Checking(String name, String sSN, double initDeposit){
        super(name, sSN, initDeposit);
        System.out.println("CHECKING ACCOUNT");
    }

}
