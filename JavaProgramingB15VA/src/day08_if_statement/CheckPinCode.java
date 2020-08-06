package day08_if_statement;


public class CheckPinCode {
    public static void main(String[] args) {
        System.out.println("WElcome to Wells Fargo ATM!");

        int secretPinCode = 2345;
        int inputPinCode = 2341;

        if(inputPinCode == secretPinCode){
            System.out.println("Welcome to Your Account!");
            System.out.println("You can withdraw, deposit, view balances");
        }else {
            System.out.println("Invalid pinCode!");
            System.out.println("Access denied!");
        }
        //this is after if else  satement, and will always run
        System.out.println("Thank you for your business! Bye");

    }
}
