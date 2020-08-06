package day_11_string_comparison_logical;
import java.util.*;
public class AmazonShopping {
    public String toString() {
        return super.toString();
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Amazon.com");
        System.out.println("Are you prime member?");
        String answer = scan.next();
        /*
        if the value of answer is "yes" then
        assign true  to isPrimeMember, otherwise assign false.
         */
        boolean isPrimeMember;
        if(answer.equalsIgnoreCase("yes")) {
                isPrimeMember = true;
        }else{
                isPrimeMember = false;
        }
        System.out.println("Enter total order price");
        double totalOrderPrice = scan.nextDouble();
        //check if order price is negative, if so, show error message and stop the program
        if(totalOrderPrice < 0){
            System.out.println("Invalid Order Price! "); //STOP PROGRAM at this point. dont run rest of below
            return;
        }
        if(isPrimeMember || totalOrderPrice >= 25.0){
            System.out.println("Your order is eligible  for free shipping");
        }else{
            System.out.println(	"Your order is not eligible  for free shipping");
        }
    }
}
