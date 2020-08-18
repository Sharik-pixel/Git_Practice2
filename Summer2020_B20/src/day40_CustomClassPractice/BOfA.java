package day40_CustomClassPractice;

public class BOfA {

    public static void main(String[] args) {

        BankAccount Alla = new BankAccount();
        Alla.setAccountInfo("Saving", "Alla Avidon", "1234567");

     Alla.getAccountInfo();

     Alla.deposit(1000);

     Alla.checkBalance();

     Alla.withDraw(500) ;

     Alla.checkBalance(); // 500

     Alla.withDraw(100000);

     Alla.checkBalance();




    }



}
