package app;

public class BankApp {
    public static void main(String[] args) {

        Checking chkacc1 = new Checking("Thomas kokos", "743849503", 1000);
        Savings savacc1 = new Savings("Albert Cook", "839540283", 2250);

        chkacc1.showInfo();
        savacc1.showInfo();

        savacc1.compound();
    }
}
