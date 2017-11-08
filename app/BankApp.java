package app;

import java.util.List;

public class BankApp {
    public static void main(String[] args) {
        String file = "C:\\Users\\Daniel\\Desktop\\BankApp\\src\\files\\NewBankAccounts.csv";
        /*Checking chkacc1 = new Checking("Thomas kokos", "743849503", 1000);
        Savings savacc1 = new Savings("Albert Cook", "839540283", 10000);

        chkacc1.showInfo();
        savacc1.showInfo();

        savacc1.compound();*/

        List<String[]> newAccounts = utilities.CSV.read(file);

        for (String[] account : newAccounts) {
            System.out.println("NEW ACOUNT");
            System.out.println(account[0]);
            System.out.println(account[1]);
            System.out.println(account[2]);
            System.out.println(account[3]);
        }
    }
}
