package app;

public class Savings extends Account {
    int safetyDepositBoxID; // 3-digit number
    int safetyDepositBoxKey; // 4-digit number

    public Savings(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        accountNumber = "1" + accountNumber; // Add 1st digit to account number
        setSafetyDepositBox();
    }

    @Override
    public void showInfo() {
        System.out.println("ACCOUNT TYPE: Savings");
        super.showInfo();
        System.out.println("\nYour Safety Depoit Box info:" + "\nDeposit Box ID: " + safetyDepositBoxID +
                "\nDeposit Box Key: " + safetyDepositBoxKey);
        System.out.println("\n*****************************\n");
    }

    private void setSafetyDepositBox() {
        safetyDepositBoxID = (int) (Math.random() * 1000);
        safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
    }

}
