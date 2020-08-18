package day40_CustomClassPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class CapitalOne {

    public static void main(String[] args) {

        BankAccount Beslan = new BankAccount();
        BankAccount David = new BankAccount();
        BankAccount Alla = new BankAccount();
        BankAccount Tona = new BankAccount();
        BankAccount Bob = new BankAccount();

        Beslan.setAccountInfo("Checking","Beslan","2345672") ;
        David.setAccountInfo("Checking", "David","12234");
        Alla.setAccountInfo("Checking", "Alla","45678");
        Tona.setAccountInfo("Checking","Tona","8765432" );
        Bob.setAccountInfo("Checking", "Bob","9876543");


        ArrayList<BankAccount> accounts = new ArrayList<>() ;
        accounts.addAll(Arrays.asList(Beslan,David,Alla,Tona,Bob) );
        //                              0      1    2    3    4


        for( BankAccount each : accounts){
            each.deposit(500);
            each.getAccountInfo() ;
        }

        accounts.get(3).deposit(10000);
        accounts.get(3).checkBalance();
        accounts.get(3).withDraw(9000);
        accounts.get(3).checkBalance();

        accounts.get(4).deposit(600) ;
        accounts.get(4).checkBalance();

        System.out.println("***********************************");
        accounts.removeIf( each -> each.balance  < 1000);
        for( BankAccount each : accounts){
            each.getAccountInfo();
        }


    }


}
