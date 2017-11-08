package app;

public class Checking extends Account {
    private int debitCardNumber;
    private int debitCardPIN;

    public Checking(String name, String sSN, double initDeposit){
        super(name, sSN, initDeposit);
        accountNumber = "1" + accountNumber; // Add 1st digit to account number
        setDebitCard();
    }

    @Override
    public void showInfo() {
        System.out.println("ACCOUNT TYPE: Checking");
        super.showInfo();
        System.out.println("\nYour Debit Card info:" + "\nDebit Card number: " + debitCardNumber + "\nPIN: " + debitCardPIN);
        System.out.println("\n*****************************\n");
    }

    @Override
    public void setRate() {
        rate = getBaseRate() * .15;
    }

    private void setDebitCard() {
        debitCardNumber = (int) (Math.random() * Math.pow(10, 12));
        debitCardPIN = (int) (Math.random() * Math.pow(10, 4));
    }
}
