package app;

public class Savings extends Account {
    int safetyDepositBoxID;
    int safetyDepositBoxKey;

    public Savings(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);

        accountNumber = "1" + accountNumber;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("ACCOUNT TYPE: Savings");
    }

}
