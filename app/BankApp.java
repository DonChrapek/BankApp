package app;

import java.util.LinkedList;
import java.util.List;

public class BankApp {
    public static void main(String[] args) {
        String file = "C:\\Users\\Daniel\\Desktop\\BankApp\\src\\files\\NewBankAccounts.csv";
        List<Savings> savingsAccounts = new LinkedList<Savings>();
        List<Checking> checkingAccounts = new LinkedList<Checking>();

        /*Checking chkacc1 = new Checking("Thomas kokos", "743849503", 1000);
        Savings savacc1 = new Savings("Albert Cook", "839540283", 10000);

        chkacc1.showInfo();
        savacc1.showInfo();

        savacc1.compound();*/

        List<String[]> newAccounts = utilities.CSV.read(file);

        for (String[] account : newAccounts) {
            System.out.println("NEW ACCOUNT");
            String name = account[0];
            String sSN = account[1];
            String accountType = account[2];
            double initDeposit = Double.parseDouble(account[3]);

            if (accountType.equals("Checking")) checkingAccounts.add(new Checking(name, sSN, initDeposit));
            else if (accountType.equals("Savings")) savingsAccounts.add(new Savings(name, sSN, initDeposit));
            else System.out.println("Wrong account type");
        }

        System.out.println("Savings accounts: ");
        for (Savings account : savingsAccounts) {
            System.out.println(account.getName());
        }
    }
}
