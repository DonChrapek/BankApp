package app;

public class BankApp {
    public static void main(String[] args) {

        Checking chkacc1 = new Checking("Thomas kokos", "743849503", 1000);
        Savings savacc1 = new Savings("Albert Cook", "839540283", 2250);

        chkacc1.showInfo();
        savacc1.showInfo();

        savacc1.withdraw(3000);
        savacc1.transfer("12132132", "Na dragi", 350);
        savacc1.deposit(74);
    }
}
